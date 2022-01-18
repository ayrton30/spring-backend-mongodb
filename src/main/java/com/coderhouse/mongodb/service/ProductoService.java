package com.coderhouse.mongodb.service;

import com.coderhouse.mongodb.model.Producto;

import java.util.List;

public interface ProductoService {

    Producto createProduct(Producto producto);
    List<Producto> findByCategory(String category);
    List<Producto> findByPriceGreaterThan(Integer price);
    List<Producto> getAllProducts();
    Producto updateProduct(Producto producto);
    void deleteProduct(String id);
}
