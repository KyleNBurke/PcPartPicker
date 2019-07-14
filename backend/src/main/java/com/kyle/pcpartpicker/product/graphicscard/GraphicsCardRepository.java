package com.kyle.pcpartpicker.product.graphicscard;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicsCardRepository extends MongoRepository<GraphicsCard, String> {
}
