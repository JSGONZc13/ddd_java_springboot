package com.example.demo.interfaces.rest.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.use_cases.CreateProduct;
import com.example.demo.application.use_cases.GetAllProducts;
import com.example.demo.domain.entities.Product;
import com.example.demo.interfaces.rest.dto.CreateProduct.CreateProductReq;
import com.example.demo.interfaces.rest.dto.CreateProduct.CreateProductRes;
import com.example.demo.interfaces.rest.dto.GetProduct.GetProductsRes;

import jakarta.validation.Valid;

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
     public ResponseEntity<CreateProductRes> create(@Valid @RequestBody CreateProductReq request) {
          Product created = createProduct.create(request.name);
          if (created == null) {
               return ResponseEntity.ok(new CreateProductRes(1, "Error al crear el producto"));
          }
          return ResponseEntity.ok(new CreateProductRes(0, "ok", created));
     }

     @GetMapping
     public ResponseEntity<GetProductsRes> getAll() {
          List<Product> products = getAllProducts.getAll();

          if (products.isEmpty()) {
               return ResponseEntity.ok(new GetProductsRes(1, "No hay productos"));
          }

          return ResponseEntity.ok(new GetProductsRes(0, "ok", products));
     }
}
