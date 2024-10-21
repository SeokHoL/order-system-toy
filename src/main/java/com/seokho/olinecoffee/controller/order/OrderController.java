package com.seokho.olinecoffee.controller.order;

import com.seokho.olinecoffee.controller.response.Response;
import com.seokho.olinecoffee.domain.create.CreateOrder;
import com.seokho.olinecoffee.service.order.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {
    private final OrderService orderService;

    OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/v1/order")
    public Response<Integer> newOrder() {
        HashMap<Integer, Integer> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1, 10);
        orderService.order(CreateOrder.builder()
                .customerId(1)
                .quantityByProduct(objectObjectHashMap)
                .build());

        return Response.ok(1000);
    }
}