package com.globant.model;



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
    @ManyToOne
    @JoinColumn(name = "PEDIDO_ID")
    private Order order;

    public Item(String name) {
        this.name = name;
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
