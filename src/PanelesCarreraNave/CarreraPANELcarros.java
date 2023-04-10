package PanelesCarreraNave;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CarreraPANELcarros extends javax.swing.JPanel {

    public CarreraPANELcarros(int[][] espaciopista) {
        initComponents();
        this.setFocusable(true);
        this.requestFocusInWindow();

        addKeyListener(new KeyListener() { //EVENTOS DEL TECLADO 

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        });

    }

    public CarreraPANELcarros() {
        initComponents();
        this.setFocusable(true);
        this.requestFocusInWindow();

    }

    // Tomaremos primero a la nave azul como la nave del ususurio, mas adelante se habilitara la opcion de escoger. 
    //FICHAS Y NAVES
    public JLabel getAutoAzul() {  //Para el label que tiene el carro azul
        return AZULc;
    }

    public JLabel getAutoNaranja() { //Para el label que tiene el carro naranja
        return NARANJAc;
    }

    public JLabel getAutoVerde() { //Para el label que tiene el carro verde
        return VERDEc;
    }

    public JLabel getLineaMeta() {
        return Fin;
    }
    
    private int fila = 0, columna = 0; //Contadores
    private final int limiteF = 20, limiteC = 14; //Limites de la matriz
    private int casilla=50;//Lo que medira nuestras casillas imaginarias de la matriz

    private int[][] espaciopista;
    //Creacion de la matriz de la pista
    //Pista donde los carros se moveran de 19x12, se rellenara con ceros y unos

    public int[][] Hacerespaciopista() {
        int F = 0, C = 0;
        int espaciopista[][] = new int[100][100];
        for (F = 0; F < limiteF; F++) {
            for (C = 0; C < limiteC; C++) {
                if (F == limiteF - 1 || F == 0 || C == limiteC - 1 || C == 0) {
                    espaciopista[F][C] = 1; //Bordes de la pista
                } else {
                    if ((F >= 1 | F < limiteF - 2) & C == limiteC - 2) {
                        espaciopista[F][C] = 2; //Linea de meta
                    } else {
                        espaciopista[F][C] = 0; //Espacio donde los carritos se moveran 
                    }
                }
            }
        }
        return espaciopista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InicioBTN = new javax.swing.JButton();
        Mensajito = new javax.swing.JLabel();
        VERDEc = new javax.swing.JLabel();
        Fin = new javax.swing.JLabel();
        NARANJAc = new javax.swing.JLabel();
        AZULc = new javax.swing.JLabel();
        pistafondo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(0, 0, 0)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(780, 370));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioBTN.setText("Comenzar!");
        InicioBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioBTNActionPerformed(evt);
            }
        });
        add(InicioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 50));

        Mensajito.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        Mensajito.setForeground(new java.awt.Color(204, 204, 255));
        add(Mensajito, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 180, 60));

        VERDEc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/verdecarro (2).png"))); // NOI18N
        add(VERDEc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 70));
        add(Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 40, 340));

        NARANJAc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/naranjacarro_1.png"))); // NOI18N
        add(NARANJAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, 70));

        AZULc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/axullcarro (1).png"))); // NOI18N
        AZULc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AZULcKeyPressed(evt);
            }
        });
        add(AZULc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 140, -1));

        pistafondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGcars/fondoPistaSinFOndo.png"))); // NOI18N
        add(pistafondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 780, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void InicioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioBTNActionPerformed
        InicioBTN.setVisible(false);

        //Primero la ubicacion de inicio para todas las naves
        AZULc.setLocation(0, AZULc.getLocation().y);
        NARANJAc.setLocation(0, NARANJAc.getLocation().y);
        VERDEc.setLocation(0, VERDEc.getLocation().y);
        
        AZULc.requestFocus(); //CENTRAR EL MOVIMIENTO CON TECLAS A LA NAVE DEL USUARIO
    }//GEN-LAST:event_InicioBTNActionPerformed


    private void AZULcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AZULcKeyPressed
        int x = AZULc.getX(), y = AZULc.getY();
        int[][]espaciopista = null;
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_RIGHT: //DERECHA
                Mensajito.setText("");
                if(espaciopista[y/20][(x/20)+1]!=1){
                     AZULc.setLocation(x + 20, y);
                }
                break;
            case KeyEvent.VK_UP: //ARRIBA
                Mensajito.setText("");
                AZULc.setLocation(x, y - 20);
                break;
            case KeyEvent.VK_DOWN: //ABAJO
                Mensajito.setText("");
                if(espaciopista[1+(y/20)][x/20]!=1){
                    AZULc.setLocation(x, y + 20);
                }
                break;
            case KeyEvent.VK_LEFT: //Izquierda
                Mensajito.setText(" No puedes retroceder !");
                break;

        }


    }//GEN-LAST:event_AZULcKeyPressed

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AZULc;
    private javax.swing.JLabel Fin;
    private javax.swing.JButton InicioBTN;
    private javax.swing.JLabel Mensajito;
    private javax.swing.JLabel NARANJAc;
    private javax.swing.JLabel VERDEc;
    private javax.swing.JLabel pistafondo;
    // End of variables declaration//GEN-END:variables

}
