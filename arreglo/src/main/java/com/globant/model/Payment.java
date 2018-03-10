package com.globant.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
//for some reason loombok do not work, i'll investigate later
/// /@Data
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private float amount;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(foreignKey = @ForeignKey(name = "payment_order"), name = "ORDER_ID")
    private Order order;

    public Payment() {
    }

    public Payment(Integer id, float amount) {
        this.id = id;
        this.amount = amount;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
