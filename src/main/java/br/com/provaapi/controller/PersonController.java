package br.com.provaapi.controller;
import br.com.provaapi.constant.Constant;
import br.com.provaapi.model.Person;
import br.com.provaapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PersonController {
    @Autowired

    private PersonService personService;
    @PostMapping (Constant.URL_PERSON)
    public void insert (@RequestBody Person person){
        personService.insert(person);
    }
    @GetMapping (Constant.URL_PERSON)
    public List<Person> findAll(){
        return personService.findAll();
    }
}