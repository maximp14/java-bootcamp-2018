package com.globant.service;

import com.globant.model.Order;

import com.globant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderServiceImp implements OrderService{


    private final OrderRepository orderRepository;

    @Autowired
    public  OrderServiceImp(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrders(){
//        List<Order> orders = new ArrayList<>();
//        orderRepository.findAll().forEach(orders :: add);
        return orderRepository.findAll();
    }

    @Override
    public Order getOrder(Integer id){
        return orderRepository.findOne(id);
    }

    @Override
    public void addOrder(Order order){
         orderRepository.save(order);
    }

    @Override
    public void updateOrder(Order order, Integer id){
        orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Integer id){
        orderRepository.delete(id);
    }

}
