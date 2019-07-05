/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Inventario;
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
public class DAO_Inventario implements Mantenedores<Inventario> {

    private static final String SQL_INSERT = "INSERT INTO inventario (codigo,tipo,nombre,cantidad,precio,valor_total,fecha_ingreso,usuario,comentario)"
            + " VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM inventario WHERE codigo= ?";
    private static final String SQL_UPDATE = "UPDATE inventario SET tipo= ?,nombre= ?, cantidad= ?, precio= ? ,valor_total= ?, fecha_ingreso= ?,usuario= ?,comentario= ? WHERE codigo= ?";
    private static final String SQL_READ = "SELECT * FROM inventario WHERE codigo= ?";
    private static final String SQL_READALL = "SELECT * FROM inventario";
    private static final String SQL_ILIKE = "SELECT * FROM inventario where codigo LIKE  ? '%'";
    private static final String SQL_NLIKE = "SELECT * FROM inventario WHERE nombre LIKE  ? '%'";

    @Override
    public boolean create(Inventario c) {
        PreparedStatement ps;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_INSERT);
            ps.setInt(1, c.getCodigo_inventario());
            ps.setInt(2, c.getTipo());
            ps.setString(3, c.getNombre());
            ps.setFloat(4, c.getCantidad());
            ps.setInt(5, c.getPrecio_cu());
            ps.setInt(6, c.getValor_total_p());
            ps.setString(7, c.getUlt_actualizacion());
            ps.setString(8, c.getCod_user());
            ps.setString(9, c.getCometario());
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
    public boolean delete(Inventario c) {
        PreparedStatement ps;
        Conexion con = new Conexion();

        try {
            ps = con.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, c.getCodigo_inventario());
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
    public boolean update(Inventario c) {
        PreparedStatement ps;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_UPDATE);
            ps.setInt(1, c.getTipo());
            ps.setString(2, c.getNombre());
            ps.setFloat(3, c.getCantidad());
            ps.setInt(4, c.getPrecio_cu());
            ps.setInt(5, c.getValor_total_p());
            ps.setString(6, c.getUlt_actualizacion());
            ps.setString(7, c.getCod_user());
            ps.setString(8, c.getCometario());
            ps.setInt(9, c.getCodigo_inventario());
            
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
    public Inventario read(Inventario c) {
        PreparedStatement ps;
        ResultSet res;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, c.getCodigo_inventario());
            res = ps.executeQuery();

            while (res.next()) {
                
                c.setTipo(res.getInt("tipo"));
                c.setNombre(res.getString("nombre"));
                c.setCantidad(res.getInt("cantidad"));
                c.setPrecio_cu(res.getInt("precio"));
                c.setValor_total_p(res.getInt("valor_total"));
                c.setUlt_actualizacion(res.getString("fecha_ingreso"));
                c.setCod_user(res.getString("usuario"));
                c.setCometario(res.getString("comentario"));
                
            }
            
            if(c.getNombre() == null){
                c= null;
                return c;
            }

        } catch (SQLException ex) {

            return null;
        }
        return c;
    }

    @Override
    public List<Inventario> readAll() {
        PreparedStatement ps;
        ResultSet res;
        ArrayList<Inventario> lista = new ArrayList<>();
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READALL);
            res = ps.executeQuery();

            while (res.next()) {
                Inventario c = new Inventario();
                c.setCodigo_inventario(Integer.parseInt(res.getString("codigo")));
                c.setTipo(res.getInt("tipo"));
                c.setNombre(res.getString("nombre"));
                c.setCantidad(res.getInt("cantidad"));
                c.setPrecio_cu(res.getInt("precio"));
                c.setValor_total_p(res.getInt("valor_total"));
                c.setUlt_actualizacion(res.getString("fecha_ingreso"));
                c.setCod_user(res.getString("usuario"));
                c.setCometario(res.getString("comentario"));
                lista.add(c);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Detalle_Pedido.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.Desconexion();
        }
        return lista;
    }
    
    public boolean find(int codigo){
        
         PreparedStatement ps;
        ResultSet res;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, codigo);
            res = ps.executeQuery();

            while (res.next()) {
                return true;
            }

        } catch (SQLException ex) {

            
        }
        return false;        
    }
    
    public List<Inventario> readLike(String b_cod){
        PreparedStatement ps;
        ResultSet res;
        ArrayList<Inventario> lista = new ArrayList<>();
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_ILIKE);
            ps.setString(1, b_cod);
            res = ps.executeQuery();

            while (res.next()) {
                Inventario c = new Inventario();
                c.setCodigo_inventario(res.getInt("codigo"));
                c.setTipo(res.getInt("Tipo"));
                c.setNombre(res.getString("Nombre"));
                c.setCantidad(res.getInt("Cantidad"));
                c.setPrecio_cu(res.getInt("Precio"));
                c.setValor_total_p(res.getInt("Valor_total"));
                c.setUlt_actualizacion(res.getString("fecha_ingreso"));
                c.setCod_user(res.getString("usuario"));
                c.setCometario(res.getString("Comentario"));
                lista.add(c);
            }    

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.Desconexion();
        }
        return lista;
    }
    
    public List<Inventario> nLike(String nom){
        PreparedStatement ps;
        ResultSet res;
        ArrayList<Inventario> lista = new ArrayList<>();
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_NLIKE);
            ps.setString(1, nom);
            res = ps.executeQuery();

            while (res.next()) {
                Inventario c = new Inventario();
                c.setCodigo_inventario(res.getInt("codigo"));
                c.setTipo(res.getInt("Tipo"));
                c.setNombre(res.getString("Nombre"));
                c.setCantidad(res.getInt("Cantidad"));
                c.setPrecio_cu(res.getInt("Precio"));
                c.setValor_total_p(res.getInt("Valor_total"));
                c.setUlt_actualizacion(res.getString("fecha_ingreso"));
                c.setCod_user(res.getString("usuario"));
                c.setCometario(res.getString("Comentario"));
                lista.add(c);
            }    

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.Desconexion();
        }
        return lista;
    }
    
    
    
    
    
    
}
