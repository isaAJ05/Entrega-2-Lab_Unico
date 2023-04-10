package PanelesEscaletaYSerpiente;

public class Tablero1 {

    GamePanel1 insta = new GamePanel1();
    int dado = insta.dado;
   
    private final int limiteF = 7, limiteC = 5; //Limites de la matriz
    public static int casilla=0;//Lo que medira nuestras casillas imaginarias de la matriz
    
    //El numero de columanas y filas multiplicado por el valor de la casilla debe dar valores 
    //cercanos o aproximas (segun el gusto) a las dimensiones del panel (Ancho, alto )
    
    
    //Creacion de la matriz de la pista
    //Pista donde los carros se moveran de 19x12, se rellenara con ceros y unos
    public int[][] Hacerespaciopista() {
        int F = 0, C = 0, casilla = 0;
        int tablero1M[][] = new int[100][100];
        for (F = 0; F < limiteF; F++) {
            if (F % 2 == 0) {
                for (C = 0; C < limiteC; C++) {
                    tablero1M[F][C] = casilla;
                    casilla++;
                }
            } else {
                for (C = limiteC-1; C >= 0; C--) {
                    tablero1M[F][C] = casilla;
                    casilla++;
                }
            }

        }
        /*
      Fin(casilla menor)    0   1   2  3   4  
                            9   8   7  6   5  
                            10 11  12  13 14  
                            19 18  17  16 15  
                            20 21  22  23 24  
                            29 28  27  26 25  
                            30 31  32  33 34     Inicio (casilla mayor)
        
         */
        return tablero1M;
    }
}
