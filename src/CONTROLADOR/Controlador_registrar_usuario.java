/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.DAO_Usuario;
import DTO.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author 19688016-K
 */
public class Controlador_registrar_usuario {

    public void Registrar_usuario(String rut, String clave, String nombre, String apellido, String fono, String direccion, int type, String comentario) {
        try {
            if (rut.trim().isEmpty() || clave.trim().isEmpty() || nombre.trim().isEmpty() || apellido.trim().isEmpty() || fono.trim().isEmpty()
                    || direccion.trim().isEmpty() || comentario.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No deje campos vacios", "Error #02", JOptionPane.WARNING_MESSAGE);
            } else {

                try {
                    int num = Integer.parseInt(fono);
                    DAO_Usuario u = new DAO_Usuario();
                    
                    
                    if (u.find_user(rut)==true) {
                        JOptionPane.showMessageDialog(null, "error ya existe ese usuario");
                    } else {
                        
                        u.create(new Usuario(rut, clave, nombre, apellido, num, direccion, type, comentario));
                        JOptionPane.showMessageDialog(null, "Usuario registrado");

                    }
                

            }catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese solo numeron en el campo fono", "Error #05", JOptionPane.WARNING_MESSAGE);
                }

        }

    }
    catch (Exception e

    
    

) {
        }
    }

}
