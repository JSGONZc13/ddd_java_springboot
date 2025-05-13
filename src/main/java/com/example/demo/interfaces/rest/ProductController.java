package com.example.demo.interfaces.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.use_cases.CreateProduct;
import com.example.demo.application.use_cases.GetAllProducts;
import com.example.demo.domain.models.Product;
import com.example.demo.interfaces.rest.dto.CreateProductRequest;

@RestController
@RequestMapping("/api/products")
public class ProductController {
     private final CreateProduct createProduct;
     private final GetAllProducts getAllProducts;

     public ProductController(CreateProduct createProduct, GetAllProducts getAllProducts) {
          this.createProduct = createProduct;
          this.getAllProducts = getAllProducts;
     }

     @PostMapping
     public Product create(@RequestBody CreateProductRequest request) {
          return createProduct.create(request.name);
     }

     @GetMapping
     public List<Product> getAll() {
          return getAllProducts.getAll();
     }
}
