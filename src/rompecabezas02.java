

import rompecabezas.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

// Créditos de la imagen: https://www.nationalgeographic.com.es/ciencia/sistema-solar-que-es-como-se-formo-y-datos-principales_18430

// Créditos gif ganador: https://tenor.com/view/cute-panda-happy-love-yay-gif-16763329
// Créditos gif perdedor: https://images.app.goo.gl/FLzFLSCFVXRhy6NX8

public class rompecabezas02 extends javax.swing.JFrame implements ActionListener {

    JLabel[][] status;
    JButton[][] piezas;
    ImageIcon[][] imagenes;
    ClassLoader CL = getClass().getClassLoader();
    ImageIcon pp1 = new ImageIcon(CL.getResource("imagenes/12.jpg"));
    ImageIcon pp2 = new ImageIcon(CL.getResource("imagenes/11.jpg"));
    ImageIcon pp3 = new ImageIcon(CL.getResource("imagenes/10.jpg"));
    ImageIcon pp4 = new ImageIcon(CL.getResource("imagenes/9.jpg"));
    ImageIcon pp5 = new ImageIcon(CL.getResource("imagenes/8.jpg"));
    ImageIcon pp6 = new ImageIcon(CL.getResource("imagenes/7.jpg"));
    ImageIcon pp7 = new ImageIcon(CL.getResource("imagenes/6.jpg"));
    ImageIcon pp8 = new ImageIcon(CL.getResource("imagenes/5.jpg"));
    ImageIcon pp9 = new ImageIcon(CL.getResource("imagenes/4.jpg"));
    ImageIcon pp10 = new ImageIcon(CL.getResource("imagenes/3.jpg"));
    ImageIcon pp11 = new ImageIcon(CL.getResource("imagenes/2.jpg"));
    ImageIcon pp12 = new ImageIcon(CL.getResource("imagenes/1.jpg"));
   
    private String user;
    public rompecabezas02(String name) {
         this.user=name;
        initComponents();
        this.setVisible(true);
        this.setSize(800, 490);
        imagenes = new ImageIcon[][]{{pp1, pp2, pp3}, {pp4, pp5, pp6}, {pp7, pp8, pp9}, {pp10, pp11, pp12}};
        status = new JLabel[][]{{pieza1, pieza2, pieza3}, {pieza4, pieza5, pieza6}, {pieza7, pieza8, pieza9}, {pieza10, pieza11, pieza12}};
        piezas = new JButton[][]{{p1, p2, p3}, {p4, p5, p6}, {p7, p8, p9}, {p10, p11, p12}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                piezas[i][j].addActionListener(this);
            }
        }

        p1.setIcon(pp10);
        p2.setIcon(pp8);
        p3.setIcon(pp4);
        p4.setIcon(pp9);
        p5.setIcon(pp12);
        p6.setIcon(pp1);
        p7.setIcon(pp3);
        p8.setIcon(pp6);
        p9.setIcon(pp2);
        p10.setIcon(pp7);
        p11.setIcon(pp11);
        p12.setIcon(pp5);
        this.setTitle("ROMPECABEZAS");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    int contador = 0, f, c;
    JButton btn;

    public void actionPerformed(ActionEvent e) {

        btn = (JButton) e.getSource();
        int[] filas = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};
        int[] columnas = {0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2};

