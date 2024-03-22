package ru.kalen.pickupservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kalen.pickupservice.models.Order;
import ru.kalen.pickupservice.repository.OrderRepository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Сервис для работы с заказами.
 */
@Service
@RequiredArgsConstructor
public class OrderService {

    /**
     * Репозиторий для работы с сущностью заказ.
     */
    private final OrderRepository orderRepository;

    /**
     * Получить список всех заказов на конкретном филиале.
     *
     * @return список заказов.
     */
    public List<Order> getAllOrdersFromPickUpPoint() {
        int pickUpPointId = 1;
        return orderRepository.findAll().stream().filter
                (order -> (order.getPickUpPointId() == pickUpPointId)).collect(Collectors.toList());
    }

    /**
     * Получить список заказов по номеру тулефона покупателя.
     *
     * @param phone номер телефона покупателя.
     * @return список заказов.
     */
    public List<Order> getOrderByPhone(String phone) {
        return orderRepository.getOrderByCustomerPhone(phone);
    }

    /**
     * Добавить новый заказ.
     *
     * @param order заказ.
     * @return заказ.
     */
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    /**
     * Получить заказ по идентификатору заказа.
     *
     * @param orderId идентификатор заказа.
     * @return заказ.
     */
    public Order getOrderByOrderId(Long orderId) {
        return orderRepository.getOrderByOrderId(orderId);
    }

    /**
     * Удаление заказа по идентификатору заказа.
     *
     * @param orderId идентификатор заказа.
     */
    public void deleteOrderById(Long orderId) {
        orderRepository.deleteById(orderId);
    }

    /**
     * Получить список заказов готовых к выдачи по номеру телефона покупателя.
     *
     * @param phone номер телефона покупателя.
     * @return список заказов.
     */
    public List<Order> findReadyOrdersByPhone(String phone) {
        return orderRepository.findReadyOrdersByPhone(phone);
    }

    /**
     * Получить список заказов от центрального склада.
     *
     * @return список заказов.
     */
    public List<Order> getAllOrdersOfCentral() {
        return orderRepository.getAllOrdersOfCental();
    }
}
