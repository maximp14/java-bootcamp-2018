package com.globant.model;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
//for some reason loombok do not work, i'll investigate later
//@Data
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;


    public Item(Integer id, String name) {
        this.id = id;
        this.name = name;
       // this.order = new Order(orderId,"");
    }

    public Item() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
