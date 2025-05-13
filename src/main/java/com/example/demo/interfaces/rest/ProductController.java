package com.example.demo.interfaces.rest;

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
import com.example.demo.interfaces.rest.dto.ApiResponse;
import com.example.demo.interfaces.rest.dto.CreateProductRequest;
import com.example.demo.interfaces.rest.dto.ResponseFactory;

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
     public ResponseEntity<ApiResponse<Product>> create(@Valid @RequestBody CreateProductRequest request) {
          Product created = createProduct.create(request.name);
          return ResponseEntity.ok(ResponseFactory.success(created));
     }

     @GetMapping
     public ResponseEntity<ApiResponse<List<Product>>> getAll() {
          List<Product> products = getAllProducts.getAll();
          return ResponseEntity.ok(!products.isEmpty() ? ResponseFactory.success(products)
                    : ResponseFactory.warning("No hay productos"));
     }
}
