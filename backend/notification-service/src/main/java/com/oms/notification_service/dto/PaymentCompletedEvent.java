package com.oms.notification_service.dto;

public class PaymentCompletedEvent {
    
    private Long orderId;
    private String paymentStatus;

    // generate getters and setters for all fields
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getPaymentStatus() {
        return paymentStatus;   
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
