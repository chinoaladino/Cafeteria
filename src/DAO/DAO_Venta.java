/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Venta;
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
public class DAO_Venta implements Mantenedores<Venta>{
    private static final String SQL_INSERT = "INSERT INTO venta (mesa,usuario,comentario,total,fecha_venta)"
            + " VALUES (?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM venta WHERE codigo_v = ?";
    private static final String SQL_UPDATE = "UPDATE venta SET mesa= ?, usuario= ?, comentario= ?, total= ? ,fecha_venta= ? WHERE codigo_v= ?";
    private static final String SQL_READ = "SELECT * FROM venta WHERE codigo_v= ?";
    private static final String SQL_READALL = "SELECT * FROM venta";  

    @Override
    public boolean create(Venta c) {
        PreparedStatement ps;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_INSERT);
            ps.setInt(1, c.getN_mesa());
            ps.setString(2, c.getRut_user());
            ps.setString(3, c.getComentario());
            ps.setInt(4, c.getTotal());
            ps.setString(5, c.getFecha_hora_venta());
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
    public boolean delete(Venta c) {
        PreparedStatement ps;
        Conexion con = new Conexion();

        try {
            ps = con.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, c.getCodigo_venta());
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
    public boolean update(Venta c) {
        PreparedStatement ps;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_UPDATE);

            
            ps.setInt(1, c.getN_mesa());
            ps.setString(2, c.getRut_user());
            ps.setString(3, c.getComentario());
            ps.setInt(4, c.getTotal());
            ps.setString(5, c.getFecha_hora_venta());
            ps.setInt(6, c.getCodigo_venta());
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
    public Venta read(Venta c) {
        PreparedStatement ps;
        ResultSet res;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, c.getCodigo_venta());
            res = ps.executeQuery();

            while (res.next()) {
                c.setN_mesa(res.getInt("mesa"));
                c.setRut_user(res.getString("usuario"));
                c.setComentario(res.getString("comentario"));
                c.setTotal(res.getInt("total"));
                c.setFecha_hora_venta(res.getString("fecha_venta"));
            }

        } catch (SQLException ex) {

            return null;
        }
        return c;
    }

    @Override
    public List<Venta> readAll() {
        PreparedStatement ps;
        ResultSet res;
            ArrayList<Venta> lista = new ArrayList<>();
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READALL);
            res = ps.executeQuery();

            while (res.next()) {
                Venta c = new Venta();
                c.setN_mesa(res.getInt("mesa"));
                c.setRut_user(res.getString("usuario"));
                c.setComentario(res.getString("comentario"));
                c.setTotal(res.getInt("total"));
                c.setFecha_hora_venta(res.getString("fecha_venta"));
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
