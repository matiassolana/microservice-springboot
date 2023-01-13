package org.matiassolana.microservices.repository;

import org.matiassolana.microservices.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String>{

}
