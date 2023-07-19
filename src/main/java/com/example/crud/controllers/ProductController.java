package com.example.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.domain.Product;
import com.example.crud.domain.ProductRepository;
import com.example.crud.domain.RequestProduct;

import jakarta.validation.*;

@RestController
@RequestMapping
public class ProductController {
    @Autowired
    private ProductRepository repository;
    
    @GetMapping
    public ResponseEntity getAllProducts(){
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }
    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data){
        Product newProduct = new Product(data);
        System.out.println(data);
        repository.save(newProduct);
        return ResponseEntity.ok("Produto adicionado");
    }
    @PutMapping
    public ResponseEntity updateProduct(@RequestBody @Valid RequestProduct data){
        Product product =  repository.getReferenceById(data.id());
        product.setName(data.name());
        product.setPrice_in_cents(data.price_in_cents());
        return ResponseEntity.ok(product);
    }
}
