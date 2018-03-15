package com.globant.controller;

import com.globant.dto.ClientDTO;
import com.globant.model.Client;
import com.globant.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @RequestMapping("/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @RequestMapping("/client/{clientId}")
    public Client getClient(@PathVariable("clientId") Integer clientId){
        return clientService.getClient(clientId);
    }

//    @PostMapping("/client")
//    public void addClient(@RequestBody Client client){
//
//        clientService.addClient(client);
//    }

    @PostMapping("/client")
    public void addClient(@RequestBody ClientDTO clientDTO){
        clientService.addClient(clientDTO);
    }

    @PutMapping("/client/{clientId}")
    public void updateClient(@PathVariable("clientId") Integer clientId,@RequestBody ClientDTO clientDTO){
        clientService.updateClient(clientId,clientDTO);
    }

    @DeleteMapping("/client/{clientId}")
    public void deleteClient(@PathVariable("clientId") Integer clientId){
        clientService.deleteClient(clientId);
    }

}
