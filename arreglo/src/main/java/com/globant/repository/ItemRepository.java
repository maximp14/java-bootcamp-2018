package com.globant.repository;

import com.globant.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Integer> {

    List<Item> findByOrderId(Integer orderId);
}
