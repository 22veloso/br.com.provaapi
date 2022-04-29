package br.com.provaapi.service;

import br.com.provaapi.model.Employee;

import br.com.provaapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void insert (Employee employee){
        employeeRepository.save(employee);
    }

    public List<Employee> findAll (){
        return employeeRepository.findAll();
    }
}
