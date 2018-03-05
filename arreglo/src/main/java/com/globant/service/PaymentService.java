package com.globant.service;

import com.globant.model.Payment;


import java.util.List;

public interface PaymentService {

    List<Payment> getAllPayments();

    Payment getPayment(Integer id);

    void addPayment(Payment payment);

    void updatePayment(Integer id, Payment payment);

    void deletePayment(Integer id);
}
