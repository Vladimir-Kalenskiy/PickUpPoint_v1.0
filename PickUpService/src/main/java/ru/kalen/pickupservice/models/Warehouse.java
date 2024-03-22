package ru.kalen.pickupservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Объект местанахождения товара на складе.
 */
@Table(name = "warehouse")
@Data
public class Warehouse {
    /**
     * Идентификатор товара.
     */
    @Column(name = "product_id")
    private Long productId;
    /**
     * Номер стеллажа на складе.
     */
    @Column(name = "shelf_number")
    private int shelfNumber;
    /**
     * Место товара на полке.
     */
    @Column(name = "product_location")
    private int productLocation;
}
