package com.oms.order_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.order_service.dto.CreateOrderRequest;
import com.oms.order_service.model.Order;
import com.oms.order_service.service.OrderService;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderController {
    
    private final OrderService orderService;
    
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order createOrder(@RequestBody CreateOrderRequest request) {
        // Implementation will go here
        return orderService.createOrder(request);
    }
}
