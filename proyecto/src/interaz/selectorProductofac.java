/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaz;

import Excepciones.*;
import clases.Base;
import java.sql.SQLException;

/**
 *
 * 
 */
public class selectorProductofac extends javax.swing.JDialog {

    /**
     * Creates new form selectorProductofac
     */
    private boolean Aceptar = false;
    private String Codigo; private float Cantidad;
    private Base Conexion_DB = new Base();

    public boolean isAceptar() {
        return Aceptar;
    }

    public String getCodigo() {
        return Codigo;
    }

    public float getCantidad() {
        return Cantidad;
    }
    public selectorProductofac(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public selectorProductofac(java.awt.Frame parent, boolean modal, String Sucursal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            tabla_produc.setModel(Conexion_DB.obtenerProductosfac(Sucursal));
        } catch (SQLException|NoSePuedeConectar ex) {
            DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "ERROR", ex.getMessage());
            dialogo.setVisible(true);
        }
    }
    



    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Aceptar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_Titulo1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_Nombretrab3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_produc = new javax.swing.JTable();
        sep_Filtro = new javax.swing.JSeparator();
        txt_Filtro = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JLabel();
        txt_Cantidad = new javax.swing.JTextField();
        sep_Filtro1 = new javax.swing.JSeparator();
        lbl_Precio = new javax.swing.JLabel();
        lbl_Total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 64, 64)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Aceptar.setBackground(new java.awt.Color(255, 51, 51));
        btn_Aceptar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btn_Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Aceptar.setText("Aceptar");
        btn_Aceptar.setOpaque(true);
        btn_Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 100, 27));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(96, 96, 96));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Titulo1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo1.setText("SELECCIONAR PRODUCTO");
        jPanel3.add(lbl_Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jPanel4.setBackground(new java.awt.Color(128, 128, 128));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Nombretrab3.setEditable(false);
        txt_Nombretrab3.setBackground(new java.awt.Color(128, 128, 128));
        txt_Nombretrab3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Nombretrab3.setForeground(new java.awt.Color(255, 255, 255));
        txt_Nombretrab3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombretrab3.setText(" F10  VER EXISTENCIAS");
        txt_Nombretrab3.setBorder(null);
        txt_Nombretrab3.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Nombretrab3.setSelectionColor(new java.awt.Color(255, 0, 0));
        txt_Nombretrab3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_Nombretrab3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_Nombretrab3FocusLost(evt);
            }
        });
        txt_Nombretrab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_Nombretrab3MousePressed(evt);
            }
        });
        txt_Nombretrab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombretrab3ActionPerformed(evt);
            }
        });
        jPanel4.add(txt_Nombretrab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 150, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        tabla_produc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabla_produc.setForeground(new java.awt.Color(64, 64, 64));
        tabla_produc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_produc.setGridColor(new java.awt.Color(64, 64, 64));
        tabla_produc.setRowHeight(24);
        tabla_produc.setSelectionBackground(new java.awt.Color(192, 192, 192));
        tabla_produc.setSelectionForeground(new java.awt.Color(64, 64, 64));
        tabla_produc.setShowVerticalLines(false);
        tabla_produc.getTableHeader().setReorderingAllowed(false);
        tabla_produc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_producMousePressed(evt);
            }
        });
        tabla_produc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_producKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_producKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_produc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 570, 270));

        sep_Filtro.setBackground(new java.awt.Color(64, 64, 64));
        sep_Filtro.setForeground(new java.awt.Color(64, 64, 64));
        jPanel1.add(sep_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 570, 10));

        txt_Filtro.setBackground(new java.awt.Color(240, 240, 240));
        txt_Filtro.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txt_Filtro.setForeground(new java.awt.Color(64, 64, 64));
        txt_Filtro.setText("Búsqueda");
        txt_Filtro.setBorder(null);
        txt_Filtro.setCaretColor(new java.awt.Color(64, 64, 64));
        txt_Filtro.setDisabledTextColor(new java.awt.Color(96, 96, 96));
        txt_Filtro.setSelectedTextColor(new java.awt.Color(64, 64, 64));
        txt_Filtro.setSelectionColor(new java.awt.Color(192, 192, 192));
        txt_Filtro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_FiltroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_FiltroFocusLost(evt);
            }
        });
        txt_Filtro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_FiltroMousePressed(evt);
            }
        });
        txt_Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FiltroActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 570, 20));

        btn_Cancelar.setBackground(new java.awt.Color(255, 51, 51));
        btn_Cancelar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.setOpaque(true);
        btn_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 100, 27));

        txt_Cantidad.setBackground(new java.awt.Color(240, 240, 240));
        txt_Cantidad.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txt_Cantidad.setForeground(new java.awt.Color(255, 51, 51));
        txt_Cantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_Cantidad.setText("1");
        txt_Cantidad.setBorder(null);
        txt_Cantidad.setCaretColor(new java.awt.Color(64, 64, 64));
        txt_Cantidad.setSelectedTextColor(new java.awt.Color(64, 64, 64));
        txt_Cantidad.setSelectionColor(new java.awt.Color(192, 192, 192));
        txt_Cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_CantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CantidadFocusLost(evt);
            }
        });
        txt_Cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_CantidadMousePressed(evt);
            }
        });
        txt_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CantidadActionPerformed(evt);
            }
        });
        txt_Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_CantidadKeyReleased(evt);
            }
        });
        jPanel1.add(txt_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 140, 20));

        sep_Filtro1.setBackground(new java.awt.Color(64, 64, 64));
        sep_Filtro1.setForeground(new java.awt.Color(64, 64, 64));
        jPanel1.add(sep_Filtro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 140, 10));

        lbl_Precio.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl_Precio.setForeground(new java.awt.Color(64, 64, 64));
        lbl_Precio.setText("Cantidad:");
        jPanel1.add(lbl_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 90, 20));

        lbl_Total.setBackground(new java.awt.Color(128, 128, 128));
        lbl_Total.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbl_Total.setForeground(new java.awt.Color(64, 64, 64));
        lbl_Total.setText("Total = 0");
        jPanel1.add(lbl_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AceptarMouseClicked
        // TODO add your handling code here:

       int seleccion = tabla_produc.getSelectedRow();
        if (seleccion != -1 && Float.parseFloat(txt_Cantidad.getText()) <= Float.parseFloat(tabla_produc.getValueAt(seleccion, 3).toString())) {
//            Productos.setValueAt(tabla_produc.getValueAt(seleccion, 0).toString(), seleccion2, 0);
//            Productos.setValueAt(tabla_produc.getValueAt(seleccion, 2).toString(), seleccion2, 1);
//            Productos.setValueAt(txt_Cantidad.getText(), seleccion2, 2);
//            Productos.setValueAt("0.00", seleccion2, 3);
//            Productos.setValueAt("0.00", seleccion2, 4);
//            Productos.addRow(new String[]{});
            Codigo = tabla_produc.getValueAt(seleccion, 0).toString();
            Cantidad = Float.parseFloat(txt_Cantidad.getText());
            Aceptar = true;
           this.setVisible(false);
        }     else if(Float.parseFloat(txt_Cantidad.getText()) > Float.parseFloat(tabla_produc.getValueAt(seleccion, 3).toString())){
             DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "ERROR", "Insuficientes existencias, verifique la cantidad");
             dialogo.setVisible(true);
        }      
    }//GEN-LAST:event_btn_AceptarMouseClicked

    private void tabla_producMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_producMousePressed
        int seleccion = tabla_produc.getSelectedRow();
        if (seleccion != -1) {
            btn_Aceptar.setEnabled(true);
            try {
                lbl_Total.setText("Total: " + Conexion_DB.existencias(tabla_produc.getValueAt(seleccion, 0).toString()));
            } catch (SQLException|NoSePuedeConectar ex) {
                DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "ERROR", ex.getMessage());
                dialogo.setVisible(true);
            }
        }
    }//GEN-LAST:event_tabla_producMousePressed

    private void tabla_producKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_producKeyPressed

    }//GEN-LAST:event_tabla_producKeyPressed

    private void txt_FiltroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_FiltroFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FiltroFocusGained

    private void txt_FiltroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_FiltroFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FiltroFocusLost

    private void txt_FiltroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_FiltroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FiltroMousePressed

    private void txt_FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FiltroActionPerformed

    private void btn_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelarMouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
    }//GEN-LAST:event_btn_CancelarMouseClicked

    private void txt_CantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CantidadFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CantidadFocusGained

    private void txt_CantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CantidadFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CantidadFocusLost

    private void txt_CantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_CantidadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CantidadMousePressed

    private void txt_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CantidadActionPerformed

    private void tabla_producKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_producKeyReleased

        if (evt.getKeyCode() == 121){
            int seleccion  = tabla_produc.getSelectedRow();
            if(seleccion != -1){
                Existencias exi = new Existencias(null, true, tabla_produc.getValueAt(seleccion, 0).toString());
                exi.setVisible(true);
            }
        }
    }//GEN-LAST:event_tabla_producKeyReleased

    private void txt_Nombretrab3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Nombretrab3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombretrab3FocusGained

    private void txt_Nombretrab3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_Nombretrab3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombretrab3FocusLost

    private void txt_Nombretrab3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Nombretrab3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombretrab3MousePressed

    private void txt_Nombretrab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombretrab3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombretrab3ActionPerformed

    private void txt_CantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CantidadKeyReleased
        int seleccion = tabla_produc.getSelectedRow();
        if (seleccion != -1 && txt_Cantidad.getText().length()!=0){
            btn_Aceptar.setEnabled(true);
            try {
                lbl_Total.setText("Total: " + Conexion_DB.existencias(tabla_produc.getValueAt(seleccion, 0).toString())*Float.parseFloat(txt_Cantidad.getText()));
            } catch (SQLException|NoSePuedeConectar ex) {
                DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "ERROR", ex.getMessage());
                dialogo.setVisible(true);
            }
        }
        else if(seleccion != -1 && txt_Cantidad.getText().length()==0)
        {
           btn_Aceptar.setEnabled(true);
            try {
                lbl_Total.setText("Total: " + Conexion_DB.existencias(tabla_produc.getValueAt(seleccion, 0).toString())*0);
            } catch (SQLException|NoSePuedeConectar ex) {
                DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "ERROR", ex.getMessage());
                dialogo.setVisible(true);
            } 
        }
    }//GEN-LAST:event_txt_CantidadKeyReleased

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
            java.util.logging.Logger.getLogger(selectorProductofac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectorProductofac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectorProductofac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectorProductofac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                selectorProductofac dialog = new selectorProductofac(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Aceptar;
    private javax.swing.JLabel btn_Cancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Precio;
    private javax.swing.JLabel lbl_Titulo1;
    private javax.swing.JLabel lbl_Total;
    private javax.swing.JSeparator sep_Filtro;
    private javax.swing.JSeparator sep_Filtro1;
    private javax.swing.JTable tabla_produc;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Filtro;
    private javax.swing.JTextField txt_Nombretrab3;
    // End of variables declaration//GEN-END:variables
}
