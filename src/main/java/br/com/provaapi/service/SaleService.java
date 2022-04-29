package br.com.provaapi.service;
import br.com.provaapi.model.Sale;
import br.com.provaapi.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public void insert (Sale sale){
        saleRepository.save(sale);
    }

    public List<Sale> findAll (){
        return saleRepository.findAll();
    }
}
