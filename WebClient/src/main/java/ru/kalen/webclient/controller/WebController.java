package ru.kalen.webclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Контроллер веб представления.
 */
@Controller
@RequestMapping("/web")
public class WebController {

    /**
     * Получить домашнюю страничку.
     *
     * @return html-страница.
     */
    @GetMapping("/")
    public String getHomePage() {
        return "TheMainPanel";
    }

    /**
     * Получить страничку выдачи заказов.
     *
     * @return html-страница.
     */
    @GetMapping("/PickUpOrders")
    public String getPickUpOrders() {
        return "PickUpOrders";
    }

    /**
     * Получить страничку выдачи заказов по номеру телефона.
     *
     * @return html-страница.
     */
    @GetMapping("/PickUpOrderByPhone")
    public String getPickUpOrdersTest() {
        return "testPhone";
    }

    /**
     * Получить страничку работы со складом.
     *
     * @return html-страница.
     */
    @GetMapping("/WarehouseManagement")
    public String getWarehouseManagement() {
        return "WarehouseManagement";
    }

    /**
     * Получить страничку все заказов.
     *
     * @return html-страница.
     */
    @GetMapping("/allorders")
    public String getAllOrders() {
        return "ListOfAllOrdersInStock";
    }

    /**
     * Получить страничку с заказами у которых просроченные сроки.
     *
     * @return html-страница.
     */
    @GetMapping("/overdue")
    public String getAllOverdueOrders() {
        return "Overdue";
    }

    /**
     * Получить страничку с формой добавления заказов.
     *
     * @return html-страница.
     */
    @GetMapping("/add")
    public String addOrder() {
        return "AddOrder";
    }

}
