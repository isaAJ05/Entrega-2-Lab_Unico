/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelesSP;

/**
 *
 * @author USUARIO
 */
public class tema extends javax.swing.JPanel {

    /**
     * Creates new form Fondo
     */
     private String user = null;
    public tema(String name) {
        initComponents();
         this.user = name;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonplanetas = new javax.swing.JButton();

        contenido2.setBackground(new java.awt.Color(102, 102, 255));
        contenido2.setOpaque(false);
        contenido2.setPreferredSize(new java.awt.Dimension(800, 496));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
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

        javax.swing.GroupLayout contenido2Layout = new javax.swing.GroupLayout(contenido2);
        contenido2.setLayout(contenido2Layout);
        contenido2Layout.setHorizontalGroup(
            contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido2Layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addGroup(contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido2Layout.createSequentialGroup()
                        .addComponent(botonplanetas)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42))))
        );
        contenido2Layout.setVerticalGroup(
            contenido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(botonplanetas)
                .addContainerGap(202, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonplanetas;
    private javax.swing.JPanel contenido2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
