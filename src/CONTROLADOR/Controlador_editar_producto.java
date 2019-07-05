/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.DAO_Inventario;
import DAO.DAO_Usuario;
import DTO.Inventario;
import DTO.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author 19688016-K
 */
public class Controlador_editar_producto {
    public Usuario Ver(String rut){
        DAO_Usuario u = new DAO_Usuario();
        Usuario user = new Usuario();
        user.setRut(rut);
        u.read(user);
        return user;
        
    }
    
    public void editar(String cod, String nom, String cantidad, String precio, String comentario, String rut, int tipo) {
        try {
            if (cod.trim().isEmpty() || nom.trim().isEmpty() || cantidad.trim().isEmpty() || precio.trim().isEmpty() || comentario.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No deje campos Vacios" ,"Error #02", JOptionPane.WARNING_MESSAGE);
            }else{
                try {
                    int codigo = Integer.parseInt(cod);
                    float cant = Float.parseFloat(cantidad);
                    int pre = Integer.parseInt(precio);
                    DAO_Inventario i = new DAO_Inventario();

                    DateFormat df = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
                    Calendar calobj = Calendar.getInstance();
                    String fecha = df.format(calobj.getTime()).toString();
                    if(i.find(codigo)==true){
                        int valor = pre * (Math.round(cant));
                        Inventario p=new Inventario();
                        p.setCodigo_inventario(codigo);
                        p.setNombre(nom);
                        p.setCantidad(cant);
                        p.setTipo(tipo);
                        p.setPrecio_cu(pre);
                        p.setUlt_actualizacion(fecha);
                        p.setValor_total_p(valor);
                        p.setCod_user(rut);
                        p.setCometario(comentario);
                        
                        i.update(p);
                        
                    }else{
                       JOptionPane.showMessageDialog(null, "Codigo no existe" ,"Error #03", JOptionPane.WARNING_MESSAGE); 
                    }
                } catch (NumberFormatException e) {
                }
            }
        } catch (Exception e) {
        }
    }

}
