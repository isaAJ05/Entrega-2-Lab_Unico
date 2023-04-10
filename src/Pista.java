
import PanelesCarreraNave.InfoCarrerasPanel;
import PanelesCarreraNave.CarreraPANELcarros;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pista extends javax.swing.JFrame {

//    FondoPanel fondo=new FondoPanel();
    private String user;

    public Pista(String name) {
        this.user = name;

        initComponents();

        this.setLocationRelativeTo(null);//centrar ventana
        this.setTitle(" Carrera de Autos Espaciales"); //Titulo 
        
        SeleccionNavePanel NavePanel=new SeleccionNavePanel();
        ShowPanel(NavePanel);   
        
        CarreraPANELcarros Cpanel=new CarreraPANELcarros();
        add(Cpanel);

    }
    private void ShowPanel(JPanel p){ //Cambio de paneles metodo
        p.setSize(780,370);
        p.setLocation(0, 0);
        visible2.removeAll();
        visible2.add(p, BorderLayout.CENTER);
        visible2.revalidate();
        visible2.repaint();
    }
    
    
    

    //Pista donde los carros se moveran de 19x12, se rellenara con ceros y unos
    public static int espaciopista[][];
    public static int limiteF = 20, limiteC = 14, F;
    int Auto=0;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Visible = new javax.swing.JPanel();
        InfoBTN = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SelectNAVEbtn = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        visible2 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Visible.setBackground(new java.awt.Color(0, 0, 51));
        Visible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InfoBTN.setBackground(new java.awt.Color(153, 153, 255));
        InfoBTN.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        InfoBTN.setForeground(new java.awt.Color(51, 51, 51));
        InfoBTN.setText("Info");
        InfoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoBTNActionPerformed(evt);
            }
        });
        Visible.add(InfoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, -1, -1));

        btnVolver.setBackground(new java.awt.Color(153, 153, 255));
        btnVolver.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(51, 51, 51));
        btnVolver.setText("Volver ←");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        Visible.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("STAR GAMES");
        Visible.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 150, 30));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("CARRERA DE AUTOS ESPACIALES");
        Visible.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 563, 60));

        SelectNAVEbtn.setBackground(new java.awt.Color(153, 153, 255));
        SelectNAVEbtn.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        SelectNAVEbtn.setForeground(new java.awt.Color(51, 51, 51));
        SelectNAVEbtn.setText("Naves");
        SelectNAVEbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectNAVEbtnActionPerformed(evt);
            }
        });
        Visible.add(SelectNAVEbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        btnStart.setBackground(new java.awt.Color(153, 153, 255));
        btnStart.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnStart.setForeground(new java.awt.Color(51, 51, 51));
        btnStart.setText("Carrera");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        Visible.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        visible2.setBackground(new java.awt.Color(0, 0, 51));
        visible2.setEnabled(false);
        visible2.setOpaque(false);

        javax.swing.GroupLayout visible2Layout = new javax.swing.GroupLayout(visible2);
        visible2.setLayout(visible2Layout);
        visible2Layout.setHorizontalGroup(
            visible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        visible2Layout.setVerticalGroup(
            visible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        Visible.add(visible2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 370));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/fondoespacio(3) (1).png"))); // NOI18N
        Visible.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Visible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Visible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
       CarreraPANELcarros Cpanel=new CarreraPANELcarros();
       ShowPanel(Cpanel); //Llamar el metodo para mostrar el panel 
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal3 a = new Principal3(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void InfoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoBTNActionPerformed
        InfoCarrerasPanel InfoPANEL=new InfoCarrerasPanel();
        ShowPanel(InfoPANEL);//Llamar el metodo para mostrar el panel 
    }//GEN-LAST:event_InfoBTNActionPerformed

    private void SelectNAVEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectNAVEbtnActionPerformed
         SeleccionNavePanel NavePanel=new SeleccionNavePanel();
        ShowPanel(NavePanel);//Llamar el metodo para mostrar el panel 
    }//GEN-LAST:event_SelectNAVEbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pista(null).setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoBTN;
    private javax.swing.JButton SelectNAVEbtn;
    private javax.swing.JPanel Visible;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel visible2;
    // End of variables declaration//GEN-END:variables

//    class FondoPanel extends JPanel{
//        private Image imagen;
//        
//        @Override
//        public void paint(Graphics g){
//            imagen=new ImageIcon(getClass().getResource("\\IMGcars\\fondoespacio(3)(1).png")).getImage();
//            
//            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
//            setOpaque(false);
//            
//            super.paint(g);
//        }
//    }
}
