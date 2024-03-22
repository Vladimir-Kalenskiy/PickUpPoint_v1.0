package ru.kalen.employeecustomerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kalen.employeecustomerservice.model.Employee;

import java.util.List;

/**
 * Репозиторий для работы с сущность работник.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /**
     * Получить список всех работников.
     *
     * @return список работников.
     */
    @Query(nativeQuery = true,
            value = "SELECT * FROM employee e;")
    List<Employee> getAllEmployee();
}
