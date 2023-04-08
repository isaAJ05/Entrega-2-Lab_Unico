
public class SeleccionNavePanel extends javax.swing.JPanel {

    public SeleccionNavePanel() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AzulcBTN = new javax.swing.JButton();
        NaranjacBTN = new javax.swing.JButton();
        VerdecBTN = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AzulcBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/axullcarro.png"))); // NOI18N
        AzulcBTN.setBorderPainted(false);
        AzulcBTN.setContentAreaFilled(false);
        AzulcBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AzulcBTN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AzulcBTNFocusGained(evt);
            }
        });
        add(AzulcBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 190, 120));

        NaranjacBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/naranjacarro.png"))); // NOI18N
        NaranjacBTN.setBorderPainted(false);
        NaranjacBTN.setContentAreaFilled(false);
        NaranjacBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NaranjacBTN.setFocusPainted(false);
        NaranjacBTN.setFocusable(false);
        NaranjacBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaranjacBTNActionPerformed(evt);
            }
        });
        add(NaranjacBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 190, 120));

        VerdecBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdecarro (2)_1.png"))); // NOI18N
        VerdecBTN.setBorderPainted(false);
        VerdecBTN.setContentAreaFilled(false);
        add(VerdecBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 190, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void NaranjacBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaranjacBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NaranjacBTNActionPerformed

    private void AzulcBTNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AzulcBTNFocusGained
        AzulcBTN.setText("hiiiiiiiii");
    }//GEN-LAST:event_AzulcBTNFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AzulcBTN;
    private javax.swing.JButton NaranjacBTN;
    private javax.swing.JButton VerdecBTN;
    // End of variables declaration//GEN-END:variables
}
