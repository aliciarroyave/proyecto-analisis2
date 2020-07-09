/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaz;

import clases.*;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Roberto
 */
public class RecursosHumanos extends javax.swing.JPanel {
    private Conexion conexion;
    /**
     * Creates new form Financiero
     */
    public RecursosHumanos(Conexion conexion) {
        initComponents();
        this.conexion=conexion;
    }
    public void desactivarBotonoes(JLabel exclusion)
    {
        exclusion.setBackground(Color.red);
        if(btn_deudas!=exclusion)
            btn_deudas.setBackground(Color.black);
        if(btn_trabajadores!=exclusion)
            btn_trabajadores.setBackground(Color.black);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_contenido = new javax.swing.JPanel();
        btn_trabajadores = new javax.swing.JLabel();
        btn_deudas = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        pn_contenido.setBackground(new java.awt.Color(0, 0, 0));
        pn_contenido.setPreferredSize(new java.awt.Dimension(940, 650));

        javax.swing.GroupLayout pn_contenidoLayout = new javax.swing.GroupLayout(pn_contenido);
        pn_contenido.setLayout(pn_contenidoLayout);
        pn_contenidoLayout.setHorizontalGroup(
            pn_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pn_contenidoLayout.setVerticalGroup(
            pn_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        btn_trabajadores.setBackground(new java.awt.Color(0, 0, 0));
        btn_trabajadores.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_trabajadores.setForeground(new java.awt.Color(255, 255, 255));
        btn_trabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_trabajadores.setText("TRABAJADORES");
        btn_trabajadores.setName(""); // NOI18N
        btn_trabajadores.setOpaque(true);
        btn_trabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_trabajadoresMouseClicked(evt);
            }
        });

        btn_deudas.setBackground(new java.awt.Color(0, 0, 0));
        btn_deudas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_deudas.setForeground(new java.awt.Color(255, 255, 255));
        btn_deudas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_deudas.setText("DEUDAS");
        btn_deudas.setName(""); // NOI18N
        btn_deudas.setOpaque(true);
        btn_deudas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deudasMouseClicked(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(0, 0, 0));
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosSCE/cancel (2).png"))); // NOI18N
        Salir.setOpaque(true);
        Salir.setPreferredSize(new java.awt.Dimension(40, 40));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_trabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_deudas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 580, Short.MAX_VALUE)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_trabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_deudas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(pn_contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_trabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_trabajadoresMouseClicked
        desactivarBotonoes(btn_trabajadores);
        Trabajadores trabajadores= new Trabajadores(conexion);
        trabajadores.setLocation(0,0);
        trabajadores.setSize(pn_contenido.getSize());
        pn_contenido.removeAll();
        pn_contenido.add(trabajadores,BorderLayout.CENTER);
        pn_contenido.revalidate();
        pn_contenido.repaint();
    }//GEN-LAST:event_btn_trabajadoresMouseClicked

    private void btn_deudasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deudasMouseClicked
        desactivarBotonoes(btn_deudas);
        DeudasTrabajador deudas= new DeudasTrabajador(conexion);
        deudas.setLocation(0,0);
        deudas.setSize(pn_contenido.getSize());
        pn_contenido.removeAll();
        pn_contenido.add(deudas,BorderLayout.CENTER);
        pn_contenido.revalidate();
        pn_contenido.repaint();

    }//GEN-LAST:event_btn_deudasMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel btn_deudas;
    private javax.swing.JLabel btn_trabajadores;
    private javax.swing.JPanel pn_contenido;
    // End of variables declaration//GEN-END:variables
}
