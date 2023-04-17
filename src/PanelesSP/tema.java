
package PanelesSP;

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
//    Image icono = new ImageIcon(getClass().getResource("\\IMGSP\\solar.gif")).getImage();
//       
//        ImageIcon iconoespacio = new ImageIcon(icono.getScaledInstance(200, 184, Image.SCALE_DEFAULT));
//        labelplanetas.setIcon(iconoespacio);
//        //ANIME
//        ImageIcon icono2 = new ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Lab\\src\\IMGSP\\narutogiftransparente.gif");
//        ImageIcon icononaruto = new ImageIcon(icono2.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT));
//        labelanime.setIcon(icononaruto);
//        //MUSICA
//        ImageIcon icono3 = new ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Lab\\src\\IMGSP\\musica.gif");
//        ImageIcon iconomusica = new ImageIcon(icono3.getImage().getScaledInstance(161, 200, Image.SCALE_DEFAULT));
//        labelmusica.setIcon(iconomusica);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonplanetas = new javax.swing.JButton();
        botonanime = new javax.swing.JButton();
        botonmusica = new javax.swing.JButton();
        labelmusica = new javax.swing.JLabel();
        labelplanetas = new javax.swing.JLabel();
        labelanime = new javax.swing.JLabel();

        contenido2.setBackground(new java.awt.Color(102, 102, 255));
        contenido2.setOpaque(false);
        contenido2.setPreferredSize(new java.awt.Dimension(800, 496));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("SELECCIONE LA TEMÁTICA DE JUEGO");

        botonplanetas.setBackground(new java.awt.Color(255, 153, 255));
        botonplanetas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonplanetas.setForeground(new java.awt.Color(0, 0, 51));
        botonplanetas.setText("PLANETAS");
        botonplanetas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonplanetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonplanetasActionPerformed(evt);
            }
        });

        botonanime.setBackground(new java.awt.Color(255, 153, 255));
        botonanime.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonanime.setForeground(new java.awt.Color(0, 0, 51));
        botonanime.setText("ANIME");
        botonanime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonanime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonanimeActionPerformed(evt);
            }
        });

        botonmusica.setBackground(new java.awt.Color(255, 153, 255));
        botonmusica.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botonmusica.setForeground(new java.awt.Color(0, 0, 51));
        botonmusica.setText("MÚSICA");
        botonmusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonmusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmusicaActionPerformed(evt);
            }
        });

        labelmusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGSP/musica1.gif"))); // NOI18N

        labelplanetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGSP/solar1.gif"))); // NOI18N
        labelplanetas.setMaximumSize(new java.awt.Dimension(50, 50));

        labelanime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGSP/narutogiftransparente1.gif"))); // NOI18N

        javax.swing.GroupLayout contenido2Layout = new javax.swing.GroupLayout(contenido2);
        contenido2.setLayout(contenido2Layout);
        contenido2Layout.setHorizontalGroup(
            contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(labelplanetas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelanime, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(labelmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(botonplanetas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(botonanime, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(botonmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
        );
        contenido2Layout.setVerticalGroup(
            contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelplanetas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelanime, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenido2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelmusica, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonplanetas)
                    .addComponent(botonanime)
                    .addComponent(botonmusica)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonplanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonplanetasActionPerformed
        //Anthony Zabs helped :)
        nivel n = new nivel(user);
        n.setSize(800, 500);
        n.setLocation(0, 0);
        n.setOpaque(false);
        contenido2.removeAll();
        contenido2.add(n);
        contenido2.revalidate();
        contenido2.repaint();
    }//GEN-LAST:event_botonplanetasActionPerformed

    private void botonanimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonanimeActionPerformed
 //Anthony Zabs helped :)
        nivelanime n = new nivelanime(user);
        n.setSize(800, 496);
        n.setLocation(0, 0);
        n.setOpaque(false);
        contenido2.removeAll();
        contenido2.add(n);
        contenido2.revalidate();
        contenido2.repaint();       
    }//GEN-LAST:event_botonanimeActionPerformed

    private void botonmusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmusicaActionPerformed
        nivelmusica n = new nivelmusica(user);
        n.setSize(800, 500);
        n.setLocation(0, 0);
        n.setOpaque(false);
        contenido2.removeAll();
        contenido2.add(n);
        contenido2.revalidate();
        contenido2.repaint();    
    }//GEN-LAST:event_botonmusicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonanime;
    private javax.swing.JButton botonmusica;
    private javax.swing.JButton botonplanetas;
    private javax.swing.JPanel contenido2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelanime;
    private javax.swing.JLabel labelmusica;
    private javax.swing.JLabel labelplanetas;
    // End of variables declaration//GEN-END:variables
}
