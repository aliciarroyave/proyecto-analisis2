package Ventanas;

import java.sql.SQLException;
import javax.swing.ListSelectionModel;

public class Proveedores extends javax.swing.JPanel {

  
//    private Conexion Conexion_DB = new Conexion();
    private DialogodeMensaje Dialogo = new DialogodeMensaje();
    private DialogodeConfrimacion DialogoConfirmacion = new DialogodeConfrimacion();
    public Proveedores() {
        initComponents();
        tabla_prov.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        try {
//            tabla_prov.setModel(Conexion_DB.obtenerProceedores());
//        } catch (SQLException|NoSePuedeConectar ex) {
//            Dialogo.setContenido("ERROR", ex.getMessage(), DialogodeMensaje.ICONO_ERROR);
//            Dialogo.setVisible(true);
//        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_prov = new javax.swing.JTable();
        txt_Nit = new javax.swing.JTextField();
        sep_Nit = new javax.swing.JSeparator();
        btn_Nuevo = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        sep_Nombre = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_Nit = new javax.swing.JLabel();
        sep_Deuda = new javax.swing.JSeparator();
        txt_Deuda = new javax.swing.JTextField();
        lbl_Deuda = new javax.swing.JLabel();
        sep_Abonos = new javax.swing.JSeparator();
        txt_abonos = new javax.swing.JTextField();
        lbl_Abonos = new javax.swing.JLabel();
        sep_Saldo = new javax.swing.JSeparator();
        txt_Saldo = new javax.swing.JTextField();
        lbl_Saldos = new javax.swing.JLabel();
        txt_Filtro = new javax.swing.JTextField();
        sep_Filtro = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rbtn_Credito = new javax.swing.JRadioButton();
        btn_Eliminar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_prov.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabla_prov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_prov.setGridColor(new java.awt.Color(0, 0, 0));
        tabla_prov.setRowHeight(24);
        tabla_prov.setSelectionBackground(new java.awt.Color(255, 0, 0));
        tabla_prov.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabla_prov.setShowVerticalLines(false);
        tabla_prov.getTableHeader().setReorderingAllowed(false);
        tabla_prov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_provMousePressed(evt);
            }
        });
        tabla_prov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_provKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_provKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_prov);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 940, 330));

        txt_Nit.setBackground(new java.awt.Color(0, 0, 0));
        txt_Nit.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Nit.setForeground(new java.awt.Color(255, 255, 255));
        txt_Nit.setText("INGRESE EL NIT DEL PROVEEDOR (SI APLICA)");
        txt_Nit.setBorder(null);
        txt_Nit.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Nit.setSelectionColor(new java.awt.Color(255, 0, 0));
        txt_Nit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NitFocusLost(evt);
            }
        });
        txt_Nit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_NitMousePressed(evt);
            }
        });
        txt_Nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NitActionPerformed(evt);
            }
        });
        add(txt_Nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 400, 26));

        sep_Nit.setForeground(new java.awt.Color(255, 255, 255));
        add(sep_Nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 371, -1));

        btn_Nuevo.setBackground(new java.awt.Color(255, 0, 0));
        btn_Nuevo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn_Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        btn_Nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Nuevo.setText("NUEVO");
        btn_Nuevo.setOpaque(true);
        btn_Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NuevoMouseClicked(evt);
            }
        });
        add(btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 300, 84));

        btn_Guardar.setBackground(new java.awt.Color(255, 0, 0));
        btn_Guardar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Guardar.setText("GUARDAR");
        btn_Guardar.setOpaque(true);
        btn_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_GuardarMouseClicked(evt);
            }
        });
        add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 300, 84));

        txt_Nombre.setBackground(new java.awt.Color(0, 0, 0));
        txt_Nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setText("INGRESE EL NOMBRE DEL PROVEEDOR");
        txt_Nombre.setBorder(null);
        txt_Nombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Nombre.setSelectionColor(new java.awt.Color(255, 0, 0));
        txt_Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreFocusLost(evt);
            }
        });
        txt_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_NombreMousePressed(evt);
            }
        });
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 400, 26));

        sep_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        add(sep_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 400, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 380, 10));

        lbl_Nombre.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nombre.setText("NOMBRE");
        add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_Nit.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_Nit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nit.setText("NIT");
        add(lbl_Nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        sep_Deuda.setForeground(new java.awt.Color(255, 255, 255));
        add(sep_Deuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 220, -1));

        txt_Deuda.setBackground(new java.awt.Color(0, 0, 0));
        txt_Deuda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Deuda.setForeground(new java.awt.Color(255, 255, 255));
        txt_Deuda.setText("0.00");
        txt_Deuda.setBorder(null);
        txt_Deuda.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Deuda.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txt_Deuda.setEnabled(false);
        txt_Deuda.setSelectionColor(new java.awt.Color(255, 0, 0));
        txt_Deuda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_DeudaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_DeudaFocusLost(evt);
            }
        });
        txt_Deuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_DeudaMousePressed(evt);
            }
        });
        txt_Deuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DeudaActionPerformed(evt);
            }
        });
        add(txt_Deuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 220, 26));

        lbl_Deuda.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_Deuda.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Deuda.setText("DEUDA");
        add(lbl_Deuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        sep_Abonos.setForeground(new java.awt.Color(255, 255, 255));
        add(sep_Abonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 220, -1));

        txt_abonos.setBackground(new java.awt.Color(0, 0, 0));
        txt_abonos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_abonos.setForeground(new java.awt.Color(255, 255, 255));
        txt_abonos.setText("0.00");
        txt_abonos.setBorder(null);
        txt_abonos.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_abonos.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txt_abonos.setEnabled(false);
        txt_abonos.setSelectionColor(new java.awt.Color(255, 0, 0));
        txt_abonos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_abonosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_abonosFocusLost(evt);
            }
        });
        txt_abonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_abonosMousePressed(evt);
            }
        });
        txt_abonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_abonosActionPerformed(evt);
            }
        });
        add(txt_abonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 220, 26));

        lbl_Abonos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_Abonos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Abonos.setText("ABONOS");
        add(lbl_Abonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        sep_Saldo.setForeground(new java.awt.Color(255, 255, 255));
        add(sep_Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 220, -1));

        txt_Saldo.setBackground(new java.awt.Color(0, 0, 0));
        txt_Saldo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Saldo.setForeground(new java.awt.Color(255, 255, 255));
        txt_Saldo.setText("0.00");
        txt_Saldo.setBorder(null);
        txt_Saldo.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Saldo.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txt_Saldo.setEnabled(false);
        txt_Saldo.setSelectionColor(new java.awt.Color(255, 0, 0));
        txt_Saldo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_SaldoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_SaldoFocusLost(evt);
            }
        });
        txt_Saldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_SaldoMousePressed(evt);
            }
        });
        txt_Saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SaldoActionPerformed(evt);
            }
        });
        add(txt_Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 220, 26));

        lbl_Saldos.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_Saldos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Saldos.setText("SALDO");
        add(lbl_Saldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

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
        add(txt_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 920, 20));

        sep_Filtro.setForeground(new java.awt.Color(255, 255, 255));
        add(sep_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 920, 10));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, -1, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CAMPOS OBLIGATORIOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, 20));

        rbtn_Credito.setBackground(new java.awt.Color(0, 0, 0));
        rbtn_Credito.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rbtn_Credito.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_Credito.setSelected(true);
        rbtn_Credito.setText("CREDITO");
        rbtn_Credito.setBorder(null);
        add(rbtn_Credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 400, -1));

        btn_Eliminar.setBackground(new java.awt.Color(255, 0, 0));
        btn_Eliminar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Eliminar.setText("ELIMINAR");
        btn_Eliminar.setOpaque(true);
        btn_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EliminarMouseClicked(evt);
            }
        });
        add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, 84));
    }// </editor-fold>//GEN-END:initComponents
    private void filaSeleccionada(){
        int selecion = tabla_prov.getSelectedRow();
        
        if (selecion != -1) {
            txt_Nombre.setText(tabla_prov.getValueAt(selecion, 0).toString());
            txt_Nit.setText(tabla_prov.getValueAt(selecion, 1).toString());
            rbtn_Credito.setSelected((tabla_prov.getValueAt(selecion, 2).toString().equals("SI")));
            txt_Saldo.setText(tabla_prov.getValueAt(selecion, 3).toString());
        }
            
    }
    private void txt_NitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NitFocusGained
        // TODO add your handling code here:
        if(txt_Nit.getText().equals("INGRESE EL NIT DEL PROVEEDOR (SI APLICA)"))txt_Nit.setText("");
    }//GEN-LAST:event_txt_NitFocusGained

    private void txt_NitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NitFocusLost
        // TODO add your handling code here:
        if(txt_Nit.getText().equals("")) txt_Nit.setText("INGRESE EL NIT DEL PROVEEDOR (SI APLICA)");
    }//GEN-LAST:event_txt_NitFocusLost

    private void txt_NitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_NitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NitMousePressed

    private void txt_NitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NitActionPerformed

    private void txt_SaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SaldoActionPerformed

    private void txt_SaldoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_SaldoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SaldoMousePressed

    private void txt_SaldoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_SaldoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SaldoFocusLost

    private void txt_SaldoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_SaldoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SaldoFocusGained

    private void txt_abonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_abonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_abonosActionPerformed

    private void txt_abonosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_abonosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_abonosMousePressed

    private void txt_abonosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_abonosFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_abonosFocusLost

    private void txt_abonosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_abonosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_abonosFocusGained

    private void txt_DeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DeudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DeudaActionPerformed

    private void txt_DeudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_DeudaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DeudaMousePressed

    private void txt_DeudaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_DeudaFocusLost
        // TODO add your handling code here:
        if(txt_Deuda.getText().equals("")) txt_Deuda.setText("INGRESE EL NOMBRE DE USUARIO");
    }//GEN-LAST:event_txt_DeudaFocusLost

    private void txt_DeudaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_DeudaFocusGained
        // TODO add your handling code here:
        if(txt_Deuda.getText().equals("INGRESE EL NOMBRE DE USUARIO"))txt_Deuda.setText("");
    }//GEN-LAST:event_txt_DeudaFocusGained

    private void btn_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GuardarMouseClicked
