package com.globant.service;

import com.globant.dto.ClientDTO;
import com.globant.model.Client;
import com.globant.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService{

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImp(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }


    @Override
    public List<Client> getAllClients() {
       // List<Client> clients = new ArrayList<>();
       /// clientRepository.findAll().forEach(clients::add);
        return clientRepository.findAll();
    }

    @Override
    public Client getClient(Integer clientId) {
        return clientRepository.findOne(clientId);
    }

//    @Override
//    public void addClient(Client client) {
//        clientRepository.save(client);
//    }

    // is this ok?
    @Override
    public void addClient(ClientDTO clientDTO) {
        Client client = new Client(clientDTO.getFirstName(),clientDTO.getLastName(),clientDTO.getDescription());
        clientRepository.save(client);
    }

    @Override
    public void updateClient(Integer clientId, ClientDTO clientDTO) {

        Client client = clientRepository.findOne(clientId);
        client.setFirstName(clientDTO.getFirstName());
        client.setLastName(clientDTO.getLastName());
        client.setDescription(clientDTO.getDescription());
        

        clientRepository.save(client);
    }

    @Override
    public void deleteClient(Integer clientId) {
        clientRepository.delete(clientId);
    }
}
