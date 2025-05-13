package com.example.demo.infrastructure.repositories_impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.entities.Product;
import com.example.demo.domain.repositories.ProductRepository;
import com.example.demo.infrastructure.mappers.ProductMapper;
import com.example.demo.infrastructure.models.ProductModel;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
     private final SpringDataProductJpaRepository jpaRepo;

     public ProductRepositoryImpl(SpringDataProductJpaRepository jpaRepo) {
          this.jpaRepo = jpaRepo;
     }

     @Override
     public Product save(Product product) {
          ProductModel savedModel = jpaRepo.save(ProductMapper.toModel(product));
          return ProductMapper.toDomain(savedModel);
     }

     @Override
     public List<Product> findAll() {
          return jpaRepo.findAll()
                    .stream()
                    .map(ProductMapper::toDomain)
                    .collect(Collectors.toList());
     }

}
