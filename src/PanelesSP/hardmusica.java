/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelesSP;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class hardmusica extends javax.swing.JPanel {

    /**
     * Creates new form hard
     */
    private String name = null;

    public hardmusica(String user) {
        initComponents();
        this.name = user;
        int i, j, auxs = 1, auxs2 = 0, auxm2 = 7, auxm = 8, auxn = 7, auxn2 = 6, aux5 = 3, aux52 = 4;
        //Matriz de botones [8][8]
        JButton botones[][] = {{boton11, boton12, boton13, boton14, boton15, boton16, boton17, boton18},
        {boton21, boton22, boton23, boton24, boton25, boton26, boton27, boton28},
        {boton31, boton32, boton33, boton34, boton35, boton36, boton37, boton38},
        {boton41, boton42, boton43, boton44, boton45, boton46, boton47, boton48},
        {boton51, boton52, boton53, boton54, boton55, boton56, boton57, boton58},
        {boton61, boton62, boton63, boton64, boton65, boton66, boton67, boton68},
        {boton71, boton72, boton73, boton74, boton75, boton76, boton77, boton78},
        {boton81, boton82, boton83, boton84, boton85, boton86, boton87, boton88}};//matriz de botones

        //Vector de cantantes [8] pero solo se usan 6 espacios
        String[] cantantes = {"STRAYK", "MANESKIN", "BIGTR", "5SOS", "QUEEN", "NIRVANA", "", ""};

        //Asignacion de letras a texto de la matriz de botones
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {

                //Letras aleatorias mayusculas usando Random
                Random random = new Random();
                char letra = (char) (random.nextInt(26) + 'A');
                String letraStr = String.valueOf(letra);
                botones[i][j].setText(letraStr);// se le asigna una letra aleatoria al texto de los botones

                //ORGANIZAR LETRAS DE PALABRAS SEGUN LA POSICIÓN DESEADA
                //De acuerdo a mi matriz planteada:
                //i representará mis filas
                //j representará mis columnas
                
                //NIRVANA
                if (i == 1 && j >= 1 && j <= 7) { // Posición Horizontal: Fila 1, columnas de 1- 7
                    String caracter5 = cantantes[5].substring(auxn2, auxn);//extraer caracteres de la palabra nirvana
                    auxn = auxn2;
                    auxn2 = auxn2 - 1;
                    botones[i][j].setText(caracter5);//se le asignan las letras correspondientes
                    //MANESKIN
                }
                if (i >= 0 && i <= 7 && j == 6) { //Posición Vertical inversa: fila de 0-7, columnas 7
                    String caracter1 = cantantes[1].substring(auxm2, auxm);
                    auxm = auxm2;
                    auxm2 = auxm2 - 1;
                    botones[i][j].setText(caracter1);
                    
                } 
                // STRAY K
                else if (i == 2 && j >= 1 && j <= 6) { // Posición Horizontal: Fila 2, columnas de 1 - 6
                    String caracter = cantantes[0].substring(auxs2, auxs);//extraer caracteres de la palabra SHINZO
                    auxs2 = auxs;
                    auxs = auxs + 1;
                    botones[i][j].setText(caracter);//se le asignan las letras correspondientes;
                    //BIGTR
                    //Posición Diagonal: fila de 3-7, columnas 0-3
                } else if (j == 0 && i == 7) {
                    String caracter2 = cantantes[2].substring(j, j + 1);//extracción de caracter personalizado 
                    botones[i][j].setText(caracter2);//LETRA B
                } else if (j == 1 && i == 6) {
                    String caracter21 = cantantes[2].substring(j, j + 1);
                    botones[i][j].setText(caracter21);//LETRA I
                } else if (j == 2 && i == 5) {
                    String caracter22 = cantantes[2].substring(j, j + 1);
                    botones[i][j].setText(caracter22);//LETRA G
                } else if (j == 3 && i == 4) {
                    String caracter23 = cantantes[2].substring(j, j + 1);
                    botones[i][j].setText(caracter23);//LETRA T
                } else if (j == 4 && i == 3) {
                    String caracter23 = cantantes[2].substring(j, j + 1);
                    botones[i][j].setText(caracter23);//LETRA R
                    //5SOS
                } else if (j >= 1 && j <= 4 && i == 7) { //Posición horizontal inversa: fila de 7, columna 1-4
                    String caracter3 = cantantes[3].substring(aux5, aux52);
                    aux52 = aux5;
                    aux5 = aux5 - 1;
                    botones[i][j].setText(caracter3);
                    // QUEEN
                } else if (j == 0 && i >= 0 && i <= 4) {// Posición vertical: Fila 0-4, columna 0
                    String caracter4 = cantantes[4].substring(i, i + 1);
                    botones[i][j].setText(caracter4);
                    
                } 
            }
        }
        //Contador para contabilizar palabras halladas y mostrarlas al usuario
        cont = 0;
        //Hacer invisible estrellas al inicio de apertura de la ventana
        chulito1.setVisible(false);
        chulito2.setVisible(false);
        chulito3.setVisible(false);
        chulito4.setVisible(false);
        chulito5.setVisible(false);
        chulito6.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido6 = new javax.swing.JPanel();
        boton11 = new javax.swing.JButton();
        boton61 = new javax.swing.JButton();
        boton41 = new javax.swing.JButton();
        boton51 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton31 = new javax.swing.JButton();
        boton81 = new javax.swing.JButton();
        boton71 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton22 = new javax.swing.JButton();
        boton32 = new javax.swing.JButton();
        boton42 = new javax.swing.JButton();
        boton52 = new javax.swing.JButton();
        boton62 = new javax.swing.JButton();
        boton82 = new javax.swing.JButton();
        boton72 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton23 = new javax.swing.JButton();
        boton43 = new javax.swing.JButton();
        boton33 = new javax.swing.JButton();
        boton63 = new javax.swing.JButton();
        boton53 = new javax.swing.JButton();
        boton73 = new javax.swing.JButton();
        boton83 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        boton17 = new javax.swing.JButton();
        boton18 = new javax.swing.JButton();
        boton24 = new javax.swing.JButton();
        boton44 = new javax.swing.JButton();
        boton34 = new javax.swing.JButton();
        boton54 = new javax.swing.JButton();
        boton64 = new javax.swing.JButton();
        boton74 = new javax.swing.JButton();
        boton84 = new javax.swing.JButton();
        boton25 = new javax.swing.JButton();
        boton35 = new javax.swing.JButton();
        boton45 = new javax.swing.JButton();
        boton55 = new javax.swing.JButton();
        boton65 = new javax.swing.JButton();
        boton75 = new javax.swing.JButton();
        boton85 = new javax.swing.JButton();
        boton26 = new javax.swing.JButton();
        boton36 = new javax.swing.JButton();
        boton46 = new javax.swing.JButton();
        boton56 = new javax.swing.JButton();
        boton66 = new javax.swing.JButton();
        boton76 = new javax.swing.JButton();
        boton86 = new javax.swing.JButton();
        boton27 = new javax.swing.JButton();
        boton37 = new javax.swing.JButton();
        boton47 = new javax.swing.JButton();
        boton57 = new javax.swing.JButton();
        boton67 = new javax.swing.JButton();
        boton77 = new javax.swing.JButton();
        boton87 = new javax.swing.JButton();
        boton28 = new javax.swing.JButton();
        boton38 = new javax.swing.JButton();
        boton48 = new javax.swing.JButton();
        boton58 = new javax.swing.JButton();
        boton68 = new javax.swing.JButton();
        boton78 = new javax.swing.JButton();
        boton88 = new javax.swing.JButton();
        sopadeletras = new javax.swing.JLabel();
        pista = new javax.swing.JButton();
        solucion = new javax.swing.JButton();
        palabrasencontradas = new javax.swing.JLabel();
        instrucciones = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chulito1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chulito2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        chulito3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chulito4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chulito5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chulito6 = new javax.swing.JLabel();
        FD = new javax.swing.JLabel();
        siguiente1 = new javax.swing.JButton();

        contenido6.setBackground(new java.awt.Color(0, 0, 204));
        contenido6.setName("STAR GAMES: Sopa de letras Planetas"); // NOI18N
        contenido6.setOpaque(false);
        contenido6.setPreferredSize(new java.awt.Dimension(800, 496));
        contenido6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                contenido6MouseMoved(evt);
            }
        });

        boton11.setText("jButton2");
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        boton61.setText("jButton2");

        boton41.setText("jButton2");

        boton51.setText("jButton2");
        boton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton51ActionPerformed(evt);
            }
        });

        boton21.setText("jButton2");

        boton31.setText("jButton2");

        boton81.setText("jButton2");
        boton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton81ActionPerformed(evt);
            }
        });

        boton71.setText("jButton2");

        boton12.setText("jButton2");
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });

        boton22.setText("jButton2");
        boton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton22ActionPerformed(evt);
            }
        });

        boton32.setText("jButton2");
        boton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton32ActionPerformed(evt);
            }
        });

        boton42.setText("jButton2");

        boton52.setText("jButton2");

        boton62.setText("jButton2");

        boton82.setText("jButton2");
        boton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton82ActionPerformed(evt);
            }
        });

        boton72.setText("jButton2");
        boton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton72ActionPerformed(evt);
            }
        });

        boton13.setText("jButton2");
        boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton13ActionPerformed(evt);
            }
        });

        boton23.setText("jButton2");

        boton43.setText("jButton2");

        boton33.setText("jButton2");
        boton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton33ActionPerformed(evt);
            }
        });

        boton63.setText("jButton2");

        boton53.setText("jButton2");
        boton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton53ActionPerformed(evt);
            }
        });

        boton73.setText("jButton2");
        boton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton73ActionPerformed(evt);
            }
        });

        boton83.setText("jButton2");
        boton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton83ActionPerformed(evt);
            }
        });

        boton14.setText("jButton2");
        boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton14ActionPerformed(evt);
            }
        });

        boton15.setText("jButton2");
        boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton15ActionPerformed(evt);
            }
        });

        boton16.setText("jButton2");
        boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton16ActionPerformed(evt);
            }
        });

        boton17.setText("jButton2");
        boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton17ActionPerformed(evt);
            }
        });

        boton18.setText("jButton2");
        boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton18ActionPerformed(evt);
            }
        });

        boton24.setText("jButton2");
        boton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton24ActionPerformed(evt);
            }
        });

        boton44.setText("jButton2");
        boton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton44ActionPerformed(evt);
            }
        });

        boton34.setText("jButton2");
        boton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton34ActionPerformed(evt);
            }
        });

        boton54.setText("jButton2");
        boton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton54ActionPerformed(evt);
            }
        });

        boton64.setText("jButton2");
        boton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton64ActionPerformed(evt);
            }
        });

        boton74.setText("jButton2");
        boton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton74ActionPerformed(evt);
            }
        });

        boton84.setText("jButton2");
        boton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton84ActionPerformed(evt);
            }
        });

        boton25.setText("jButton2");
        boton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton25ActionPerformed(evt);
            }
        });

        boton35.setText("jButton2");
        boton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton35ActionPerformed(evt);
            }
        });

        boton45.setText("jButton2");
        boton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton45ActionPerformed(evt);
            }
        });

        boton55.setText("jButton2");
        boton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton55ActionPerformed(evt);
            }
        });

        boton65.setText("jButton2");
        boton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton65ActionPerformed(evt);
            }
        });

        boton75.setText("jButton2");
        boton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton75ActionPerformed(evt);
            }
        });

        boton85.setText("jButton2");
        boton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton85ActionPerformed(evt);
            }
        });

        boton26.setText("jButton2");
        boton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton26ActionPerformed(evt);
            }
        });

        boton36.setText("jButton2");
        boton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton36ActionPerformed(evt);
            }
        });

        boton46.setText("jButton2");
        boton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton46ActionPerformed(evt);
            }
        });

        boton56.setText("jButton2");
        boton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton56ActionPerformed(evt);
            }
        });

        boton66.setText("jButton2");
        boton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton66ActionPerformed(evt);
            }
        });

        boton76.setText("jButton2");
        boton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton76ActionPerformed(evt);
            }
        });

        boton86.setText("jButton2");
        boton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton86ActionPerformed(evt);
            }
        });

        boton27.setText("jButton2");
        boton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton27ActionPerformed(evt);
            }
        });

        boton37.setText("jButton2");
        boton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton37ActionPerformed(evt);
            }
        });

        boton47.setText("jButton2");
        boton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton47ActionPerformed(evt);
            }
        });

        boton57.setText("jButton2");
        boton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton57ActionPerformed(evt);
            }
        });

        boton67.setText("jButton2");
        boton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton67ActionPerformed(evt);
            }
        });

        boton77.setText("jButton2");
        boton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton77ActionPerformed(evt);
            }
        });

        boton87.setText("jButton2");
        boton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton87ActionPerformed(evt);
            }
        });

        boton28.setText("jButton2");
        boton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton28ActionPerformed(evt);
            }
        });

        boton38.setText("jButton2");
        boton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton38ActionPerformed(evt);
            }
        });

        boton48.setText("jButton2");
        boton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton48ActionPerformed(evt);
            }
        });

        boton58.setText("jButton2");
        boton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton58ActionPerformed(evt);
            }
        });

        boton68.setText("jButton2");
        boton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton68ActionPerformed(evt);
            }
        });

        boton78.setText("jButton2");
        boton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton78ActionPerformed(evt);
            }
        });

        boton88.setText("jButton2");
        boton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton88ActionPerformed(evt);
            }
        });

        sopadeletras.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        sopadeletras.setForeground(new java.awt.Color(255, 255, 255));
        sopadeletras.setText("SOPA DE LETRAS STAR ");

        pista.setBackground(new java.awt.Color(255, 153, 255));
        pista.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        pista.setForeground(new java.awt.Color(0, 0, 51));
        pista.setText("Pista");
        pista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pistaActionPerformed(evt);
            }
        });

        solucion.setBackground(new java.awt.Color(255, 153, 255));
        solucion.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        solucion.setForeground(new java.awt.Color(0, 0, 51));
        solucion.setText("Ver solución");
        solucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        solucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solucionActionPerformed(evt);
            }
        });

        palabrasencontradas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        palabrasencontradas.setForeground(new java.awt.Color(255, 255, 255));
        palabrasencontradas.setText("0/6");

        instrucciones.setBackground(new java.awt.Color(255, 153, 255));
        instrucciones.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        instrucciones.setForeground(new java.awt.Color(0, 0, 51));
        instrucciones.setText("Instrucciones");
        instrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruccionesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BANDAS");

        chulito1.setForeground(new java.awt.Color(255, 0, 0));
        chulito1.setText("★");

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STRAY K");

        chulito2.setForeground(new java.awt.Color(255, 0, 0));
        chulito2.setText("★");

        jLabel9.setBackground(new java.awt.Color(153, 204, 255));
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MANESKIN");

        chulito3.setForeground(new java.awt.Color(255, 0, 0));
        chulito3.setText("★");

        jLabel10.setBackground(new java.awt.Color(153, 204, 255));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BIGTR");

        chulito4.setForeground(new java.awt.Color(255, 0, 0));
        chulito4.setText("★");

        jLabel11.setBackground(new java.awt.Color(153, 204, 255));
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("5SOS");

        chulito5.setForeground(new java.awt.Color(255, 0, 0));
        chulito5.setText("★");

        jLabel12.setBackground(new java.awt.Color(153, 204, 255));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("QUEEN");

        chulito6.setForeground(new java.awt.Color(255, 0, 0));
        chulito6.setText("★");

        FD.setBackground(new java.awt.Color(153, 204, 255));
        FD.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        FD.setForeground(new java.awt.Color(255, 255, 255));
        FD.setText("NIRVANA");

        siguiente1.setBackground(new java.awt.Color(255, 153, 255));
        siguiente1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        siguiente1.setForeground(new java.awt.Color(0, 0, 51));
        siguiente1.setText("REGRESAR AL MENÚ");
        siguiente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenido6Layout = new javax.swing.GroupLayout(contenido6);
        contenido6.setLayout(contenido6Layout);
        contenido6Layout.setHorizontalGroup(
            contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boton81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(boton71, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(boton61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(boton51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(boton41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(boton31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(boton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(boton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenido6Layout.createSequentialGroup()
                                .addComponent(boton82, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton83, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton84, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton85, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton86, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton87, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton88, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(contenido6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(siguiente1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenido6Layout.createSequentialGroup()
                                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(boton22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton26, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton27, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(boton32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton36, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton37, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton38, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boton42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boton52, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(contenido6Layout.createSequentialGroup()
                                                .addComponent(boton43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton45, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton46, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton47, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton48, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(contenido6Layout.createSequentialGroup()
                                                .addComponent(boton53, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton54, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton55, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton56, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton57, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boton58, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(boton62, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton63, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton64, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton65, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton66, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton67, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton68, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito6)
                                        .addGap(18, 18, 18)
                                        .addComponent(FD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito1)
                                        .addGap(18, 18, 18)
                                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(contenido6Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(palabrasencontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(4, 4, 4)))))
                        .addGap(189, 189, 189))
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addComponent(boton72, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton73, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton74, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton75, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton76, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton77, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton78, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(contenido6Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(sopadeletras)
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(instrucciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pista, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solucion)
                .addGap(305, 305, 305))
        );
        contenido6Layout.setVerticalGroup(
            contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instrucciones)
                    .addComponent(pista)
                    .addComponent(solucion)
                    .addComponent(palabrasencontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(sopadeletras))
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton11)
                    .addComponent(boton12)
                    .addComponent(boton13)
                    .addComponent(boton14)
                    .addComponent(boton15)
                    .addComponent(boton16)
                    .addComponent(boton17)
                    .addComponent(boton18)
                    .addComponent(chulito1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton22)
                            .addComponent(boton23)
                            .addComponent(boton24)
                            .addComponent(boton25)
                            .addComponent(boton26)
                            .addComponent(boton27)
                            .addComponent(boton28)
                            .addComponent(chulito2)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton32)
                            .addComponent(boton33)
                            .addComponent(boton34)
                            .addComponent(boton35)
                            .addComponent(boton36)
                            .addComponent(boton37)
                            .addComponent(boton38)
                            .addComponent(chulito3)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton42)
                            .addComponent(boton43)
                            .addComponent(boton44)
                            .addComponent(boton45)
                            .addComponent(boton46)
                            .addComponent(boton47)
                            .addComponent(boton48)
                            .addComponent(chulito4)
                            .addComponent(jLabel11)))
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addComponent(boton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton41)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton51)
                    .addComponent(boton52)
                    .addComponent(boton53)
                    .addComponent(boton54)
                    .addComponent(boton55)
                    .addComponent(boton56)
                    .addComponent(boton57)
                    .addComponent(boton58)
                    .addComponent(chulito5)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton61)
                    .addComponent(boton62)
                    .addComponent(boton63)
                    .addComponent(boton64)
                    .addComponent(boton65)
                    .addComponent(boton66)
                    .addComponent(boton67)
                    .addComponent(boton68)
                    .addComponent(chulito6)
                    .addComponent(FD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton72)
                            .addComponent(boton73)
                            .addComponent(boton74)
                            .addComponent(boton75)
                            .addComponent(boton76)
                            .addComponent(boton77)
                            .addComponent(boton78)
                            .addComponent(boton71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton82)
                        .addComponent(boton83)
                        .addComponent(boton84)
                        .addComponent(boton85)
                        .addComponent(boton86)
                        .addComponent(boton87)
                        .addComponent(boton88)))
                .addGap(8, 8, 8)
                .addComponent(siguiente1)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido6, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    int cont;
    int QUEEN=0;
    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
  QUEEN += 1;//Si se presiona este boton que representa la letra inicial de QUEEN el contador sumara 1
        if (QUEEN == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara QUEEN
            boton11.setBackground(Color.green);//Letra Q
            boton21.setBackground(Color.green);//Letra U
            boton31.setBackground(Color.green);//Letra E
            boton41.setBackground(Color.green);//Letra E
            boton51.setBackground(Color.green);//Letra N
            //Se volverá visible una estrella al lado de la palabra QUEEN en la lista
            chulito5.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton11ActionPerformed
    int BIGTR=0;
    private void boton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton81ActionPerformed
          BIGTR += 1;//Si se presiona este boton que representa la letra inicial de BIGTR el contador sumara 1
        if (BIGTR == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara BIGTR
            boton81.setBackground(Color.green);//Letra B
            boton72.setBackground(Color.green);//Letra I
            boton63.setBackground(Color.green);//Letra G
            boton54.setBackground(Color.green);//Letra T
            boton45.setBackground(Color.green);//Letra R
            //Se volverá visible una estrella al lado de la palabra BIGTR en la lista
            chulito3.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton81ActionPerformed
    int STRAYK = 0;
    private void boton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton32ActionPerformed
          STRAYK += 1;//Si se presiona este boton que representa la letra inicial de STRAYK el contador sumara 1
        if (STRAYK == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara STRAYK
            boton32.setBackground(Color.green);//Letra S
            boton33.setBackground(Color.green);//Letra T
            boton34.setBackground(Color.green);//Letra R
            boton35.setBackground(Color.green);//Letra A
            boton36.setBackground(Color.green);//Letra Y
            boton37.setBackground(Color.green);//Letra K
            //Se volverá visible una estrella al lado de la palabra STRAYK en la lista
            chulito1.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton32ActionPerformed

    private void boton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton72ActionPerformed

    }//GEN-LAST:event_boton72ActionPerformed

    private void boton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton53ActionPerformed

    private void boton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton73ActionPerformed

    private void boton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton83ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton83ActionPerformed
   
    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
      
    }//GEN-LAST:event_boton14ActionPerformed
    
    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
     
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton16ActionPerformed

    }//GEN-LAST:event_boton16ActionPerformed

    private void boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton17ActionPerformed
         MANESKIN += 1;//Si se presiona este boton que representa la letra inicial de MANESKIN el contador sumara 1
        if (MANESKIN == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara MANESKIN
            boton87.setBackground(Color.green);//Letra M
            boton77.setBackground(Color.green);//Letra A
            boton67.setBackground(Color.green);//Letra N
            boton57.setBackground(Color.green);//Letra E
            boton47.setBackground(Color.green);//Letra S
            boton37.setBackground(Color.green);//Letra K
            boton27.setBackground(Color.green);//Letra I
            boton17.setBackground(Color.green);//Letra N
            //Se volverá visible una estrella al lado de la palabra MANESKIN en la lista
            chulito2.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton17ActionPerformed

    private void boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton18ActionPerformed

    }//GEN-LAST:event_boton18ActionPerformed

    private void boton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton24ActionPerformed

    private void boton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton44ActionPerformed

    private void boton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton34ActionPerformed

    private void boton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton54ActionPerformed

    private void boton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton64ActionPerformed

    private void boton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton74ActionPerformed

    private void boton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton84ActionPerformed
   
    }//GEN-LAST:event_boton84ActionPerformed

    private void boton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton25ActionPerformed

    private void boton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton35ActionPerformed

    private void boton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton45ActionPerformed
         BIGTR += 1;//Si se presiona este boton que representa la letra inicial de BIGTR el contador sumara 1
        if (BIGTR == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara BIGTR
            boton81.setBackground(Color.green);//Letra B
            boton72.setBackground(Color.green);//Letra I
            boton63.setBackground(Color.green);//Letra G
            boton54.setBackground(Color.green);//Letra T
            boton45.setBackground(Color.green);//Letra R
            //Se volverá visible una estrella al lado de la palabra BIGTR en la lista
            chulito3.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton45ActionPerformed

    private void boton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton55ActionPerformed

    private void boton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton65ActionPerformed

    private void boton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton75ActionPerformed
    int SSOS=0;
    private void boton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton85ActionPerformed
         SSOS += 1;//Si se presiona este boton que representa la letra inicial de SSOS el contador sumara 1
        if (SSOS == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara SSOS
            boton85.setBackground(Color.green);//Letra 5
            boton84.setBackground(Color.green);//Letra S
            boton83.setBackground(Color.green);//Letra O
            boton82.setBackground(Color.green);//Letra S
            //Se volverá visible una estrella al lado de la palabra SOS en la lista
            chulito4.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton85ActionPerformed

    private void boton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton26ActionPerformed

    private void boton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton36ActionPerformed

    }//GEN-LAST:event_boton36ActionPerformed
    
    private void boton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton46ActionPerformed
    
    }//GEN-LAST:event_boton46ActionPerformed

    private void boton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton56ActionPerformed

    private void boton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton66ActionPerformed

    private void boton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton76ActionPerformed

    }//GEN-LAST:event_boton76ActionPerformed

    private void boton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton86ActionPerformed
    
    }//GEN-LAST:event_boton86ActionPerformed

    private void boton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton27ActionPerformed
     
    }//GEN-LAST:event_boton27ActionPerformed

    private void boton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton37ActionPerformed
          STRAYK += 1;//Si se presiona este boton que representa la letra inicial de STRAYK el contador sumara 1
        if (STRAYK == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara STRAYK
            boton32.setBackground(Color.green);//Letra S
            boton33.setBackground(Color.green);//Letra T
            boton34.setBackground(Color.green);//Letra R
            boton35.setBackground(Color.green);//Letra A
            boton36.setBackground(Color.green);//Letra Y
            boton37.setBackground(Color.green);//Letra K
            //Se volverá visible una estrella al lado de la palabra STRAYK en la lista
            chulito1.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton37ActionPerformed

    private void boton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton47ActionPerformed

    private void boton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton57ActionPerformed

    private void boton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton67ActionPerformed

    private void boton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton77ActionPerformed
    int MANESKIN=0;
    private void boton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton87ActionPerformed
         MANESKIN += 1;//Si se presiona este boton que representa la letra inicial de MANESKIN el contador sumara 1
        if (MANESKIN == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara MANESKIN
            boton87.setBackground(Color.green);//Letra M
            boton77.setBackground(Color.green);//Letra A
            boton67.setBackground(Color.green);//Letra N
            boton57.setBackground(Color.green);//Letra E
            boton47.setBackground(Color.green);//Letra S
            boton37.setBackground(Color.green);//Letra K
            boton27.setBackground(Color.green);//Letra I
            boton17.setBackground(Color.green);//Letra N
            //Se volverá visible una estrella al lado de la palabra MANESKIN en la lista
            chulito2.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton87ActionPerformed
    int NIRVANA =0;
    private void boton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton28ActionPerformed
         NIRVANA += 1;//Si se presiona este boton que representa la letra inicial de NIRVANA el contador sumara 1
        if (NIRVANA == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara NIRVANA
            boton28.setBackground(Color.green);//Letra N
            boton27.setBackground(Color.green);//Letra I
            boton26.setBackground(Color.green);//Letra R
            boton25.setBackground(Color.green);//Letra V
            boton24.setBackground(Color.green);//Letra A
            boton23.setBackground(Color.green);//Letra N
            boton22.setBackground(Color.green);//Letra A
            //Se volverá visible una estrella al lado de la palabra NIRVANA en la lista
            chulito6.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton28ActionPerformed

    private void boton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton38ActionPerformed

    private void boton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton48ActionPerformed

    private void boton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton58ActionPerformed
       
    }//GEN-LAST:event_boton58ActionPerformed

    private void boton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton68ActionPerformed

    private void boton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton78ActionPerformed

    }//GEN-LAST:event_boton78ActionPerformed
    
    private void boton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton88ActionPerformed
      
    }//GEN-LAST:event_boton88ActionPerformed
    int contp = 0, maux = 1, qaux = 1, baux = 1, saux = 1, staux = 1, naux = 1;
    private void pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaActionPerformed
        //Para mostrar pistas:
        //tengo en cuenta si ya el contador de la palabra está lleno ademas creo un auxiliar para cerciorarme de no repetir la palabra si ya la encontraron
        //la pista consiste en crear un fondo verde en la inicial o final de la letra de un planeta que no haya encontrado el usuario
        if (QUEEN < 2 & qaux == 1) {//pista letra inicial QUEEN
            boton11.setBackground(new Color(153, 255, 153));
            qaux = 0;
        } else if (BIGTR < 2 & baux == 1) {//pista letra inicial BIGTR
            boton14.setBackground(new Color(153, 255, 153));
            baux = 0;
        } else if (SSOS < 2 & saux == 1) {//pista letra inicisl 5SOS
            boton82.setBackground(new Color(153, 255, 153));
            saux = 0;
        } else if (STRAYK < 2 & staux == 1) {//pista letra final STRAYK
            boton37.setBackground(new Color(153, 255, 153));
            staux = 0;
        } else if (MANESKIN < 2 & maux == 1) {//pista letra final MANESKIN
            boton87.setBackground(new Color(153, 255, 153));
            maux = 0;
        } else if (NIRVANA < 2 & naux == 1) {//pista letra final NIRVANA
            boton22.setBackground(new Color(153, 255, 153));
            naux = 0;
        }
        contp += 1;
        if (contp > 4) {
            JOptionPane.showMessageDialog(null, "\nLo sentimos " + name + ":(..\nHas usado el número máximo de pistas");
        }
    }//GEN-LAST:event_pistaActionPerformed

    private void solucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solucionActionPerformed
        //Al presionar este boton se podra visualizar la solución de la sopa de letras al ver con un fondo verde las letras de las palabras propuestas al usuario
        //NIRVANA
        boton28.setBackground(Color.green);//Letra N
            boton27.setBackground(Color.green);//Letra I
            boton26.setBackground(Color.green);//Letra R
            boton25.setBackground(Color.green);//Letra V
            boton24.setBackground(Color.green);//Letra A
            boton23.setBackground(Color.green);//Letra N
            boton22.setBackground(Color.green);//Letra A
        //MANESKIN
        boton87.setBackground(Color.green);//Letra M
            boton77.setBackground(Color.green);//Letra A
            boton67.setBackground(Color.green);//Letra N
            boton57.setBackground(Color.green);//Letra E
            boton47.setBackground(Color.green);//Letra S
            boton37.setBackground(Color.green);//Letra K
            boton27.setBackground(Color.green);//Letra I
            boton17.setBackground(Color.green);//Letra N
        //5SOS
         boton85.setBackground(Color.green);//Letra 5
            boton84.setBackground(Color.green);//Letra S
            boton83.setBackground(Color.green);//Letra O
            boton82.setBackground(Color.green);//Letra S
        //STRAYK
        boton32.setBackground(Color.green);//Letra S
            boton33.setBackground(Color.green);//Letra T
            boton34.setBackground(Color.green);//Letra R
            boton35.setBackground(Color.green);//Letra A
            boton36.setBackground(Color.green);//Letra Y
            boton37.setBackground(Color.green);//Letra K
        //BIGTR
        boton81.setBackground(Color.green);//Letra B
            boton72.setBackground(Color.green);//Letra I
            boton63.setBackground(Color.green);//Letra G
            boton54.setBackground(Color.green);//Letra T
            boton45.setBackground(Color.green);//Letra R
        //QUEEN
        boton11.setBackground(Color.green);//Letra Q
            boton21.setBackground(Color.green);//Letra U
            boton31.setBackground(Color.green);//Letra E
            boton41.setBackground(Color.green);//Letra E
            boton51.setBackground(Color.green);//Letra N
        //MOSTRAR PALABRAS ENCONTRADAS
        palabrasencontradas.setText("6/6");
        //MOSTRAR ESTRELLAS (CHULITOS)
        chulito1.setVisible(true);
        chulito2.setVisible(true);
        chulito3.setVisible(true);
        chulito4.setVisible(true);
        chulito5.setVisible(true);
        chulito6.setVisible(true);

    }//GEN-LAST:event_solucionActionPerformed

    private void instruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instruccionesActionPerformed
        //Mostrar Joption pane de instrucciones
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
    }//GEN-LAST:event_instruccionesActionPerformed

    private void contenido6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenido6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_contenido6MouseMoved

    private void siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente1ActionPerformed
        contenido6.removeAll();
        tema m = new tema(name);
        m.setSize(800, 496);
        m.setLocation(0, 0);
        m.setOpaque(false);
        contenido6.add(m);
        contenido6.revalidate();
        contenido6.repaint();
    }//GEN-LAST:event_siguiente1ActionPerformed
   
    private void boton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton22ActionPerformed
 NIRVANA += 1;//Si se presiona este boton que representa la letra inicial de NIRVANA el contador sumara 1
        if (NIRVANA == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara NIRVANA
            boton28.setBackground(Color.green);//Letra N
            boton27.setBackground(Color.green);//Letra I
            boton26.setBackground(Color.green);//Letra R
            boton25.setBackground(Color.green);//Letra V
            boton24.setBackground(Color.green);//Letra A
            boton23.setBackground(Color.green);//Letra N
            boton22.setBackground(Color.green);//Letra A
            //Se volverá visible una estrella al lado de la palabra NIRVANA en la lista
            chulito6.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL INICIO para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }       
    }//GEN-LAST:event_boton22ActionPerformed

    private void boton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton82ActionPerformed
         SSOS += 1;//Si se presiona este boton que representa la letra inicial de SSOS el contador sumara 1
        if (SSOS == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara SSOS
            boton85.setBackground(Color.green);//Letra 5
            boton84.setBackground(Color.green);//Letra S
            boton83.setBackground(Color.green);//Letra O
            boton82.setBackground(Color.green);//Letra S
            //Se volverá visible una estrella al lado de la palabra SOS en la lista
            chulito4.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL INICIO para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton82ActionPerformed

    private void boton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton51ActionPerformed
        QUEEN += 1;//Si se presiona este boton que representa la letra inicial de QUEEN el contador sumara 1
        if (QUEEN == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara QUEEN
            boton11.setBackground(Color.green);//Letra Q
            boton21.setBackground(Color.green);//Letra U
            boton31.setBackground(Color.green);//Letra E
            boton41.setBackground(Color.green);//Letra E
            boton51.setBackground(Color.green);//Letra N
            //Se volverá visible una estrella al lado de la palabra QUEEN en la lista
            chulito5.setVisible(true);
            //Para contabilizar palabras halladas y mostrarlas al usuario
            cont += 1;// cada palabra hallada se le suma 1 al contador
            if (cont == 1) {
                palabrasencontradas.setText("1/6");
            } else if (cont == 2) {
                palabrasencontradas.setText("2/6");
            } else if (cont == 3) {
                palabrasencontradas.setText("3/6");
            } else if (cont == 4) {
                palabrasencontradas.setText("4/6");
            } else if (cont == 5) {
                palabrasencontradas.setText("5/6");
            } else if (cont == 6) {
                palabrasencontradas.setText("6/6");
            }
        }
        //JOPTION PANE para mostrar aviso de que ha ganado al usuario
        if (NIRVANA >= 2 && BIGTR >= 2 && SSOS >= 2 && QUEEN >= 2 && STRAYK >= 2 && MANESKIN >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL INICIO para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton51ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton13ActionPerformed

    private void boton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton33ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FD;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton17;
    private javax.swing.JButton boton18;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton22;
    private javax.swing.JButton boton23;
    private javax.swing.JButton boton24;
    private javax.swing.JButton boton25;
    private javax.swing.JButton boton26;
    private javax.swing.JButton boton27;
    private javax.swing.JButton boton28;
    private javax.swing.JButton boton31;
    private javax.swing.JButton boton32;
    private javax.swing.JButton boton33;
    private javax.swing.JButton boton34;
    private javax.swing.JButton boton35;
    private javax.swing.JButton boton36;
    private javax.swing.JButton boton37;
    private javax.swing.JButton boton38;
    private javax.swing.JButton boton41;
    private javax.swing.JButton boton42;
    private javax.swing.JButton boton43;
    private javax.swing.JButton boton44;
    private javax.swing.JButton boton45;
    private javax.swing.JButton boton46;
    private javax.swing.JButton boton47;
    private javax.swing.JButton boton48;
    private javax.swing.JButton boton51;
    private javax.swing.JButton boton52;
    private javax.swing.JButton boton53;
    private javax.swing.JButton boton54;
    private javax.swing.JButton boton55;
    private javax.swing.JButton boton56;
    private javax.swing.JButton boton57;
    private javax.swing.JButton boton58;
    private javax.swing.JButton boton61;
    private javax.swing.JButton boton62;
    private javax.swing.JButton boton63;
    private javax.swing.JButton boton64;
    private javax.swing.JButton boton65;
    private javax.swing.JButton boton66;
    private javax.swing.JButton boton67;
    private javax.swing.JButton boton68;
    private javax.swing.JButton boton71;
    private javax.swing.JButton boton72;
    private javax.swing.JButton boton73;
    private javax.swing.JButton boton74;
    private javax.swing.JButton boton75;
    private javax.swing.JButton boton76;
    private javax.swing.JButton boton77;
    private javax.swing.JButton boton78;
    private javax.swing.JButton boton81;
    private javax.swing.JButton boton82;
    private javax.swing.JButton boton83;
    private javax.swing.JButton boton84;
    private javax.swing.JButton boton85;
    private javax.swing.JButton boton86;
    private javax.swing.JButton boton87;
    private javax.swing.JButton boton88;
    private javax.swing.JLabel chulito1;
    private javax.swing.JLabel chulito2;
    private javax.swing.JLabel chulito3;
    private javax.swing.JLabel chulito4;
    private javax.swing.JLabel chulito5;
    private javax.swing.JLabel chulito6;
    private javax.swing.JPanel contenido6;
    private javax.swing.JButton instrucciones;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel palabrasencontradas;
    private javax.swing.JButton pista;
    private javax.swing.JButton siguiente1;
    private javax.swing.JButton solucion;
    private javax.swing.JLabel sopadeletras;
    // End of variables declaration//GEN-END:variables
}
