package com.globant.service;

import com.globant.dto.ClientDTO;
import com.globant.model.Client;
import com.globant.repository.ClientRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@RunWith(MockitoJUnitRunner.class)
public class ClientServiceImpTest {

    private ClientDTO clientDTO;

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientServiceImp clientServiceImp;


    @Before
    public void setUp(){
        initMocks(ClientServiceImpTest.class);
        clientDTO = new ClientDTO("Maxi","Pavolini","Cansado");
    }


    @Test
    public void listAllClientsTest(){

        /// not sure about this---------------------------
        Client client = new Client(clientDTO.getFirstName(),clientDTO.getLastName(),clientDTO.getDescription());
        List<Client> clients = new ArrayList<>();
        clients.add(client);
        when(clientRepository.findAll()).thenReturn(clients);
        clientServiceImp.getAllClients();
        Mockito.verify(clientRepository,times(1)).findAll();
    }

    @Test
    public void givenIdReturnClientTest(){
        Client client = new Client(clientDTO.getFirstName(),clientDTO.getLastName(),clientDTO.getDescription());
        when(clientRepository.findOne(anyInt())).thenReturn(client);
        Client c = clientServiceImp.getClient(1);
        assertEquals(client,c);
        Mockito.verify(clientRepository,times( 1)).findOne(anyInt());

    }


//       not quit sure
    @Test(expected = Exception.class)
    public void givenIdReturnClientNullTest() throws Exception{
        when(clientRepository.findOne(anyInt())).thenReturn(null);
        Client c = clientServiceImp.getClient(1);
        assertEquals(null,c.getFirstName());
        Mockito.verify(clientRepository,times(1)).findOne(anyInt());

    }


    @Test
    public void shouldCreateClientTest(){
        Client client = new Client(clientDTO.getFirstName(),clientDTO.getLastName(),clientDTO.getDescription());
        when(clientRepository.save(any(Client.class))).thenReturn(client);
        clientServiceImp.addClient(clientDTO);
//        assertEquals("Maxi",clientDTO.getFirstName());
        Mockito.verify(clientRepository, times(1)).save(any(Client.class));
    }







}