//       try {
//            if (!txt_Nombre.getText().equals("INGRESE EL NOMBRE DEL PROVEEDOR")){
//                Conexion_DB.crearProveedor(txt_Nombre.getText(), txt_Nit.getText(), rbtn_Credito.isSelected());
//                Dialogo.setContenido("INFORMACION", "EL PROVEEDOR FUE CREADO EXITOSAMENTE!", DialogodeMensaje.ICONO_INFORMACION);
//                Dialogo.setVisible(true);
//                tabla_prov.setModel(Conexion_DB.obtenerProceedores());
//            } else{
//                Dialogo.setContenido("ERROR", "INGRESE UN NOMBRE DE PROVEEDOR", DialogodeMensaje.ICONO_ERROR);
//                Dialogo.setVisible(true);
//            }
//        } catch (SQLException|NoSePuedeConectar ex) {
//            Dialogo.setContenido("ERROR", ex.getMessage(), DialogodeMensaje.ICONO_ERROR);
//            Dialogo.setVisible(true);
//        }
    }//GEN-LAST:event_btn_GuardarMouseClicked

    private void btn_NuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NuevoMouseClicked
        btn_Nuevo.setEnabled(false);
        btn_Guardar.setEnabled(true);
        txt_Nit.setText("INGRESE EL NIT DEL PROVEEDOR (SI APLICA)");
        txt_Nombre.setText("INGRESE EL NOMBRE DEL PROVEEDOR");
        txt_Deuda.setText("0.00");
        txt_Saldo.setText("0.00");
        txt_abonos.setText("0.00");
