/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;


import java.awt.event.KeyEvent;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juampa
 */
public class Clientes extends javax.swing.JPanel {
//    Conexion conexion;
    /**
     * Creates new form Clientes
     */
//    public Clientes() {
//        initComponents();
//    }
    /**
     * Crea un nuevo panel de clientes
//     * @param conexion objeto para conectarse a la BD
     */
    public Clientes(/*Conexion conexion*/){
        initComponents();
//        this.conexion=conexion;
        //Inicia los paneles invisibles, para que se seleccione una opcion
        listadoPanel.setVisible(false);
        generalPanel.setVisible(false);
        telefonosButton.setVisible(false);//CAMBIAR AL FINALIZAR
        //Limpia el formulario
        limpiar();
//        switch(conexion.getUsuario().getIdPermisos()){
//            case 3:
//                modificarButton.setEnabled(false);
//                eliminarButton.setEnabled(false);
//                break;
//            case 4:
//                modificarButton.setEnabled(false);
//                eliminarButton.setEnabled(false);
//                break;
//            case 5:
//                modificarButton.setEnabled(false);
//                eliminarButton.setEnabled(false);
//                break;
//            case 6:
//                modificarButton.setEnabled(false);
//                eliminarButton.setEnabled(false);
//                break;
//        }
    }
    /**
     * Limpia el formulario
     */
    private void limpiar(){
        //Pone los botones de opcion como negros
        ingresarButton.setBackground(Color.BLACK);
        modificarButton.setBackground(Color.BLACK);
        eliminarButton.setBackground(Color.BLACK);
        verButton.setBackground(Color.BLACK);
        //Limpia los JFields
        nombreField.setText("");
        apellidoField.setText("");
        nitField.setText("");
        //Inicializa con 0 los campos de numero
        direccionField.setText("");
        descuentoField.setText("0");
        limCreditoField.setText("0");
        saldoField.setText("0.00");
        //Pone la opción de cheque como falso
        chequeCheck.setSelected(false);
        //Setea un modelo vacio a la tabla
        listadoTable.setModel(new DefaultTableModel());
        listadoPanel.setEnabled(true);
        
    }
    /**
     * Carga los datos de la fila seleccionada en los campos, si se esta en modo modificación
     */
    private void filaSeleccionada(){
        if(modificarButton.getBackground()==Color.RED){
            int seleccion=listadoTable.getSelectedRow();
            if(seleccion!=-1){
                nitField.setText((String)listadoTable.getValueAt(seleccion, 1));
                nombreField.setText((String)listadoTable.getValueAt(seleccion, 2));
                apellidoField.setText((String)listadoTable.getValueAt(seleccion, 3));
                descuentoField.setText((String)listadoTable.getValueAt(seleccion, 4));
                direccionField.setText((String)listadoTable.getValueAt(seleccion, 5));
                limCreditoField.setText((String)listadoTable.getValueAt(seleccion, 6));
                saldoField.setText((String)listadoTable.getValueAt(seleccion, 7));
                chequeCheck.setSelected(((String)listadoTable.getValueAt(seleccion, 8)).equals("SI"));
                
            }
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

        ingresarButton = new javax.swing.JLabel();
        modificarButton = new javax.swing.JLabel();
        eliminarButton = new javax.swing.JLabel();
        verButton = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        panel_Contenido = new javax.swing.JPanel();
        panel_Anterior = new javax.swing.JPanel();
        generalPanel = new javax.swing.JPanel();
        lbl_codigo = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        lbl_codigo1 = new javax.swing.JLabel();
        apellidoField = new javax.swing.JTextField();
        lbl_codigo2 = new javax.swing.JLabel();
        direccionField = new javax.swing.JTextField();
        lbl_codigo3 = new javax.swing.JLabel();
        nitField = new javax.swing.JTextField();
        lbl_codigo4 = new javax.swing.JLabel();
        lbl_codigo5 = new javax.swing.JLabel();
        chequeCheck = new javax.swing.JCheckBox();
        generalButton = new javax.swing.JLabel();
        descuentoField = new javax.swing.JFormattedTextField();
        limCreditoField = new javax.swing.JFormattedTextField();
        lbl_codigo7 = new javax.swing.JLabel();
        saldoField = new javax.swing.JFormattedTextField();
        telefonosButton = new javax.swing.JLabel();
        listadoPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoTable = new javax.swing.JTable();
        lbl_codigo6 = new javax.swing.JLabel();
        btn_Pagos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresarButton.setBackground(new java.awt.Color(0, 0, 0));
        ingresarButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ingresarButton.setForeground(new java.awt.Color(255, 255, 255));
        ingresarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresarButton.setText("INGRESO");
        ingresarButton.setName(""); // NOI18N
        ingresarButton.setOpaque(true);
        ingresarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarButtonMouseClicked(evt);
            }
        });
        add(ingresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        modificarButton.setBackground(new java.awt.Color(0, 0, 0));
        modificarButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        modificarButton.setForeground(new java.awt.Color(255, 255, 255));
        modificarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarButton.setText("MODIFICACION");
        modificarButton.setName(""); // NOI18N
        modificarButton.setOpaque(true);
        modificarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarButtonMouseClicked(evt);
            }
        });
        add(modificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 160, 40));

        eliminarButton.setBackground(new java.awt.Color(0, 0, 0));
        eliminarButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarButton.setText("ELIMINACIÓN");
        eliminarButton.setName(""); // NOI18N
        eliminarButton.setOpaque(true);
        eliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarButtonMouseClicked(evt);
            }
        });
        add(eliminarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 160, 40));

        verButton.setBackground(new java.awt.Color(0, 0, 0));
        verButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        verButton.setForeground(new java.awt.Color(255, 255, 255));
        verButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verButton.setText("VER CLIENTES");
        verButton.setName(""); // NOI18N
        verButton.setOpaque(true);
        verButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verButtonMouseClicked(evt);
            }
        });
        add(verButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 160, 40));

        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosSCE/minus-symbol.png"))); // NOI18N
        Minimizar.setPreferredSize(new java.awt.Dimension(40, 40));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

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
        add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));

        panel_Contenido.setBackground(new java.awt.Color(0, 0, 0));
        panel_Contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(panel_Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 610));

        panel_Anterior.setBackground(new java.awt.Color(0, 0, 0));
        panel_Anterior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generalPanel.setOpaque(false);
        generalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_codigo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo.setText("Nombre:");
        generalPanel.add(lbl_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, -1, -1));

        nombreField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nombreField.setBorder(null);
        nombreField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        nombreField.setNextFocusableComponent(apellidoField);
        nombreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFieldFocusGained(evt);
            }
        });
        generalPanel.add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 12, 260, 26));

        lbl_codigo1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_codigo1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo1.setText("Apellido:");
        generalPanel.add(lbl_codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, -1, -1));

        apellidoField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        apellidoField.setBorder(null);
        apellidoField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        apellidoField.setNextFocusableComponent(nitField);
        apellidoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidoFieldFocusGained(evt);
            }
        });
        generalPanel.add(apellidoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 45, 260, 26));

        lbl_codigo2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_codigo2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo2.setText("Dirección:");
        generalPanel.add(lbl_codigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        direccionField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        direccionField.setBorder(null);
        direccionField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        direccionField.setNextFocusableComponent(descuentoField);
        direccionField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                direccionFieldFocusGained(evt);
            }
        });
        generalPanel.add(direccionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 111, 260, 26));

        lbl_codigo3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_codigo3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo3.setText("Límite de crédito:");
        generalPanel.add(lbl_codigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, 30));

        nitField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nitField.setBorder(null);
        nitField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        nitField.setNextFocusableComponent(direccionField);
        nitField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nitFieldFocusGained(evt);
            }
        });
        generalPanel.add(nitField, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 78, 260, 26));

        lbl_codigo4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_codigo4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo4.setText("NIT:");
        generalPanel.add(lbl_codigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, -1, -1));

        lbl_codigo5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_codigo5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo5.setText("% de descuento:");
        generalPanel.add(lbl_codigo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 13, -1, 30));

        chequeCheck.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        chequeCheck.setForeground(new java.awt.Color(255, 255, 255));
        chequeCheck.setText("¿Se le acepta cheque?");
        chequeCheck.setNextFocusableComponent(generalButton);
        chequeCheck.setOpaque(false);
        generalPanel.add(chequeCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        generalButton.setBackground(new java.awt.Color(255, 0, 0));
        generalButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        generalButton.setForeground(new java.awt.Color(255, 255, 255));
        generalButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generalButton.setText("GUARDAR");
        generalButton.setName(""); // NOI18N
        generalButton.setOpaque(true);
        generalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generalButtonMouseClicked(evt);
            }
        });
        generalPanel.add(generalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 160, 40));

        descuentoField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        descuentoField.setText("0");
        descuentoField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        descuentoField.setNextFocusableComponent(limCreditoField);
        descuentoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descuentoFieldFocusGained(evt);
            }
        });
        generalPanel.add(descuentoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 260, 30));

        limCreditoField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        limCreditoField.setText("0");
        limCreditoField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        limCreditoField.setNextFocusableComponent(saldoField);
        limCreditoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                limCreditoFieldFocusGained(evt);
            }
        });
        generalPanel.add(limCreditoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 260, 26));

        lbl_codigo7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_codigo7.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo7.setText("Saldo actual:");
        generalPanel.add(lbl_codigo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        saldoField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        saldoField.setText("0.00");
        saldoField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        saldoField.setNextFocusableComponent(chequeCheck);
        saldoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                saldoFieldFocusGained(evt);
            }
        });
        generalPanel.add(saldoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 86, 260, 30));

        telefonosButton.setBackground(new java.awt.Color(255, 0, 0));
        telefonosButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        telefonosButton.setForeground(new java.awt.Color(255, 255, 255));
        telefonosButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefonosButton.setText("TELEFONOS");
        telefonosButton.setName(""); // NOI18N
        telefonosButton.setOpaque(true);
        telefonosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefonosButtonMouseClicked(evt);
            }
        });
        generalPanel.add(telefonosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 160, 40));

        panel_Anterior.add(generalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 900, 210));

        listadoPanel.setOpaque(false);
        listadoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listadoTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        listadoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listadoTable.setGridColor(new java.awt.Color(0, 0, 0));
        listadoTable.setRowHeight(24);
        listadoTable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        listadoTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        listadoTable.setShowVerticalLines(false);
        listadoTable.getTableHeader().setReorderingAllowed(false);
        listadoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listadoTableMousePressed(evt);
            }
        });
        listadoTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listadoTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listadoTable);

        listadoPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 340));

        lbl_codigo6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbl_codigo6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo6.setText("Listado de clientes:");
        listadoPanel.add(lbl_codigo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        panel_Anterior.add(listadoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 940, 380));

        add(panel_Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 610));

        btn_Pagos.setBackground(new java.awt.Color(0, 0, 0));
        btn_Pagos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_Pagos.setForeground(new java.awt.Color(255, 255, 255));
        btn_Pagos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Pagos.setText("PAGOS");
        btn_Pagos.setName(""); // NOI18N
        btn_Pagos.setOpaque(true);
        btn_Pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PagosMouseClicked(evt);
            }
        });
        add(btn_Pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarButtonMouseClicked
        //Limpia el formulario
        limpiar();
        //Setea el boton de ingresar como rojo
        ingresarButton.setBackground(Color.RED);
        //Muestra los paneles
        listadoPanel.setEnabled(false);
        listadoPanel.setVisible(true);
        generalPanel.setVisible(true);
        //Cambia el texto del botón
        generalButton.setText("Ingresar");
        generalButton.setEnabled(true);
        //Pone el foco en el texto de nombre
        nombreField.requestFocus();
        
    }//GEN-LAST:event_ingresarButtonMouseClicked

    private void modificarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarButtonMouseClicked
