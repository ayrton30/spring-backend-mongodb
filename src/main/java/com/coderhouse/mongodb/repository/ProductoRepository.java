package com.coderhouse.mongodb.repository;

import com.coderhouse.mongodb.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductoRepository extends MongoRepository<Producto, String> {

    List<Producto> findByCategory(String category);
    List<Producto> findByPriceGreaterThan(Integer price);

}
