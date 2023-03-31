
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Dimension;
/**
 *
 * @author Paula Núñez, Isabella Arrieta y Natalia Carpintero
 */
public class Mesa1 extends javax.swing.JFrame {
private String user;
    public Mesa1(String name) {
         
        this.user = name;
        initComponents();
        this.setLocationRelativeTo(null);
       //
    }
     public void paint(Graphics gr) {
        super.paint(gr);
        Graphics u = jPanel1.getGraphics();
        Font f = new Font("Berlin Sans FB Demi",Font.PLAIN,35);
        u.setFont(f);
        u.setColor(new Color(102,255,153));
        u.drawString("Dealer", 20, 55);
        u.setColor(new Color(51,255,204));
        u.drawString(user, 20, 290);
     }
    int as = 11; //Variable as que puede cambiar dependiendo de la situción
    //Creacion de matriz 2 Barajas
    int baraja[][] = {
        //Cartas rojas [0-3]
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Corazones     
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Picas
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Treboles
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, // Diamantes

        //Cartas azules [4-7]
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10},//Corazones 
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10},//Picas
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}, //Treboles
        {as, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}};// Diamantes

    //Filas = tipo de carta
    int n = 8, m = 13;
    int C = n * m; //Numero de cartas por cajara ( fila x columnas -> 8 x 13)
    int cont = 0;
    //Vector de las dos barajas usando las filas de la matriz como referencia
    String Ccolor[] = {"r", "r", "r", "r", "n", "n", "n", "n"};

    //Corazones = fila 0 y 4
    //Picas= fila 1 y 5
    //Treboles = fila 2 y 6
    //Diamantes = fila 3 y 7
    boolean repartir = false, ganador = false;
    Random ran = new Random();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SumCartasUs = new javax.swing.JLabel();
        C2DE = new javax.swing.JLabel();
        C1DE = new javax.swing.JLabel();
        C1US = new javax.swing.JLabel();
        C2US = new javax.swing.JLabel();
        SumCartasDE = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Repartir = new javax.swing.JButton();
        Pedir1Carta = new javax.swing.JButton();
        ConteoCartas = new javax.swing.JLabel();
        Parar = new javax.swing.JButton();
        Doble = new javax.swing.JButton();
        Slipt = new javax.swing.JButton();
        AjustesBlackJack = new javax.swing.JButton();
        valdRepartir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AjustesBlackJack1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 39, 38));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(49, 79, 67));
        jPanel1.setEnabled(false);

        SumCartasUs.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        C2DE.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N

        C1US.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N

        C2US.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N

        SumCartasDE.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(C1US, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(C2US, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(C2DE, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SumCartasUs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SumCartasDE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(C1DE, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(628, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(C2US, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(C1DE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(256, 256, 256))
                                .addComponent(SumCartasUs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(375, 375, 375)
                            .addComponent(C1US, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(C2DE, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(SumCartasDE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(107, 138, 91));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel2.setText("Cartas");

        Repartir.setBackground(new java.awt.Color(0, 102, 51));
        Repartir.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Repartir.setText("Repartir");
        Repartir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Repartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepartirActionPerformed(evt);
            }
        });

        Pedir1Carta.setBackground(new java.awt.Color(96, 211, 98));
        Pedir1Carta.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Pedir1Carta.setText("Pedir Carta");
        Pedir1Carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pedir1CartaActionPerformed(evt);
            }
        });

        ConteoCartas.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        ConteoCartas.setText("104");

        Parar.setBackground(new java.awt.Color(102, 255, 153));
        Parar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Parar.setText("Parar");
        Parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararActionPerformed(evt);
            }
        });

        Doble.setBackground(new java.awt.Color(102, 255, 153));
        Doble.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Doble.setText("Doble (+2)");

        Slipt.setBackground(new java.awt.Color(102, 255, 153));
        Slipt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Slipt.setText("Separar");
        Slipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SliptActionPerformed(evt);
            }
        });

        AjustesBlackJack.setBackground(new java.awt.Color(102, 255, 153));
        AjustesBlackJack.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AjustesBlackJack.setText("Ajustes");
        AjustesBlackJack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjustesBlackJackActionPerformed(evt);
            }
        });

        valdRepartir.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Engravers MT", 1, 29)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("STAR GAMES");

        AjustesBlackJack1.setBackground(new java.awt.Color(102, 255, 153));
        AjustesBlackJack1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AjustesBlackJack1.setText("Volver ←");
        AjustesBlackJack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjustesBlackJack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Pedir1Carta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Doble))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Parar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Slipt)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(valdRepartir, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Repartir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ConteoCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(AjustesBlackJack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(176, Short.MAX_VALUE)
                    .addComponent(AjustesBlackJack1)
                    .addGap(14, 14, 14)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConteoCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(Repartir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(valdRepartir, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pedir1Carta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doble, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Parar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Slipt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(jLabel4)
                .addGap(83, 83, 83)
                .addComponent(AjustesBlackJack)
                .addGap(44, 44, 44))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(439, Short.MAX_VALUE)
                    .addComponent(AjustesBlackJack1)
                    .addGap(45, 45, 45)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararActionPerformed

    }//GEN-LAST:event_PararActionPerformed
    int a = 0;
    private void RepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepartirActionPerformed
        if (a == 0) {
            Graphics g = jPanel1.getGraphics();
           
            repartir = true;
            Pedir1Carta.setVisible(false);

            //Usuario Cartas Iniales
            int CartaUs1 = 0, CartaUs2 = 0, Sum0Us;
            String clr, cB1 = "r", cB2 = "n";
            int dib = 0, type1U=0,type2U=0;
            for (int i = 1; i <= 2; i++) { //Se Inicia con dos cartas Visibles para el usuario
                int f = ran.nextInt(n); //Con inidices aleoatorios se escoge las cartas dentro de la matriz baraja
                int c = ran.nextInt(m); //Solo sera necesarios hacer esto dos veces
                clr = Ccolor[f];
                dib = f;
                if (baraja[f][c] == 0) { //Asegurar que la combinación al azar no de una posición que tenga el valor de 0
                    while (baraja[f][c] == 0) {
                        f = ran.nextInt(n); //Posicion en matriz aleatoria
                        c = ran.nextInt(m);
                        clr = Ccolor[f];//Que baraja pertenece
                        dib = f;
                    }
                }
                if (i == 1) { //Para la primera carta del usuario 
                    CartaUs1 = baraja[f][c]; //Valor de la carta
                    cB1 = clr;//baraja
                    type1U=dib;
                
                } else { //Para la segunda carta
                    CartaUs2 = baraja[f][c]; //Valor de la carta
                    cB2 = clr; //Numero de fila dice el color = baraja
                    type2U=dib;
                }
                baraja[f][c] = 0; //Se descuenta las cartas ya tomadas
                cont = i;
            }
            Sum0Us = CartaUs1 + CartaUs2; //Sumar las dos cartas del Usuario

            if (Sum0Us > 21 & (CartaUs1 == 11 | CartaUs2 == 11)) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                //as=1;
                if (CartaUs1 == 11) {
                    CartaUs1 = 1;
                }
                if (CartaUs2 == 11) {
                    CartaUs2 = 1;
                }
                Sum0Us = CartaUs1 + CartaUs2;

            }

            C = C - cont; //Toatl de cartas menos las que se repartieron
            ConteoCartas.setText(Integer.toString(C)); //Imprimir numero de cartas actual sin usar

            //Mostrar primera carta usuario
            switch (cB1) { //Casos para diferentes COLOR barajas Primera Carta
                case "r":
                    g.setColor(Color.red);
                    g.fillRoundRect(200, 300, 90, 130, 10, 10);

                    g.setColor(Color.white);
                    g.fillRoundRect(203, 303, 85, 125, 10, 10);

                    g.setColor(Color.red);
                    break;
                case "n":
                    g.setColor(Color.blue);
                    g.fillRoundRect(200, 300, 90, 130, 10, 10);

                    g.setColor(Color.white);
                    g.fillRoundRect(203, 303, 85, 125, 10, 10);

                    g.setColor(Color.blue);
                    break;

            }
            switch (type1U) { //Casos para el tipo de tipo de carta 1 (Trebol, corazon, pica, diamante , etc)
                    case 0:
                    case 4:
                        g.setColor(Color.red);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Corazón ♥" + "", 205, 375);
                        break;
                    case 1:
                    case 5:
                        g.setColor(Color.blue);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Picas ♠" + "", 210, 375);
                        break;
                    case 2:
                    case 6:
                        g.setColor(Color.blue);
                        g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Trebol ♣" + "", 210, 375);
                        break;
                    case 3:
                    case 7:
                        g.setColor(Color.red);
                        g.setFont(new Font("Tahoma", Font.BOLD, 14));
                        g.drawString("Diamantes ♦️" + "", 205, 375);
                }

            // MOSTRAR NUMERO DE LA CARTA 1 USUARIO
            //C1US.setText(Integer.toString(CartaUs1)); lo que se haria con un label, pero estamos trabajando con la clase graphic
            String cn1 = Integer.toString(CartaUs1);
            g.setFont(new Font("Tahoma", Font.BOLD, 16));
            g.drawString(cn1 + "", 215, 356);

            //MOSTAR SEGUNDA CARTA USUARIO
            switch (cB2) { // Color de la segunda carta usuario
                case "r":
                    g.setColor(Color.red);
                    g.fillRoundRect(350, 300, 90, 130, 10, 10); //

                    g.setColor(Color.white);
                    g.fillRoundRect(353, 303, 85, 125, 10, 10);

                    g.setColor(Color.red);
                    break;
                case "n":
                    g.setColor(Color.blue);
                    g.fillRoundRect(350, 300, 90, 130, 10, 10); //

                    g.setColor(Color.white);
                    g.fillRoundRect(353, 303, 85, 125, 10, 10);

                    g.setColor(Color.blue);
                    break;

            }
            switch (type2U) { //Casos para el tipo de tipo de carta 2 (Trebol, corazon, pica, diamante , etc)
                    case 0:
                    case 4:
                        g.setColor(Color.red);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Corazón ♥" + "", 356, 375);
                        break;
                    case 1:
                    case 5:
                        g.setColor(Color.blue);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Picas ♠" + "", 360, 375);
                        break;
                    case 2:
                    case 6:
                        g.setColor(Color.blue);
                        g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Trebol ♣" + "", 360, 375);
                        break;
                    case 3:
                    case 7:
                        g.setColor(Color.red);
                        g.setFont(new Font("Tahoma", Font.BOLD, 14));
                        g.drawString("Diamantes ♦" + "", 354, 375);
                }

            //MOstrar NUmero de la carta 2
            //C2US.setText(Integer.toString(CartaUs2));
            String C2US = Integer.toString(CartaUs2);
            g.setFont(new Font("Tahoma", Font.BOLD, 16));
            g.drawString(C2US + "", 370, 356);

            //Mostrar numero de la suma acumulada del usuario
             //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            g.setColor(new Color(204,255,102)); 
            g.fillOval(50, 305, 40, 40);
            String SumaUs = Integer.toString(Sum0Us);
            g.setColor(Color.BLACK);
            g.drawString(SumaUs + "", 60, 331);

            
            
   //Dealer Cartas Iniciales
            int CartaDe1 = 0, CartaDe2 = 0, Sum0De;
            String clrd, cB1D = "r", cB2D = "n";
            int dibDE = 0, type1D=0,type2D=0;
            for (int i = 1; i <= 2; i++) { //Se Inicia con dos cartas Visibles para el usuario
                int f = ran.nextInt(n); //Con inidices aleoatorios se escoge las cartas dentro de la matriz baraja
                int c = ran.nextInt(m); //Solo sera necesarios hacer esto dos veces
                clrd = Ccolor[f];
                dibDE=f;
                if (baraja[f][c] == 0) { //Asegurar que la combinación al azar no de una posición que tenga el valor de 0
                    while (baraja[f][c] == 0) {
                        f = ran.nextInt(n);
                        c = ran.nextInt(m);
                        clrd = Ccolor[f];//Que baraja pertenece
                        dibDE=f;
                    }
                }
                if (i == 1) { //Para la primera carta del dealer
                    CartaDe1 = baraja[f][c];
                    cB1D = clrd;//baraja
                    type1D=dibDE;
                } else { //Para la segunda carta del dealer
                    CartaDe2 = baraja[f][c];
                    cB2D = clrd;//baraja
                    type2D=dibDE;
                }
                baraja[f][c] = 0; //Se descuenta las cartas ya tomadas
                cont = i;

            }
            C = C - cont; // conteo de las cartas que quedan 
            ConteoCartas.setText(Integer.toString(C)); //Mostrar cartas que quedan 

            Sum0De = CartaDe1 + CartaDe2; 

            if (Sum0De > 21 & (CartaDe1 == 11 | CartaDe2 == 11)) { //Si sale un as se tomara como 11 siempre y cuando no se pase de 21
                //as=1;
                if (CartaDe1 == 11) {
                    CartaDe1 = 1;
                }
                if (CartaDe2 == 11) {
                    CartaDe2 = 1;
                }
                Sum0De = CartaDe1 + CartaDe2;

            }
            // C1DE.setText(Integer.toString(CartaDe1)); 
            //NO se muetra pero si se pinta la carta boca abajo 
            switch (cB1D) { //Casos para diferentes barajas
                case "r":
                    g.setColor(Color.red);
                    g.fillRoundRect(200, 90, 90, 130, 10, 10); //

                    break;
                case "n":
                    g.setColor(Color.blue);
                    g.fillRoundRect(200, 90, 90, 130, 10, 10); //
                    break;
            }

            // C2DE.setText(Integer.toString(CartaDe2)); //Si se muetsra la carta 
            switch (cB2D) { //Casos para diferentes barajas
                case "r":
                    g.setColor(Color.red);
                    g.fillRoundRect(350, 90, 90, 130, 10, 10); //
                    g.setColor(Color.white);
                    g.fillRoundRect(353, 93, 85, 125, 10, 10);
                    g.setColor(Color.red);
                    break;
                case "n":
                    g.setColor(Color.blue);
                    g.fillRoundRect(350, 90, 90, 130, 10, 10); //
                    g.setColor(Color.white);
                    g.fillRoundRect(353, 93, 85, 125, 10, 10); //
                    g.setColor(Color.blue);
                    break;
            }
            switch (type2D) { //Casos para el tipo de tipo de carta 2 dealer (Trebol, corazon, pica, diamante , etc)
                    case 0:
                    case 4:
                        g.setColor(Color.red);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Corazón ♥" + "", 356, 145);
                        break;
                    case 1:
                    case 5:
                        g.setColor(Color.blue);
                         g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Picas ♠" + "", 360, 145);
                        break;
                    case 2:
                    case 6:
                        g.setColor(Color.blue);
                        g.setFont(new Font("Tahoma", Font.BOLD, 16));
                        g.drawString("Trebol ♣" + "", 360, 145);
                        break;
                    case 3:
                    case 7:
                        g.setColor(Color.red);
                        g.setFont(new Font("Tahoma", Font.BOLD, 14));
                        g.drawString("Diamantes ♦" + "", 354, 145);
                }

            //Solo se mostrara una carta al usuario, la otra quedara oculta hasta que el usuruario termine de jugar 
            //  CARTA 2
            String C2D = Integer.toString(CartaDe2);
            g.setFont(new Font("Tahoma", Font.BOLD, 16));
            g.drawString(C2D + "", 370, 130);

            //Mostrar numero de la suma acumulada del usuario, pero por ahora solo la de la carta 2
            //Cuando se revele la carta si se hara la suma, pero mientras tanto el usuario no saber la carta 1 del dealer
            //Figuras
            //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            g.setColor(new Color(204,255,102));
            g.fillOval(50, 70, 40, 40);
            //Numero SUMA 
            g.setColor(Color.BLACK);
            g.drawString(C2D + "", 60,96);

            Pedir1Carta.setVisible(true); //Activar botones de juego
            a = 1;
            Repartir.setEnabled(false); //Desspues de repatir que el boton se desactive
        } else {
            valdRepartir.setText(" Reparte las cartas para iniciar");
        }
    }//GEN-LAST:event_RepartirActionPerformed
    
    private void Pedir1CartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pedir1CartaActionPerformed
        if (repartir) { //Validación de repartir las cartas iniciales
            cont++;
            C = C - cont;
            //Usuario

        } else {
            Pedir1Carta.setVisible(false);
            JOptionPane.showMessageDialog(null, "No se han repartido cartas", "BlackJack∙", 2);
        }
    }//GEN-LAST:event_Pedir1CartaActionPerformed

    private void SliptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SliptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SliptActionPerformed

    private void AjustesBlackJackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjustesBlackJackActionPerformed
        AjustesBJk cambio = new AjustesBJk();
        cambio.setVisible(true);
    }//GEN-LAST:event_AjustesBlackJackActionPerformed

    private void AjustesBlackJack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjustesBlackJack1ActionPerformed
        Principal3 a = new Principal3(user);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AjustesBlackJack1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mesa1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa1(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjustesBlackJack;
    private javax.swing.JButton AjustesBlackJack1;
    private javax.swing.JLabel C1DE;
    private javax.swing.JLabel C1US;
    private javax.swing.JLabel C2DE;
    private javax.swing.JLabel C2US;
    private javax.swing.JLabel ConteoCartas;
    private javax.swing.JButton Doble;
    private javax.swing.JButton Parar;
    private javax.swing.JButton Pedir1Carta;
    private javax.swing.JButton Repartir;
    private javax.swing.JButton Slipt;
    private javax.swing.JLabel SumCartasDE;
    private javax.swing.JLabel SumCartasUs;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel valdRepartir;
    // End of variables declaration//GEN-END:variables

   
}
