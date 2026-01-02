package com.oms.order_service.service;

import org.springframework.stereotype.Service;

import com.oms.order_service.dto.CreateOrderRequest;
import com.oms.order_service.model.Order;
import com.oms.order_service.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(CreateOrderRequest request) {
        Order order = new Order();
        order.setProductName(request.getProductName());
        order.setQuantity(request.getQuantity());
        order.setPrice(request.getPrice());
        order.setStatus("CREATED");
        
        return orderRepository.save(order);
    }
}
