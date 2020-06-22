/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
//
//import Excepciones.*;
//import RobertoPruebas.Conexion;
//import RobertoPruebas.DialogoOpcion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class selectorCliente extends javax.swing.JDialog {

    /**
     * Creates new form selectorCliente
     */
//    private Conexion Conexion_DB = new Conexion();
    private String[] Cliente;
    private int codigo;
    public selectorCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
//        try {
//            tabla_cliente.setModel(Conexion_DB.obtenerClientes());
//        } catch (SQLException|NoSePuedeConectar ex) {
//            DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "ERROR", ex.getMessage());
//            dialogo.setVisible(true);
//        }
    }

    public String[] getCliente() {
        return Cliente;
    }

    public int getCodigo() {
        return codigo;
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
        lbl_Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cliente = new javax.swing.JTable();
        sep_Filtro = new javax.swing.JSeparator();
        txt_Filtro = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Aceptar.setBackground(new java.awt.Color(255, 0, 0));
        btn_Aceptar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn_Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Aceptar.setText("ACEPTAR");
        btn_Aceptar.setEnabled(false);
        btn_Aceptar.setOpaque(true);
        btn_Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 160, 40));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Titulo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Titulo.setText("SELECCIONE UN CLIENTE");
        jPanel2.add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        tabla_cliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabla_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_cliente.setGridColor(new java.awt.Color(0, 0, 0));
        tabla_cliente.setRowHeight(24);
        tabla_cliente.setSelectionBackground(new java.awt.Color(255, 0, 0));
        tabla_cliente.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabla_cliente.setShowVerticalLines(false);
        tabla_cliente.getTableHeader().setReorderingAllowed(false);
        tabla_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_clienteMousePressed(evt);
            }
        });
        tabla_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_clienteKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_cliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 650, 330));

        sep_Filtro.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sep_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 650, 10));

        txt_Filtro.setBackground(new java.awt.Color(0, 0, 0));
        txt_Filtro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Filtro.setForeground(new java.awt.Color(255, 255, 255));
        txt_Filtro.setText("NOMBRE");
        txt_Filtro.setBorder(null);
        txt_Filtro.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Filtro.setSelectionColor(new java.awt.Color(255, 0, 0));
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
        jPanel1.add(txt_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 650, 20));

        btn_Cancelar.setBackground(new java.awt.Color(255, 0, 0));
        btn_Cancelar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Cancelar.setText("CANCELAR");
        btn_Cancelar.setOpaque(true);
        btn_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CancelarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 160, 40));

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

        int seleccion = tabla_cliente.getSelectedRow();
        if (seleccion != -1) {
            Cliente = new String[] {tabla_cliente.getValueAt(seleccion, 0).toString(), tabla_cliente.getValueAt(seleccion, 1).toString(),
            tabla_cliente.getValueAt(seleccion, 2).toString(), tabla_cliente.getValueAt(seleccion, 3).toString()};
            codigo = Integer.parseInt(tabla_cliente.getValueAt(seleccion, 0).toString());
        }
        this.setVisible(false);
    }//GEN-LAST:event_btn_AceptarMouseClicked

    private void tabla_clienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clienteMousePressed
        if (tabla_cliente.getSelectedRow() != -1) {
            btn_Aceptar.setEnabled(true);
        }

    }//GEN-LAST:event_tabla_clienteMousePressed

    private void tabla_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_clienteKeyPressed
        //filaSeleccionada();
    }//GEN-LAST:event_tabla_clienteKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(selectorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                selectorCliente dialog = new selectorCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JSeparator sep_Filtro;
    private javax.swing.JTable tabla_cliente;
    private javax.swing.JTextField txt_Filtro;
    // End of variables declaration//GEN-END:variables
}