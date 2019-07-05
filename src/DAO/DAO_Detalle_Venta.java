/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Detalle_venta;
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
public class DAO_Detalle_Venta implements Mantenedores<Detalle_venta> {

    private static final String SQL_INSERT = "INSERT INTO venta_has_producto (codigo_detalle,codigo_venta,codigo_producto,nombre_producto,precio_venta,cantidad)"
            + " VALUES (?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM venta_has_producto WHERE codigo_detalle = ?";
    private static final String SQL_UPDATE = "UPDATE venta_has_producto SET codigo_venta= ?, codigo_producto= ?, nombre_producto= ? ,precio_venta= ?, cantidad= ? WHERE pedido_has_producto= ?";
    private static final String SQL_READ = "SELECT * FROM venta_has_producto WHERE codigo_detalle= ?";
    private static final String SQL_READALL = "SELECT * FROM venta_has_producto";

    @Override
    public boolean create(Detalle_venta c) {
        PreparedStatement ps;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_INSERT);
            ps.setInt(1, c.getCod_detalle_v());
            ps.setInt(2, c.getCod_venta());
            ps.setInt(3, c.getCod_producto());
            ps.setString(4, c.getNombre_producto());
            ps.setInt(5, c.getPrecio_venta());
            ps.setInt(6, c.getCantidad());
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
    public boolean delete(Detalle_venta c) {
        PreparedStatement ps;
        Conexion con = new Conexion();

        try {
            ps = con.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, c.getCod_detalle_v());
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
    public boolean update(Detalle_venta c) {
        PreparedStatement ps;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_UPDATE);

            ps.setInt(1, c.getCod_venta());
            ps.setInt(2, c.getCod_producto());
            ps.setString(3, c.getNombre_producto());
            ps.setInt(4, c.getPrecio_venta());
            ps.setInt(5, c.getCantidad());
            ps.setInt(6, c.getCod_detalle_v());
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
    public Detalle_venta read(Detalle_venta c) {
        PreparedStatement ps;
        ResultSet res;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, c.getCod_detalle_v());
            res = ps.executeQuery();

            while (res.next()) {
                c.setCod_detalle_v(res.getInt("codigo_detalle"));
                c.setCod_venta(res.getInt("codigo_pedido"));
                c.setCod_producto(res.getInt("codigo_producto"));
                c.setNombre_producto(res.getString("nombre_producto"));
                c.setPrecio_venta(res.getInt("precio_venta"));
                c.setCantidad(res.getInt("cantidad"));
            }

        } catch (SQLException ex) {

            return null;
        }
        return c;
    }

    @Override
    public List<Detalle_venta> readAll() {
        PreparedStatement ps;
        ResultSet res;
        ArrayList<Detalle_venta> lista = new ArrayList<>();
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READALL);
            res = ps.executeQuery();

            while (res.next()) {
                Detalle_venta c = new Detalle_venta();
                c.setCod_detalle_v(res.getInt("codigo_detalle"));
                c.setCod_venta(res.getInt("codigo_pedido"));
                c.setCod_producto(res.getInt("codigo_producto"));
                c.setNombre_producto(res.getString("nombre_producto"));
                c.setCantidad(res.getInt("cantidad"));
                c.setPrecio_venta(res.getInt("precio_venta"));
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


