package com.oms.payment_service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.oms.payment_service.dto.OrderCreatedEvent;
import com.oms.payment_service.service.PaymentService;

@Service
public class OrderCreatedConsumer {
    private final PaymentService paymentService;

    public OrderCreatedConsumer(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @KafkaListener(
        topics = "order-created-topic",
        groupId = "payment-group",
        containerFactory = "kafkaListenerContainerFactory"
    )
    public void consume(OrderCreatedEvent event) {
        paymentService.processPayment(event);
    }
}
