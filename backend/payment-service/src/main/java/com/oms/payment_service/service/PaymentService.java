package com.oms.payment_service.service;

import org.springframework.stereotype.Service;

import com.oms.payment_service.dto.OrderCreatedEvent;
import com.oms.payment_service.dto.PaymentCompletedEvent;
import com.oms.payment_service.producer.PaymentEventProducer;

@Service
public class PaymentService {
    
    private final PaymentEventProducer eventProducer;

    public PaymentService(PaymentEventProducer eventProducer) {
        this.eventProducer = eventProducer;
    }

    public void processPayment(OrderCreatedEvent event) {
        // Simulate payment success
        PaymentCompletedEvent completedEvent = new PaymentCompletedEvent();
        completedEvent.setOrderId(event.getOrderId());
        completedEvent.setPaymentStatus("SUCCESS");

        eventProducer.publishPaymentCompletedEvent(completedEvent);
    }
}
