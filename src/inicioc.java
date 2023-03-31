

// Paula Núñez, Isabella Arrieta Y Natalia Carpintero
// SE tomo como guia este codigo https://github.com/ChristianRaulRamirez/Juego_Carreara_Basica
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class inicioc extends Thread { //Heredar Thread

    //atributos, variables
    private JLabel etiqueta; //Tomara el auto
    private carrerastart nave;

//Constructores
    public inicioc(JLabel etiqueta, carrerastart nave) {
        this.etiqueta = etiqueta;
        this.nave = nave;

    }

    Random ran = new Random();

    int vel[] = {4,2,7, 10, 20, 30, 40, 50,100}; //Opciones para la velocidad

    @Override
    public void run() {
        //guardar coordenadas
        int azul = 0;
        int naranja = 0;
        int verde = 0;
        int r;
        while (true) { //blucle infinito
            try { //Mover los autos al hacer click el boton 
               
                sleep((int) (Math.random() *500)); //se pausara movera detenidamente, que descanse por 200 milisegundos
          
                //Thread.sleep(100); //que descanse por 100 milisgundos
                
                //Guardar las ubicaciones del eje x de los carros
                azul = nave.getAutoAzul().getLocation().x;
                naranja = nave.getAutoNaranja().getLocation().x;
                verde = nave.getAutoVerde().getLocation().x;

                //Para que avancen al mismo tiempo, si aun no esta en la meta que todas las naves avancen
                //Se compara la ubicacion de la coordenada x es menor a las coodernada en x de la meta o fin 
                if (azul < nave.getFIN().getLocation().x - 190 && naranja < nave.getFIN().getLocation().x - 190
                        && verde < nave.getFIN().getLocation().x - 190) {
                   
                    r = ran.nextInt(8);//Que elija un numero aletorio para la posición 
                    int v = vel[r]; //Guadar dicho valor de esa posición en la varible

                    //Actualizar la ubicacion para que avance horizontalmente tantos pasos en x. Qu e cambio la posción de tanato en tanto
                    //Ya deben de las variaciones del vector
                    etiqueta.setLocation(etiqueta.getLocation().x + v, etiqueta.getLocation().y);
                    nave.repaint();// se repinta para que no se muestre una imagen pasada
                } else {
                    break; //Para que se salga del bucle
                }
            } catch (Exception e) { //mostrar donde es el error
                System.out.println(e);
            }

            //decir  el ganador
            //si alguno de los carros ya supero la meta
            if (etiqueta.getLocation().x >= nave.getFIN().getLocation().x - 190) {
                //determinar que nave llego de primero
                if (azul > naranja & azul > verde) {
                    JOptionPane.showMessageDialog(null, " Felicidades! \n Ganador: Nave Azul");
                } else {
                    if (naranja > azul & naranja > verde) {
                        JOptionPane.showMessageDialog(null, " Felicidades! \n Ganador: Nave Naranja");
                    } else {
                        if (verde > azul & verde > naranja) {
                            JOptionPane.showMessageDialog(null, " Felicidades! \n Ganador: Nave Verde");
                        } else {
                            if (verde == azul) {
                                JOptionPane.showMessageDialog(null, " Empate! \n Buen trabajo nave Azul y Verde ");
                            } else {
                                if (verde == naranja) {
                                    JOptionPane.showMessageDialog(null, " Empate! \n Buen trabajo nave Naranja y Verde ");
                                } else if (naranja == azul) {
                                    JOptionPane.showMessageDialog(null, " Empate! \n Buen trabajo nave Azul y Naranja ");
                                } else {
                                    JOptionPane.showMessageDialog(null, " Empate! \n Buen trabajo a todas las naves. ");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
