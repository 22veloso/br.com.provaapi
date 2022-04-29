package br.com.provaapi.service;
import br.com.provaapi.model.Type;
import br.com.provaapi.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class TypeService {
    @Autowired
    private TypeRepository typeRepository;

    public void insert (Type type){
        typeRepository.save(type);
    }

    public List<Type> findAll (){
        return typeRepository.findAll();
    }
}
