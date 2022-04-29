package br.com.provaapi.service;
import br.com.provaapi.model.Products;
import br.com.provaapi.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public void insert (Products products){
        productsRepository.save(products);
    }

    public List<Products> findAll (){
        return productsRepository.findAll();
    }
}
