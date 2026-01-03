package com.oms.payment_service.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.oms.payment_service.dto.PaymentCompletedEvent;

@Service
public class PaymentEventProducer {
    private final KafkaTemplate<String,PaymentCompletedEvent> kafkaTemplate;

    public PaymentEventProducer(KafkaTemplate<String, PaymentCompletedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishPaymentCompletedEvent(PaymentCompletedEvent event) {
        kafkaTemplate.send("payment_completed_topic", event);
    }
}
