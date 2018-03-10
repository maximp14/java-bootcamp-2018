package com.globant.controller;

import com.globant.dto.ClientDTO;
import com.globant.model.Client;
import com.globant.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @RequestMapping("/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @RequestMapping("/client/{id}")
    public Client getClient(@PathVariable Integer id){
        return clientService.getClient(id);
    }

    @PostMapping("/client")
    public void addClient(@RequestBody Client client){

        clientService.addClient(client);
    }

//    @PostMapping("/client")
//    public void addClient(@RequestBody ClientDTO clientDTO){
//        clientService.addClient(clientDTO);
//    }

    @PutMapping("/client/{id}")
    public void updateClient(@PathVariable Integer id,@RequestBody Client client){
        clientService.updateClient(id,client);
    }

    @DeleteMapping("/client/{id}")
    public void deleteClient(@PathVariable Integer id){
        clientService.deleteClient(id);
    }

}
