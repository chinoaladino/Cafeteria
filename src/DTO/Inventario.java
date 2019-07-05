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
public class Inventario {
    private int codigo_inventario;
    private int tipo;
    private String nombre;
    private float cantidad;
    private int precio_cu;
    private int valor_total_p;
    private String ult_actualizacion;
    private String cod_user;
    private String cometario;

    public Inventario() {
    }

    public Inventario(int codigo_inventario, int tipo, String nombre, float cantidad, int precio_cu, int valor_total_p, String ult_actualizacion, String cod_user, String cometario) {
        this.codigo_inventario = codigo_inventario;
        this.tipo = tipo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio_cu = precio_cu;
        this.valor_total_p = valor_total_p;
        this.ult_actualizacion = ult_actualizacion;
        this.cod_user = cod_user;
        this.cometario = cometario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

   

    public int getCodigo_inventario() {
        return codigo_inventario;
    }

    public void setCodigo_inventario(int codigo_inventario) {
        this.codigo_inventario = codigo_inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_cu() {
        return precio_cu;
    }

    public void setPrecio_cu(int precio_cu) {
        this.precio_cu = precio_cu;
    }

    public int getValor_total_p() {
        return valor_total_p;
    }

    public void setValor_total_p(int valor_total_p) {
        this.valor_total_p = valor_total_p;
    }

    public String getUlt_actualizacion() {
        return ult_actualizacion;
    }

    public void setUlt_actualizacion(String ult_actualizacion) {
        this.ult_actualizacion = ult_actualizacion;
    }

    public String getCod_user() {
        return cod_user;
    }

    public void setCod_user(String cod_user) {
        this.cod_user = cod_user;
    }

    public String getCometario() {
        return cometario;
    }

    public void setCometario(String cometario) {
        this.cometario = cometario;
    }
    
    


}
