package br.com.provaapi.model;

import org.springframework.data.annotation.Id;

public class Sale {
    @Id
    private String _id;
    private Clients clients;
    private Employee employee;
    private Products products;

    public String get_id() {return _id;}

    public void set_id(String _id) {this._id = _id;}

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

}
