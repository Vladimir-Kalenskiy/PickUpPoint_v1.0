package ru.kalen.pickupservice.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Объект товара.
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "products")
public class Product {
    /**
     * Идентификатор товара.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;
    /**
     * Наименование товара.
     */
    @Column(name = "name_product")
    private String name;
    /**
     * Описание к товару.
     */
    @Column(name = "description")
    private String description;
    /**
     * Количество товаров.
     */
    @Column(name = "count")
    private int count;
    /**
     * Цена товара.
     */
    @Column(name = "price")
    private BigDecimal price;
}
