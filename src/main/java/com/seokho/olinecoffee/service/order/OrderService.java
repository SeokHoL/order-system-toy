package com.seokho.olinecoffee.service.order;

import com.seokho.olinecoffee.domain.create.CreateOrder;
import com.seokho.olinecoffee.domain.Order;
import com.seokho.olinecoffee.repository.order.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void order(CreateOrder createOrder) {
        Order order = Order.newOrder(createOrder);
        orderRepository.save(order);
    }
}