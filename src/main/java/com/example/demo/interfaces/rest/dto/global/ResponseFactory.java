package com.example.demo.interfaces.rest.dto.global;

public class ResponseFactory {
     public static ApiResponse success() {
          return new ApiResponse(0, "ok");
     }

     public static ApiResponse error(int codigo, String mensaje) {
          return new ApiResponse(codigo, mensaje);
     }

     public static ApiResponse warning(String mensaje) {
          return new ApiResponse(1, mensaje);
     }
}
