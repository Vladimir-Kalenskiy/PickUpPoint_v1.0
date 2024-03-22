package ru.kalen.employeecustomerservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kalen.employeecustomerservice.model.Employee;
import ru.kalen.employeecustomerservice.repository.EmployeeRepository;

import java.util.List;

/**
 * Сервис для работы с сущностью работник.
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {
    /**
     * Репозиторий для работы с сущностью работник.
     */
    private final EmployeeRepository employeeRepository;

    /**
     * Получить список всех работников.
     *
     * @return список работников.
     */
    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }
}
