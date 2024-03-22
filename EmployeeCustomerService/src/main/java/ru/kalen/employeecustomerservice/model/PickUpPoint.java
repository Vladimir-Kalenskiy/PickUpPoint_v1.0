package ru.kalen.employeecustomerservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Объект пункт выдачи заказов.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "pick_up_point")
public class PickUpPoint {
    /**
     * Идентификатор пункта выдачи заказов.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pick_up_point_id")
    private Long pickUpPointId;
    /**
     * Адрес пункта выдачи заказов.
     */
    private String address;
    /**
     * Часы работы пункта выдачи заказов.
     */
    @Column(name = "working_hourse")
    private String workingHours;
}
