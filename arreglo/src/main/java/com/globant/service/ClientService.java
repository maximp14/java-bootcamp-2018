package com.globant.service;

import com.globant.dto.ClientDTO;
import com.globant.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();

    Client getClient(Integer id);

    void addClient(Client client);

    /// to do
//    void addClient(ClientDTO client);

    void updateClient(Integer id, Client client);

    void deleteClient(Integer id);


}
