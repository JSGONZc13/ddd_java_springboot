package com.example.demo.infrastructure.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.models.Product;
import com.example.demo.domain.repositories.ProductRepository;

@Repository
public class JpaProductRepository implements ProductRepository {
     private final List<Product> mockDb = new ArrayList<>();

     @Override
     public Product save(Product product) {
          long lastId = mockDb.stream()
                    .mapToLong(Product::getId)
                    .max()
                    .orElse(0L); // Si la lista está vacía, empieza en 0

          product.setId(lastId + 1);
          mockDb.add(product);
          return product;
     }

     @Override
     public List<Product> findAll() {
          return mockDb;
     }

}