//        if(modificarButton.isEnabled()){
//            try {
//                //limpia el formulario
//                limpiar();
//                //Setea el color del boton a rojo
//                modificarButton.setBackground(Color.RED);
//                //Muestra los paneles
//                listadoPanel.setVisible(true);
//                generalPanel.setVisible(true);
//                //Obtiene la lista de clientes y la setea en la tabla
////                listadoTable.setModel(conexion.obtenerClientesJP());
//                //Setea el texto del boton
//                generalButton.setText("Actualizar Datos");
//                generalButton.setEnabled(true);
//                //Pone el foco en la tabla
//                listadoTable.requestFocus();
//            } catch (SQLException|NoSePuedeConectar ex) {
//                DialogoOpcion dialogo= new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "Modificación", "Error:\n"+ex.toString());
//                dialogo.setVisible(true);
//            }
//        }
    }//GEN-LAST:event_modificarButtonMouseClicked

    private void eliminarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarButtonMouseClicked
//        if(eliminarButton.isEnabled()){
//            try {
//                //Limpia el formulario
//                limpiar();
//                //Pone el color del boton en rojo y muestra los paneles
//                eliminarButton.setBackground(Color.RED);
//                listadoPanel.setVisible(true);
//                generalPanel.setVisible(true);
//                //Cambia el texto del botón
//                generalButton.setText("Eliminar Selección");
//                generalButton.setEnabled(true);
//                //Obtiene la lista de clientes y la pone en la tabla, pone el foco en la misma
//                listadoTable.setModel(conexion.obtenerClientesJP());
//                listadoTable.requestFocus();
//            } catch (SQLException|NoSePuedeConectar ex) {
//                DialogoOpcion dialogo= new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "Eliminación", "Error:\n"+ex.toString());
//                dialogo.setVisible(true);
//            }
//        }
    }//GEN-LAST:event_eliminarButtonMouseClicked

    private void verButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verButtonMouseClicked
