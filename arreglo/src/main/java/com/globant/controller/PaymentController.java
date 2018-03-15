package com.globant.controller;

import com.globant.dto.PaymentDTO;
import com.globant.model.Payment;
import com.globant.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @RequestMapping("/payments")
    public List<Payment>getAllPayments(){
        return paymentService.getAllPayments();
    }

    @RequestMapping("/payment/{paymentId}")
    public Payment getPayment(@PathVariable("paymentId") Integer paymentId){
        return paymentService.getPayment(paymentId);
    }

    @PostMapping("/payment")
    public void addPayment(@RequestBody PaymentDTO paymentDTO){
        paymentService.addPayment(paymentDTO);
    }

    @PutMapping("/payment/{paymentId}")
    public void updatePayment(@PathVariable("paymentId") Integer paymentId, @RequestBody PaymentDTO paymentDTO){
        paymentService.updatePayment(paymentId, paymentDTO);
    }

    @DeleteMapping("/payment/{paymentId}")
    public void deletePayment(@PathVariable("paymentId") Integer paymentId){
        paymentService.deletePayment(paymentId);
    }
}