//        try {
//            tabla_prov.setModel(Conexion_DB.obtenerProceedores());
//        } catch (SQLException|NoSePuedeConectar ex) {
//             Dialogo.setContenido("ERROR", ex.getMessage(), DialogodeMensaje.ICONO_ERROR);
//                Dialogo.setVisible(true);
//        }
    }//GEN-LAST:event_btn_NuevoMouseClicked

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_NombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreMousePressed

    private void txt_NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusLost
        if (txt_Nombre.getText().equals("")) txt_Nombre.setText("INGRESE EL NOMBRE DEL PROVEEDOR");
    }//GEN-LAST:event_txt_NombreFocusLost

    private void txt_NombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusGained
        if (txt_Nombre.getText().equals("INGRESE EL NOMBRE DEL PROVEEDOR")) txt_Nombre.setText("");
    }//GEN-LAST:event_txt_NombreFocusGained

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

    private void btn_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EliminarMouseClicked
//        int selccion = tabla_prov.getSelectedRow();
//        if (selccion != -1) {
//            try {
//                DialogoConfirmacion.setContenido("CONFIRMACION", "¿ESTA SEGURO QUE DESEA ELIMINAR EL PROVEEDOR?", DialogodeMensaje.ICONO_INTERROGANTE, tabla_prov.getValueAt(selccion, 0).toString());
//                DialogoConfirmacion.setVisible(true);
//                
//                tabla_prov.setModel(Conexion_DB.obtenerProceedores());
//            } catch (SQLException|NoSePuedeConectar ex) {
//                Dialogo.setContenido("ERROR", ex.getMessage(), DialogodeMensaje.ICONO_ERROR);
//                Dialogo.setVisible(true);
//            }
//        }else {
//            Dialogo.setContenido("ERROR", "DEBE SELECCIONAR UN PROVEEDOR PARA PODER ELIMINARLO", DialogodeMensaje.ICONO_ERROR);
//                Dialogo.setVisible(true);
//        }
    }//GEN-LAST:event_btn_EliminarMouseClicked

    private void tabla_provKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_provKeyPressed
        
    }//GEN-LAST:event_tabla_provKeyPressed

    private void tabla_provMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_provMousePressed
        filaSeleccionada();
        btn_Nuevo.setEnabled(true);
    }//GEN-LAST:event_tabla_provMousePressed

    private void tabla_provKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_provKeyReleased
        if (evt.getKeyCode() == 38 || evt.getKeyCode()== 40)
        {
            filaSeleccionada();
        }
    }//GEN-LAST:event_tabla_provKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Eliminar;
    private javax.swing.JLabel btn_Guardar;
    private javax.swing.JLabel btn_Nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_Abonos;
    private javax.swing.JLabel lbl_Deuda;
    private javax.swing.JLabel lbl_Nit;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Saldos;
    private javax.swing.JRadioButton rbtn_Credito;
    private javax.swing.JSeparator sep_Abonos;
    private javax.swing.JSeparator sep_Deuda;
    private javax.swing.JSeparator sep_Filtro;
    private javax.swing.JSeparator sep_Nit;
    private javax.swing.JSeparator sep_Nombre;
    private javax.swing.JSeparator sep_Saldo;
    private javax.swing.JTable tabla_prov;
    private javax.swing.JTextField txt_Deuda;
    private javax.swing.JTextField txt_Filtro;
    private javax.swing.JTextField txt_Nit;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Saldo;
    private javax.swing.JTextField txt_abonos;
    // End of variables declaration//GEN-END:variables
}
