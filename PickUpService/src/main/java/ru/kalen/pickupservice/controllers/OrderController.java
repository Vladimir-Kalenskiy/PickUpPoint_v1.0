package ru.kalen.pickupservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kalen.pickupservice.models.Order;
import ru.kalen.pickupservice.models.enam.OrderStatus;
import ru.kalen.pickupservice.services.OrderService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Контроллер заказов.
 */
@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    /**
     * Сервис для работы с заказами.
     */
    private final OrderService orderService;

    /**
     * Получить список всех заказов на конкретном филиале.
     *
     * @return список заказов.
     */
    @GetMapping("/")
    public List<Order> getAllOrders() {
        return orderService.getAllOrdersFromPickUpPoint();
    }

    /**
     * Получить список заказов с центрально склада.
     *
     * @return список заказов.
     */
    @GetMapping("/central")
    public List<Order> getAllOrdersOfCental() {
        return orderService.getAllOrdersOfCentral();
    }

    /**
     * Получить список заказов готовых к выдачи по номеру телефона покупателя.
     *
     * @param phone номер телефона покупателя.
     * @return список заказов.
     */
    @GetMapping("/ready/{phone}")
    public List<Order> findReadyOrdersByPhone(@PathVariable("phone") String phone) {
        return orderService.findReadyOrdersByPhone(phone);
    }

    /**
     * Метод изменения статуса заказа на "завершенный" по идентификатору заказа.
     *
     * @param orderId идентификатор заказа.
     * @return заказ.
     */
    @PostMapping("/giveout/{orderId}")
    public Order giveOutOrder(@PathVariable("orderId") Long orderId) {
        Order order = getOrderById(orderId);
        order.setStatus(OrderStatus.COMPLETED);
        orderService.addOrder(order);
        return order;
    }

    /**
     * Получить список всех заказов по номеру телефона покупателя
     *
     * @param phone номер телефона покупателя.
     * @return список заказов.
     */
    @GetMapping("/all/{phone}") //
    public List<Order> findAllOrdersByPhone(@PathVariable("phone") String phone) {
        return orderService.getOrderByPhone(phone);
    }

    /**
     * Метод добавления заказа.
     *
     * @param order заказ.
     * @return заказ.
     */
    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    /**
     * Получить список заказов со статусом "не забрали".
     *
     * @return список заказов.
     */
    @GetMapping("/overdue")
    public List<Order> getOverdueOrders() {
        return orderService.getAllOrdersFromPickUpPoint().stream().filter
                        (item -> item.getStatus().equals(OrderStatus.NOT_PICKED_UP)).
                collect(Collectors.toList());
    }

    /**
     * Получить заказ по идентификатору заказа.
     *
     * @param orderId идентификатор заказа.
     * @return заказ.
     */
    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable("orderId") Long orderId) {
        return orderService.getOrderByOrderId(orderId);
    }

    /**
     * Метод удаления заказа по идентификатору заказа.
     *
     * @param orderId идентификатор заказа.
     */
    @DeleteMapping("/delete/{orderId}")
    public void deleteOrderById(@PathVariable("orderId") Long orderId) {
        orderService.deleteOrderById(orderId);
    }

//     TODO: Продумать как должен осуществляться возврат товара от покупателя

}
