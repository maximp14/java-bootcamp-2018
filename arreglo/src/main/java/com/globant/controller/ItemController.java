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

    @RequestMapping("/order/{orderId}/items}")
    public List<Item> getAllItems(@PathVariable Integer orderId){
        return itemService.getAllItems(orderId);
    }

    @RequestMapping("/order/{orderId}/item/{id}")
    public Item getItem(@PathVariable Integer id){
        return itemService.getItem(id);
    }

    @PostMapping("/order/orderId/item")
    public void addItem(@RequestBody Item item,@PathVariable Integer orderId){
        item.setOrder(new Order(orderId,""));
        itemService.addItem(item);
    }

    @PutMapping("/order/orderId/item/{id}")
    public void updateItem(@RequestBody Item item,@PathVariable Integer orderId,@PathVariable Integer id){
        item.setOrder(new Order(orderId,""));
        itemService.updateItem(item);
    }

    @DeleteMapping("/order/{orderId}/item/{id}")
    public void deleteItem(@PathVariable Integer id){
        itemService.deleteItem(id);
    }

}
