package com.globant.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class ClientDTO {

    private Integer clientId;
    private String name;
    private String lastName;
    private String description;
    private List<Integer>paymentsId;

    public ClientDTO() {
    }

    public ClientDTO( String name, String lastName, String description) {

        this.name = name;
        this.lastName = lastName;
        this.description = description;

    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Integer> getPaymentsId() {
        return paymentsId;
    }

    public void setPaymentsId(List<Integer> paymentsId) {
        this.paymentsId = paymentsId;
    }
}
