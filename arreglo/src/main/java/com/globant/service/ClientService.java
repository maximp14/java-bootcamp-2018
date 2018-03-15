package com.globant.service;

import com.globant.dto.ClientDTO;
import com.globant.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();

    Client getClient(Integer clientId);

//    void addClient(Client client);


    void addClient(ClientDTO clientDTO);

//    void updateClient(Integer id, Client client);

    void updateClient(Integer clientId, ClientDTO clientDTO);

    void deleteClient(Integer clientId);


}
