
import PanelesEscaletaYSerpiente.AvataresPanel;
import PanelesEscaletaYSerpiente.JuegoPanel;
import PanelesEscaletaYSerpiente.InfoPanel;
import PanelesEscaletaYSerpiente.JuegoPanel;
import java.awt.BorderLayout;
import javax.swing.JPanel;


public class SerpienteGAME extends javax.swing.JFrame {

    private String user=null;
    public SerpienteGAME(String name) {
        this.user=name;
        initComponents();
        this.setLocationRelativeTo(null); //centrar ventana
        this.setTitle("Escalerita y serpiente"); //Titulo 
        
        AvataresPanel Avatares=new AvataresPanel();
        ShowPanel(Avatares);   
        if(Avatares.isShowing()){
            BTNAvatar.setEnabled(false);
        }else{
            BTNAvatar.setEnabled(true);
        }
    }

    private void ShowPanel(JPanel p){ //Cambio de paneles metodo
        p.setSize(765,401);
        p.setLocation(0, 0);
        visible.removeAll();
        visible.add(p, BorderLayout.CENTER);
        visible.revalidate();
        visible.repaint();
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver = new javax.swing.JButton();
        JugarBTN = new javax.swing.JButton();
        visible = new javax.swing.JPanel();
        InfoBTN = new javax.swing.JButton();
        BTNAvatar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 15, -1, -1));

        JugarBTN.setText("Jugar!");
        JugarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(JugarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        visible.setOpaque(false);

        javax.swing.GroupLayout visibleLayout = new javax.swing.GroupLayout(visible);
        visible.setLayout(visibleLayout);
        visibleLayout.setHorizontalGroup(
            visibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        visibleLayout.setVerticalGroup(
            visibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        getContentPane().add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        InfoBTN.setText("Info");
        InfoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(InfoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        BTNAvatar.setText("Avatar");
        BTNAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAvatarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/fondogen.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoBTNActionPerformed
        InfoPanel InfoP=new InfoPanel();
        ShowPanel(InfoP); 
    }//GEN-LAST:event_InfoBTNActionPerformed

    private void BTNAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAvatarActionPerformed
        AvataresPanel AvatarP=new AvataresPanel();
        ShowPanel(AvatarP);
    }//GEN-LAST:event_BTNAvatarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Principal3 a = new Principal3(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void JugarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarBTNActionPerformed
        JuegoPanel Game=new JuegoPanel();
        ShowPanel(Game);
    }//GEN-LAST:event_JugarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(SerpienteGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SerpienteGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SerpienteGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SerpienteGAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SerpienteGAME(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAvatar;
    private javax.swing.JButton InfoBTN;
    private javax.swing.JButton JugarBTN;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel visible;
    // End of variables declaration//GEN-END:variables
}
