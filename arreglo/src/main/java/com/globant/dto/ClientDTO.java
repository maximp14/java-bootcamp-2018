package com.globant.dto;

import java.util.List;

//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class ClientDTO {

    private Integer clientId;
    private String firstName;
    private String lastName;
    private String description;
    private List<Integer>paymentsId;

    public ClientDTO() {
    }

    public ClientDTO( String name, String lastName, String description) {

        this.firstName = name;
        this.lastName = lastName;
        this.description = description;

    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
