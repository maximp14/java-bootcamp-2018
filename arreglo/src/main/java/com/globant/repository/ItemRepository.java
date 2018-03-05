package com.globant.repository;

import com.globant.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item,Integer>{

    List<Item> findByOrderId(Integer orderId);
}
