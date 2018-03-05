package com.globant.model;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private float amount;

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

    public float getAmaount() {
        return amount;
    }

    public void setAmaount(float amount) {
        this.amount = amount;
    }
}
