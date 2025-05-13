package com.example.demo.interfaces.rest.dto.CreateProduct;

import jakarta.validation.constraints.NotBlank;

public class CreateProductReq {

     @NotBlank(message = "El nombre del producto es obligatorio")
     public String name;
}
