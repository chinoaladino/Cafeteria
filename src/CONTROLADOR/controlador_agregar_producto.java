/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.DAO_Inventario;
import DTO.Inventario;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 19688016-K
 */
public class controlador_agregar_producto {
    
    public List<Inventario> tabla() {

        DAO_Inventario u = new DAO_Inventario();
        ArrayList<Inventario> list = new ArrayList<>();
        for (int i = 0; i < u.readAll().size(); i++) {

            list.add(u.readAll().get(i));
        }
        return list;
    }

    public List<Inventario> tabla_u() {

        DAO_Inventario u = new DAO_Inventario();

        ArrayList<Inventario> list = new ArrayList<>();
        for (int i = 0; i < u.readAll().size(); i++) {

            if (u.readAll().get(i).getTipo() == 1) {
                list.add(u.readAll().get(i));
            }

        }
        return list;
    }

    public List<Inventario> tabla_k() {

        DAO_Inventario u = new DAO_Inventario();

        ArrayList<Inventario> list = new ArrayList<>();
        for (int i = 0; i < u.readAll().size(); i++) {

            if (u.readAll().get(i).getTipo() == 2) {
                list.add(u.readAll().get(i));
            }

        }
        return list;
    }

    public List<Inventario> tabla_l() {

        DAO_Inventario u = new DAO_Inventario();

        ArrayList<Inventario> list = new ArrayList<>();
        for (int i = 0; i < u.readAll().size(); i++) {

            if (u.readAll().get(i).getTipo() == 3) {
                list.add(u.readAll().get(i));
            }

        }
        return list;
    }

    public List<Inventario> Buscar_r(String b_cod) {
        DAO_Inventario u = new DAO_Inventario();
        ArrayList<Inventario> list = new ArrayList<>();

        for (int i = 0; i < u.readLike(b_cod).size(); i++) {

            Inventario user = u.readLike(b_cod).get(i);
            list.add(user);

        }
        return list;
    }

    public List<Inventario> Buscar_n(String nom) {
        DAO_Inventario u = new DAO_Inventario();
        ArrayList<Inventario> list = new ArrayList<>();

        for (int i = 0; i < u.nLike(nom).size(); i++) {

            Inventario user = u.nLike(nom).get(i);
            list.add(user);

        }
        return list;
    }

    
    
}
