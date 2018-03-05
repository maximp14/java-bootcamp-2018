package com.globant.service;

import com.globant.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order getOrder(Integer id);

    void addOrder(Order order);

    void updateOrder(Order order, Integer id);

    void deleteOrder(Integer id);


}
