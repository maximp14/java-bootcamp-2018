package com.globant.service;

import com.globant.dto.OrderDTO;
import com.globant.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order getOrder(Integer orderId);

    void addOrder(OrderDTO orderDTO);

    void updateOrder(Integer orderId, OrderDTO orderDTO);

    void deleteOrder(Integer orderId);


}
