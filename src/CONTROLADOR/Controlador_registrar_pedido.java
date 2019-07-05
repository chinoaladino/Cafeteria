/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.DAO_Pedido;
import DTO.Pedido;

/**
 *
 * @author 19688016-K
 */
public class Controlador_registrar_pedido {
    public Pedido nuevo(){
        DAO_Pedido n= new DAO_Pedido();
        if(n.readAll().isEmpty()){
            Pedido p= new Pedido();
            p.setCod_pedido(1);
            return p;
        }else{
            for (int i = 0; i <= n.readAll().size(); i++) {
                if(n.readAll().get(i).getCod_pedido()==n.readAll().size()){
                    Pedido p= new Pedido();
                    p.setCod_pedido(i+1);
                    return p;
                }
            }
            
        }
        return null;
    }
    
}
