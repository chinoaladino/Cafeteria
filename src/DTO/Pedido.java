/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author 19688016-K
 */
public class Pedido {
    private int Cod_pedido;
    private String Nombre_cliente;
    private int Fono_cliente;
    private String email;
    private String comentario;
    private String Fecha_pedido;
    private String Fecha_entrega;
    private String pedido;
    private int total;
    private String Rut_user;

    public Pedido() {
    }

    public Pedido(int Cod_pedido, String Nombre_cliente, int Fono_cliente, String email, String comentario, String Fecha_pedido, String Fecha_entrega, String pedido, int total, String Rut_user) {
        this.Cod_pedido = Cod_pedido;
        this.Nombre_cliente = Nombre_cliente;
        this.Fono_cliente = Fono_cliente;
        this.email = email;
        this.comentario = comentario;
        this.Fecha_pedido = Fecha_pedido;
        this.Fecha_entrega = Fecha_entrega;
        this.pedido = pedido;
        this.total = total;
        this.Rut_user = Rut_user;
    }

    public Pedido(String Nombre_cliente, int Fono_cliente, String email, String comentario, String Fecha_pedido, String Fecha_entrega, String pedido, int total, String Rut_user) {
        this.Nombre_cliente = Nombre_cliente;
        this.Fono_cliente = Fono_cliente;
        this.email = email;
        this.comentario = comentario;
        this.Fecha_pedido = Fecha_pedido;
        this.Fecha_entrega = Fecha_entrega;
        this.pedido = pedido;
        this.total = total;
        this.Rut_user = Rut_user;
    }
        
    

    public int getCod_pedido() {
        return Cod_pedido;
    }

    public void setCod_pedido(int Cod_pedido) {
        this.Cod_pedido = Cod_pedido;
    }

    public String getNombre_cliente() {
        return Nombre_cliente;
    }

    public void setNombre_cliente(String Nombre_cliente) {
        this.Nombre_cliente = Nombre_cliente;
    }

    public int getFono_cliente() {
        return Fono_cliente;
    }

    public void setFono_cliente(int Fono_cliente) {
        this.Fono_cliente = Fono_cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha_pedido() {
        return Fecha_pedido;
    }

    public void setFecha_pedido(String Fecha_pedido) {
        this.Fecha_pedido = Fecha_pedido;
    }

    public String getFecha_entrega() {
        return Fecha_entrega;
    }

    public void setFecha_entrega(String Fecha_entrega) {
        this.Fecha_entrega = Fecha_entrega;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getRut_user() {
        return Rut_user;
    }

    public void setRut_user(String Rut_user) {
        this.Rut_user = Rut_user;
    }
    
    
    
    
}