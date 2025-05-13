package com.example.demo.interfaces.rest.dto.CreateProduct;

import com.example.demo.domain.entities.Product;
import com.example.demo.interfaces.rest.dto.global.ApiResponse;

public class CreateProductRes extends ApiResponse {
     private Product product;

     public CreateProductRes(int codigo, String mensaje, Product product) {
          super(codigo, mensaje);
          this.product = product;
     }

     public CreateProductRes(int codigo, String mensaje) {
          super(codigo, mensaje);
     }

     public Product getProduct() {
          return product;
     }

     public void setProduct(Product product) {
          this.product = product;
     }
}
