/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interaz;


import Excepciones.ArchivoNoExiste;
import Excepciones.FormatoInvalido;
import Excepciones.NoSePuedeConectar;
import Excepciones.NoSePuedeEscribirArchivo;
import conexion.conexionDB;
import java.awt.event.KeyEvent;
import javax.persistence.EntityManagerFactory;
import clases.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import static interaz.Seguridad.claveCifrado;


/**
 *
 * 
 */
public class Login extends javax.swing.JFrame {
    
    private Server server;
    private Conexion conexion;
    private UsuarioG user;
    /**
     * Creates new form Interfaz
     */
    
    public Login() {
        initComponents();
        emf = conexionDB.obtenerConexion();
        this.setLocationRelativeTo(null);
        try {
            File configDServer = Server.SERVER_CONFIG_DEFAULT_FILE;
            //Comprobamos si la configuración de conexion al servidor ya existe
            if(configDServer.exists()&&configDServer.length()>0){
                //Leemos la configuración del archivo
                server = new Server(Server.SERVER_CONFIG_DEFAULT_FILE);
                // Generamos una clave que queramos que tenga al menos 16 bytes adecuada para AES
                Key key = new SecretKeySpec(Seguridad.claveCifrado.getBytes(),  0, 16, "AES");
                // Se obtiene un cifrador AES
                Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
                // Se inicializa el cifrador, se pone en modo de descifrado y se le envia la clave
                aes.init(Cipher.DECRYPT_MODE,key);
                // Se desencripta y se guarda en la variable de servidor
                server.setPass(new String(aes.doFinal(server.getPassArray())));
                conexion= new Conexion(server.getUser(), server.getIp(), server.getPass(), server.getBd());
                //Comprobamos si hay una sesión guardada
                File configDUser=UsuarioG.LOGGED_USER_DEFAULT_FILE;
                if(configDUser.exists()&&configDUser.length()>0){
                    user= new UsuarioG(configDUser);
                    // Generamos una clave que queramos que tenga al menos 16 bytes adecuada para AES
                    key = new SecretKeySpec(Seguridad.claveCifrado.getBytes(),  0, 16, "AES");
                    // Se obtiene un cifrador AES
                    aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
                    // Se inicializa el cifrador, se pone en modo de descifrado y se le envia la clave
                    aes.init(Cipher.DECRYPT_MODE,key);
                    // Se desencripta y se guarda en la variable de servidor
                    user.setPass(new String(aes.doFinal(user.getPassBytes())));
                    //Se hace login desde el archivo
                    logueo(user.getUser(),user.getPass(),true);
                }
                else{
                    //Si no hay sesión guardada, se muestra la ventana de login
                    this.setVisible(true);
                }
            }
            else{
                DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR,"No hay configuración","Error: no hay configuración de acceso a la base de datos");
                dialogo.setVisible(true);
                //System.exit(0);
                this.setVisible(true);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException | FileNotFoundException | FormatoInvalido | ArchivoNoExiste ex) {
            DialogoOpcion dialogo = new DialogoOpcion(null, true, DialogoOpcion.ICONO_ERROR,"Error fatal",ex.toString());
            dialogo.setVisible(true);
        }
    }
    
