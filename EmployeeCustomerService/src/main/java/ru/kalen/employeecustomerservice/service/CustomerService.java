package ru.kalen.employeecustomerservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kalen.employeecustomerservice.model.Customer;
import ru.kalen.employeecustomerservice.repository.CustomerRepository;

/**
 * Сервис для работы с покупателями.
 */
@Service
@RequiredArgsConstructor
public class CustomerService {
    /**
     * Репозиторий для работы с сущность покупатель.
     */
    private final CustomerRepository customerRepository;

    /**
     * Получение объекта покупателя по номеру телефона.
     *
     * @param phone номер телефона покупателя.
     * @return объект покупателя
     */
    public Customer findCustomerByPhone(String phone) {
        return customerRepository.findCustomerByPhone(phone);
    }
}
