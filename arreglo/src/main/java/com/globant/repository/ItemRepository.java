package com.globant.repository;

import com.globant.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ItemRepository extends JpaRepository<Item,Integer> {


}
