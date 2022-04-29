package br.com.provaapi.service;
import br.com.provaapi.model.Clients;
import br.com.provaapi.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientsService {
    @Autowired
    private ClientsRepository clientsRepository;

    public void insert (Clients clients){
        clientsRepository.save(clients);
    }

    public List<Clients> findAll (){
        return clientsRepository.findAll();
    }
}
