package com.globant.service;

import com.globant.model.Item;
import com.globant.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImp implements ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemServiceImp(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }


    @Override
    public List<Item> getAllItems(Integer orderId) {
        List<Item> items = new ArrayList<>();
        itemRepository.findByOrderId(orderId).forEach(items::add);
        return items;
    }

    @Override
    public Item getItem(Integer id) {
        return itemRepository.findOne(id);
    }

    @Override
    public void addItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void updateItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void deleteItem(Integer id) {
        itemRepository.delete(id);
    }


}
