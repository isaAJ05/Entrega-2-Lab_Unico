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
public class hard extends javax.swing.JPanel {

    /**
     * Creates new form hard
     */
    private String name = null;

    public hard(String user) {
        initComponents();
        this.name = user;
        int i, j, auxm = 4, auxm2 = 5, auxu = 4, auxu2 = 5, auxv = 4, auxv2 = 5;
        //Matriz de botones [8][8]
        JButton botones[][] = {{boton11, boton21, boton31, boton41, boton51, boton61, boton71, boton81},
        {boton12, boton22, boton32, boton42, boton52, boton62, boton72, boton82},
        {boton13, boton23, boton33, boton43, boton53, boton63, boton73, boton83},
        {boton14, boton24, boton34, boton44, boton54, boton64, boton74, boton84},
        {boton15, boton25, boton35, boton45, boton55, boton65, boton75, boton85},
        {boton16, boton26, boton36, boton46, boton56, boton66, boton76, boton86},
        {boton17, boton27, boton37, boton47, boton57, boton67, boton77, boton87},
        {boton18, boton28, boton38, boton48, boton58, boton68, boton78, boton88}};//matriz de botones

        //Vector de planetas [8] pero solo se usan 5 espacios
        String[] planetas = {"TIERRA", "SATURNO", "MARTE", "URANO", "VENUS", "JUPITER", "", ""};

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
                //j representará mis filas
                //i representará mis columnas
                // TIERRA 
                if (j == 0 && i < 6) { // Posición Horizontal: Fila 0, columnas de 0 - 5
                    String caracter = planetas[0].substring(i, i + 1);//extraer caracteres de la palabra TIERRA
                    botones[i][j].setText(caracter);//se le asignan las letras correspondientes
                    //SATURNO
                } else if (j < 7 && i == 7) { //Posición Vertical: fila de 0-6, columnas 7
                    String caracter2 = planetas[1].substring(j, j + 1);
                    botones[i][j].setText(caracter2);
                    //MARTE
                } else if (i == 5 && j >= 2 && j < 7) { //Posición Vertical inversa: fila de 2-6, columna 5
                    String caracter2 = planetas[2].substring(auxm, auxm2);// uso de auxiliares para obtener valores deseados para una correcta extracción de caracteres
                    auxm2 = auxm;
                    auxm = auxm - 1;
                    botones[i][j].setText(caracter2);
                    //URANO
                } else if (i == 1 && j >= 2 && j < 7) { //Posición Vertical inversa: fila de 2-6, columna 1
                    String caracter3 = planetas[3].substring(auxu, auxu2);
                    auxu2 = auxu;
                    auxu = auxu - 1;
                    botones[i][j].setText(caracter3);
                    // VENUS 
                } else if (j == 7 && i >= 3 && i < 8) {// Posición Horizontal inversa: Fila 7, columnas de 3 - 7
                    String caracter4 = planetas[4].substring(auxv, auxv2);
                    auxv2 = auxv;
                    auxv = auxv - 1;
                    botones[i][j].setText(caracter4);
                    // JUPITER
                } else if (j >= 1 && j < 8 && i < 7) {// Posición Diagonal: Fila de 7-1, columnas de 0- 6
                    if (j == 7 && i == 0) {
                        String caracter5 = planetas[5].substring(i, i + 1);//extracción de caracter personalizado 
                        botones[i][j].setText(caracter5);//LETRA J
                    } else if (j == 6 && i == 1) {
                        String caracter51 = planetas[5].substring(i, i + 1);
                        botones[i][j].setText(caracter51);//LETRA U
                    } else if (j == 5 && i == 2) {
                        String caracter52 = planetas[5].substring(i, i + 1);
                        botones[i][j].setText(caracter52);//LETRA P
                    } else if (j == 4 && i == 3) {
                        String caracter53 = planetas[5].substring(i, i + 1);
                        botones[i][j].setText(caracter53);//LETRA I
                    } else if (j == 3 && i == 4) {
                        String caracter54 = planetas[5].substring(i, i + 1);
                        botones[i][j].setText(caracter54);//LETRA T
                    } else if (j == 2 && i == 5) {
                        String caracter55 = planetas[5].substring(i, i + 1);
                        botones[i][j].setText(caracter55);//LETRA E
                    } else if (j == 1 && i == 6) {
                        String caracter56 = planetas[5].substring(i, i + 1);
                        botones[i][j].setText(caracter56);//LETRA R
                    }
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
        chulito7.setVisible(false);
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
        chulito7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        siguiente1 = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();
        labelvolver = new javax.swing.JLabel();

        contenido6.setBackground(new java.awt.Color(0, 0, 204));
        contenido6.setName("STAR GAMES: Sopa de letras Planetas"); // NOI18N
        contenido6.setOpaque(false);
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

        boton22.setText("jButton2");

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

        boton72.setText("jButton2");
        boton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton72ActionPerformed(evt);
            }
        });

        boton13.setText("jButton2");

        boton23.setText("jButton2");

        boton43.setText("jButton2");

        boton33.setText("jButton2");

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
        jLabel2.setText("PLANETAS");

        chulito1.setForeground(new java.awt.Color(255, 0, 0));
        chulito1.setText("★");

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIERRA");

        chulito2.setForeground(new java.awt.Color(255, 0, 0));
        chulito2.setText("★");

        jLabel9.setBackground(new java.awt.Color(153, 204, 255));
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SATURNO");

        chulito3.setForeground(new java.awt.Color(255, 0, 0));
        chulito3.setText("★");

        jLabel10.setBackground(new java.awt.Color(153, 204, 255));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MARTE");

        chulito4.setForeground(new java.awt.Color(255, 0, 0));
        chulito4.setText("★");

        jLabel11.setBackground(new java.awt.Color(153, 204, 255));
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("URANO");

        chulito5.setForeground(new java.awt.Color(255, 0, 0));
        chulito5.setText("★");

        jLabel12.setBackground(new java.awt.Color(153, 204, 255));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("VENUS");

        chulito7.setForeground(new java.awt.Color(255, 0, 0));
        chulito7.setText("★");

        jLabel13.setBackground(new java.awt.Color(153, 204, 255));
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("JUPITER");

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

        btnVolver2.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnVolver2.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnVolver2.setContentAreaFilled(false);
        btnVolver2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolver2.setMaximumSize(new java.awt.Dimension(50, 39));
        btnVolver2.setMinimumSize(new java.awt.Dimension(50, 39));
        btnVolver2.setPreferredSize(new java.awt.Dimension(58, 47));
        btnVolver2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasr.png"))); // NOI18N
        btnVolver2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasr.png"))); // NOI18N
        btnVolver2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolver2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolver2MouseExited(evt);
            }
        });
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        labelvolver.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelvolver.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenido6Layout = new javax.swing.GroupLayout(contenido6);
        contenido6.setLayout(contenido6Layout);
        contenido6Layout.setHorizontalGroup(
            contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido6Layout.createSequentialGroup()
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boton81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(boton71, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(boton61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(boton51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(boton41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(boton31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(boton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(boton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)))
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
                                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(siguiente1)
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(instrucciones)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pista, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(solucion)
                                        .addGap(116, 116, 116))))
                            .addGroup(contenido6Layout.createSequentialGroup()
                                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenido6Layout.createSequentialGroup()
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
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido6Layout.createSequentialGroup()
                                        .addComponent(sopadeletras)
                                        .addGap(75, 75, 75)))
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
                                        .addComponent(chulito7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(contenido6Layout.createSequentialGroup()
                                        .addComponent(chulito1)
                                        .addGap(18, 18, 18)
                                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(contenido6Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenido6Layout.createSequentialGroup()
                                                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(contenido6Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(palabrasencontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(4, 4, 4)))))))
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
        );
        contenido6Layout.setVerticalGroup(
            contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenido6Layout.createSequentialGroup()
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instrucciones)
                            .addComponent(pista)
                            .addComponent(solucion)
                            .addComponent(palabrasencontradas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenido6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(contenido6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sopadeletras))
                .addGap(18, 18, 18)
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
                    .addComponent(chulito7)
                    .addComponent(jLabel13))
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
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    int tierra = 0;
    int cont;
    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        tierra += 1;//Si se presiona este boton que representa la letra inicial de TIERRA el contador sumara 1
        if (tierra == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara TIERRA
            boton11.setBackground(Color.green);//Letra T
            boton12.setBackground(Color.green);//Letra I
            boton13.setBackground(Color.green);//Letra E
            boton14.setBackground(Color.green);//Letra R
            boton15.setBackground(Color.green);//Letra R
            boton16.setBackground(Color.green);//Letra A
            //Se volverá visible una estrella al lado de la palabra TIERRA en la lista
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton11ActionPerformed
    int jupiter;
    private void boton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton81ActionPerformed
        jupiter += 1;//Si se presiona este boton que representa la letra inicial de URANO el contador sumara 1
        if (jupiter == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara JUPITER
            boton81.setBackground(Color.green);//Letra R
            boton72.setBackground(Color.green);//Letra E
            boton63.setBackground(Color.green);//Letra T
            boton54.setBackground(Color.green);//Letra I
            boton45.setBackground(Color.green);//Letra P
            boton36.setBackground(Color.green);//Letra U
            boton27.setBackground(Color.green);//Letra J
            //Se volverá visible una estrella al lado de la palabra JUPITER en la lista
            chulito7.setVisible(true);
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton81ActionPerformed
    int urano;
    private void boton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton32ActionPerformed
        urano += 1;//Si se presiona este boton que representa la letra final de URANO el contador sumara 1
        if (urano == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara URANO
            boton72.setBackground(Color.green);//Letra U
            boton62.setBackground(Color.green);//Letra R
            boton52.setBackground(Color.green);//Letra A
            boton42.setBackground(Color.green);//Letra N
            boton32.setBackground(Color.green);//Letra O
            //Se volverá visible una estrella al lado de la palabra TIERRA en la lista
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton32ActionPerformed

    private void boton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton72ActionPerformed
        urano += 1;//Si se presiona este boton que representa la letra inicial de URANO el contador sumara 1
        if (urano == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara URANO
            boton72.setBackground(Color.green);//Letra U
            boton62.setBackground(Color.green);//Letra R
            boton52.setBackground(Color.green);//Letra A
            boton42.setBackground(Color.green);//Letra N
            boton32.setBackground(Color.green);//Letra O
            //Se volverá visible una estrella al lado de la palabra TIERRA en la lista
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
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
        // TODO add your handling code here:
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton16ActionPerformed
        tierra += 1;//Si se presiona este boton que representa la letra final de TIERRA el contador sumara 1
        if (tierra == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara TIERRA
            boton11.setBackground(Color.green);//Letra T
            boton12.setBackground(Color.green);//Letra I
            boton13.setBackground(Color.green);//Letra E
            boton14.setBackground(Color.green);//Letra R
            boton15.setBackground(Color.green);//Letra R
            boton16.setBackground(Color.green);//Letra A
            //Se volverá visible una estrella al lado de la palabra TIERRA en la lista
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");

        }
    }//GEN-LAST:event_boton16ActionPerformed

    private void boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton17ActionPerformed
    int saturno;
    private void boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton18ActionPerformed
        saturno += 1;//Si se presiona este boton que representa la letra inicial de SATURNO el contador sumara 1
        if (saturno == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara SATURNO
            boton18.setBackground(Color.green);//Letra S
            boton28.setBackground(Color.green);//Letra A
            boton38.setBackground(Color.green);//Letra T
            boton48.setBackground(Color.green);//Letra U
            boton58.setBackground(Color.green);//Letra R
            boton68.setBackground(Color.green);//Letra N
            boton78.setBackground(Color.green);//Letra O
            //Se volverá visible una estrella al lado de la palabra SATURNO en la lista
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
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
    int venus;
    private void boton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton84ActionPerformed
        venus += 1;//Si se presiona este boton que representa la letra final de VENUS el contador sumara 1
        if (venus == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara VENUS
            boton88.setBackground(Color.green);//Letra V
            boton87.setBackground(Color.green);//Letra E
            boton86.setBackground(Color.green);//Letra N
            boton85.setBackground(Color.green);//Letra U
            boton84.setBackground(Color.green);//Letra S
            //Se volverá visible una estrella al lado de la palabra VENUS en la lista
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton84ActionPerformed

    private void boton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton25ActionPerformed

    private void boton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton35ActionPerformed

    private void boton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton45ActionPerformed
        // TODO add your handling code here:
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

    private void boton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton85ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton85ActionPerformed

    private void boton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton26ActionPerformed
    int marte;
    private void boton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton36ActionPerformed
        marte += 1;//Si se presiona este boton que representa la letra final de MARTE el contador sumara 1
        if (marte == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara MARTE
            boton76.setBackground(Color.green);//Letra M
            boton66.setBackground(Color.green);//Letra A
            boton56.setBackground(Color.green);//Letra R
            boton46.setBackground(Color.green);//Letra T
            boton36.setBackground(Color.green);//Letra E
            //Se volverá visible una estrella al lado de la palabra MARTE en la lista
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton36ActionPerformed

    private void boton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton46ActionPerformed

    private void boton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton56ActionPerformed

    private void boton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton66ActionPerformed

    private void boton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton76ActionPerformed
        marte += 1;//Si se presiona este boton que representa la letra inicial de MARTE el contador sumara 1
        if (marte == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara MARTE
            boton76.setBackground(Color.green);//Letra M
            boton66.setBackground(Color.green);//Letra A
            boton56.setBackground(Color.green);//Letra R
            boton46.setBackground(Color.green);//Letra T
            boton36.setBackground(Color.green);//Letra E
            //Se volverá visible una estrella al lado de la palabra MARTE en la lista
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton76ActionPerformed

    private void boton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton86ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton86ActionPerformed

    private void boton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton27ActionPerformed
        jupiter += 1;//Si se presiona este boton que representa la letra final de JUPITER el contador sumara 1
        if (jupiter == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara JUPITER
            boton81.setBackground(Color.green);//Letra R
            boton72.setBackground(Color.green);//Letra E
            boton63.setBackground(Color.green);//Letra T
            boton54.setBackground(Color.green);//Letra I
            boton45.setBackground(Color.green);//Letra P
            boton36.setBackground(Color.green);//Letra U
            boton27.setBackground(Color.green);//Letra J
            //Se volverá visible una estrella al lado de la palabra JUPITER en la lista
            chulito7.setVisible(true);
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton27ActionPerformed

    private void boton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton37ActionPerformed
        // TODO add your handling code here:
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

    private void boton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton87ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton87ActionPerformed

    private void boton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton28ActionPerformed

    private void boton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton38ActionPerformed

    private void boton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton48ActionPerformed

    private void boton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton58ActionPerformed

    private void boton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton68ActionPerformed

    private void boton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton78ActionPerformed
        saturno += 1;//Si se presiona este boton que representa la letra final de SATURNO el contador sumara 1
        if (saturno == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara SATURNO
            boton18.setBackground(Color.green);//Letra S
            boton28.setBackground(Color.green);//Letra A
            boton38.setBackground(Color.green);//Letra T
            boton48.setBackground(Color.green);//Letra U
            boton58.setBackground(Color.green);//Letra R
            boton68.setBackground(Color.green);//Letra N
            boton78.setBackground(Color.green);//Letra O
            //Se volverá visible una estrella al lado de la palabra SATURNO en la lista
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton78ActionPerformed

    private void boton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton88ActionPerformed
        venus += 1;//Si se presiona este boton que representa la letra inicial de VENUS el contador sumara 1
        if (venus == 2) {// si vale 2:
            //se obtendra un color verde en el fondo de los botones que contienen las letras de la palara VENUS
            boton88.setBackground(Color.green);//Letra V
            boton87.setBackground(Color.green);//Letra E
            boton86.setBackground(Color.green);//Letra N
            boton85.setBackground(Color.green);//Letra U
            boton84.setBackground(Color.green);//Letra S
            //Se volverá visible una estrella al lado de la palabra VENUS en la lista
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
        if (tierra >= 2 && marte >= 2 && saturno >= 2 && jupiter >= 2 && venus >= 2 && urano >= 2) {
            JOptionPane.showMessageDialog(null, "!FELICIDADES " + name + "! \nHas resuelto el nivel hard\nSin duda eres un maestro de la Sopa de letras STAR :D");
            JOptionPane.showMessageDialog(null, "Presiona REGRESAR AL MENU para ir al principio del juego \n o SALIR para ir al Menu principal de STAR GAMES");
        }
    }//GEN-LAST:event_boton88ActionPerformed
    int contp = 0, maux = 1, jaux = 1, vaux = 1, uaux = 1,taux=1,saux=1;
    private void pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaActionPerformed
        //Para mostrar pistas:
        //tengo en cuenta si ya el contador de la palabra está lleno ademas creo un auxiliar para cerciorarme de no repetir la palabra si ya la encontraron
        //la pista consiste en crear un fondo verde en la inicial o final de la letra de un planeta que no haya encontrado el usuario
        //psra la palabra urano la pista esta en las dos 2 ultimas letras
        if (marte < 2 & maux == 1) {//pista letra inicial MARTE
            boton76.setBackground(new Color(153, 255, 153));
            maux = 0;
        } else if (jupiter <2 & jaux == 1) {//pista letra inicial JUPITER
            boton81.setBackground(new Color(153, 255, 153));
            jaux = 0;
        } else if (venus <2 & vaux == 1) {//pista letra final VENUS
            boton84.setBackground(new Color(153, 255, 153));
            vaux = 0;
        } else if (urano <2 & uaux == 1) {//pista letra final URANO
            boton32.setBackground(new Color(153, 255, 153));
            uaux = 0;
        }else if (tierra <2 & taux == 1) {//pista letra final tierra
            boton16.setBackground(new Color(153, 255, 153));
            taux = 0;}
        else if (saturno <2 & saux == 1) {//pista letra final saturno
            boton78.setBackground(new Color(153, 255, 153));
            saux = 0;}
        contp += 1;
        if (contp > 4) {
            JOptionPane.showMessageDialog(null, "\nLo sentimos " + name + ":(..\nHas usado el número máximo de pistas");
        }
    }//GEN-LAST:event_pistaActionPerformed

    private void solucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solucionActionPerformed
        //Al presionar este boton se podra visualizar la solución de la sopa de letras al ver con un fondo verde las letras de las palabras propuestas al usuario
        //TIERRA
        boton11.setBackground(Color.green);
        boton12.setBackground(Color.green);
        boton13.setBackground(Color.green);
        boton14.setBackground(Color.green);
        boton15.setBackground(Color.green);
        boton16.setBackground(Color.green);
        //SATURNO
        boton18.setBackground(Color.green);
        boton28.setBackground(Color.green);
        boton38.setBackground(Color.green);
        boton48.setBackground(Color.green);
        boton58.setBackground(Color.green);
        boton68.setBackground(Color.green);
        boton78.setBackground(Color.green);
        //MARTE
        boton76.setBackground(Color.green);
        boton66.setBackground(Color.green);
        boton56.setBackground(Color.green);
        boton46.setBackground(Color.green);
        boton36.setBackground(Color.green);
        //JUPITER
        boton81.setBackground(Color.green);
        boton72.setBackground(Color.green);
        boton63.setBackground(Color.green);
        boton54.setBackground(Color.green);
        boton45.setBackground(Color.green);
        boton36.setBackground(Color.green);
        boton27.setBackground(Color.green);
        //VENUS
        boton88.setBackground(Color.green);
        boton87.setBackground(Color.green);
        boton86.setBackground(Color.green);
        boton85.setBackground(Color.green);
        boton84.setBackground(Color.green);
        //URANO
        boton72.setBackground(Color.green);
        boton62.setBackground(Color.green);
        boton52.setBackground(Color.green);
        boton42.setBackground(Color.green);
        boton32.setBackground(Color.green);
        //MOSTRAR PALABRAS ENCONTRADAS
        palabrasencontradas.setText("6/6");
        //MOSTRAR ESTRELLAS (CHULITOS)
        chulito1.setVisible(true);
        chulito2.setVisible(true);
        chulito3.setVisible(true);
        chulito4.setVisible(true);
        chulito5.setVisible(true);
        chulito7.setVisible(true);

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

    private void btnVolver2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver2MouseEntered
        labelvolver.setText(" Menú");
    }//GEN-LAST:event_btnVolver2MouseEntered

    private void btnVolver2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver2MouseExited
        labelvolver.setText("");
    }//GEN-LAST:event_btnVolver2MouseExited

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        contenido6.removeAll();
        tema h = new tema(name);//Una instancia
        h.setSize(800, 496);
        h.setLocation(0, 0);
        h.setOpaque(false);

        contenido6.add(h);
        contenido6.revalidate();
        contenido6.repaint();
    }//GEN-LAST:event_btnVolver2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton btnVolver2;
    private javax.swing.JLabel chulito1;
    private javax.swing.JLabel chulito2;
    private javax.swing.JLabel chulito3;
    private javax.swing.JLabel chulito4;
    private javax.swing.JLabel chulito5;
    private javax.swing.JLabel chulito7;
    private javax.swing.JPanel contenido6;
    private javax.swing.JButton instrucciones;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelvolver;
    private javax.swing.JLabel palabrasencontradas;
    private javax.swing.JButton pista;
    private javax.swing.JButton siguiente1;
    private javax.swing.JButton solucion;
    private javax.swing.JLabel sopadeletras;
    // End of variables declaration//GEN-END:variables
}
