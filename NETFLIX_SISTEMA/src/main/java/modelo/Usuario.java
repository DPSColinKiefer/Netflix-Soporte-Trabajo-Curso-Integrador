/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;
import java.sql.*;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private boolean estado;
    private LocalDateTime fechaRegistro;
    private String contrasena;
    private String rol;
    
    public Usuario() {}
    
    public Usuario(int id, String nombre, String correo, boolean estado, 
                   LocalDateTime fechaRegistro, String contrasena, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.contrasena = contrasena;
        this.rol = rol;
    }
    
    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    
    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    
    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }
    
    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }
    
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
    
    @Override
    public String toString() {
        return "Usuario{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", correo='" + correo + '\'' +
               ", estado=" + estado +
               ", fechaRegistro=" + fechaRegistro +
               ", rol='" + rol + '\'' +
               '}';
    }
}

