package com.example.demo.infrastructure.mappers;

import com.example.demo.domain.entities.Product;
import com.example.demo.infrastructure.models.ProductModel;

public class ProductMapper {
     public static Product toDomain(ProductModel model) {
          return new Product(model.getId(), model.getName());
     }

     public static ProductModel toModel(Product product) {
          return new ProductModel(product.getId(), product.getName());
     }
}
