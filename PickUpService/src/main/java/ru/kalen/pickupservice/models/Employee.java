package ru.kalen.pickupservice.models;

import jakarta.persistence.Column;

/**
 * Объект с работником.
 */
public class Employee {
    /**
     * Идентификатор работника.
     */
    @Column(name = "employee_id")
    private Long employeeId;
    /**
     * Имя работника.
     */
    private String name;
    /**
     * Должность работника.
     */
    private String position;
    /**
     * Идентификатор пункта выдачи заказов.
     */
    @Column(name = "pick_up_point_id")
    private int pickUpPointId;
}
