package br.com.provaapi.controller;

import br.com.provaapi.constant.Constant;
import br.com.provaapi.model.Products;
import br.com.provaapi.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductsController {
        @Autowired

        private ProductsService productsService;
        @PostMapping(Constant.URL_PRODUCTS)
        public void insert (@RequestBody Products products){
            productsService.insert(products);
        }
        @GetMapping(Constant.URL_PRODUCTS)
        public List<Products> findAll(){
            return productsService.findAll();
        }
    }

