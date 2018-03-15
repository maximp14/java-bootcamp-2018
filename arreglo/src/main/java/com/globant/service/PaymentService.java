package com.globant.service;

import com.globant.dto.PaymentDTO;
import com.globant.model.Payment;


import java.util.List;

public interface PaymentService {

    List<Payment> getAllPayments();

    Payment getPayment(Integer paymentId);

    void addPayment(PaymentDTO paymentDTO);

    void updatePayment(Integer paymentId, PaymentDTO paymentDTO);

    void deletePayment(Integer paymentId);
}
