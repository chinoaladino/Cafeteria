/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;


import DAO.DAO_Usuario;
import DTO.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 19688016-K
 */
public class Controlador_buscar_usuario {
    
    public List<Usuario> tabla(){
        
        DAO_Usuario u= new DAO_Usuario();
        ArrayList<Usuario> list= new ArrayList<>();
        for (int i = 0; i < u.readAll().size(); i++) {
            
            list.add(u.readAll().get(i));
        }
        return list;
    }
    
    public void ElminarUsuario(String respuesta){
        if (respuesta.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No deje campos Vacios" ,"Error #02", JOptionPane.WARNING_MESSAGE);
        }else{
            DAO_Usuario u= new DAO_Usuario();
            if(u.find_user(respuesta)==true){
                Usuario user = new Usuario();
                user.setRut(respuesta);
                u.delete(user);
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
            
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario no existe" ,"Error #04", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public List<Usuario> Buscar_rut(String b_rut){
        
        DAO_Usuario u= new DAO_Usuario();
        ArrayList<Usuario> list= new ArrayList<>();
        for (int i = 0; i < u.RutLIKE(b_rut).size(); i++) {
            Usuario user = u.RutLIKE(b_rut).get(i);
            
            list.add(user);
            
        }
        
        return list;
        
    }
    
    public List<Usuario> Buscar_numbre(String b_nom){
        DAO_Usuario u= new DAO_Usuario();
        ArrayList<Usuario> list= new ArrayList<>();
        for (int i = 0; i < u.nomLIKE(b_nom).size(); i++) {
            Usuario user = u.nomLIKE(b_nom).get(i);
            
            list.add(user);
        }
        return list;
    }
    
    
}
