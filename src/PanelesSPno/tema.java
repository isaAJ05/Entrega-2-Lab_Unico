
package PanelesSPno;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;


public class tema extends javax.swing.JPanel {

    private String user = null;

    public tema(String name) {
        initComponents();
        this.user = name;
        //ICONOS : 
        //PLANETAS
        ImageIcon icono = new ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Lab\\src\\IMGSP\\solar transparente.gif");
        ImageIcon iconoespacio = new ImageIcon(icono.getImage().getScaledInstance(177, 184, Image.SCALE_DEFAULT));
        labelplanetas.setIcon(iconoespacio);
        //ANIME
        ImageIcon icono2 = new ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Lab\\src\\IMGSP\\narutogiftransparente.gif");
        ImageIcon icononaruto = new ImageIcon(icono2.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT));
        labelanime.setIcon(icononaruto);
        //MUSICA Tema
        ImageIcon icono3 = new ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Lab\\src\\IMGSP\\musica.gif");
        ImageIcon iconomusica = new ImageIcon(icono3.getImage().getScaledInstance(161, 200, Image.SCALE_DEFAULT));
        labelmusica.setIcon(iconomusica);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonplanetas = new javax.swing.JButton();
        botonanime = new javax.swing.JButton();
        botonanime1 = new javax.swing.JButton();
        labelmusica = new javax.swing.JLabel();
        labelplanetas = new javax.swing.JLabel();
        labelanime = new javax.swing.JLabel();

        contenido2.setBackground(new java.awt.Color(102, 102, 255));
        contenido2.setOpaque(false);
        contenido2.setPreferredSize(new java.awt.Dimension(800, 496));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONE LA TEMÁTICA DE JUEGO");

        botonplanetas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonplanetas.setForeground(new java.awt.Color(255, 153, 255));
        botonplanetas.setText("PLANETAS");
        botonplanetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonplanetasActionPerformed(evt);
            }
        });

        botonanime.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonanime.setForeground(new java.awt.Color(255, 153, 255));
        botonanime.setText("ANIME");
        botonanime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonanimeActionPerformed(evt);
            }
        });

        botonanime1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonanime1.setForeground(new java.awt.Color(255, 153, 255));
        botonanime1.setText("MÚSICA");
        botonanime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonanime1ActionPerformed(evt);
            }
        });

        labelmusica.setText("jLabel2");

        labelplanetas.setText("jLabel2");
        labelplanetas.setMaximumSize(new java.awt.Dimension(50, 50));

        labelanime.setText("jLabel2");

        javax.swing.GroupLayout contenido2Layout = new javax.swing.GroupLayout(contenido2);
        contenido2.setLayout(contenido2Layout);
        contenido2Layout.setHorizontalGroup(
            contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(labelplanetas, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(labelanime, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(botonplanetas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonanime)
                        .addGap(100, 100, 100)))
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addComponent(labelmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido2Layout.createSequentialGroup()
                        .addComponent(botonanime1)
                        .addGap(93, 93, 93))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(156, 156, 156))
        );
        contenido2Layout.setVerticalGroup(
            contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelplanetas, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelanime, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonplanetas)
                            .addComponent(botonanime)))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botonanime1)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonplanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonplanetasActionPerformed
        //Anthony Zabs helped :)
        nivel n = new nivel(user);
        n.setSize(800, 496);
        n.setLocation(0, 0);
        n.setOpaque(false);
        contenido2.removeAll();
        contenido2.add(n);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_botonplanetasActionPerformed

    private void botonanimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonanimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonanimeActionPerformed

    private void botonanime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonanime1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonanime1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonanime;
    private javax.swing.JButton botonanime1;
    private javax.swing.JButton botonplanetas;
    private javax.swing.JPanel contenido2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelanime;
    private javax.swing.JLabel labelmusica;
    private javax.swing.JLabel labelplanetas;
    // End of variables declaration//GEN-END:variables
}
