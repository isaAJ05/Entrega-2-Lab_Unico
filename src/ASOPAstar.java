
import PanelesSP.inicio;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ASOPAstar extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    private String user;

    public ASOPAstar(String name) {
        initComponents();
        this.user = name;
        this.setContentPane(fondo);
        this.setLocationRelativeTo(null);//centrar ventana
        this.setTitle("Sopa de Letras"); //Titulo 

        this.setLocationRelativeTo(null);
        inicio i = new inicio(user);
        i.setSize(800, 500);
        i.setLocation(0, 0);
        i.setOpaque(false);
        this.setLayout(null);
        this.add(btnVolver2);
        this.add(labelvolver);
        btnVolver2.setBounds(10, 6, 58, 47);
        labelvolver.setBounds(10, 53, 49, 17);

        this.add(i);

//        inicio ini = new inicio();
//        ShowPanel(ini);
    }
//
//    private void ShowPanel(JPanel p) { //Cambio de paneles metodo
//        p.setSize(800, 500);
//        p.setLocation(0, 0);
//
//        contenido.removeAll();
//        contenido.add(p, BorderLayout.CENTER);
//        contenido.revalidate();
//        contenido.repaint();
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        labelvolver = new javax.swing.JLabel();
        btnVolver2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));

        btnVolver2.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVolver2.setForeground(new java.awt.Color(0, 0, 51));
        btnVolver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellar.png"))); // NOI18N
        btnVolver2.setBorder(null);
        btnVolver2.setBorderPainted(false);
        btnVolver2.setContentAreaFilled(false);
        btnVolver2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver2.setFocusPainted(false);
        btnVolver2.setFocusable(false);
        btnVolver2.setHideActionText(true);
        btnVolver2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver2.setPreferredSize(new java.awt.Dimension(58, 47));
        btnVolver2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellar1.png"))); // NOI18N
        btnVolver2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellar1.png"))); // NOI18N
        btnVolver2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolver2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver2MouseExited(evt);
            }
        });
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(736, Short.MAX_VALUE))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolver2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver2MouseEntered
        labelvolver.setText(" Inicio");
    }//GEN-LAST:event_btnVolver2MouseEntered

    private void btnVolver2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver2MouseExited
        labelvolver.setText("");
    }//GEN-LAST:event_btnVolver2MouseExited

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        Principal3 p = new Principal3(user);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolver2ActionPerformed

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
    private javax.swing.JButton btnVolver2;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel labelvolver;
    // End of variables declaration//GEN-END:variables
 class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("\\IMGcars\\fondoespacio(3) (1).png")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
