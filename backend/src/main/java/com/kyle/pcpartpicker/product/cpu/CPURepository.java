package com.kyle.pcpartpicker.product.cpu;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CPURepository extends MongoRepository<CPU, String> {

}
