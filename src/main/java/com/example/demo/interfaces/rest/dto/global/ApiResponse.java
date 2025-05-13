package com.example.demo.interfaces.rest.dto.global;

public class ApiResponse {
     private int codigo;
     private String mensaje;

     public ApiResponse() {
     }

     public ApiResponse(int codigo, String mensaje) {
          this.codigo = codigo;
          this.mensaje = mensaje;
     }

     public int getCodigo() {
          return codigo;
     }

     public void setCodigo(int codigo) {
          this.codigo = codigo;
     }

     public String getMensaje() {
          return mensaje;
     }

     public void setMensaje(String mensaje) {
          this.mensaje = mensaje;
     }
}
