/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Usuario;
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
public class DAO_Usuario implements Mantenedores<Usuario>{

    
    
    private static final String SQL_INSERT = "INSERT INTO usuario (rut,clave,nombre,apellido,fono,direccion,tipo,comentario)"
            + " VALUES (?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE rut = ?";
    private static final String SQL_UPDATE = "UPDATE usuario SET clave= ?, nombre= ?, apellido= ?, fono= ? ,direccion= ? ,tipo= ?,comentario= ? WHERE rut= ?";
    private static final String SQL_READ = "SELECT * FROM usuario WHERE rut= ?";
    private static final String SQL_READALL = "SELECT * FROM usuario";
    private static final String SQL_RLIKE = "SELECT * FROM usuario WHERE rut LIKE  ? '%'";
    private static final String SQL_NLIKE = "SELECT * FROM usuario WHERE nombre LIKE  ? '%'";
    
    @Override
    public boolean create(Usuario c) {
        PreparedStatement ps;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_INSERT);
            ps.setString(1, c.getRut());
            ps.setString(2, c.getClave());
            ps.setString(3, c.getNombre());
            ps.setString(4, c.getApellido());
            ps.setInt(5, c.getFono());
            ps.setString(6, c.getDireccion());
            ps.setInt(7, c.getTipo());
            ps.setString(8, c.getComentario());
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
    public boolean delete(Usuario c) {
        PreparedStatement ps;
        Conexion con = new Conexion();

        try {
            ps = con.getConexion().prepareStatement(SQL_DELETE);
            ps.setString(1, c.getRut());
            if (ps.executeUpdate() > 0) {

                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.Desconexion();
        }
        return false;
    }

    @Override
    public boolean update(Usuario c) {
        PreparedStatement ps;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_UPDATE);

            
            ps.setString(1, c.getClave());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellido());
            ps.setInt(4, c.getFono());
            ps.setString(5, c.getDireccion());
            ps.setInt(6, c.getTipo());
            ps.setString(7, c.getComentario());
            ps.setString(8, c.getRut());
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
    public Usuario read(Usuario c) {
        PreparedStatement ps;
        ResultSet res;
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READ);
            ps.setString(1, c.getRut());
            res = ps.executeQuery();

            while (res.next()) {
                c.setRut(res.getString("rut"));
                c.setClave(res.getString("clave"));
                c.setNombre(res.getString("nombre"));
                c.setApellido(res.getString("apellido"));
                c.setFono(res.getInt("fono"));
                c.setDireccion(res.getString("direccion"));
                c.setTipo(res.getInt("tipo"));
                c.setComentario(res.getString("comentario"));
            }
            

        } catch (SQLException ex) {

            return null;
        }
        return c;
    }

    @Override
    public List<Usuario> readAll() {
        PreparedStatement ps;
        ResultSet res;
            ArrayList<Usuario> lista = new ArrayList<>();
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_READALL);
            res = ps.executeQuery();

            while (res.next()) {
                Usuario c = new Usuario();
                c.setRut(res.getString("rut"));
                c.setClave(res.getString("clave"));
                c.setNombre(res.getString("nombre"));
                c.setApellido(res.getString("apellido"));
                c.setFono(res.getInt("fono"));
                c.setDireccion(res.getString("direccion"));
                c.setTipo(res.getInt("tipo"));
                c.setComentario(res.getString("comentario"));
                lista.add(c);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Detalle_Pedido.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.Desconexion();
        }
        return lista;
    }

    public Object read(DAO_Usuario validacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean find_user(String rut ){
        PreparedStatement ps;
        ResultSet res;
        Conexion con = new Conexion();
        try {
            
            ps = con.getConexion().prepareStatement(SQL_READ);
            ps.setString(1, rut);
            res = ps.executeQuery();
            while(res.next()){
                 
                return true;
            }
            
        } catch (SQLException e) {
            
        }
        return false;
        
        
    }
    
    public List<Usuario> RutLIKE(String rut) {
        PreparedStatement ps;
        ResultSet res;
        ArrayList<Usuario> lista = new ArrayList<>();
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_RLIKE);
            ps.setString(1, rut);
            res = ps.executeQuery();

            while (res.next()) {
                Usuario c = new Usuario();
                c.setRut(res.getString("rut"));
                c.setClave(res.getString("clave"));
                c.setNombre(res.getString("nombre"));
                c.setApellido(res.getString("apellido"));
                c.setFono(res.getInt("fono"));
                c.setDireccion(res.getString("direccion"));
                c.setTipo(res.getInt("tipo"));
                c.setComentario(res.getString("comentario"));
                lista.add(c);
            }    

        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.Desconexion();
        }
        return lista;
    }
    
     public List<Usuario> nomLIKE(String nom) {
        PreparedStatement ps;
        ResultSet res;
        ArrayList<Usuario> lista = new ArrayList<>();
        Conexion con = new Conexion();
        try {

            ps = con.getConexion().prepareStatement(SQL_NLIKE);
            ps.setString(1, nom);
            res = ps.executeQuery();

            while (res.next()) {
                Usuario c = new Usuario();
                c.setRut(res.getString("rut"));
                c.setClave(res.getString("clave"));
                c.setNombre(res.getString("nombre"));
                c.setApellido(res.getString("apellido"));
                c.setFono(res.getInt("fono"));
                c.setDireccion(res.getString("direccion"));
                c.setTipo(res.getInt("tipo"));
                c.setComentario(res.getString("comentario"));
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