        for (int i = 0; i < 12; i++) {
            f = filas[i];
            c = columnas[i];
            if (status[f][c].getIcon() == null) {
                status[f][c].setIcon(btn.getIcon());
                btn.setEnabled(false);
                if (contador == 12) {
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
        if (contador == 12) {
            for (int i = 0; i < 4; i++) {
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
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 3; j++) {
                        piezas[i][j].setEnabled(true);
                        status[i][j].setIcon(null);
                        contador = 0;
                    }
                }
            } else {
                ImageIcon perdiste = new ImageIcon(CL.getResource("imagenes/sad.gif"));
                JOptionPane.showMessageDialog(null, "GAME OVER\nPerdiste esta vez,\nsuerte para la próxima.", "ROMPECABEZAS", JOptionPane.PLAIN_MESSAGE, perdiste);
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 3; j++) {
                        piezas[i][j].setEnabled(true);
                        status[i][j].setIcon(null);
                        contador = 0;

                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver1 = new javax.swing.JButton();
        labelvolver = new javax.swing.JLabel();
        volver1 = new javax.swing.JButton();
        rompecabezas = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
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
        p10 = new javax.swing.JButton();
        p11 = new javax.swing.JButton();
        p12 = new javax.swing.JButton();
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
        pieza10 = new javax.swing.JLabel();
        pieza11 = new javax.swing.JLabel();
        pieza12 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver1.setBackground(new java.awt.Color(255, 153, 255));
        btnVolver1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(0, 0, 51));
        btnVolver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellar.png"))); // NOI18N
        btnVolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver1.setMaximumSize(new java.awt.Dimension(50, 39));
        btnVolver1.setMinimumSize(new java.awt.Dimension(50, 39));
        btnVolver1.setPreferredSize(new java.awt.Dimension(58, 47));
        btnVolver1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellar1.png"))); // NOI18N
        btnVolver1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stellar1.png"))); // NOI18N
        btnVolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolver1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver1MouseExited(evt);
            }
        });
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(labelvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        volver1.setBackground(new java.awt.Color(0, 0, 153));
        volver1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        volver1.setText("Volver");
        volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver1ActionPerformed(evt);
            }
        });
        jPanel1.add(volver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        rompecabezas.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        rompecabezas.setForeground(new java.awt.Color(51, 51, 255));
        rompecabezas.setText("ROMPECABEZAS");
        jPanel1.add(rompecabezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        limpiar.setBackground(new java.awt.Color(0, 0, 153));
        limpiar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        limpiar.setText("Reintentar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 111, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Haga click en las piezas en el orden que considere correcto.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 490, 30));

        PIEZAS.setBackground(new java.awt.Color(0, 0, 51));
        PIEZAS.setMaximumSize(new java.awt.Dimension(300, 117));
        PIEZAS.setMinimumSize(new java.awt.Dimension(300, 117));
        PIEZAS.setPreferredSize(new java.awt.Dimension(296, 222));
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

        p10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PIEZAS.add(p10);

        p11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11ActionPerformed(evt);
            }
        });
        PIEZAS.add(p11);

        p12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        p12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p12ActionPerformed(evt);
            }
        });
        PIEZAS.add(p12);

        jPanel1.add(PIEZAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        ROMPECABEZAS.setBackground(new java.awt.Color(0, 0, 51));
        ROMPECABEZAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ROMPECABEZAS.setMaximumSize(new java.awt.Dimension(300, 117));
        ROMPECABEZAS.setMinimumSize(new java.awt.Dimension(300, 117));
        ROMPECABEZAS.setPreferredSize(new java.awt.Dimension(296, 222));
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
        ROMPECABEZAS.add(pieza10);
        ROMPECABEZAS.add(pieza11);
        ROMPECABEZAS.add(pieza12);

        jPanel1.add(ROMPECABEZAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoespacio (1).png"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(800, 500));
        fondo.setMinimumSize(new java.awt.Dimension(800, 500));
        fondo.setOpaque(true);
        fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        for (int i = 0; i < 4; i++) {
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

    private void p11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p11ActionPerformed

    private void p12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p12ActionPerformed

    private void volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver1ActionPerformed
        rompecabezas a = new rompecabezas(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volver1ActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
         Principal3 p = new Principal3(user);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnVolver1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseEntered
          labelvolver.setText(" Inicio");  
    }//GEN-LAST:event_btnVolver1MouseEntered

    private void btnVolver1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseExited
          labelvolver.setText("");  
    }//GEN-LAST:event_btnVolver1MouseExited

    
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
            java.util.logging.Logger.getLogger(rompecabezas02.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rompecabezas02.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rompecabezas02.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rompecabezas02.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rompecabezas02(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PIEZAS;
    private javax.swing.JPanel ROMPECABEZAS;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton p1;
    private javax.swing.JButton p10;
    private javax.swing.JButton p11;
    private javax.swing.JButton p12;
    private javax.swing.JButton p2;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    private javax.swing.JLabel pieza1;
    private javax.swing.JLabel pieza10;
    private javax.swing.JLabel pieza11;
    private javax.swing.JLabel pieza12;
    private javax.swing.JLabel pieza2;
    private javax.swing.JLabel pieza3;
    private javax.swing.JLabel pieza4;
    private javax.swing.JLabel pieza5;
    private javax.swing.JLabel pieza6;
    private javax.swing.JLabel pieza7;
    private javax.swing.JLabel pieza8;
    private javax.swing.JLabel pieza9;
    private javax.swing.JLabel rompecabezas;
    private javax.swing.JButton volver1;
    // End of variables declaration//GEN-END:variables
}
