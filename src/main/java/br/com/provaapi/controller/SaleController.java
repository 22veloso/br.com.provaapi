package br.com.provaapi.controller;

import br.com.provaapi.constant.Constant;
import br.com.provaapi.model.Sale;
import br.com.provaapi.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class SaleController {

        @Autowired

        private SaleService saleService;
        @PostMapping(Constant.URL_SALE)
        public void insert (@RequestBody Sale sale){
            saleService.insert(sale);
        }
        @GetMapping(Constant.URL_SALE)
        public List<Sale> findAll(){
            return saleService.findAll();
        }
    }