    EntityManagerFactory emf;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        conexionProblema1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(96, 96, 96));
        jLabel4.setText("BIENVENIDO");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 96, 96));
        jLabel1.setText("Empresarial");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 96, 96));
        jLabel3.setText("Sistema de Control");

        jSeparator1.setBackground(new java.awt.Color(96, 96, 96));
        jSeparator1.setForeground(new java.awt.Color(96, 96, 96));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(96, 96, 96));
        jLabel6.setText("LOGO");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 96, 96));
        jLabel2.setText("REPUESTOS PESADOS MQ, S.A.");

        jSeparator3.setBackground(new java.awt.Color(96, 96, 96));
        jSeparator3.setForeground(new java.awt.Color(96, 96, 96));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 690));

        jPanel3.setBackground(new java.awt.Color(96, 96, 96));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(245, 245, 245));
        jSeparator2.setForeground(new java.awt.Color(245, 245, 245));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 228, 166, -1));

        jLabel5.setBackground(new java.awt.Color(245, 245, 245));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("LOG IN");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 162, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setText("USUARIO");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 245, 245));
        jLabel8.setText("CONTRASEÑA");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(245, 245, 245));
        jSeparator4.setForeground(new java.awt.Color(245, 245, 245));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 371, -1));

        jSeparator5.setBackground(new java.awt.Color(245, 245, 245));
        jSeparator5.setForeground(new java.awt.Color(245, 245, 245));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 371, 6));

        jTextField2.setBackground(new java.awt.Color(96, 96, 96));
        jTextField2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(245, 245, 245));
        jTextField2.setText("INGRESE EL NOMBRE DE USUARIO");
        jTextField2.setBorder(null);
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField2.setSelectedTextColor(new java.awt.Color(64, 64, 64));
        jTextField2.setSelectionColor(new java.awt.Color(192, 192, 192));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2MousePressed(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 371, 26));

        jPasswordField1.setBackground(new java.awt.Color(96, 96, 96));
        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(245, 245, 245));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPasswordField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPasswordField1.setSelectedTextColor(new java.awt.Color(64, 64, 64));
        jPasswordField1.setSelectionColor(new java.awt.Color(192, 192, 192));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 371, 30));

        jLabel9.setBackground(new java.awt.Color(255, 51, 51));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("       LOG IN");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel9KeyReleased(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 513, 192, 84));

        jCheckBox1.setBackground(new java.awt.Color(96, 96, 96));
        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(245, 245, 245));
        jCheckBox1.setText("GUARDAR CONTRASEÑA");
        jCheckBox1.setBorder(null);
        jCheckBox1.setNextFocusableComponent(jLabel9);
        jCheckBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyReleased(evt);
            }
        });
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel10.setBackground(new java.awt.Color(96, 96, 96));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosSCE/cancel (2).png"))); // NOI18N
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 11, -1, -1));

        conexionProblema1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        conexionProblema1.setForeground(new java.awt.Color(245, 245, 245));
        conexionProblema1.setText("¿No se puede conectar?");
        conexionProblema1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conexionProblema1MouseClicked(evt);
            }
        });
        jPanel3.add(conexionProblema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 450, 690));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2MousePressed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        if(jTextField2.getText().equals("INGRESE EL NOMBRE DE USUARIO"))jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        if(jTextField2.getText().equals("")) jTextField2.setText("INGRESE EL NOMBRE DE USUARIO");
    }//GEN-LAST:event_jTextField2FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if(!jTextField2.getText().trim().equals("")&&!new String(jPasswordField1.getPassword()).trim().equals(""))
            logueo(jTextField2.getText().trim(),new String(jPasswordField1.getPassword()).trim(),jCheckBox1.isSelected());
        else{
            DialogoOpcion dialogo = new DialogoOpcion(this, true, DialogoOpcion.ICONO_ERROR, "Debe llenar los campos", "Por favor ingrese todos los campos");  
            dialogo.setVisible(true);
            jTextField2.setText("");
            jPasswordField1.setText("");
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jLabel9MouseClicked
    /**
     * Función que hace login o no, dependiendo de los datos enviados
     * @param usuario nombre del usuario
     * @param password contraseña del usuario
     * @param guardar si va a guardarse la sesión o no
     */
    private void logueo(String usuario, String password, boolean guardar){
        if(!server.getUser().equals("")){
            try {
                if(conexion.login(usuario,password)==1){
                    if(guardar){
                        // Generamos una clave que queramos que tenga al menos 16 bytes adecuada para AES
                        Key key = new SecretKeySpec(claveCifrado.getBytes(),  0, 16, "AES");
                        // Se obtiene un cifrador AES
                        Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
                        // Se inicializa el cifrador, se pone en modo de cifrado y se le envia la clave
                        aes.init(Cipher.ENCRYPT_MODE,key);
                        // Se encripta
                        byte[] encriptado=aes.doFinal(password.getBytes());
                        user=new UsuarioG(usuario, encriptado);
                        user.escribirArchivo(UsuarioG.LOGGED_USER_DEFAULT_FILE);
                    }
                    Usuario datosUsuario= new Usuario(usuario,conexion.obtenerPermisosDeUsuario(usuario));
                    conexion.setUsuario(datosUsuario);
                    Principal m = new Principal(conexion);
                    m.setVisible(true);
                    this.setVisible(false);
                }
                else{
                    DialogoOpcion dialogo = new DialogoOpcion(this, true, DialogoOpcion.ICONO_ERROR, "Error", "Usuario o contraseña incorrecta");  
                    dialogo.setVisible(true);
                    if(UsuarioG.LOGGED_USER_DEFAULT_FILE.length()>0){
                        UsuarioG.limpiarArchivo(UsuarioG.LOGGED_USER_DEFAULT_FILE);
                        System.exit(0);
                    }
                }
                jTextField2.setText("");
                jPasswordField1.setText("");
                jTextField2.requestFocus();
                
            } catch (SQLException|NoSuchAlgorithmException|NoSuchPaddingException|InvalidKeyException|IllegalBlockSizeException|BadPaddingException|NoSePuedeEscribirArchivo ex) {
                DialogoOpcion dialogo = new DialogoOpcion(this, true, DialogoOpcion.ICONO_ERROR, "Log In", "Error:\n"+ex.toString());  
                dialogo.setVisible(true);
            }catch(NoSePuedeConectar ex){
                DialogoOpcion dialogo = new DialogoOpcion(this, true, DialogoOpcion.ICONO_ERROR, "No se puede conectar", "NO es posible conectarse a la base de datos, revise su configuración de conexión. Se mostrará otro mensaje con detalles");  
                dialogo.setVisible(true);
                dialogo = new DialogoOpcion(this, true, DialogoOpcion.ICONO_ERROR, "Detalles del error", ex.toString());  
                dialogo.setVisible(true);
                    
            }
        }
    }
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        int code = evt.getKeyCode();
        if(code==KeyEvent.VK_ENTER){
            if(!jTextField2.getText().trim().equals("")&&!new String(jPasswordField1.getPassword()).trim().equals(""))
                logueo(jTextField2.getText(),new String(jPasswordField1.getPassword()),jCheckBox1.isSelected());
            else{
                DialogoOpcion dialogo = new DialogoOpcion(this, true, DialogoOpcion.ICONO_ERROR, "Debe llenar los campos", "Por favor ingrese todos los campos");  
                dialogo.setVisible(true);
                jTextField2.setText("");
                jPasswordField1.setText("");
                jTextField2.requestFocus();
            }
        }
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jCheckBox1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyReleased
        int code = evt.getKeyCode();
        if(code==KeyEvent.VK_ENTER){
            if(!jTextField2.getText().trim().equals("")&&!new String(jPasswordField1.getPassword()).trim().equals(""))
                logueo(jTextField2.getText(),new String(jPasswordField1.getPassword()),jCheckBox1.isSelected());
            else{
                DialogoOpcion dialogo = new DialogoOpcion(this, true, DialogoOpcion.ICONO_ERROR, "Debe llenar los campos", "Por favor ingrese todos los campos");  
                dialogo.setVisible(true);
                jTextField2.setText("");
                jPasswordField1.setText("");
                jTextField2.requestFocus();
            }
        }
    }//GEN-LAST:event_jCheckBox1KeyReleased

    private void jLabel9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyReleased
        int code = evt.getKeyCode();
        if(code==KeyEvent.VK_ENTER){
            if(!jTextField2.getText().trim().equals("")&&!new String(jPasswordField1.getPassword()).trim().equals(""))
                logueo(jTextField2.getText(),new String(jPasswordField1.getPassword()),jCheckBox1.isSelected());
            else{
                DialogoOpcion dialogo = new DialogoOpcion(this, true, DialogoOpcion.ICONO_ERROR, "Debe llenar los campos", "Por favor ingrese todos los campos");  
                dialogo.setVisible(true);
                jTextField2.setText("");
                jPasswordField1.setText("");
                jTextField2.requestFocus();
            }
        }
    }//GEN-LAST:event_jLabel9KeyReleased

    private void conexionProblema1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conexionProblema1MouseClicked
        DialConexion dialogo = new DialConexion(null, true);
        
        dialogo.setVisible(true);
    }//GEN-LAST:event_conexionProblema1MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login()/*.setVisible(true)*/;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conexionProblema1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
