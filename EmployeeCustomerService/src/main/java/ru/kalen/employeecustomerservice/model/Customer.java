package ru.kalen.employeecustomerservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Объект с покупателем.
 */
@Entity
@Data
@RequiredArgsConstructor
@Table(name = "Customer")
public class Customer {
    /**
     * Идентификатор покупателя.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
