package com.example.crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {
    @GetMapping
    public ResponseEntity getAllProducts(){
        return ResponseEntity.ok("deu tudo certo");
    }
}
