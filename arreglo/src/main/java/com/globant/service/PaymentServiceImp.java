package com.globant.service;

import com.globant.dto.PaymentDTO;
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
    public Payment getPayment(Integer paymentId) {
        return paymentRepository.findOne(paymentId);
    }

    @Override
    public void addPayment(PaymentDTO paymentDTO) {
        Payment payment = new Payment(paymentDTO.getAmaount());
        paymentRepository.save(payment);
    }

    @Override
    public void updatePayment(Integer paymentId, PaymentDTO paymentDTO) {
        Payment payment = paymentRepository.findOne(paymentId);
        payment.setAmount(paymentDTO.getAmaount());
        paymentRepository.save(payment);
    }

    @Override
    public void deletePayment(Integer paymentId) {
        paymentRepository.delete(paymentId);
    }
}
