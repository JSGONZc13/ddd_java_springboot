package com.example.demo.interfaces.rest.dto.GetProduct;

import java.util.List;

import com.example.demo.domain.entities.Product;
import com.example.demo.interfaces.rest.dto.global.ApiResponse;

public class GetProductsRes extends ApiResponse {
     private List<Product> products;

     public GetProductsRes(int codigo, String mensaje, List<Product> products) {
          super(codigo, mensaje);
          this.products = products;
     }

     public GetProductsRes(int codigo, String mensaje) {
          super(codigo, mensaje);
          this.products = List.of(); // devuelve lista vacía, evita null
     }

     public List<Product> getProducts() {
          return products;
     }

     public void setProducts(List<Product> products) {
          this.products = products;
     }

}
