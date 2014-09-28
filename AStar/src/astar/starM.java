/**
* Universidad Del Valle 
* Pablo Díaz 13203
* Adolfo Morales 13014
*/

package astar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class starM {
    
    /********** Método para crear nuevas diagongales 
       Recibe como parámetro el tamanho del arreglo, que es la cantidad de nodos
     * @param tamanio
                                                    ********************/
    public static void nuevoArchivo(int tamanio){
       
         try {
            File file = new File("DiagonalesFijas.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                    file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);


            System.out.println("Done");
            Random aleatorio = new Random();

            for (int i = 0; i<tamanio; i++){
                int distribuicion= aleatorio.nextInt(2)+1;
                bw.write(Integer.toString(distribuicion));
                bw.write("\n");


            }
            bw.close();
        } catch (IOException e) {
    }
      
    }
    
    public static int[] LeerArchivo(int tamanio){
        
        BufferedReader br = null;
        int[] distribucion = new int[tamanio];
        int contador=0;
        try {
                String sCurrentLine;

                br = new BufferedReader(new FileReader("DiagonalesFijas.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                    distribucion[contador] = Integer.parseInt(sCurrentLine);
                    contador++;
                        
                }

        } catch (IOException e) {
        }
        return distribucion;
    }
    
    public static void main(String[] args) {
        
       
        int decision = JOptionPane.showOptionDialog(
        null,
        "Seleccione condicion", 
        "Selector de opciones",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,    // null para icono por defecto.
        new Object[] { "Grafo sin Diagonales", "Grafo con Diagonales"},   // null para YES, NO y CANCEL
        "Grafo sin Diagonales");


        boolean diagonales;
        boolean obstaculo;
        /* Condicion para saber si el grafo cuenta con diagonales o no*/
        if (decision ==1){
            diagonales=true;
        }
        else diagonales=false;

         int decision2 = JOptionPane.showOptionDialog(null,"Seleccione Condición","Selector de opciones",
            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,    // null para icono por defecto.
            new Object[] { "Grafo sin obstáculos", "Grafo con obstáculos"},"Grafo sin obstáculos");
            
       
        /** Se ejecuta el algoritmo de camino mas corto segun el tamanho del grafo**/
          
        int[] arregloDistri2 = LeerArchivo(225);

        int tamanio = 15;
        

        /****************************************************************************/
         /************************* ESCOGER EL ALGORITMO QUE SE DESEA UTILIZAR *******/

        int algoritmoUtilizar = JOptionPane.showOptionDialog(null,"Seleccione Algortimo","Selector de opciones",
        JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,    // null para icono por defecto.
        new Object[] { "Astar", "Dijkstra"},"Astar");

        switch (algoritmoUtilizar){
            case 0:

                Astar astar = new Astar(tamanio, tamanio, arregloDistri2);
                        /* Condicion para saber si el grafo cuenta con obstaculo o no */
               if (decision2 == 1){
                  astar.getGrafo().crearOstaculo15x15();
               } 
               

                astar.calcular(diagonales,false);

                //mostrar parte gráfica 
                JFrame window = new JFrame();

                window.setSize(450, 450);
                window.setLocationRelativeTo(null);
                window.setVisible(true);
                window.add(new GrafoGrafico(astar.getGrafo(),tamanio,tamanio,astar.getPath(),astar.getNodosEvaluados()));
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                break;
            case 1:
            /********************** En caso el usuario decidió utilizar el algoritmo Dijkstra **/
                System.out.println("Algoritmo: Dijkstra");
                 astar = new Astar(tamanio, tamanio, arregloDistri2);

                astar.calcular(diagonales,true);

                //mostrar parte gráfica 
               window = new JFrame();

                window.setSize(450, 450);
                window.setLocationRelativeTo(null);
                window.setVisible(true);
                window.add(new GrafoGrafico(astar.getGrafo(),tamanio,tamanio,astar.getPath(),astar.getNodosEvaluados()));
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                break;
        }

    }
}
