
import PanelesSP.inicio;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class ASOPAstar extends javax.swing.JFrame {

    private String user;

    public ASOPAstar(String name) {
        initComponents();
        this.user = name;
        this.setLocationRelativeTo(null);//centrar ventana
        this.setTitle(" Carrera de Autos Espaciales"); //Titulo 

        inicio ini = new inicio();
        ShowPanel(ini);

    }

    private void ShowPanel(JPanel p) { //Cambio de paneles metodo
        p.setSize(780, 370);
        p.setLocation(0, 0);
        Visible.removeAll();
        Visible.add(p, BorderLayout.CENTER);
        Visible.revalidate();
        Visible.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        Visible = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(255, 153, 255));
        btnVolver.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 51));
        btnVolver.setText("Salir ←");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Visible.setOpaque(false);

        javax.swing.GroupLayout VisibleLayout = new javax.swing.GroupLayout(Visible);
        Visible.setLayout(VisibleLayout);
        VisibleLayout.setHorizontalGroup(
            VisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        VisibleLayout.setVerticalGroup(
            VisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(Visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/fondoespacio (1) (1).png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal3 a = new Principal3(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(ASOPAstar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASOPAstar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASOPAstar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASOPAstar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ASOPAstar(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Visible;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
