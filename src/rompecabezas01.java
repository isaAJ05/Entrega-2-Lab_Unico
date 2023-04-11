

import rompecabezas.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

// Créditos gif ganador: https://tenor.com/view/cute-panda-happy-love-yay-gif-16763329
// Créditos gif perdedor: https://images.app.goo.gl/FLzFLSCFVXRhy6NX8

public class rompecabezas01 extends javax.swing.JFrame implements ActionListener {

    JLabel[][] status;
    JButton[][] piezas;
    ImageIcon[][] imagenes;
    ClassLoader CL = getClass().getClassLoader();
    ImageIcon pp1 = new ImageIcon(CL.getResource("imagenes/r1.png"));
    ImageIcon pp2 = new ImageIcon(CL.getResource("imagenes/r2.png"));
    ImageIcon pp3 = new ImageIcon(CL.getResource("imagenes/r3.png"));
    ImageIcon pp4 = new ImageIcon(CL.getResource("imagenes/r4.png"));
    ImageIcon pp5 = new ImageIcon(CL.getResource("imagenes/r5.png"));
    ImageIcon pp6 = new ImageIcon(CL.getResource("imagenes/r6.png"));
    ImageIcon pp7 = new ImageIcon(CL.getResource("imagenes/r7.png"));
    ImageIcon pp8 = new ImageIcon(CL.getResource("imagenes/r8.png"));
    ImageIcon pp9 = new ImageIcon(CL.getResource("imagenes/r9.png"));
 
    private String user;

