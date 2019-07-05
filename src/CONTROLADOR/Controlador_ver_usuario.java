/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.DAO_Usuario;
import DTO.Usuario;

/**
 *
 * @author 19688016-K
 */
public class Controlador_ver_usuario {
    
    public Usuario Ver(String rut){
        DAO_Usuario u = new DAO_Usuario();
        Usuario user = new Usuario();
        user.setRut(rut);
        u.read(user);
        return user;
        
    }
    
}
