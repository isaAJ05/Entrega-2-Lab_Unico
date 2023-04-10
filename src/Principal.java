
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author nunez, Arrieta, Carpintero 
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        continuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 0, 51));

        continuar.setBackground(new java.awt.Color(0, 0, 102));
        continuar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/stella (1).png"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        Principal2 a = new Principal2();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_continuarActionPerformed

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics gr = panel.getGraphics();
        
//        gr.setColor(Color.yellow);
//        int[] vx = {60, 123, 150, 177, 240, 190, 200, 150, 100, 110};
//        int[] vy = {160, 160, 100, 160, 160, 200, 260, 220, 260, 200};
//        gr.fillPolygon(vx, vy, 10);
//
//        gr.setColor(Color.red);
//        int[] xt1 = {150, 123, 177};
//        int[] yt1 = {100, 160, 160};
//        gr.fillPolygon(xt1, yt1, 3);
//
//        gr.setColor(Color.green);
//        int[] xt2 = {123, 60, 110};
//        int[] yt2 = {160, 160, 200};
//        gr.fillPolygon(xt2, yt2, 3);
//
//        gr.setColor(Color.magenta);
//        int[] xt3 = {177, 240, 190};
//        int[] yt3 = {160, 160, 200};
//        gr.fillPolygon(xt3, yt3, 3);
//
//        gr.setColor(Color.blue);
//        int[] xt4 = {110, 150, 100};
//        int[] yt4 = {200, 220, 260};
//        gr.fillPolygon(xt4, yt4, 3);
//
//        gr.setColor(Color.cyan);
//        int[] xt5 = {190, 150, 200};
//        int[] yt5 = {200, 220, 260};
//        gr.fillPolygon(xt5, yt5, 3);
//        
        gr.setColor(Color.white);
        Font f1 = new Font("Elephant",Font.BOLD,20);
        gr.setFont(f1);
        gr.drawString("BIENVENIDX  A" + "", 442, 160);
        Font f2 = new Font("Monospaced",Font.PLAIN,17);
        gr.setFont(f2);
        gr.drawString("by NIP creations" + "", 465, 230);
        
//        g.fillOval(141, 200, 8, 13);
//        g.fillOval(167, 200, 8, 13);
//        
//        gr.setColor(Color.white);
//        gr.fillOval(136, 170, 3, 3);
//        gr.fillOval(162, 170, 3, 3);
//        
//        gr.setColor(Color.black);
//        g.fillOval(141, 217, 35, 20);
//        gr.setColor(Color.yellow);
//        gr.fillRect(133, 185, 35, 9);
        
        gr.setColor(Color.orange);
        Font f3 = new Font("Engravers MT",Font.BOLD,25);       
        gr.setFont(f3);
        gr.drawString("STAR Games" + "", 428, 200);

    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    

}
