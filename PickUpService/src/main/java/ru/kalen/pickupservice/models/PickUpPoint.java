package ru.kalen.pickupservice.models;

import jakarta.persistence.Column;

/**
 * Объект пункт выдачи заказов.
 */
public class PickUpPoint {
    /**
     * Идентификатор пункта выдачи заказов.
     */
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
