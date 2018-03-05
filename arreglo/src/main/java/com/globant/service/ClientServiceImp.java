package com.globant.service;

import com.globant.model.Client;
import com.globant.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImp implements ClientService{

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImp(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }


    @Override
    public List<Client> getAllClients() {
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(clients::add);
        return clients;
    }

    @Override
    public Client getClient(Integer id) {
        return clientRepository.findOne(id);
    }

    @Override
    public void addClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void updateClient(Integer id, Client client) {
        clientRepository.save(client);
    }

    @Override
    public void deleteClient(Integer id) {
        clientRepository.delete(id);
    }
}
