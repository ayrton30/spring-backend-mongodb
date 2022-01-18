package com.coderhouse.mongodb.repository;

import com.coderhouse.mongodb.model.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MensajeRepository extends MongoRepository<Mensaje, Long> {
}
