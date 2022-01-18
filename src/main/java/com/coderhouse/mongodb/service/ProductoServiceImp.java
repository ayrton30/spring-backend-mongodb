package com.coderhouse.mongodb.service;

import com.coderhouse.mongodb.model.Producto;
import com.coderhouse.mongodb.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements ProductoService{

    @Autowired
    private ProductoRepository repository;

    @Override
    public Producto createProduct(Producto producto) {
        return this.repository.save(producto);
    }

    @Override
    public List<Producto> findByCategory(String category) {
        return this.repository.findByCategory(category);
    }

    @Override
    public List<Producto> findByPriceGreaterThan(Integer price) {
        return this.repository.findByPriceGreaterThan(price);
    }

    @Override
    public List<Producto> getAllProducts() {
        return this.repository.findAll();
    }

    @Override
    public Producto updateProduct(Producto producto) {
        return this.repository.save(producto);
    }

    @Override
    public void deleteProduct(String id) {
        this.repository.deleteById(id);
    }
}
