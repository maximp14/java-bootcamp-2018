package com.globant.service;

import com.globant.dto.ItemDTO;
import com.globant.model.Item;
import com.globant.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ItemServiceImp implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImp(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }


    @Override
    public List<Item> getAllItems() {
        //List<Item> items = new ArrayList<>();
        //itemRepository.findByOrderId(orderId).forEach(items::add);
        return itemRepository.findAll();
    }

    @Override
    public Item getItem(Integer itemId) {
        return itemRepository.findOne(itemId);
    }

    @Override
    public void addItem(ItemDTO itemDTO) {
        Item item = new Item(itemDTO.getName());
        itemRepository.save(item);
    }

    @Override
    public void updateItem(Integer itemId, ItemDTO itemDTO) {
        Item item = itemRepository.findOne(itemId);
        item.setName(itemDTO.getName());
        itemRepository.save(item);
    }

    @Override
    public void deleteItem(Integer itemId) {
        itemRepository.delete(itemId);
    }


}
