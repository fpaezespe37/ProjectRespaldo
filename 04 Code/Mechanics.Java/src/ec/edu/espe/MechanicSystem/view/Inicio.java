
package ec.edu.espe.MechanicSystem.view;
import ec.edu.espe.FastPay.model.Cargar;
import ec.edu.espe.MechanicSystem.view.frmLogin;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Freddy Páez
 */



public final class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    Cargar hilo;

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        iniciar();

    }
    
    
    
   

    public void iniciar() {
        setLocationRelativeTo(null);
        hilo = new Cargar(getProgress());
        hilo.start();
        hilo = null;
        this.setLocationRelativeTo(null);

    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prgssLoadingBar = new javax.swing.JProgressBar();
        jTextField1 = new javax.swing.JTextField();
        labBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(600, 376));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prgssLoadingBar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                prgssLoadingBarStateChanged(evt);
            }
        });
        getContentPane().add(prgssLoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 494, 25));

        jTextField1.setBackground(new java.awt.Color(255, 204, 51));
        jTextField1.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("¡WELCOME!");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        labBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        labBack.setText("¡WELCOME!");
        getContentPane().add(labBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 850, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prgssLoadingBarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prgssLoadingBarStateChanged
        if (prgssLoadingBar.getValue() == 100) {
            
            frmLogin vp = new frmLogin();
            vp.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_prgssLoadingBarStateChanged

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labBack;
    private javax.swing.JProgressBar prgssLoadingBar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the progress
     */
    public javax.swing.JProgressBar getProgress() {
        return prgssLoadingBar;
    }

    
   
}
