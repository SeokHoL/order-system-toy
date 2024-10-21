package com.seokho.olinecoffee.service.customer;

import com.seokho.olinecoffee.domain.create.CreateCustomer;
import com.seokho.olinecoffee.domain.Customer;
import com.seokho.olinecoffee.domain.CustomerDto;
import com.seokho.olinecoffee.repository.customer.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public Customer newCustomer(CreateCustomer createCustomer) {
        Customer customer = Customer.newCustomer(createCustomer);
        return customerRepository.save(customer);
    }
}
