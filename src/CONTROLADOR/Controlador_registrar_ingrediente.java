/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.DAO_Inventario;
import DTO.Inventario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author 19688016-K
 */
public class Controlador_registrar_ingrediente {

    public void Registrar(String cod, String nom, String cantidad, String precio, String comentario, String rut,int tipo) {
        try {
            if (cod.trim().isEmpty() || nom.trim().isEmpty() || cantidad.trim().isEmpty() || precio.trim().isEmpty() || comentario.trim().isEmpty()) {

                JOptionPane.showMessageDialog(null, "No deje campos vacios", "Error #02", JOptionPane.WARNING_MESSAGE);

            } else {
                try {
                    int codigo = Integer.parseInt(cod);
                    float cant = Float.parseFloat(cantidad);
                    int pre = Integer.parseInt(precio);
                    
                    DAO_Inventario i = new DAO_Inventario();

                    DateFormat df = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
                    Calendar calobj = Calendar.getInstance();
                    String fecha = df.format(calobj.getTime()).toString();
                    if (i.find(codigo) != true) {
                        int valor = pre * (Math.round(cant));
                        i.create(new Inventario(codigo, tipo, nom, cant, pre, valor, fecha, rut, comentario));
                        JOptionPane.showMessageDialog(null, "Registro exitoso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Este codigo ya existe", "Error #09", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo numeros en los campos (cantidad,precio)", "Error #09", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {
        }

    }

}
