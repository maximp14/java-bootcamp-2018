package com.globant.service;

import com.globant.model.Payment;
import com.globant.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentServiceImp implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImp(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    @Override
    public List<Payment> getAllPayments() {
//        List<Payment> payments = new ArrayList<>();
//        paymentRepository.findAll().forEach(payments::add);
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPayment(Integer id) {
        return paymentRepository.findOne(id);
    }

    @Override
    public void addPayment(Payment payment) {
        paymentRepository.save(payment);
    }

    @Override
    public void updatePayment(Integer id, Payment payment) {
        paymentRepository.save(payment);
    }

    @Override
    public void deletePayment(Integer id) {
        paymentRepository.delete(id);
    }
}
