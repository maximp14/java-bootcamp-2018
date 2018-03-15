package com.globant.service;

import com.globant.dto.ItemDTO;
import com.globant.model.Item;


import java.util.List;

public interface ItemService {

    List<Item> getAllItems();

    Item getItem(Integer itemId);

//    void addItem(Item item);

    void addItem(ItemDTO itemDTO);

//    void updateItem(Item item);

    void updateItem(Integer itemId, ItemDTO itemDTO);

    void deleteItem(Integer itemId);

}
