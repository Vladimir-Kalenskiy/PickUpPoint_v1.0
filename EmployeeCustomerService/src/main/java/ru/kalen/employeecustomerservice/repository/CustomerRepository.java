package ru.kalen.employeecustomerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kalen.employeecustomerservice.model.Customer;

/**
 * Репозиторий для работы с сущностью покупатель.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    /**
     * Найти покупателя по номеру телефона.
     *
     * @param phone номер телефона покупателя.
     * @return сущность покупателя.
     */
    @Query(nativeQuery = true, value = "SELECT * FROM customer c WHERE c.phone = ?;")
    Customer findCustomerByPhone(String phone);
}
