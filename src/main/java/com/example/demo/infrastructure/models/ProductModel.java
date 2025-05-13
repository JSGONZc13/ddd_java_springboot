package com.example.demo.infrastructure.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductModel {
     @Id
     @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
     private Long lngId;
     private String strName;

     public ProductModel() {
     }

     public ProductModel(String strName) {
          this.strName = strName;
     }

     public ProductModel(Long id, String name) {
          this.lngId = id;
          this.strName = name;
     }

     // Getters & setters
     public Long getId() {
          return lngId;
     }

     public void setId(Long lngId) {
          this.lngId = lngId;
     }

     public String getName() {
          return strName;
     }

     public void setName(String strName) {
          this.strName = strName;
     }
}
