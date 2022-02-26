package com.example.week1.service;

import com.example.week1.models.Products;
import com.example.week1.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List getAllProducts(){
        return productRepository.findAll();
    }

    public List<Products> search(String name) {
        return productRepository.findByName(name);
    }

    public void addProduct(Products products) {
        productRepository.save(products);
    }

    public void deleteProduct(long id) {
        productRepository.deleteById((int) id);
    }

    public void updateProduct(Products products) {
        Products product = productRepository.findById(products.getID()).orElse(null);

        product.setName(products.getName());
        product.setID(products.getID());
        product.setQty(products.getQty());
        productRepository.save(product);
    }
}
