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
public class Venta {
    private int codigo_venta;
    private int n_mesa;
    private String rut_user;
    private String comentario;
    private int total;
    private String fecha_hora_venta;

    public Venta() {
    }

    public Venta(int codigo_venta, int n_mesa, String rut_user, String comentario, int total, String fecha_hora_venta) {
        this.codigo_venta = codigo_venta;
        this.n_mesa = n_mesa;
        this.rut_user = rut_user;
        this.comentario = comentario;
        this.total = total;
        this.fecha_hora_venta = fecha_hora_venta;
    }

    public int getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(int codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public int getN_mesa() {
        return n_mesa;
    }

    public void setN_mesa(int n_mesa) {
        this.n_mesa = n_mesa;
    }

    public String getRut_user() {
        return rut_user;
    }

    public void setRut_user(String rut_user) {
        this.rut_user = rut_user;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFecha_hora_venta() {
        return fecha_hora_venta;
    }

    public void setFecha_hora_venta(String fecha_hora_venta) {
        this.fecha_hora_venta = fecha_hora_venta;
    }
       
}   
   