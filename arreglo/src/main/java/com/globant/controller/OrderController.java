package com.globant.controller;

import com.globant.dto.OrderDTO;
import com.globant.model.Order;

import com.globant.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }


    @RequestMapping("/orders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @RequestMapping("/order/{orderId}")
    public Order getOrder(@PathVariable("orderId") Integer orderId){
        return orderService.getOrder(orderId);
    }

    @PostMapping("/order")
    public void addOrder(@RequestBody OrderDTO orderDTO){
        orderService.addOrder(orderDTO);
    }

    @PutMapping("/order/{orderId}")
    public void updateOrder(@PathVariable("orderId") Integer orderId, @RequestBody OrderDTO orderDTO){
        orderService.updateOrder(orderId, orderDTO);
    }

    @DeleteMapping("/order/{orderId}")
    public void deleteOrder(@PathVariable("orderId") Integer orderId){
        orderService.deleteOrder(orderId);
    }


}
