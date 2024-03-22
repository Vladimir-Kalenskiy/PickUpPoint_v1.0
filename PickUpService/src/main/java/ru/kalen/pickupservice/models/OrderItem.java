package ru.kalen.pickupservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Объект элемента заказа.
 */
@Table(name = "order_item")
@NoArgsConstructor
public class OrderItem {

    /**
     * Сущность заказа.
     */
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

    /**
     * Сущность товара.
     */
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    /**
     * Количество товаров.
     */
    @Column(name = "product_quantity")
    private int productQuantity;

    /**
     * Цена товара.
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * Конструктор класса.
     *
     * @param order           сущность заказа.
     * @param product         сущность товара.
     * @param productQuantity количество товаров.
     */
    public OrderItem(Order order, Product product, int productQuantity) {
        this.order = order;
        this.product = product;
        this.productQuantity = productQuantity;
        this.price = product.getPrice().multiply(BigDecimal.valueOf(productQuantity));
    }
}
