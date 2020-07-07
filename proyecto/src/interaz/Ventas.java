/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaz;

import Excepciones.NoSePuedeConectar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JLabel;
import clases.*;
/**
 *
 *
 */
public class Ventas extends javax.swing.JPanel {

    /**
     * Creates new form Ventas
     */
    private  Factura panel_Factura;

    private consultaFactura consulta;
    private Conexion Conexion_DB;
    public Ventas() {
        initComponents();
       try {
            panel_Factura = new Factura(Conexion_DB.siguienteCotizacion() + "");
          consulta=new consultaFactura();
        } catch (SQLException|NoSePuedeConectar ex) {
            DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "ERROR", ex.getMessage());
            dialogo.setVisible(true);
        }

    }
    public Ventas(Conexion conexion) {
        initComponents();
        this.Conexion_DB=conexion;
        try {
            panel_Factura = new Factura(Conexion_DB.siguienteCotizacion() + "");
            consulta=new consultaFactura();
        } catch (SQLException|NoSePuedeConectar ex) {
            DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "ERROR", ex.getMessage());
            dialogo.setVisible(true);
        }

    }
    private void setBoton(JLabel boton){
        boton.setBackground(Color.RED);
    }
    private void resetBoton(JLabel boton){
        boton.setBackground(Color.BLACK);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Contenido = new javax.swing.JPanel();
        Minimizar = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        btn_Facturaccion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Contenido.setBackground(new java.awt.Color(0, 0, 0));
        panel_Contenido.setName(""); // NOI18N

        javax.swing.GroupLayout panel_ContenidoLayout = new javax.swing.GroupLayout(panel_Contenido);
        panel_Contenido.setLayout(panel_ContenidoLayout);
        panel_ContenidoLayout.setHorizontalGroup(
            panel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        panel_ContenidoLayout.setVerticalGroup(
            panel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        add(panel_Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 650));

        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosSCE/minus-symbol.png"))); // NOI18N
        add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        Salir.setBackground(new java.awt.Color(0, 0, 0));
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosSCE/cancel (2).png"))); // NOI18N
        Salir.setOpaque(true);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 40, 40));

        btn_Facturaccion.setBackground(new java.awt.Color(0, 0, 0));
        btn_Facturaccion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_Facturaccion.setForeground(new java.awt.Color(255, 255, 255));
        btn_Facturaccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Facturaccion.setText("FACTURACION");
        btn_Facturaccion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_Facturaccion.setName(""); // NOI18N
        btn_Facturaccion.setOpaque(true);
        btn_Facturaccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FacturaccionMouseClicked(evt);
            }
        });
        add(btn_Facturaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 160, 50));
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_FacturaccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturaccionMouseClicked
        setBoton(btn_Facturaccion);
        panel_Factura.setLocation(0, 0);
        panel_Factura.setSize(panel_Contenido.getSize());
        panel_Contenido.removeAll();
        panel_Contenido.add(panel_Factura, BorderLayout.CENTER);
        panel_Contenido.revalidate();
        panel_Contenido.repaint();
       
    }//GEN-LAST:event_btn_FacturaccionMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel btn_Facturaccion;
    public static javax.swing.JPanel panel_Contenido;
    // End of variables declaration//GEN-END:variables
}
