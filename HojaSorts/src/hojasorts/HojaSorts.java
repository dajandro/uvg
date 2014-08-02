
/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Clase que crea 2000 mil números aleatorios y permite ordenarlos con 4 
* algoritmos de ordenamiento 
* Se guardan los números ordenados en otro archivo
* HojaSort.java
*/

package hojasorts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class HojaSorts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //se crean 2 mil números aleatorios y se guardan en un arreglo tipo comparable
        Comparable[] list = new Comparable[2000];
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("1. Insertion Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Merge Sort");
        System.out.println("Ingrese el número que desea:");
        String entry=teclado.next();
       
        

        Random aleatorio=new Random();
        for (int j=0;j<2000;j++){
            list[j]=aleatorio.nextInt(2000)+1;
        }
        
             
        /**
         * Aqui se tien tiene que guardar los 2000 mil números desordenados en un archivo
         */
        

        //El factory decide que clase instanciar
        Factory _nFactory = new Factory(entry);

        //se manda como parámetro la lista desordenada y el método la ordena
        BaseSorts sort= _nFactory.getSort(list);

        //se guarda la lista de números en la clase base
        sort.setListaNumeros(list);

        /**
         * Aqui se tienen que guardar los 2000 mil números ya ordenados
         * en otro archivo
         */

        //se muestra el arreglo ordenado
        System.out.print("[");
        for (int j =0; j < 2000; j++){

            System.out.print(sort.getListaNumeros()[j].toString().concat(", ")); 
        }
        System.out.print("]\n");




        /*
        String[] numerosGenerados=new String[2000];
        FileProject Archivo = new FileProject();
        Archivo.CrearArchivo();
        Archivo.LeerArchivo();
        numerosGenerados = Archivo.getNumerosGenerados();
        Sorting.selectionSort(numerosGenerados); 

        System.out.print("[");
        for (int j =0; j < 2000; j++){

            System.out.print(numerosGenerados[j]+" \n"); 
        }
        System.out.print("]\n");

        Archivo.setNumerosGenerados(numerosGenerados);
        Archivo.CrearArchivoOrdenad();

        */



        
    }

}
