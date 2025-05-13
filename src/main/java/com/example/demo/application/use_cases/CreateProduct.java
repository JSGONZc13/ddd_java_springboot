package com.example.demo.application.use_cases;

import org.springframework.stereotype.Service;

import com.example.demo.domain.models.Product;
import com.example.demo.domain.repositories.ProductRepository;

@Service
public class CreateProduct {
     private final ProductRepository productRepository;

     public CreateProduct(ProductRepository productRepository) {
          this.productRepository = productRepository;
     }

     public Product create(String name) {
          Product product = new Product(null, name);
          return productRepository.save(product);
     }
}
