package com.example.week1.controller;

import com.example.week1.models.Products;
import com.example.week1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Products> getAllProduct(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/search/{name}")
    public List<Products> search(@PathVariable String name){

        return  productService.search(name);
    }

    @PostMapping("/products/add")
    public void addProduct(@RequestBody Products products) {
        productService.addProduct(products);
    }

    @DeleteMapping("/products/delete/{id}")
    public void deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);
    }

    @PutMapping("/products/edit/{id}")
    public void updateProduct(@RequestBody Products products){
        productService.updateProduct(products);
    }




}
