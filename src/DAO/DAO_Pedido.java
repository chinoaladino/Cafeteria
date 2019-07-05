/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Pedido;
import Interface.Mantenedores;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class DAO_Pedido implements Mantenedores<Pedido> {

    private static final String SQL_INSERT = "INSERT INTO pedido (nombre_cliente,fono,e-mail,comentario,fecha_pedido,fecha_entrega,pedido,total,usuario)"
            + " VALUES (?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM pedido WHERE codigo_pedido = ?";
    private static final String SQL_UPDATE = "UPDATE pedido SET nombre_cliente= ?, fono= ?, e-mail= ?, comentario= ? ,fecha_pedido= ? ,fecha_entrega= ?,pedido= ?,total= ?, usuario=? WHERE codigo_pedido= ?";
    private static final String SQL_READ = "SELECT * FROM pedido WHERE codigo_pedido= ?";
    private static final String SQL_READALL = "SELECT * FROM pedido";
    
    
    @Override
    public boolean create(Pedido c) {
        PreparedStatement ps;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_INSERT);
            ps.setString(1, c.getNombre_cliente());
            ps.setInt(2, c.getFono_cliente());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getComentario());
            ps.setString(5, c.getFecha_pedido());
            ps.setString(6, c.getFecha_entrega());
            ps.setString(7, c.getPedido());
            ps.setInt(8, c.getTotal());
            ps.setString(9, c.getRut_user());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Detalle_Pedido.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.Desconexion();
        }
        return false;
    }

    @Override
    public boolean delete(Pedido c) {
        PreparedStatement ps;
        Conexion con = new Conexion();

        try {
            ps = con.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, c.getCod_pedido());
            if (ps.executeUpdate() > 0) {

                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Detalle_Pedido.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.Desconexion();
        }
        return false;
    }

    @Override
    public boolean update(Pedido c) {
        PreparedStatement ps;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_UPDATE);

            ps.setInt(1, c.getFono_cliente());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getComentario());
            ps.setString(4, c.getFecha_pedido());
            ps.setString(5, c.getFecha_entrega());
            ps.setString(6, c.getPedido());
            ps.setInt(7, c.getTotal());
            ps.setString(8, c.getRut_user());
            ps.setString(9, c.getNombre_cliente());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Detalle_Pedido.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.Desconexion();
        }
        return false;
    }

    @Override
    public Pedido read(Pedido c) {
        PreparedStatement ps;
        ResultSet res;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, c.getCod_pedido());
            res = ps.executeQuery();

            while (res.next()) {
                c.setNombre_cliente(res.getString("nombre_cliente"));
                c.setFono_cliente(res.getInt("fono"));
                c.setEmail(res.getString("e-mail/u"));
                c.setComentario(res.getString("comentario"));
                c.setFecha_pedido(res.getString("fecha_pedido"));
                c.setFecha_entrega(res.getString("fecha_entrega"));
                c.setPedido(res.getString("pedido"));
                c.setTotal(res.getInt("total"));
                c.setRut_user(res.getString("usuario"));
            }

        } catch (SQLException ex) {

            return null;
        }
        return c;
    }

    @Override
    public List<Pedido> readAll() {
        PreparedStatement ps;
        ResultSet res;
            ArrayList<Pedido> lista = new ArrayList<>();
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READALL);
            res = ps.executeQuery();

            while (res.next()) {
                Pedido c = new Pedido();
                c.setNombre_cliente(res.getString("nombre_cliente"));
                c.setFono_cliente(res.getInt("fono"));
                c.setEmail(res.getString("e-mail/u"));
                c.setComentario(res.getString("comentario"));
                c.setFecha_pedido(res.getString("fecha_pedido"));
                c.setFecha_entrega(res.getString("fecha_entrega"));
                c.setPedido(res.getString("pedido"));
                c.setTotal(res.getInt("total"));
                c.setRut_user(res.getString("usuario"));
                lista.add(c);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Detalle_Pedido.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.Desconexion();
        }
        return lista;
    }

}