    public rompecabezas01(String name) {
        this.user=name;
        initComponents();
        this.setSize(800, 500);
        this.setVisible(true);

        imagenes = new ImageIcon[][]{{pp1, pp2, pp3}, {pp4, pp5, pp6}, {pp7, pp8, pp9}};
        status = new JLabel[][]{{pieza1, pieza2, pieza3}, {pieza4, pieza5, pieza6}, {pieza7, pieza8, pieza9}};
        piezas = new JButton[][]{{p1, p2, p3}, {p4, p5, p6}, {p7, p8, p9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                piezas[i][j].addActionListener(this);
            }
        }

        p1.setIcon(pp5);
        p2.setIcon(pp8);
        p3.setIcon(pp4);
        p4.setIcon(pp9);
        p5.setIcon(pp2);
        p6.setIcon(pp1);
        p7.setIcon(pp3);
        p8.setIcon(pp6);
        p9.setIcon(pp7);
        this.setTitle("ROMPECABEZAS");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    int contador = 0, f, c;
    JButton btn;

    public void actionPerformed(ActionEvent e) {
        btn = (JButton) e.getSource();
        int[] filas = {0, 0, 0, 1, 1, 1, 2, 2, 2};
        int[] columnas = {0, 1, 2, 0, 1, 2, 0, 1, 2};

        for (int i = 0; i < 9; i++) {
            f = filas[i];
            c = columnas[i];
            if (status[f][c].getIcon() == null) {
                status[f][c].setIcon(btn.getIcon());
                btn.setEnabled(false);
                if (contador == 9) {
                    break;
                }
                contador++;
                break;

            }

        }

        rompecabezas();

    }

    public void rompecabezas() {
        boolean k = true;
        if (contador == 9) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (status[i][j].getIcon() != imagenes[i][j]) {
                        k = false;
                    }
                }
            }
            UIManager.put("OptionPane.messageFont", new Font("Monospaced", Font.BOLD, 20));
            if (k) {
                ImageIcon ganaste = new ImageIcon(CL.getResource("imagenes/happy.gif"));
                JOptionPane.showMessageDialog(null, "¡FELICIDADES!\nEres todo un ganador.", "ROMPECABEZAS", JOptionPane.PLAIN_MESSAGE, ganaste);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    piezas[i][j].setEnabled(true);
                    status[i][j].setIcon(null);
                    contador = 0;
                }
            }
            } else {
                ImageIcon perdiste = new ImageIcon(CL.getResource("imagenes/sad.gif"));
                JOptionPane.showMessageDialog(null, "GAME OVER\nPerdiste esta vez,\nsuerte para la próxima.", "ROMPECABEZAS", JOptionPane.PLAIN_MESSAGE, perdiste);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    piezas[i][j].setEnabled(true);
                    status[i][j].setIcon(null);
                    contador = 0;
                }
            }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rompecabezas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        PIEZAS = new javax.swing.JPanel();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        ROMPECABEZAS = new javax.swing.JPanel();
        pieza1 = new javax.swing.JLabel();
        pieza2 = new javax.swing.JLabel();
        pieza3 = new javax.swing.JLabel();
        pieza4 = new javax.swing.JLabel();
        pieza5 = new javax.swing.JLabel();
        pieza6 = new javax.swing.JLabel();
        pieza7 = new javax.swing.JLabel();
        pieza8 = new javax.swing.JLabel();
        pieza9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        rompecabezas.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        rompecabezas.setForeground(new java.awt.Color(51, 51, 255));
        rompecabezas.setText("ROMPECABEZAS");
        getContentPane().add(rompecabezas);
        rompecabezas.setBounds(210, 30, 506, 60);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        volver.setBackground(new java.awt.Color(0, 0, 153));
        volver.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        PIEZAS.setBackground(new java.awt.Color(0, 0, 51));
        PIEZAS.setPreferredSize(new java.awt.Dimension(300, 231));
        PIEZAS.setLayout(new java.awt.GridLayout(3, 3));

        p1.setBackground(new java.awt.Color(204, 204, 255));
        p1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p1MouseDragged(evt);
            }
        });
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        PIEZAS.add(p1);

        p2.setBackground(new java.awt.Color(204, 204, 255));
        p2.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        PIEZAS.add(p2);

        p3.setBackground(new java.awt.Color(204, 204, 255));
        p3.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        PIEZAS.add(p3);

        p4.setBackground(new java.awt.Color(204, 204, 255));
        p4.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });
        PIEZAS.add(p4);

        p5.setBackground(new java.awt.Color(204, 204, 255));
        p5.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });
        PIEZAS.add(p5);

        p6.setBackground(new java.awt.Color(204, 204, 255));
        p6.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });
        PIEZAS.add(p6);

        p7.setBackground(new java.awt.Color(204, 204, 255));
        p7.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });
        PIEZAS.add(p7);

        p8.setBackground(new java.awt.Color(204, 204, 255));
        p8.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });
        PIEZAS.add(p8);

        p9.setBackground(new java.awt.Color(204, 204, 255));
        p9.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        p9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });
        PIEZAS.add(p9);

        ROMPECABEZAS.setBackground(new java.awt.Color(0, 0, 51));
        ROMPECABEZAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ROMPECABEZAS.setPreferredSize(new java.awt.Dimension(300, 231));
        ROMPECABEZAS.setLayout(new java.awt.GridLayout(3, 3));
        ROMPECABEZAS.add(pieza1);
        ROMPECABEZAS.add(pieza2);
        ROMPECABEZAS.add(pieza3);
        ROMPECABEZAS.add(pieza4);
        ROMPECABEZAS.add(pieza5);
        ROMPECABEZAS.add(pieza6);
        ROMPECABEZAS.add(pieza7);
        ROMPECABEZAS.add(pieza8);
        ROMPECABEZAS.add(pieza9);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Haga click en las piezas en el orden que considere correcto.");

        limpiar.setBackground(new java.awt.Color(0, 0, 153));
        limpiar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        limpiar.setText("Reintentar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoespacio (1).png"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(800, 500));
        fondo.setMinimumSize(new java.awt.Dimension(800, 500));
        fondo.setOpaque(true);
        fondo.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PIEZAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(ROMPECABEZAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(volver)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ROMPECABEZAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PIEZAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        rompecabezas a = new rompecabezas(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                piezas[i][j].setEnabled(true);
                status[i][j].setIcon(null);
                contador = 0;
            }
        }
    }//GEN-LAST:event_limpiarActionPerformed

    private void p1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_p1MouseDragged

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed

    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed

    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed

    }//GEN-LAST:event_p3ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed

    }//GEN-LAST:event_p4ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed

    }//GEN-LAST:event_p5ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed

    }//GEN-LAST:event_p6ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed

    }//GEN-LAST:event_p7ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed

    }//GEN-LAST:event_p8ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed

    }//GEN-LAST:event_p9ActionPerformed

   
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
            java.util.logging.Logger.getLogger(rompecabezas01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rompecabezas01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rompecabezas01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rompecabezas01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rompecabezas01(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PIEZAS;
    private javax.swing.JPanel ROMPECABEZAS;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton p1;
    private javax.swing.JButton p2;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    private javax.swing.JLabel pieza1;
    private javax.swing.JLabel pieza2;
    private javax.swing.JLabel pieza3;
    private javax.swing.JLabel pieza4;
    private javax.swing.JLabel pieza5;
    private javax.swing.JLabel pieza6;
    private javax.swing.JLabel pieza7;
    private javax.swing.JLabel pieza8;
    private javax.swing.JLabel pieza9;
    private javax.swing.JLabel rompecabezas;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
