/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaz;

import clases.Base;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
 */
public class DialogodeMensaje extends javax.swing.JFrame {

    /**
     * Creates new form DialogodeMensaje
     */
    public static final int ICONO_ERROR = 1;
    public static final int ICONO_INFORMACION = 2;
    public static final int ICONO_INTERROGANTE = 3;
    private Base Conexion_DB = new Base();
//    private DialogodeMensaje Dialogo = new DialogodeMensaje();
    public DialogodeMensaje() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setContenido(String Titulo, String Mensaje, int Icono){
        this.lbl_Titulo.setText(Titulo);
        this.Mensaje.setText(Mensaje);
        if (Icono == 1) {
            this.Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosSCE/error.png")));
        }else if (Icono == 2){
            this.Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosSCE/info.png")));
        }else if (Icono == 3){
            this.Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosSCE/quesion.png")));
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
        jPanel2 = new javax.swing.JPanel();
        lbl_Titulo = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        btn_Aceptar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        jPanel1.setPreferredSize(new java.awt.Dimension(408, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(96, 96, 96));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        lbl_Titulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Titulo.setText("TITULO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosSCE/info.png"))); // NOI18N
        jPanel1.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        Mensaje.setBackground(new java.awt.Color(64, 64, 64));
        Mensaje.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(64, 64, 64));
        Mensaje.setText("Mensaje");
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 290, 80));

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
        jPanel1.add(btn_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 100, 27));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AceptarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_AceptarMouseClicked

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
            java.util.logging.Logger.getLogger(DialogodeMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogodeMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogodeMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogodeMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogodeMensaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel btn_Aceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
