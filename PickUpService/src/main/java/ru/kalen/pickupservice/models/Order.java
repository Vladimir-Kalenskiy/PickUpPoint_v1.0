package ru.kalen.pickupservice.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import ru.kalen.pickupservice.models.enam.OrderStatus;

import java.time.LocalDateTime;

/**
 * Объект с заказом.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    /**
     * Идентификатор заказа.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;
    /**
     * Идентификатор покупателя.
     */
    @Column(name = "customer_id")
    private Long customerId;
    /**
     * Статус заказа.
     */
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    /**
     * Идентификатор пункта выдачи заказов.
     */
    @Column(name = "pick_up_point_id")
    private Long pickUpPointId;
    /**
     * Дата создания заказа.
     */
    @Column(name = "order_date")
    @CreationTimestamp
    private LocalDateTime orderDate;

    /**
     * Конструктор класса заказ.
     *
     * @param orderId       идентификатор заказа
     * @param customerId    идентификатор покупателя
     * @param status        статус заказа
     * @param pickUpPointId идентификатор пункта выдачи заказов
     */
    public Order(Long orderId, Long customerId, OrderStatus status, Long pickUpPointId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.status = status;
        this.pickUpPointId = pickUpPointId;
        this.orderDate = LocalDateTime.now();
    }
}
