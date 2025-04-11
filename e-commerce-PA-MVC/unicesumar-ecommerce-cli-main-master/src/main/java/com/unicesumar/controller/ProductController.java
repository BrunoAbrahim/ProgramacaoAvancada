package com.unicesumar.controller;

import com.unicesumar.entities.Product;
import com.unicesumar.repository.ProductRepository;

import java.util.List;
import java.util.UUID;

public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void createProduct(UUID id, String name, double price) {
        Product p = new Product(id, name, price);
        productRepository.save(p);
    }
}
