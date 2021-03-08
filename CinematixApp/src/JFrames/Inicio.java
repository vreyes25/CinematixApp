package JFrames;
import java.awt.Color;

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
        setBackground( new Color (0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnvendedor = new javax.swing.JLabel();
        btnadmi = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnvendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvendedorMouseClicked(evt);
            }
        });
        getContentPane().add(btnvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 190, 190));

        btnadmi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadmi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnadmiMouseClicked(evt);
            }
        });
        getContentPane().add(btnadmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 190, 190));

        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setName("btnCerrar"); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 30, 30));
        btnCerrar.getAccessibleContext().setAccessibleName("btnCerrar");

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Primera Pantalla.png"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnvendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvendedorMouseClicked
        LoginVendedor logV = new LoginVendedor();
        logV.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnvendedorMouseClicked

    private void btnadmiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadmiMouseClicked
        LoginAdmin logA = new LoginAdmin();
        logA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnadmiMouseClicked

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
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnadmi;
    private javax.swing.JLabel btnvendedor;
    private javax.swing.JLabel labelFondo;
    // End of variables declaration//GEN-END:variables
}
