package JFrames;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Los Pibes
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        transparenciaButton();
    }

    @Override
    public Image getIconImage() {
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

        btnAdmin = new javax.swing.JButton();
        btnVendedor = new javax.swing.JButton();
        btnCerrar = new javax.swing.JLabel();
        btnPermisos = new javax.swing.JLabel();
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

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BtnAdmin.png"))); // NOI18N
        btnAdmin.setBorder(null);
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.setOpaque(false);
        btnAdmin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BtnAdminPresionado.png"))); // NOI18N
        btnAdmin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BtnAdminPresionado.png"))); // NOI18N
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 156, 190, 190));

        btnVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BtnVendedor.png"))); // NOI18N
        btnVendedor.setBorder(null);
        btnVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendedor.setOpaque(false);
        btnVendedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BtnVendedorPresionado.png"))); // NOI18N
        btnVendedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BtnVendedorPresionado.png"))); // NOI18N
        btnVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 156, 190, 190));

        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setName("btnCerrar"); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 98, 35, 35));
        btnCerrar.getAccessibleContext().setAccessibleName("btnCerrar");

        btnPermisos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPermisos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPermisosMouseClicked(evt);
            }
        });
        getContentPane().add(btnPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 150, 130));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Primera Pantalla.png"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMouseClicked

    public void transparenciaButton() {
        btnAdmin.setOpaque(false);
        btnAdmin.setContentAreaFilled(false);
        btnAdmin.setBorderPainted(false);

        btnVendedor.setOpaque(false);
        btnVendedor.setContentAreaFilled(false);
        btnVendedor.setBorderPainted(false);
    }

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        LoginAdmin logA = new LoginAdmin();
        logA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedorActionPerformed
        LoginVendedor logV = new LoginVendedor();
        logV.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVendedorActionPerformed

    private void btnPermisosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPermisosMouseClicked
        LoginPermisos logP = new LoginPermisos();
        logP.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPermisosMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnPermisos;
    private javax.swing.JButton btnVendedor;
    private javax.swing.JLabel labelFondo;
    // End of variables declaration//GEN-END:variables
}
