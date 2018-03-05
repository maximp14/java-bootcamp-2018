package com.globant.service;

import com.globant.model.Item;


import java.util.List;

public interface ItemService {

    List<Item> getAllItems(Integer orderId);

    Item getItem(Integer id);

    void addItem(Item item);

    void updateItem( Item item);

    void deleteItem(Integer id);

}
