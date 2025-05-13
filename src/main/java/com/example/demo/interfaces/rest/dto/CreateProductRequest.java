package com.example.demo.interfaces.rest.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateProductRequest {

     @NotBlank(message = "El nombre del producto es obligatorio")
     public String name;
}
