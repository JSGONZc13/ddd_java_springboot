package com.example.demo.interfaces.rest.dto;

public class ResponseFactory {
     public static <T> ApiResponse<T> success(T data) {
          return new ApiResponse<>(0, "ok", data);
     }

     public static ApiResponse<Void> error(int codigo, String mensaje) {
          return new ApiResponse<>(codigo, mensaje, null);
     }

     public static <T> ApiResponse<T> warning(String mensaje) {
          return new ApiResponse<>(1, mensaje, null);
     }
}
