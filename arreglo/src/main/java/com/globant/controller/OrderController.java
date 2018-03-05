package com.globant.controller;

import com.globant.model.Order;

import com.globant.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }


    @RequestMapping("/orders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @RequestMapping("/order/{id}")
    public Order getOrder(@PathVariable Integer id){
        return orderService.getOrder(id);
    }

    @PostMapping("/order")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }

    @PutMapping("/order/{id}")
    public void updateOrder(@RequestBody Order order,@PathVariable Integer id){
        orderService.updateOrder(order,id);
    }

    @DeleteMapping("/order/{id}")
    public void deleteOrder(@PathVariable Integer id){
        orderService.deleteOrder(id);
    }


}
