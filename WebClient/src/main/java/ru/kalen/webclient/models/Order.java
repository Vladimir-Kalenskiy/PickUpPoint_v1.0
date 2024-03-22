package ru.kalen.webclient.models;

import lombok.Data;
import ru.kalen.webclient.models.enam.OrderStatus;

import java.time.LocalDateTime;


/**
 * Объект с заказом.
 */
@Data
public class Order {
    /**
     * Идентификатор заказа.
     */
    private Long orderId;
    /**
     * Идентификатор покупателя.
     */
    private Long customerId;
    /**
     * Статус заказа.
     */
    private OrderStatus status; // Enum для статуса заказа (ACCEPTED, READY_FOR_PICKUP, COMPLETED, NOT_PICKED_UP)
    /**
     * Идентификатор пункта выдачи заказов.
     */
    private Long pickUpPointId;
    /**
     * Дата и время заказа.
     */
    private LocalDateTime orderDate;
}
