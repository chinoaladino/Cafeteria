/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import CONTROLADOR.Controlador_menu;
import Ventanas.Registrar_usuario;
import Ventanas.Buscar_venta;
import Ventanas.Buscar_producto;
import Ventanas.Registrar_Venta;
import Ventanas.Registrar_ingrediente;
import Ventanas.Buscar_pedido;
import Ventanas.Buscar_usuario;
import Ventanas.Editar_ingrediente;
import Ventanas.Registrar_pedido;
import Ventanas.Editar_venta;
import Ventanas.Editar_pedido;
import Ventanas.Editar_producto;
import Ventanas.Editar_usuario;
import Ventanas.Eliminar_venta;
import Ventanas.Eliminar_pedido;
import Ventanas.Eliminar_producto;
import Ventanas.Eliminar_usuario;
import Ventanas.Consumir_inventario;
import Ventanas.Registrar_entrega_pedido;
import Ventanas.V_Alertas;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;


/**
 *
 * @author 19688016-K
 */
public class menu extends javax.swing.JFrame {


    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/java.png")).getImage());
        txtrut.setText(iniciar_session.txtrut.getText());
    }
    iniciar_session i;
    Registrar_usuario u;
    Registrar_usuario a;
    Registrar_ingrediente p;
    Registrar_Venta c;
    Registrar_pedido cp;
    Buscar_usuario bu;
    Buscar_pedido b_p;
    Buscar_venta bc;
    Buscar_producto bp;
    Editar_usuario edi;
    Editar_venta edc;
    Editar_pedido ed_p;
    Editar_producto edp;
    Eliminar_usuario eu;
    Eliminar_venta ec;
    Eliminar_pedido e_p;
    Eliminar_producto ep;
    V_Alertas va;
    Consumir_inventario g_p;
    Editar_ingrediente e_i;
    Registrar_entrega_pedido r_e_p;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        txtrut = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btn_alerta = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        gestion_compra = new javax.swing.JMenuItem();
        bttbuscar_compra = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        gestion_p = new javax.swing.JMenuItem();
        generar_producto = new javax.swing.JMenuItem();
        buscar_producto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Crear_pedido = new javax.swing.JMenuItem();
        registrar_pedido = new javax.swing.JMenuItem();
        Buscar_pedido = new javax.swing.JMenuItem();
        Ajuste = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        registrar_usuario = new javax.swing.JMenuItem();
        buscar_usuario = new javax.swing.JMenuItem();
        cerrar_session = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafeteria");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/java.png")).getImage());

        jLabel1.setText("Usuario:");

        escritorio.setLayer(txtrut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(682, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(575, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        escritorioLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, txtrut});

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setAutoscrolls(true);

        btn_alerta.setText("Alertas");
        btn_alerta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alertaMouseClicked(evt);
            }
        });
        btn_alerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alertaActionPerformed(evt);
            }
        });
        jMenuBar1.add(btn_alerta);

        jMenu1.setBorder(null);
        jMenu1.setText("Gestionar compras");

        gestion_compra.setText("Registrar compra ");
        gestion_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestion_compraActionPerformed(evt);
            }
        });
        jMenu1.add(gestion_compra);

        bttbuscar_compra.setText("Buscar compra");
        bttbuscar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttbuscar_compraActionPerformed(evt);
            }
        });
        jMenu1.add(bttbuscar_compra);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setText("Gestion inventario");

        gestion_p.setText("Registrar ingrediente");
        gestion_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestion_pActionPerformed(evt);
            }
        });
        jMenu2.add(gestion_p);

        generar_producto.setText("Generar producto");
        generar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(generar_producto);

        buscar_producto.setText("Buscar ingrediente/producto");
        buscar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(buscar_producto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Gestionar pedido");

        Crear_pedido.setText("Registrar pedido");
        Crear_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_pedidoActionPerformed(evt);
            }
        });
        jMenu3.add(Crear_pedido);

        registrar_pedido.setText("Registrar entrega pedido");
        registrar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_pedidoActionPerformed(evt);
            }
        });
        jMenu3.add(registrar_pedido);

        Buscar_pedido.setText("Buscar pedido");
        Buscar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_pedidoActionPerformed(evt);
            }
        });
        jMenu3.add(Buscar_pedido);

        jMenuBar1.add(jMenu3);

        Ajuste.setText("Ajustes");

        jMenu4.setText("Administrar usuarios");

        registrar_usuario.setText("Registrar usuario");
        registrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_usuarioActionPerformed(evt);
            }
        });
        jMenu4.add(registrar_usuario);

        buscar_usuario.setText("Buscar usuario");
        buscar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_usuarioActionPerformed(evt);
            }
        });
        jMenu4.add(buscar_usuario);

        Ajuste.add(jMenu4);

        cerrar_session.setText("Cerrar session");
        cerrar_session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sessionActionPerformed(evt);
            }
        });
        Ajuste.add(cerrar_session);

        jMenuBar1.add(Ajuste);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_productoActionPerformed
        // TODO add your handling code here:
        if(bp==null||bp.isClosed()){
            bp=new Buscar_producto();
            escritorio.add(bp);
            bp.show();
        }else{
            JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buscar_productoActionPerformed

    private void gestion_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestion_pActionPerformed
        if(p==null||p.isClosed()){
            p=new Registrar_ingrediente();
            escritorio.add(p);
            p.show();
        }else{
            JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_gestion_pActionPerformed

    private void gestion_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestion_compraActionPerformed
        // TODO add your handling code here:
        if(c==null||c.isClosed()){
            c = new Registrar_Venta();
            escritorio.add(c);
            c.show();
        }else{
            JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_gestion_compraActionPerformed

    private void bttbuscar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttbuscar_compraActionPerformed
        // TODO add your handling code here:
             if (bc == null || bc.isClosed()) {
            bc = new Buscar_venta();
            escritorio.add(bc);
            bc.show();
        } else {
            JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bttbuscar_compraActionPerformed

    private void btn_alertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alertaActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_btn_alertaActionPerformed

    private void btn_alertaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alertaMouseClicked
        // TODO add your handling code here:
                if (va==null || va.isClosed()){
            va=new V_Alertas();
            escritorio.add(va);
            va.show();   
        }else{
          JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_btn_alertaMouseClicked

    private void Crear_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_pedidoActionPerformed
        // TODO add your handling code here:
        if (cp==null || cp.isClosed()){
            cp=new Registrar_pedido();
            escritorio.add(cp);
            cp.show();   
        }else{
          JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_Crear_pedidoActionPerformed

    private void Buscar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_pedidoActionPerformed
        // TODO add your handling code here:
        if (b_p==null || b_p.isClosed()){
            b_p=new Buscar_pedido();
            escritorio.add(b_p);
            b_p.show();   
        }else{
          JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_Buscar_pedidoActionPerformed

    private void cerrar_sessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sessionActionPerformed
        // TODO add your handling code here:
        i = new iniciar_session();
        i.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_cerrar_sessionActionPerformed

    private void generar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar_productoActionPerformed
        // TODO add your handling code here:
        if (g_p==null || g_p.isClosed()){
            g_p=new Consumir_inventario();
            escritorio.add(g_p);
            g_p.show();   
        }else{
          JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_generar_productoActionPerformed

    private void registrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_usuarioActionPerformed
        // TODO add your handling code here:
        
        Controlador_menu m = new Controlador_menu();
        String rut=txtrut.getText();
        m.validar_cargo(rut);
        if (m.validar_cargo(rut).getTipo() == 2) {
            if (u == null || u.isClosed()) {
                u = new Registrar_usuario();
                escritorio.add(u);
                u.show();
            } else {
                JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Permisos insuficientes", "Error #07", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_registrar_usuarioActionPerformed

    private void buscar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_usuarioActionPerformed
        // TODO add your handling code here:
        Controlador_menu m = new Controlador_menu();
        String rut=txtrut.getText();
        m.validar_cargo(rut);
        if (m.validar_cargo(rut).getTipo() == 2) {
        if (bu==null || bu.isClosed()){
            bu=new Buscar_usuario();
            escritorio.add(bu);
            bu.show();   
        }else{
          JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);  
        }
        }else{
            JOptionPane.showMessageDialog(null, "Permisos insuficientes", "Error #07", JOptionPane.WARNING_MESSAGE);
        }
            
    }//GEN-LAST:event_buscar_usuarioActionPerformed

    private void registrar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_pedidoActionPerformed
        // TODO add your handling code here:
        if (r_e_p==null || r_e_p.isClosed()){
            r_e_p=new Registrar_entrega_pedido();
            escritorio.add(r_e_p);
            r_e_p.show();   
        }else{
          JOptionPane.showMessageDialog(null, "Esta ventana ya esta abierta", "Error #01", JOptionPane.WARNING_MESSAGE);  
        }
        
    }//GEN-LAST:event_registrar_pedidoActionPerformed

    /**
     * @param args the command line arguments
     */
 public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(iniciar_session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciar_session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciar_session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciar_session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new menu().setVisible(true);
            }
        });
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ajuste;
    private javax.swing.JMenuItem Buscar_pedido;
    private javax.swing.JMenuItem Crear_pedido;
    private javax.swing.JMenu btn_alerta;
    private javax.swing.JMenuItem bttbuscar_compra;
    private javax.swing.JMenuItem buscar_producto;
    private javax.swing.JMenuItem buscar_usuario;
    private javax.swing.JMenuItem cerrar_session;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem generar_producto;
    private javax.swing.JMenuItem gestion_compra;
    private javax.swing.JMenuItem gestion_p;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem registrar_pedido;
    private javax.swing.JMenuItem registrar_usuario;
    public static javax.swing.JLabel txtrut;
    // End of variables declaration//GEN-END:variables
}
