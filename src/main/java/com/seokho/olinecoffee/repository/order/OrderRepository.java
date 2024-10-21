package com.seokho.olinecoffee.repository.order;

import com.seokho.olinecoffee.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
