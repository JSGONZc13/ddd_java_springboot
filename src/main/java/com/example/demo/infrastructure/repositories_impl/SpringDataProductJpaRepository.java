package com.example.demo.infrastructure.repositories_impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.infrastructure.models.ProductModel;
@Repository
public interface SpringDataProductJpaRepository  extends JpaRepository<ProductModel, Long>{
     
}
