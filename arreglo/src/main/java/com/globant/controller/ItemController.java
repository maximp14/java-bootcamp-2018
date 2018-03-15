package com.globant.controller;

import com.globant.dto.ItemDTO;
import com.globant.model.Item;
import com.globant.model.Order;
import com.globant.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @RequestMapping("/items")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @RequestMapping("/item/{itemId}")
    public Item getItem(@PathVariable("itemId") Integer itemId){
        return itemService.getItem(itemId);
    }

    @PostMapping("/item")
    public void addItem(@RequestBody ItemDTO itemDTO){
        itemService.addItem(itemDTO);
    }

    @PutMapping("/item/{itemId}")
    public void updateItem(@PathVariable("itemId") Integer itemId ,@RequestBody ItemDTO itemDTO){
        itemService.updateItem(itemId, itemDTO);
    }

    @DeleteMapping("/item/{itemId}")
    public void deleteItem(@PathVariable("itemId") Integer itemId){
        itemService.deleteItem(itemId);
    }

}
