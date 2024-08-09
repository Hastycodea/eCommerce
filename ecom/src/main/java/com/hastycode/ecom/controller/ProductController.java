package com.hastycode.ecom.controller;

import com.hastycode.ecom.model.Product;
import com.hastycode.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String home() {
        return "Good Morning Kings and Queens";
    }

    @GetMapping("/products")
    public List<Product> getAllProduct() {
        return service.getAllProducts();
    }

}
