/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.DAO_Inventario;
import DTO.Inventario;

/**
 *
 * @author 19688016-K
 */
public class Controlador_ver_producto {
    
    public Inventario Ver(int cod){
        DAO_Inventario u = new DAO_Inventario();
        Inventario user = new Inventario();
        user.setCodigo_inventario(cod);
        u.read(user);
        return user;
        
    }
}
