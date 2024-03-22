package ru.kalen.pickupservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kalen.pickupservice.models.Order;

import java.util.List;

/**
 * Репозиторий для работы с сущностью заказ.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    /**
     * Нахождение заказов по номеру телефона покупателя.
     *
     * @param phone номер телефона покупателя.
     * @return список заказов.
     */
    @Query(nativeQuery = true,
            value = "SELECT o.order_id,o.status,o.pick_up_point_id,c.customer_id,c.name,c.phone,o.order_date " +
                    "FROM orders o JOIN customer c on o.customer_id = c.customer_id WHERE c.phone = ?;")
    List<Order> getOrderByCustomerPhone(String phone);

    /**
     * Нахождение заказа по идентификатора заказа.
     *
     * @param orderId - индефикатор заказа.
     * @return сущностью заказ.
     */
    Order getOrderByOrderId(Long orderId);

    /**
     * Нахождение готовых к выдачи заказов по номеру телефона покупателя.
     *
     * @param phone номер телфона покупателя.
     * @return список заказов.
     */
    @Query(nativeQuery = true,
            value = "SELECT o.order_id,o.status,o.pick_up_point_id,c.customer_id,c.name,c.phone,o.order_date " +
                    "FROM orders o JOIN customer c on o.customer_id = c.customer_id " +
                    "WHERE o.status = 'READY_FOR_PICKUP' AND c.phone = ?;")
    List<Order> findReadyOrdersByPhone(String phone);

    /**
     * Получить список заказов с центрального склада.
     *
     * @return список заказов.
     */
    @Query(nativeQuery = true,
            value = "SELECT * FROM ordersOfCentral")
    List<Order> getAllOrdersOfCental();
}
