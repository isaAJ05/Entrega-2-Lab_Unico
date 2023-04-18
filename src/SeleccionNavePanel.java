
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class SeleccionNavePanel extends javax.swing.JPanel {

    public SeleccionNavePanel() {
        Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon(getClass().getResource("cursor/cursorimg.png")).getImage(),new Point(0,0),"Custom Cursor");
        this.setCursor(cursor);
        initComponents();
    }

   boolean OP,OPA=false,OPV=false,OPN=false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AzulcBTN = new javax.swing.JButton();
        NaranjacBTN = new javax.swing.JButton();
        VerdecBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        labelvolver = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/Check.png"))); // NOI18N
        jLabel2.setEnabled(false);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 90, 40));

        jLabel1.setEnabled(false);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/Check.png"))); // NOI18N
        jLabel3.setEnabled(false);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 40, 40));

        AzulcBTN.setBackground(new java.awt.Color(52, 52, 121));
        AzulcBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/axullcarro.png"))); // NOI18N
        AzulcBTN.setBorder(null);
        AzulcBTN.setBorderPainted(false);
        AzulcBTN.setContentAreaFilled(false);
        AzulcBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AzulcBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/axullcarro25menos.png"))); // NOI18N
        AzulcBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/azulselected.png"))); // NOI18N
        AzulcBTN.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/azulselected.png"))); // NOI18N
        AzulcBTN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/azulselected.png"))); // NOI18N
        AzulcBTN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AzulcBTNFocusGained(evt);
            }
        });
        AzulcBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulcBTNActionPerformed(evt);
            }
        });
        add(AzulcBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 230, 160));

        NaranjacBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/naranjacarro.png"))); // NOI18N
        NaranjacBTN.setBorderPainted(false);
        NaranjacBTN.setContentAreaFilled(false);
        NaranjacBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NaranjacBTN.setFocusPainted(false);
        NaranjacBTN.setFocusable(false);
        NaranjacBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/naranjacarro25menos.png"))); // NOI18N
        NaranjacBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/narajaselected.png"))); // NOI18N
        NaranjacBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaranjacBTNActionPerformed(evt);
            }
        });
        add(NaranjacBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, 160));

        VerdecBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdecarro (2)_1.png"))); // NOI18N
        VerdecBTN.setBorderPainted(false);
        VerdecBTN.setContentAreaFilled(false);
        VerdecBTN.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdecarro25menos).png"))); // NOI18N
        VerdecBTN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdeselectes.png"))); // NOI18N
        VerdecBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdecBTNActionPerformed(evt);
            }
        });
        add(VerdecBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 210, 150));

        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("En proceso la habilitacion para poder seleccionar nave. Por favor siga con la carrera.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 470, -1));

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));
        labelvolver.setText("jLabel1");
        add(labelvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

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
        add(btnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private Image imagen;
    private void Eleccion(boolean OP){
        if(NaranjacBTN.isSelected()){
             OPN=true;
             OPA=false;
             OPV=false;
        }else if( AzulcBTN.isSelected()){
             OPA=true;
             OPN=false;
             OPV=false;
        }else if(VerdecBTN.isSelected()){
            OPV=true;
            OPA=false;
            OPN=false;
            
        }
    }
    
    
    private void NaranjacBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaranjacBTNActionPerformed
       Eleccion(OP);
       
    }//GEN-LAST:event_NaranjacBTNActionPerformed

    private void AzulcBTNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AzulcBTNFocusGained
    
    }//GEN-LAST:event_AzulcBTNFocusGained

    private void AzulcBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulcBTNActionPerformed
      Eleccion(OP);
    }//GEN-LAST:event_AzulcBTNActionPerformed

    private void VerdecBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdecBTNActionPerformed
        Eleccion(OP);
    }//GEN-LAST:event_VerdecBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AzulcBTN;
    private javax.swing.JButton NaranjacBTN;
    private javax.swing.JButton VerdecBTN;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelvolver;
    // End of variables declaration//GEN-END:variables
}
