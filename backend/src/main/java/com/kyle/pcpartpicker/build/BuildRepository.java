package com.kyle.pcpartpicker.build;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildRepository extends MongoRepository<Build, String> {
}
