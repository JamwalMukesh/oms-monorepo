package com.oms.order_service.service;

import org.springframework.stereotype.Service;

import com.oms.order_service.dto.CreateOrderRequest;
import com.oms.order_service.dto.OrderCreatedEvent;
import com.oms.order_service.model.Order;
import com.oms.order_service.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderEventProducer orderEventProducer;

    public OrderService(OrderRepository orderRepository, OrderEventProducer orderEventProducer) {
        this.orderRepository = orderRepository;
        this.orderEventProducer = orderEventProducer;
    }

    public Order createOrder(CreateOrderRequest request) {
        Order order = new Order();
        order.setProductName(request.getProductName());
        order.setQuantity(request.getQuantity());
        order.setPrice(request.getPrice());
        order.setStatus("CREATED");
        
        Order savedOrder = orderRepository.save(order);

        OrderCreatedEvent event = new OrderCreatedEvent();
        event.setOrderId(savedOrder.getId());
        event.setProductName(savedOrder.getProductName());
        event.setQuantity(savedOrder.getQuantity());
        event.setPrice(savedOrder.getPrice());

        orderEventProducer.publishOrderCreatedEvent(event);

        return savedOrder;
    }
}
