package com.coderhouse.mongodb.controller;

import com.coderhouse.mongodb.model.Producto;
import com.coderhouse.mongodb.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    Logger logger = LogManager.getLogger(ProductoController.class);

    @Autowired
    ProductoService service;

    @GetMapping("")
    public List<Producto> getProductos(HttpSession session) {
        logger.info("GET Request getProductos()");
        return this.service.getAllProducts();
    }

    @GetMapping("/category/{category}")
    public List<Producto> getProductosByCategory(@PathVariable String category) {
        logger.info("GET Request getProductosByCategory(String category)");
        return this.service.findByCategory(category);
    }

    @GetMapping("/price/{price}")
    public List<Producto> getProductosByPrice(@PathVariable Integer price) {
        logger.info("GET Request getProductosByPrice(Integer price)");
        return this.service.findByPriceGreaterThan(price);
    }

    @PostMapping("")
    public Producto insertProducto(@RequestBody Producto producto) {
        logger.info("POST Request insertProducto(Producto producto)");
        return this.service.createProduct(producto);
    }

    @PutMapping("")
    public Producto updateProducto(@RequestBody Producto producto) {
        logger.info("PUT Request updateProducto(Producto producto)");
        return this.service.updateProduct(producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable String id) {
        logger.info("DELETE Request deleteProducto(Long id)");
        this.service.deleteProduct(id);
    }
}
