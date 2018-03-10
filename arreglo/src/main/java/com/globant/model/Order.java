package com.globant.model;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
//for some reason loombok do not work, i'll investigate later
//@Data
@Entity
@Table(name = "pedido")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(foreignKey = @ForeignKey(name = "order_item"), name = "ITEM_ID")
    private List<Item> items;

    public Order(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Order() {
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
