package ru.kalen.employeecustomerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kalen.employeecustomerservice.model.Employee;
import ru.kalen.employeecustomerservice.service.EmployeeService;

import java.util.List;

/**
 * Контроллер для работы с сущностью работник.
 */
@RestController
@RequestMapping("/api/empl")
@RequiredArgsConstructor
public class EmployeeController {
    /**
     * Сервис для работы с сущностью работник.
     */
    private final EmployeeService employeeService;

    /**
     * Получить список всех работников.
     *
     * @return список работников.
     */
    @GetMapping("/")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }
}
