package com.globant.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class PaymentDTO {

    private Integer paymentId;
    private float amaount;
    private Integer orderId;

    public PaymentDTO() {
    }

    public PaymentDTO(Integer paymentId, float amaount, Integer orderId) {
        this.paymentId = paymentId;
        this.amaount = amaount;
        this.orderId = orderId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public float getAmaount() {
        return amaount;
    }

    public void setAmaount(float amaount) {
        this.amaount = amaount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
