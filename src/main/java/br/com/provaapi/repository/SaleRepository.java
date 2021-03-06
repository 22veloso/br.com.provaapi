package br.com.provaapi.repository;

import br.com.provaapi.model.Sale;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends MongoRepository<Sale, String> {
}
