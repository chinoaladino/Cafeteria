/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Administrador
 */
public class Usuario {
    private String rut;
    private String clave;
    private String nombre;
    private String apellido;
    private int fono;
    private String direccion;
    private int tipo;
    private String comentario;

    public Usuario() {
    }

    public Usuario(String rut, String clave, String nombre, String apellido, int fono, String direccion, int tipo, String comentario) {
        this.rut = rut;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fono = fono;
        this.direccion = direccion;
        this.tipo = tipo;
        this.comentario = comentario;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    

    
}