//        try {
            //Limpia el formulario
            limpiar();
            //Cambia el color del boton a rojo
            verButton.setBackground(Color.RED);
            //Obtiene la lista de clientes y la pone en la tabla
//            listadoTable.setModel(conexion.obtenerClientesJP());
            //Muestra los paneles
            listadoPanel.setVisible(true);
            generalPanel.setVisible(true);
            //Inhabilita el botón
            generalButton.setEnabled(false);
//        } catch (SQLException|NoSePuedeConectar ex) {
//            DialogoOpcion dialogo= new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "Visualización", "Error:\n"+ex.toString());
//            dialogo.setVisible(true);
//        }
    }//GEN-LAST:event_verButtonMouseClicked

    private void listadoTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoTableMousePressed
        filaSeleccionada();
    }//GEN-LAST:event_listadoTableMousePressed

    private void listadoTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listadoTableKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode()== KeyEvent.VK_DOWN)
        {
            filaSeleccionada();
        }
    }//GEN-LAST:event_listadoTableKeyReleased

    private void generalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generalButtonMouseClicked
//        try {
//            //Si esta en modo ingreso, modificación o eliminación, hace cosas distintas
//            //Se comprueba en que modo está
//            if(ingresarButton.getBackground()==Color.RED){
//                if(!nombreField.getText().trim().equals("")&&!nombreField.getText().trim().equals("N/A")){
//                    //Valida los datos de los textos de numero
//                    descuentoField.commitEdit();
//                    limCreditoField.commitEdit();
//                    saldoField.commitEdit();
//                    //Hace un ingreso a la BD
//                    int resultado=conexion.crearCliente(nombreField.getText().trim(), apellidoField.getText().trim(), (long)descuentoField.getValue(),direccionField.getText().trim(), (long)limCreditoField.getValue(),Float.parseFloat(saldoField.getText()),nitField.getText().trim(), chequeCheck.isSelected());
//                    //Si el resultado es 1, significa que si se ingreso, si es 0 que no (ya existe)
//                    if(resultado==1){
//                        DialogoOpcion dialogo= new DialogoOpcion(null, true, DialogoOpcion.ICONO_INFORMACION, "Ingreso", "Se ha ingresado correctamente");
//                        dialogo.setVisible(true);
//                    }
//                    else if(resultado==0){
//                        DialogoOpcion dialogo= new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "Ingreso", "Este usuario ya existe");
//                        dialogo.setVisible(true);
//                    }
//                    //Limpia el formulario
//                    limpiar();
//                }else{
//                    DialogoOpcion dialogo= new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "Ingreso", "Debe ingresar al menos el nombre del cliente");
//                    dialogo.setVisible(true);
//                    nombreField.requestFocus();
//                }
//            }else if(modificarButton.getBackground()==Color.RED){
//                if(!nombreField.getText().trim().equals("")&&!nombreField.getText().trim().equals("N/A")){
//                //Valida los datos de los campos de numero
//                descuentoField.commitEdit();
//                limCreditoField.commitEdit();
//                saldoField.commitEdit();
//                //Hace la consulta de modificación y devuelve el número de filas cambiadas (Debe de ser 1)
//                int filasMod=conexion.modificarCliente(Integer.parseInt(listadoTable.getValueAt(listadoTable.getSelectedRow(),0).toString()),nombreField.getText().trim(), apellidoField.getText().trim(), (long)descuentoField.getValue(),direccionField.getText().trim(), (long)limCreditoField.getValue(),Float.parseFloat(saldoField.getText()),nitField.getText().trim(), chequeCheck.isSelected());
//                DialogoOpcion dialogo= new DialogoOpcion(null, true, DialogoOpcion.ICONO_INFORMACION, "Modificación", "Se ha actualizado correctamente\nRegistros actualizados: "+filasMod);
//                dialogo.setVisible(true);
//                //Limpia el formulario
//                limpiar();
//                }else{
//                    DialogoOpcion dialogo= new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "Modificacion", "Debe ingresar al menos el nombre del cliente");
//                    dialogo.setVisible(true);
//                    nombreField.requestFocus();
//                }
//            }else if(eliminarButton.getBackground()==Color.RED)
//            {
//                //Muestra un dialogo para confirmar si se quiere borrar el cliente
//                DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_INTERROGANTE,"Eliminación", "¿Esta seguro de eliminar al cliente seleccionado?");
//                dialogo.setVisible(true);
//                //Si se acepta, entonces lo borra
//                if(dialogo.isAceptar()){
//                    //Manda la orden de eliminación a la BD, devuelve el número de filas cambiadas
//                    int filasMod=conexion.eliminarCliente(Integer.parseInt(listadoTable.getValueAt(listadoTable.getSelectedRow(),0).toString()));
//                    dialogo= new DialogoOpcion(null, true, DialogoOpcion.ICONO_INFORMACION, "Eliminación", "Se ha eliminado al cliente\nRegistros actualizados: "+filasMod);
//                    dialogo.setVisible(true);
//                    //Limpia el formulario
//                    limpiar();
//                }
//            }
//        } catch (SQLException|ParseException|NoSePuedeConectar ex) {
//            DialogoOpcion dialogo= new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR, "Ingreso", "Error:\n"+ex.toString());
//            dialogo.setVisible(true);
//            limpiar();
//        }
        
    }//GEN-LAST:event_generalButtonMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        //Obtenemos los contenedores padres, hasta obtener el JFrame donde se está trabajando
        JFrame padre= (JFrame)this.getParent().getParent().getParent().getParent().getParent();
        //Se le manda la orden de minimizar
        padre.setExtendedState(1);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void descuentoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descuentoFieldFocusGained
        descuentoField.selectAll();
    }//GEN-LAST:event_descuentoFieldFocusGained

    private void limCreditoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_limCreditoFieldFocusGained
        limCreditoField.selectAll();
    }//GEN-LAST:event_limCreditoFieldFocusGained

    private void saldoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_saldoFieldFocusGained
        saldoField.selectAll();
    }//GEN-LAST:event_saldoFieldFocusGained

    private void nombreFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFieldFocusGained
        nombreField.selectAll();
    }//GEN-LAST:event_nombreFieldFocusGained

    private void apellidoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoFieldFocusGained
        apellidoField.selectAll();
    }//GEN-LAST:event_apellidoFieldFocusGained

    private void nitFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nitFieldFocusGained
        nitField.selectAll();
    }//GEN-LAST:event_nitFieldFocusGained

    private void direccionFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionFieldFocusGained
        direccionField.selectAll();
    }//GEN-LAST:event_direccionFieldFocusGained

    private void telefonosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonosButtonMouseClicked
        
    }//GEN-LAST:event_telefonosButtonMouseClicked

    private void btn_PagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PagosMouseClicked
        //Limpia el formulario
        limpiar();
        //Setea el boton de ingresar como rojo
        btn_Pagos.setBackground(Color.RED);
        
        
    }//GEN-LAST:event_btn_PagosMouseClicked
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Salir;
    private javax.swing.JTextField apellidoField;
    private javax.swing.JLabel btn_Pagos;
    private javax.swing.JCheckBox chequeCheck;
    private javax.swing.JFormattedTextField descuentoField;
    private javax.swing.JTextField direccionField;
    private javax.swing.JLabel eliminarButton;
    private javax.swing.JLabel generalButton;
    private javax.swing.JPanel generalPanel;
    private javax.swing.JLabel ingresarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_codigo1;
    private javax.swing.JLabel lbl_codigo2;
    private javax.swing.JLabel lbl_codigo3;
    private javax.swing.JLabel lbl_codigo4;
    private javax.swing.JLabel lbl_codigo5;
    private javax.swing.JLabel lbl_codigo6;
    private javax.swing.JLabel lbl_codigo7;
    private javax.swing.JFormattedTextField limCreditoField;
    private javax.swing.JPanel listadoPanel;
    private javax.swing.JTable listadoTable;
    private javax.swing.JLabel modificarButton;
    private javax.swing.JTextField nitField;
    private javax.swing.JTextField nombreField;
    public static javax.swing.JPanel panel_Anterior;
    private javax.swing.JPanel panel_Contenido;
    private javax.swing.JFormattedTextField saldoField;
    private javax.swing.JLabel telefonosButton;
    private javax.swing.JLabel verButton;
    // End of variables declaration//GEN-END:variables
}
