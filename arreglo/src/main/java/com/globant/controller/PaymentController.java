package com.globant.controller;

import com.globant.model.Payment;
import com.globant.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    private PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @RequestMapping("/payments")
    public List<Payment>getAllPayments(){
        return paymentService.getAllPayments();
    }

    @RequestMapping("/payment/{id}")
    public Payment getPayment(@PathVariable Integer id){
        return paymentService.getPayment(id);
    }

    @PostMapping("/payment")
    public void addPayment(@RequestBody Payment payment){
        paymentService.addPayment(payment);
    }

    @PutMapping("/payment/{id}")
    public void updatePayment(@PathVariable Integer id, @RequestBody Payment payment){
        paymentService.updatePayment(id, payment);
    }

    @DeleteMapping("/payment/{id}")
    public void deletePayment(@PathVariable Integer id){
        paymentService.deletePayment(id);
    }
}
