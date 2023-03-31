

import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class dificultad extends javax.swing.JFrame {
    
    /**
     * Creates new form dificultad
     */
    private String user = null;
    public dificultad(String name) {
        initComponents();
        this.user = name;
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        MEDIUM = new javax.swing.JButton();
        hardplanetas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONE LA DIFICULTAD DE JUEGO");

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 255));
        jButton1.setText("Easy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MEDIUM.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        MEDIUM.setForeground(new java.awt.Color(255, 153, 255));
        MEDIUM.setText("Medium");
        MEDIUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDIUMActionPerformed(evt);
            }
        });

        hardplanetas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        hardplanetas.setForeground(new java.awt.Color(255, 153, 255));
        hardplanetas.setText("Hard");
        hardplanetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardplanetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MEDIUM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hardplanetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(167, 167, 167))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(MEDIUM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hardplanetas)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hardplanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardplanetasActionPerformed
        this.setVisible(false); //Se volvera invisible o se cerrara
        JOptionPane.showMessageDialog(null, "𝐅𝐔𝐍𝐂𝐈𝐎𝐍𝐀𝐌𝐈𝐄𝐍𝐓𝐎 𝐃𝐄𝐋 𝐉𝐔𝐄𝐆𝐎:\nEste nivel está compuesto por una sopa de letras de dimensiones 8x8 donde encontrarás 6 palabras ocultas"
                                                +"\nrelacionadas a nombres de planetas del sistema solar."
                                                +"\nAl lado derecho de la pantalla visualizarás la lista de palabras que debes buscar."
                                                +"\n𝐏𝐚𝐫𝐚 𝐣𝐮𝐠𝐚𝐫: "
                                                +"\n  ⭐Busca las letras de las palabras en cualquier dirección: horizontal, vertical o diagonal, en sentido normal"
                                                +"\n     o inverso."
                                                + "\n  ⭐Una vez que encuentres una letra de una palabra, selecciona la letra inicial y ultima"
                                                +"\n      para que el sistema verifique tu elección.\n"
                                                + "  ⭐Si tu selección es correcta se cambiará el fondo de la palabra en la sopa de letras y aparecerá "
                                                +"\n      una estrella al lado de la palabra de la lista.\n"
                                                + "  ⭐Continúa buscando hasta que hayas encontrado todas las palabras de la lista."
                                                + "\n\n𝐏𝐋𝐔𝐒: Tienes disponible solo 4 PISTAS o puedes revelar la solución de la sopa de letras al seleccionar dicha opción."
                                                + "\n\n                             ¡𝗗𝗜𝗩𝗜𝗘𝗥𝗧𝗘𝗧𝗘 𝗝𝗨𝗚𝗔𝗡𝗗𝗢 𝗟𝗔 𝗦𝗢𝗣𝗔 𝗗𝗘 𝗟𝗘𝗧𝗥𝗔𝗦 𝗦𝗧𝗔𝗥: 𝗩𝗘𝗥𝗦𝗜𝗢𝗡 𝗣𝗟𝗔𝗡𝗘𝗧𝗔𝗦!", "STAR GAMES: Sopa de letras STAR", JOptionPane.INFORMATION_MESSAGE);
        sopaplanetashard hola4 = new sopaplanetashard(user);//Una instancia
        hola4.setVisible(true);//Se abre uno nuevo
        
    }//GEN-LAST:event_hardplanetasActionPerformed

    private void MEDIUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDIUMActionPerformed
        this.setVisible(false); //Se volvera invisible o se cerrara
        JOptionPane.showMessageDialog(null, "𝐅𝐔𝐍𝐂𝐈𝐎𝐍𝐀𝐌𝐈𝐄𝐍𝐓𝐎 𝐃𝐄𝐋 𝐉𝐔𝐄𝐆𝐎:\nEste nivel está compuesto por una sopa de letras de dimensiones 8x6 donde encontrarás 4 palabras ocultas"
                                                +"\nrelacionadas a nombres de planetas del sistema solar."
                                                +"\nAl lado derecho de la pantalla visualizarás la lista de palabras que debes buscar."
                                                +"\n𝐏𝐚𝐫𝐚 𝐣𝐮𝐠𝐚𝐫: "
                                                +"\n  ⭐Busca las letras de las palabras en cualquier dirección: horizontal, vertical o diagonal, en sentido normal"
                                                +"\n     o inverso."
                                              + "\n  ⭐Una vez que encuentres una letra de una palabra, selecciona la letra inicial y ultima"
                                                +"\n      para que el sistema verifique tu elección.\n"
                                                + "  ⭐Si tu selección es correcta se cambiará el fondo de la palabra en la sopa de letras y aparecerá "
                                                +"\n      una estrella al lado de la palabra de la lista.\n"
                                                + "  ⭐Continúa buscando hasta que hayas encontrado todas las palabras de la lista."
                                                + "\n\n𝐏𝐋𝐔𝐒: Si lo deseas puedes pedir pistas o revelar la solución de la sopa de letras al seleccionar dichas opciones. "
                                                + "\n\n                             ¡𝗗𝗜𝗩𝗜𝗘𝗥𝗧𝗘𝗧𝗘 𝗝𝗨𝗚𝗔𝗡𝗗𝗢 𝗟𝗔 𝗦𝗢𝗣𝗔 𝗗𝗘 𝗟𝗘𝗧𝗥𝗔𝗦 𝗦𝗧𝗔𝗥: 𝗩𝗘𝗥𝗦𝗜𝗢𝗡 𝗣𝗟𝗔𝗡𝗘𝗧𝗔𝗦!", "STAR GAMES: Sopa de letras STAR", JOptionPane.INFORMATION_MESSAGE);
        sopaplanetasmedium hola5 = new sopaplanetasmedium(user);//Una instancia
        hola5.setVisible(true);//Se abre uno nuevo
    }//GEN-LAST:event_MEDIUMActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false); //Se volvera invisible o se cerrara
        JOptionPane.showMessageDialog(null, "𝐅𝐔𝐍𝐂𝐈𝐎𝐍𝐀𝐌𝐈𝐄𝐍𝐓𝐎 𝐃𝐄𝐋 𝐉𝐔𝐄𝐆𝐎:\nEste nivel está compuesto por una sopa de letras de dimensiones 7x5 donde encontrarás 3 palabras ocultas"
                                                +"\nrelacionadas a nombres de planetas del sistema solar."
                                                +"\nAl lado derecho de la pantalla visualizarás la lista de palabras que debes buscar."
                                                +"\n𝐏𝐚𝐫𝐚 𝐣𝐮𝐠𝐚𝐫: "
                                                +"\n  ⭐Busca las letras de las palabras en cualquier dirección: horizontal, vertical o diagonal, en sentido normal"
                                                +"\n     o inverso."
                                                + "\n  ⭐Una vez que encuentres una letra de una palabra, selecciona la letra inicial y ultima"
                                                +"\n      para que el sistema verifique tu elección.\n"
                                                + "  ⭐Si tu selección es correcta se cambiará el fondo de la palabra en la sopa de letras y aparecerá "
                                                +"\n      una estrella al lado de la palabra de la lista.\n"
                                                + "  ⭐Continúa buscando hasta que hayas encontrado todas las palabras de la lista."
                                                + "\n\n𝐏𝐋𝐔𝐒: Si lo deseas puedes pedir pistas o revelar la solución de la sopa de letras al seleccionar dichas opciones."
                                                + "\n\n                             ¡𝗗𝗜𝗩𝗜𝗘𝗥𝗧𝗘𝗧𝗘 𝗝𝗨𝗚𝗔𝗡𝗗𝗢 𝗟𝗔 𝗦𝗢𝗣𝗔 𝗗𝗘 𝗟𝗘𝗧𝗥𝗔𝗦 𝗦𝗧𝗔𝗥: 𝗩𝗘𝗥𝗦𝗜𝗢𝗡 𝗣𝗟𝗔𝗡𝗘𝗧𝗔𝗦!", "STAR GAMES: Sopa de letras STAR", JOptionPane.INFORMATION_MESSAGE);
        sopaplanetaseasy hola6 = new sopaplanetaseasy(user);//Una instancia
        hola6.setVisible(true);//Se abre uno nuevo
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(dificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dificultad(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MEDIUM;
    private javax.swing.JButton hardplanetas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void addActionListener(dificultad aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
