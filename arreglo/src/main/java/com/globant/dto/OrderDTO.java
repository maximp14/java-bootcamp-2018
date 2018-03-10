package com.globant.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class OrderDTO {

    private Integer orderId;
    private String name;
    private List<Integer> itemsId;

    public OrderDTO() {
    }

    public OrderDTO(Integer orderId, String name, List<Integer> itemsId) {
        this.orderId = orderId;
        this.name = name;
        this.itemsId = itemsId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getItemsId() {
        return itemsId;
    }

    public void setItemsId(List<Integer> itemsId) {
        this.itemsId = itemsId;
    }
}
