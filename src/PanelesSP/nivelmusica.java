
package PanelesSP;

import javax.swing.JOptionPane;

public class nivelmusica extends javax.swing.JPanel {

  
    private String user = null;

    public nivelmusica(String name) {
        initComponents();
        this.user = name;

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        MEDIUM = new javax.swing.JButton();
        hardplanetas = new javax.swing.JButton();
        btnVolver3 = new javax.swing.JButton();
        labelvolver = new javax.swing.JLabel();

        contenido3.setBackground(new java.awt.Color(51, 51, 255));
        contenido3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("SELECCIONE LA DIFICULTAD DE JUEGO");

        jButton1.setBackground(new java.awt.Color(255, 153, 255));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Easy");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MEDIUM.setBackground(new java.awt.Color(255, 153, 255));
        MEDIUM.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        MEDIUM.setForeground(new java.awt.Color(0, 0, 51));
        MEDIUM.setText("Medium");
        MEDIUM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MEDIUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDIUMActionPerformed(evt);
            }
        });

        hardplanetas.setBackground(new java.awt.Color(255, 153, 255));
        hardplanetas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        hardplanetas.setForeground(new java.awt.Color(0, 0, 51));
        hardplanetas.setText("Hard");
        hardplanetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hardplanetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardplanetasActionPerformed(evt);
            }
        });

        btnVolver3.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVolver3.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnVolver3.setContentAreaFilled(false);
        btnVolver3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver3.setMaximumSize(new java.awt.Dimension(50, 39));
        btnVolver3.setMinimumSize(new java.awt.Dimension(50, 39));
        btnVolver3.setPreferredSize(new java.awt.Dimension(58, 47));
        btnVolver3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasr.png"))); // NOI18N
        btnVolver3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasr.png"))); // NOI18N
        btnVolver3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolver3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver3MouseExited(evt);
            }
        });
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenido3Layout = new javax.swing.GroupLayout(contenido3);
        contenido3.setLayout(contenido3Layout);
        contenido3Layout.setHorizontalGroup(
            contenido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido3Layout.createSequentialGroup()
                .addGroup(contenido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido3Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(contenido3Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addGroup(contenido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hardplanetas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MEDIUM)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenido3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        contenido3Layout.setVerticalGroup(
            contenido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(jButton1)
                .addGap(67, 67, 67)
                .addComponent(MEDIUM)
                .addGap(73, 73, 73)
                .addComponent(hardplanetas)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        contenido3.removeAll();
    instruccionesem e = new instruccionesem(user);//Una instancia
        e.setSize(800, 496);
        e.setLocation(0, 0);
        e.setOpaque(false);
        contenido3.add(e);
        contenido3.revalidate();
        contenido3.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MEDIUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDIUMActionPerformed
        contenido3.removeAll();
    instruccionesmm e = new instruccionesmm(user);//Una instancia
        e.setSize(800, 496);
        e.setLocation(0, 0);
        e.setOpaque(false);
        contenido3.add(e);
        contenido3.revalidate();
        contenido3.repaint();
    }//GEN-LAST:event_MEDIUMActionPerformed

    private void hardplanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardplanetasActionPerformed
        contenido3.removeAll();
    instruccioneshm e = new instruccioneshm(user);//Una instancia
        e.setSize(800, 496);
        e.setLocation(0, 0);
        e.setOpaque(false);
        contenido3.add(e);
        contenido3.revalidate();
        contenido3.repaint();
    }//GEN-LAST:event_hardplanetasActionPerformed

    private void btnVolver3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseEntered
        labelvolver.setBounds(20, 53, 49, 17);
        labelvolver.setText(" Menú");
    }//GEN-LAST:event_btnVolver3MouseEntered

    private void btnVolver3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver3MouseExited
        labelvolver.setBounds(20, 53, 49, 17);
        labelvolver.setText("");
    }//GEN-LAST:event_btnVolver3MouseExited

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        contenido3.removeAll();
        tema h = new tema(user);//Una instancia
        h.setSize(800, 496);
        h.setLocation(0, 0);
        h.setOpaque(false);

        contenido3.add(h);
        contenido3.revalidate();
        contenido3.repaint();
    }//GEN-LAST:event_btnVolver3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MEDIUM;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JPanel contenido3;
    private javax.swing.JButton hardplanetas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelvolver;
    // End of variables declaration//GEN-END:variables
}
