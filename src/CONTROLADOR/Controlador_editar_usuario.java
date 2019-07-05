/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.DAO_Usuario;
import DTO.Usuario;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author 19688016-K
 */
public class Controlador_editar_usuario {
    
    public Usuario Ver(String rut) {
        DAO_Usuario u = new DAO_Usuario();
        Usuario user = new Usuario();
        user.setRut(rut);
        u.read(user);
        return user;

    }

    public void Editar(String rut, String clave, String nombre, String apellido, String fono, String direccion, String comentario, int type) {
        try {
            if (rut.trim().isEmpty() || clave.trim().isEmpty() || nombre.trim().isEmpty() || apellido.trim().isEmpty() || fono.trim().isEmpty()
                || direccion.trim().isEmpty() || comentario.trim().isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "No deje campos vacios", "Error #02", JOptionPane.WARNING_MESSAGE);
            }else{
                int num = Integer.parseInt(fono);
                DAO_Usuario u = new DAO_Usuario();
                if (u.find_user(rut) == true) {
                    Usuario user = new Usuario();
                    user.setRut(rut);
                    if (u.read(user).getRut().equals(rut)) {
                        user.setClave(clave);
                        user.setNombre(nombre);
                        user.setApellido(apellido);
                        user.setFono(num);
                        user.setDireccion(direccion);
                        user.setComentario(comentario);
                        user.setTipo(type);
                        u.update(user);
                        JOptionPane.showMessageDialog(null, "Usuario editado");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No se ah encontrado usuario con ese codigo", "Error #08", JOptionPane.WARNING_MESSAGE);
                    
                }
                
            }
        } catch (HeadlessException | NumberFormatException e) {
        }
    }
    
}
