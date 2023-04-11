
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
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        contenido3Layout.setVerticalGroup(
            contenido3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(jButton1)
                .addGap(67, 67, 67)
                .addComponent(MEDIUM)
                .addGap(73, 73, 73)
                .addComponent(hardplanetas)
                .addContainerGap(117, Short.MAX_VALUE))
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
        /**instruccionesep i = new instruccionesep();
        JDialog dialog = new JDialog();
        dialog.setContentPane(i);

        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.pack();
        dialog.setLocationRelativeTo(null); // Establece la posición relativa en el centro de la pantalla
        dialog.setVisible(true);
        //contenido3.add(i, BorderLayout.CENTER);
        */easymusica e = new easymusica(user);//Una instancia
        e.setSize(800, 496);
        e.setLocation(0, 0);
        e.setOpaque(false);
        contenido3.add(e);
        contenido3.revalidate();
        contenido3.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MEDIUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDIUMActionPerformed
        contenido3.removeAll();
        JOptionPane.showMessageDialog(null, "𝐅𝐔𝐍𝐂𝐈𝐎𝐍𝐀𝐌𝐈𝐄𝐍𝐓𝐎 𝐃𝐄𝐋 𝐉𝐔𝐄𝐆𝐎:\nEste nivel está compuesto por una sopa de letras de dimensiones 8x6 donde encontrarás 4 palabras ocultas"
                + "\nrelacionadas a nombres de planetas del sistema solar."
                + "\nAl lado derecho de la pantalla visualizarás la lista de palabras que debes buscar."
                + "\n𝐏𝐚𝐫𝐚 𝐣𝐮𝐠𝐚𝐫: "
                + "\n  ⭐Busca las letras de las palabras en cualquier dirección: horizontal, vertical o diagonal, en sentido normal"
                + "\n     o inverso."
                + "\n  ⭐Una vez que encuentres una letra de una palabra, selecciona la letra inicial y ultima"
                + "\n      para que el sistema verifique tu elección.\n"
                + "  ⭐Si tu selección es correcta se cambiará el fondo de la palabra en la sopa de letras y aparecerá "
                + "\n      una estrella al lado de la palabra de la lista.\n"
                + "  ⭐Continúa buscando hasta que hayas encontrado todas las palabras de la lista."
                + "\n\n𝐏𝐋𝐔𝐒: Si lo deseas puedes pedir pistas o revelar la solución de la sopa de letras al seleccionar dichas opciones. "
                + "\n\n                             ¡𝗗𝗜𝗩𝗜𝗘𝗥𝗧𝗘𝗧𝗘 𝗝𝗨𝗚𝗔𝗡𝗗𝗢 𝗟𝗔 𝗦𝗢𝗣𝗔 𝗗𝗘 𝗟𝗘𝗧𝗥𝗔𝗦 𝗦𝗧𝗔𝗥: 𝗩𝗘𝗥𝗦𝗜𝗢𝗡 𝗣𝗟𝗔𝗡𝗘𝗧𝗔𝗦!", "STAR GAMES: Sopa de letras STAR", JOptionPane.INFORMATION_MESSAGE);
        mediummusica m = new mediummusica(user);//Una instancia
        m.setSize(800, 496);
        m.setLocation(0, 0);
        m.setOpaque(false);

        contenido3.add(m);
        contenido3.revalidate();
        contenido3.repaint();
    }//GEN-LAST:event_MEDIUMActionPerformed

    private void hardplanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardplanetasActionPerformed
        contenido3.removeAll();
        JOptionPane.showMessageDialog(null, "𝐅𝐔𝐍𝐂𝐈𝐎𝐍𝐀𝐌𝐈𝐄𝐍𝐓𝐎 𝐃𝐄𝐋 𝐉𝐔𝐄𝐆𝐎:\nEste nivel está compuesto por una sopa de letras de dimensiones 8x8 donde encontrarás 6 palabras ocultas"
                + "\nrelacionadas a nombres de planetas del sistema solar."
                + "\nAl lado derecho de la pantalla visualizarás la lista de palabras que debes buscar."
                + "\n𝐏𝐚𝐫𝐚 𝐣𝐮𝐠𝐚𝐫: "
                + "\n  ⭐Busca las letras de las palabras en cualquier dirección: horizontal, vertical o diagonal, en sentido normal"
                + "\n     o inverso."
                + "\n  ⭐Una vez que encuentres una letra de una palabra, selecciona la letra inicial y ultima"
                + "\n      para que el sistema verifique tu elección.\n"
                + "  ⭐Si tu selección es correcta se cambiará el fondo de la palabra en la sopa de letras y aparecerá "
                + "\n      una estrella al lado de la palabra de la lista.\n"
                + "  ⭐Continúa buscando hasta que hayas encontrado todas las palabras de la lista."
                + "\n\n𝐏𝐋𝐔𝐒: Tienes disponible solo 4 PISTAS o puedes revelar la solución de la sopa de letras al seleccionar dicha opción."
                + "\n\n                             ¡𝗗𝗜𝗩𝗜𝗘𝗥𝗧𝗘𝗧𝗘 𝗝𝗨𝗚𝗔𝗡𝗗𝗢 𝗟𝗔 𝗦𝗢𝗣𝗔 𝗗𝗘 𝗟𝗘𝗧𝗥𝗔𝗦 𝗦𝗧𝗔𝗥: 𝗩𝗘𝗥𝗦𝗜𝗢𝗡 𝗣𝗟𝗔𝗡𝗘𝗧𝗔𝗦!", "STAR GAMES: Sopa de letras STAR", JOptionPane.INFORMATION_MESSAGE);
        hardmusica h = new hardmusica(user);//Una instancia
        h.setSize(800, 496);
        h.setLocation(0, 0);
        h.setOpaque(false);

        contenido3.add(h);
        contenido3.revalidate();
        contenido3.repaint();
    }//GEN-LAST:event_hardplanetasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MEDIUM;
    private javax.swing.JPanel contenido3;
    private javax.swing.JButton hardplanetas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
