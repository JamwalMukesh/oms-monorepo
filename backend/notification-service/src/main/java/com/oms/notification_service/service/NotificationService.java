package com.oms.notification_service.service;

import org.springframework.stereotype.Service;
import com.oms.notification_service.dto.PaymentCompletedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class NotificationService {
    
    private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void notifyUser(PaymentCompletedEvent event) {
        // Logic to notify user about payment completion
        logger.info("Notification sent for Order ID: {} with Payment Status: {}", event.getOrderId(), event.getPaymentStatus());    
    }
}
