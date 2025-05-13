package com.example.demo.domain.repositories;

import com.example.demo.domain.models.Product;
import java.util.List;

public interface ProductRepository {
     Product save(Product product);

     List<Product> findAll();
}
