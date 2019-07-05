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
public class Detalle_venta {
    private int cod_detalle_v;
    private int cod_venta;
    private int cod_producto;
    private String nombre_producto;
    private int precio_venta;
    private int cantidad;

    public Detalle_venta() {
    }

    public Detalle_venta(int cod_detalle_v, int cod_venta, int cod_producto, String nombre_producto, int precio_venta, int cantidad) {
        this.cod_detalle_v = cod_detalle_v;
        this.cod_venta = cod_venta;
        this.cod_producto = cod_producto;
        this.nombre_producto = nombre_producto;
        this.precio_venta = precio_venta;
        this.cantidad = cantidad;
    }

    public int getCod_detalle_v() {
        return cod_detalle_v;
    }

    public void setCod_detalle_v(int cod_detalle_v) {
        this.cod_detalle_v = cod_detalle_v;
    }

    public int getCod_venta() {
        return cod_venta;
    }

    public void setCod_venta(int cod_venta) {
        this.cod_venta = cod_venta;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
