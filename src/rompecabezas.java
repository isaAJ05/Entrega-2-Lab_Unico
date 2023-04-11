

import java.awt.Dimension;

public class rompecabezas extends javax.swing.JFrame {

     private String user;
    public rompecabezas() {
        setPreferredSize(new Dimension(800, 500));
        this.setResizable(false);
        this.setTitle("ROMPECABEZAS");
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    rompecabezas(String name) {
         this.user = name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rompecabezas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        panelpuzzle = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        volver.setBackground(new java.awt.Color(0, 0, 153));
        volver.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver);
        volver.setBounds(30, 20, 110, 26);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGrompecabezas/stellap.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 170, 290, 220);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGrompecabezas/puzzle2.jpg"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 170, 304, 220);

        rompecabezas.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        rompecabezas.setForeground(new java.awt.Color(51, 51, 255));
        rompecabezas.setText("ROMPECABEZAS");
        getContentPane().add(rompecabezas);
        rompecabezas.setBounds(210, 30, 506, 60);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FÁCIL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 410, 40, 20);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escoja el rompecabezas que desea realizar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 328, 20);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DIFÍCIL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 410, 56, 20);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGrompecabezas/fondoespacio (1).png"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(800, 500));
        fondo.setMinimumSize(new java.awt.Dimension(800, 500));
        fondo.setOpaque(true);
        fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 800, 500);

        panelpuzzle.setOpaque(false);

        javax.swing.GroupLayout panelpuzzleLayout = new javax.swing.GroupLayout(panelpuzzle);
        panelpuzzle.setLayout(panelpuzzleLayout);
        panelpuzzleLayout.setHorizontalGroup(
            panelpuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        panelpuzzleLayout.setVerticalGroup(
            panelpuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(panelpuzzle);
        panelpuzzle.setBounds(0, 0, 790, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
    Principal3 a = new Principal3(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        rompecabezas01 a = new rompecabezas01();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        rompecabezas02 a = new rompecabezas02();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rompecabezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rompecabezas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelpuzzle;
    private javax.swing.JLabel rompecabezas;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
