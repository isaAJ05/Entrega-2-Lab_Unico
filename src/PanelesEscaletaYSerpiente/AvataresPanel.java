
package PanelesEscaletaYSerpiente;

public class AvataresPanel extends javax.swing.JPanel {

    public AvataresPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ArojoBTN = new javax.swing.JButton();
        AmoradoBTN = new javax.swing.JButton();
        AverdeBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        ArojoBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienRojo.png"))); // NOI18N
        ArojoBTN.setBorderPainted(false);
        ArojoBTN.setContentAreaFilled(false);
        ArojoBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ArojoBTN.setFocusPainted(false);
        ArojoBTN.setFocusable(false);

        AmoradoBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienMorado (1).png"))); // NOI18N
        AmoradoBTN.setBorderPainted(false);
        AmoradoBTN.setContentAreaFilled(false);
        AmoradoBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AmoradoBTN.setFocusPainted(false);
        AmoradoBTN.setFocusable(false);
        AmoradoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmoradoBTNActionPerformed(evt);
            }
        });

        AverdeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGescaleraSerp/AlienVerde.png"))); // NOI18N
        AverdeBTN.setBorderPainted(false);
        AverdeBTN.setContentAreaFilled(false);
        AverdeBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AverdeBTN.setFocusPainted(false);
        AverdeBTN.setFocusable(false);
        AverdeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AverdeBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(ArojoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(AverdeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(AmoradoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AverdeBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ArojoBTN)
                    .addComponent(AmoradoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AmoradoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmoradoBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmoradoBTNActionPerformed

    private void AverdeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AverdeBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AverdeBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmoradoBTN;
    private javax.swing.JButton ArojoBTN;
    private javax.swing.JButton AverdeBTN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
