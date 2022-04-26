package com.codekul.java28SeptFullStack.manytomany.controller;

import com.codekul.java28SeptFullStack.manytomany.domain.Product;
import com.codekul.java28SeptFullStack.manytomany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("saveProduct")
    public String saveProduct(@RequestBody Product product){

        productRepository.save(product);
        return "product saved..";
    }
}
