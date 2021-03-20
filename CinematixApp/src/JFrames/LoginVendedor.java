package JFrames;

import Datos.Conexion;
import Tipografia.Fuente;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author TALLER VARELA
 */
public class LoginVendedor extends javax.swing.JFrame {

    /**
     * Creates new form LoginVendedor
     */
    Fuente tipoFuente;
    public LoginVendedor() {
        initComponents();
        transparenciaButton();
        setBackground( new Color (0,0,0,0));
        TextPrompt prueba = new TextPrompt("INGRESAR CORREO", txtCorreo);
        TextPrompt pru = new TextPrompt("INGRESAR CLAVE", txtClave);
        setBackground( new Color (0,0,0,0));  
        
        tipoFuente = new Fuente();
        txtClave.setFont(tipoFuente.fuente(tipoFuente.LUSI, 1, 15));
        txtCorreo.setFont(tipoFuente.fuente(tipoFuente.LUSI, 1, 15));
        prueba.setFont(tipoFuente.fuente(tipoFuente.LUSI, 1, 15));
        pru.setFont(tipoFuente.fuente(tipoFuente.LUSI, 1, 15));
    }

    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/cinematixLogo.png"));
        return retValue;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btninicioa = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(getIconImage());
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btninicioa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BtnIniciarSesión.png"))); // NOI18N
        btninicioa.setBorderPainted(false);
        btninicioa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninicioa.setOpaque(false);
        btninicioa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BtnIniciarSesión2.png"))); // NOI18N
        btninicioa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BtnIniciarSesión2.png"))); // NOI18N
        btninicioa.setVerifyInputWhenFocusTarget(false);
        btninicioa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioaActionPerformed(evt);
            }
        });
        getContentPane().add(btninicioa, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 404, 150, 40));

        txtCorreo.setBackground(new java.awt.Color(0, 0, 0));
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setBorder(null);
        txtCorreo.setOpaque(false);
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 224, 240, 45));

        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnCerrarFocusGained(evt);
            }
        });
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 30, 30));

        txtClave.setForeground(new java.awt.Color(255, 255, 255));
        txtClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClave.setBorder(null);
        txtClave.setOpaque(false);
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 314, 240, 45));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LoginVendedor.png"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 508));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void validarVendedores(){
        Conexion cc = new Conexion();
        Connection cn = cc.GetConexion();
        String user = txtCorreo.getText();
        String pass = String.valueOf(txtClave.getPassword());
        String sql = "SELECT * FROM vendedor WHERE Correo = '"+ user +"'";
        
        if(txtCorreo.getText().isEmpty() && txtClave.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtClave.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes llenar los campos");
            
        } else {
            try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql); 
           
            
            if(rs.next()){
                int intentos = Integer.parseInt(rs.getString("Intentos_restantes"));
                if(rs.getString("Intentos_restantes").equals("0")){
                    JOptionPane.showMessageDialog(null,"Usuario inactivo, comuniquese con el administrador del sistema para restablecer su usuario", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                }else
                
               
                if(rs.getString("Clave").equals(pass)){
                    MenuVendedor mv = new MenuVendedor();
                    mv.setVisible(true);
                    this.dispose();
                } else{
                if(intentos == 0){
                    
             
                    JOptionPane.showMessageDialog(null, "Ha excedido el numero de intentos para ingresar \n" + "Usuario inactivo, comuniquese con el administrador del sistema para restablecer su usuario", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                    
                    Inicio inicio = new Inicio();
                    inicio.setVisible(true);
                    this.dispose();
                }else{
                    txtCorreo.setText("");
                    txtClave.setText("");
                   try{
                    String sqlRestar = "UPDATE `vendedor` SET `Intentos_restantes` = ? WHERE `vendedor`.`Correo` = ? ";
                     PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sqlRestar);
                     pst.setString(1, String.valueOf(intentos-1));
                     pst.setString(2, user);
                     pst.execute();
                    JOptionPane.showMessageDialog(null, "Usuario o clave incorrecta, te quedan " + (intentos - 1) + " intentos", "Aviso", JOptionPane.WARNING_MESSAGE);
                
                   }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No ha sido posible restar los intentos" + e);
                }
                   
                }
                }
                
               
                
            } else{
                
               JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                
               
            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error de conexión " + e.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
             txtCorreo.setText("");
             txtClave.setText("");
        }
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            for (double i=0.0; i<=1.0; i=i+0.1){
            String val = i+"";
            float f=Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    public void transparenciaButton(){
       btninicioa.setOpaque(false);
       btninicioa.setContentAreaFilled(false);
       btninicioa.setBorderPainted(false);
   }
    
    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        Inicio regresoMenu = new Inicio();
        regresoMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCerrarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarFocusGained

    private void btninicioaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioaActionPerformed
        validarVendedores();
    }//GEN-LAST:event_btninicioaActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

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
            java.util.logging.Logger.getLogger(LoginVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btninicioa;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
