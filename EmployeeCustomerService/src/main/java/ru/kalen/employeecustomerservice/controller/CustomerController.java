package ru.kalen.employeecustomerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kalen.employeecustomerservice.model.Customer;
import ru.kalen.employeecustomerservice.service.CustomerService;

/**
 * Контроллер для работы с сущность покупатель.
 */
@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    /**
     * Сервис для работы с сущностью покупатель.
     */
    private final CustomerService customerService;

    /**
     * Получить объект покупатель по номеру телефона.
     *
     * @param phone номер телефона покупателя.
     * @return объект покупатель.
     */
    @GetMapping("/code/{phone}")
    public Customer findCustomerByPhone(@PathVariable("phone") String phone) {
        return customerService.findCustomerByPhone(phone);
    }
}
