
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Pista extends javax.swing.JFrame {

    private String user;

    public Pista(String name) {
        this.user = name;

        initComponents();

        this.setLocationRelativeTo(null);
        //centrar ventana
        this.setTitle(" Carrera de Autos Espaciales"); //Titulo 

    }

    //Pista donde los carros se moveran de 19x12, se rellenara con ceros y unos
    int espaciopista[][];
    int limiteF = 20, limiteC = 14, F;

    public JLabel getAutoAzul() {  //Para el label que tiene el carro azul
        return AZULc;
    }

    public JLabel getAutoNaranja() { //Para el label que tiene el carro naranja
        return NARANJAc;
    }

    public JLabel getAutoVerde() { //Para el label que tiene el carro verde
        return VERDEc;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Visible = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        carreraPANEL = new javax.swing.JPanel();
        AZULc = new javax.swing.JLabel();
        VERDEc = new javax.swing.JLabel();
        NARANJAc = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        InfoBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Visible.setBackground(new java.awt.Color(0, 0, 51));
        Visible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("CARRERA DE AUTOS ESPACIALES");
        Visible.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 563, 60));

        btnStart.setBackground(new java.awt.Color(153, 153, 255));
        btnStart.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnStart.setText("Iniciar");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        Visible.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        AZULc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/axullcarro (1).png"))); // NOI18N

        VERDEc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdecarro (2).png"))); // NOI18N

        NARANJAc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/naranjacarro_1.png"))); // NOI18N

        javax.swing.GroupLayout carreraPANELLayout = new javax.swing.GroupLayout(carreraPANEL);
        carreraPANEL.setLayout(carreraPANELLayout);
        carreraPANELLayout.setHorizontalGroup(
            carreraPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carreraPANELLayout.createSequentialGroup()
                .addGroup(carreraPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NARANJAc)
                    .addComponent(VERDEc)
                    .addComponent(AZULc))
                .addGap(0, 546, Short.MAX_VALUE))
        );
        carreraPANELLayout.setVerticalGroup(
            carreraPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carreraPANELLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(AZULc)
                .addGap(18, 18, 18)
                .addComponent(VERDEc)
                .addGap(27, 27, 27)
                .addComponent(NARANJAc)
                .addGap(52, 52, 52))
        );

        Visible.add(carreraPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 690, 400));

        btnVolver.setBackground(new java.awt.Color(153, 153, 255));
        btnVolver.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnVolver.setText("Volver ←");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        Visible.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("STAR GAMES");
        Visible.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 150, 30));

        InfoBTN.setBackground(new java.awt.Color(153, 153, 255));
        InfoBTN.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        InfoBTN.setText("Info");
        InfoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoBTNActionPerformed(evt);
            }
        });
        Visible.add(InfoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, -1));

        getContentPane().add(Visible, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        int F, C;
        for (F = 0; F < limiteF; F++) {
            for (C = 0; C < limiteC; C++) {
                if (F == limiteF - 1 || F == 0 || C == limiteC - 1 || C == 0) {
                    espaciopista[F][C] = 1; //Bordes de la pista
                } else {
                    if ((F >= 1 | F < limiteF - 2) & C == limiteC - 2) {
                        espaciopista[F][C] = 2; //Linea de meta
                    } else {
                        espaciopista[F][C] = 0; //Espacio donde los carritos se moveran 
                    }
                }
            }
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal3 a = new Principal3(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void InfoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoBTNActionPerformed

    int x = 210;

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
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pista(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AZULc;
    private javax.swing.JButton InfoBTN;
    private javax.swing.JLabel NARANJAc;
    private javax.swing.JLabel VERDEc;
    private javax.swing.JPanel Visible;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel carreraPANEL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
