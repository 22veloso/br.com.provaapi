package br.com.provaapi.controller;
import br.com.provaapi.constant.Constant;
import br.com.provaapi.model.Type;
import br.com.provaapi.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TypeController {
    @Autowired

    private TypeService typeService;

    @PostMapping(Constant.URL_TYPE)
    public void insert(@RequestBody Type type) {
        typeService.insert(type);
    }

    @GetMapping(Constant.URL_TYPE)
    public List<Type> findAll() {
        return typeService.findAll();
    }
}