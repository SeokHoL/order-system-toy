package com.seokho.olinecoffee.repository.customer;

import com.seokho.olinecoffee.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
}
