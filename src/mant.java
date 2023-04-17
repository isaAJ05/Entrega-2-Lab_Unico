
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class mant extends javax.swing.JFrame {

    private String user = null;
    public mant(String name) {
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(),new Point(0,0),"Custom Cursor");
        this.setCursor(cursor);
        initComponents();
        this.setLocationRelativeTo(null);
        this.user = name;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 0, 51));

        volver.setBackground(new java.awt.Color(0, 0, 102));
        volver.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        volver.setText("Volver ←");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(volver)
                .addGap(157, 157, 157))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(volver)
                .addGap(63, 63, 63))
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

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Principal3 a = new Principal3(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed
@Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics gr = panel.getGraphics();

        gr.setColor(Color.yellow);
        int[] vx = {60, 123, 150, 177, 240, 190, 200, 150, 100, 110};
        int[] vy = {160, 160, 100, 160, 160, 200, 260, 220, 260, 200};
        gr.fillPolygon(vx, vy, 10);

        gr.setColor(Color.red);
        int[] xt1 = {150, 123, 177};
        int[] yt1 = {100, 160, 160};
        gr.fillPolygon(xt1, yt1, 3);

        gr.setColor(Color.green);
        int[] xt2 = {123, 60, 110};
        int[] yt2 = {160, 160, 200};
        gr.fillPolygon(xt2, yt2, 3);

        gr.setColor(Color.magenta);
        int[] xt3 = {177, 240, 190};
        int[] yt3 = {160, 160, 200};
        gr.fillPolygon(xt3, yt3, 3);

        gr.setColor(Color.blue);
        int[] xt4 = {110, 150, 100};
        int[] yt4 = {200, 220, 260};
        gr.fillPolygon(xt4, yt4, 3);

        gr.setColor(Color.cyan);
        int[] xt5 = {190, 150, 200};
        int[] yt5 = {200, 220, 260};
        gr.fillPolygon(xt5, yt5, 3);

        gr.setColor(Color.orange);
        Font f3 = new Font("Engravers MT", Font.BOLD, 25);
        gr.setFont(f3);
        gr.drawString("STAR Games" + "", 310, 100);

        g.fillOval(141, 200, 8, 13);
        g.fillOval(167, 200, 8, 13);

        gr.setColor(Color.white);
        gr.fillOval(136, 170, 3, 3);
        gr.fillOval(162, 170, 3, 3);

        gr.setColor(Color.black);
        g.fillOval(145, 217, 25, 15);


        gr.setColor(Color.white);
        Font f2 = new Font("Monospaced", Font.PLAIN, 18);
        gr.setFont(f2);
        gr.drawString("Oops, lo sentimos "+user+".", 300, 160);
        gr.drawString("Este juego se encuentra en", 300, 180);
        gr.drawString("mantenimiento por el momento.", 300, 200);
        gr.drawString("Vuelve mas tarde.", 340, 250);

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
            java.util.logging.Logger.getLogger(mant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mant(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
