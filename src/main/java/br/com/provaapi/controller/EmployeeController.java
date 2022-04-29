package br.com.provaapi.controller;
import br.com.provaapi.constant.Constant;
import br.com.provaapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class EmployeeController {
    @Autowired

    private EmployeeController employeeService;
    @PostMapping(Constant.URL_EMPLOYEE)
    public void insert (@RequestBody Employee employee){
        employeeService.insert(employee);
    }
    @GetMapping(Constant.URL_EMPLOYEE)
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}


