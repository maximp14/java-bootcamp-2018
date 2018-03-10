package com.globant.controller;

import com.globant.model.Item;
import com.globant.model.Order;
import com.globant.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @RequestMapping("/items")
    public List<Item> getAllItems(@RequestParam(value = "orderId") Integer orderId){
        return itemService.getAllItems(orderId);
    }

    @RequestMapping("/item")
    public Item getItem(@RequestParam(value = "itemId") Integer itemId){
        return itemService.getItem(itemId);
    }

    @PostMapping("/item")
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @PutMapping("/item")
    public void updateItem(@RequestBody Item item){
        itemService.updateItem(item);
    }

    @DeleteMapping("/item")
    public void deleteItem(@RequestParam(value = "itemID") Integer itemId){
        itemService.deleteItem(itemId);
    }

}
