package ru.kalen.pickupservice.models;

import jakarta.persistence.Column;

/**
 * Объект с покупателем.
 */
public class Customer {

    /**
     * Идентификатор покупателя.
     */
    @Column(name = "customer_id")
    private Long customerId;

    /**
     * Имя покупателя.
     */
    private String name;
    /**
     * Номер телефона покупателя.
     */
    private String phone;
    /**
     * Код проверки.
     */
    @Column(name = "verification_code")
    private int codeVerification;
}
