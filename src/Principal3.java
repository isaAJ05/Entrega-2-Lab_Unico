
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Principal3 extends javax.swing.JFrame {


    private String name = null;

    public Principal3(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.name = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        red = new javax.swing.JButton();
        magenta = new javax.swing.JButton();
        green = new javax.swing.JButton();
        blue = new javax.swing.JButton();
        cyan = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        stella = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        panel.setBackground(new java.awt.Color(0, 0, 51));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        red.setBackground(new java.awt.Color(255, 0, 0));
        red.setFont(new java.awt.Font("Swis721 Blk BT", 1, 14)); // NOI18N
        red.setForeground(new java.awt.Color(0, 0, 0));
        red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/CartaBTN.png"))); // NOI18N
        red.setBorderPainted(false);
        red.setContentAreaFilled(false);
        red.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        red.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        red.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/general/CartasBtn80.png"))); // NOI18N
        red.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/general/cartaBTN95.png"))); // NOI18N
        red.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                redMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                redMouseExited(evt);
            }
        });
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });
        panel.add(red, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 130, 140));

        magenta.setBackground(new java.awt.Color(255, 51, 255));
        magenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/carreraBTN.png"))); // NOI18N
        magenta.setBorderPainted(false);
        magenta.setContentAreaFilled(false);
        magenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        magenta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/general/CarretaBTN80.png"))); // NOI18N
        magenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/general/CarreraBTN95.png"))); // NOI18N
        magenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magentaActionPerformed(evt);
            }
        });
        panel.add(magenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 110, 100));

        green.setBackground(new java.awt.Color(0, 255, 51));
        green.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/RompeCabezaBTN.png"))); // NOI18N
        green.setBorderPainted(false);
        green.setContentAreaFilled(false);
        green.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        green.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/general/Rompecabezasbtn80.png"))); // NOI18N
        green.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/general/RompecabezaBTN95.png"))); // NOI18N
        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });
        panel.add(green, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 100, 100));

        blue.setBackground(new java.awt.Color(0, 0, 255));
        blue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/SopadeLetrasBTN.png"))); // NOI18N
        blue.setBorderPainted(false);
        blue.setContentAreaFilled(false);
        blue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blue.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/general/SopadeletrasBTn80.png"))); // NOI18N
        blue.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/general/SopadeletrasBTN95.png"))); // NOI18N
        blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueActionPerformed(evt);
            }
        });
        panel.add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 100, 100));

        cyan.setBackground(new java.awt.Color(0, 255, 255));
        cyan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/SerpienteEscaleraBTN.png"))); // NOI18N
        cyan.setBorderPainted(false);
        cyan.setContentAreaFilled(false);
        cyan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cyan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/general/sepientesecaleraBTN80.png"))); // NOI18N
        cyan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/general/EscaleraSerpienteBTN95.png"))); // NOI18N
        cyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyanActionPerformed(evt);
            }
        });
        panel.add(cyan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 110, 100));

        volver.setBackground(new java.awt.Color(0, 0, 102));
        volver.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        volver.setText("Volver ←");
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        panel.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        stella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/stella (5).png"))); // NOI18N
        panel.add(stella, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general/fondoespacio (1) (1).png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        // BLACKJACK
        Mesa1 a = new Mesa1(name);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_redActionPerformed

    private void magentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magentaActionPerformed
        // CARRERAS
        Pista a = new Pista(name);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_magentaActionPerformed

    private void greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenActionPerformed
        // ROMPECABEZAS
        mant a = new mant(name);
        a.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_greenActionPerformed

    private void blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueActionPerformed
        // SOPA DE LETRAS
        SOPASTAR a = new SOPASTAR(name);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_blueActionPerformed

    private void cyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cyanActionPerformed
       // SERPIENTES Y ESCALERAS
        mant a = new mant(name);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cyanActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed

        Principal2 a = new Principal2();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void redMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redMouseEntered
        red.setText("Black Jack");
    }//GEN-LAST:event_redMouseEntered

    private void redMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redMouseExited
        red.setText("");
    }//GEN-LAST:event_redMouseExited
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics gr = panel.getGraphics();
//
//        gr.setColor(Color.yellow);
//        int[] vx = {60, 123, 150, 177, 240, 190, 200, 150, 100, 110};
//        int[] vy = {160, 160, 100, 160, 160, 200, 260, 220, 260, 200};
//        gr.fillPolygon(vx, vy, 10);
//
//        gr.setColor(Color.red);
//        int[] xt1 = {150, 123, 177};
//        int[] yt1 = {100, 160, 160};
//        gr.fillPolygon(xt1, yt1, 3);
//        gr.fillOval(320, 180, 10, 10);
//
//        gr.setColor(Color.green);
//        int[] xt2 = {123, 60, 110};
//        int[] yt2 = {160, 160, 200};
//        gr.fillPolygon(xt2, yt2, 3);
//        gr.fillOval(320, 260, 10, 10);
//
//        gr.setColor(Color.magenta);
//        int[] xt3 = {177, 240, 190};
//        int[] yt3 = {160, 160, 200};
//        gr.fillPolygon(xt3, yt3, 3);
//        gr.fillOval(320, 200, 10, 10);
//
//        gr.setColor(Color.blue);
//        int[] xt4 = {110, 150, 100};
//        int[] yt4 = {200, 220, 260};
//        gr.fillPolygon(xt4, yt4, 3);
//        gr.fillOval(320, 240, 10, 10);
//
//        gr.setColor(Color.cyan);
//        int[] xt5 = {190, 150, 200};
//        int[] yt5 = {200, 220, 260};
//        gr.fillPolygon(xt5, yt5, 3);
//        gr.fillOval(320, 220, 10, 10);
//
//        gr.setColor(Color.orange);
//        Font f3 = new Font("Engravers MT", Font.BOLD, 25);
//        gr.setFont(f3);
//        gr.drawString("STAR Games" + "", 310, 100);
//
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
//
//        gr.setColor(Color.white);
//        Font f2 = new Font("Monospaced", Font.PLAIN, 15);
//        gr.setFont(f2);
//        gr.drawString("En STAR GAMES puedes disfrutar", 280, 140);
//        gr.drawString("de 5 juegos distintos:", 280, 160);
//
//        gr.drawString("  ROJO: Cartas", 320, 190);
//        gr.drawString("  MAGENTA: Carreras", 320, 210);
//        gr.drawString("  CYAN: Serpientes y escaleras", 320, 230);
//        gr.drawString("  AZUL: Sopa de letras", 320, 250);
//        gr.drawString("  VERDE: Rompecabezas", 320, 270);
//
//        gr.drawString(name + ", puedes seleccionar tu juego presionando el botón", 100, 305);
//        gr.drawString("del color correspondiente en cada punta de Stella", 100, 325);

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
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal3(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blue;
    private javax.swing.JButton cyan;
    private javax.swing.JButton green;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton magenta;
    private javax.swing.JPanel panel;
    private javax.swing.JButton red;
    private javax.swing.JLabel stella;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

}
