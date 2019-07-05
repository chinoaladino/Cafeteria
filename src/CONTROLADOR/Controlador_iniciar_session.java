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
public class Controlador_iniciar_session {

    public boolean iniciar_session(String rut, String clave) {

        try {
            if (rut.trim().isEmpty() || clave.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No deje campos Vacios" ,"Error #02", JOptionPane.WARNING_MESSAGE);
            } else {

                DAO_Usuario u = new DAO_Usuario();

                    if(u.find_user(rut)==true){
                        Usuario user =new Usuario();
                        user.setRut(rut);
                
                        if (u.read(user).getRut().equals(rut)) {
                            
                            if(u.read(user).getClave().equals(clave)){
                                JOptionPane.showMessageDialog(null, "Bienvenido   '" + u.read(user).getNombre() + " '");
                                return true;
                            }else{
                               JOptionPane.showMessageDialog(null, "Contraseña incorrecta" ,"Error #03", JOptionPane.WARNING_MESSAGE); 
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario incorecto" ,"Error #03", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        
                        
                        JOptionPane.showMessageDialog(null, "Usuario no existe", "Error #04", JOptionPane.WARNING_MESSAGE);
                        return false;
                    }
                }
            
        } catch (Exception e) {
        }
        return false;

    }

}
