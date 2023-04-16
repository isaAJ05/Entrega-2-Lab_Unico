
package PanelesSP;

public class inicio extends javax.swing.JPanel {

    private String user = null;
    public inicio(String name) {
        initComponents();
        this.user = name;
    }

    public inicio() { //Constructor
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botoncomenzar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("STAR GAMES");

        botoncomenzar.setBackground(new java.awt.Color(255, 153, 255));
        botoncomenzar.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        botoncomenzar.setForeground(new java.awt.Color(0, 0, 51));
        botoncomenzar.setText("¡COMENCEMOS!");
        botoncomenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoncomenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncomenzarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("!BIENVENIDX AL JUEGO DE SOPA DE LETRAS MÁS GENIAL DE LA GALAXIA!");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Estás listx para poner a prueba tus habilidades para encontrar palabras?");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("mundo lleno de diversión y aventura mientras buscas las palabras ocultas");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("La sopa de letras STAR ofrece una amplia variedad de temas y dificultad, que hará sumergirte en un");

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel2)
                .addContainerGap(273, Short.MAX_VALUE))
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenidoLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel4))
                        .addGroup(contenidoLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(contenidoLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel3))
                        .addGroup(contenidoLayout.createSequentialGroup()
                            .addGap(253, 253, 253)
                            .addComponent(botoncomenzar)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addContainerGap(404, Short.MAX_VALUE))
            .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenidoLayout.createSequentialGroup()
                    .addGap(0, 141, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addGap(97, 97, 97)
                    .addComponent(jLabel3)
                    .addGap(62, 62, 62)
                    .addComponent(botoncomenzar)
                    .addGap(0, 28, Short.MAX_VALUE)))
        );

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void botoncomenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncomenzarActionPerformed
        //Anthony Zabs helped :)
        tema t = new tema(user);
        t.setSize(800, 500);
        t.setLocation(0, 0);
        t.setOpaque(false);
        contenido.removeAll();
        contenido.add(t);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botoncomenzarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoncomenzar;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
