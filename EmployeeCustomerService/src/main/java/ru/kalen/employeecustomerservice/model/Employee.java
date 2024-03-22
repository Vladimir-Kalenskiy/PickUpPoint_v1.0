package ru.kalen.employeecustomerservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Объект с работником.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    /**
     * Идентификатор работника.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
