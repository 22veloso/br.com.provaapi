package br.com.provaapi.controller;
import br.com.provaapi.constant.Constant;
import br.com.provaapi.model.Clients;
import br.com.provaapi.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ClientsController {
    @Autowired

    private ClientsService clientsService;
    @PostMapping(Constant.URL_CLIENTS)
    public void insert (@RequestBody Clients clients){
        clientsService.insert(clients);
    }
    @GetMapping(Constant.URL_CLIENTS)
    public List<Clients> findAll(){
        return clientsService.findAll();
    }
}
