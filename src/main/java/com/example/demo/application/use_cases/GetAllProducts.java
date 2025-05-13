package com.example.demo.application.use_cases;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.models.Product;
import com.example.demo.domain.repositories.ProductRepository;

@Service
public class GetAllProducts {
     private final ProductRepository productRepository;

     public GetAllProducts(ProductRepository productRepository) {
          this.productRepository = productRepository;
     }

     public List<Product> getAll() {
          return productRepository.findAll();
     }
}
