package br.com.provaapi.service;
import br.com.provaapi.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.provaapi.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void insert (Person person){
        personRepository.save(person);
    }

    public List <Person> findAll (){
        return personRepository.findAll();
    }

}

