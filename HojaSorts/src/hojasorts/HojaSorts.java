
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
        Scanner teclado = new Scanner (System.in);
      
        System.out.println("Programa que implementa algoritmos de ordenamiento");
        
        
        
        System.out.println("1.Generar nuevos números aleatorios");
        System.out.println("2. Utilizar números almacenados en el archivo");
        System.out.print("Ingrese opción: ");
        String entrada_ini = teclado.next();
        
        
        //se declara la lista donde se van a guardar los números
        Comparable[] list;
        
        System.out.println("1. Insertion Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Merge Sort");
        System.out.print("Ingrese el número de algoritmo que desea:");
        String entry=teclado.next();
        
       //clase para guardar y leer en un archivo toda la info generada
        FileProject Archivo = new FileProject();
        
       
        
        if (entrada_ini.equals("1")){
            
            System.out.print("Ingrese el tamaño del  nodo:");
            int tamaño = teclado.nextInt();
            //se instancia la clase nodo con el tamaño ingresado
            list= new Nodo[tamaño]; 
            //se crean todos los números aleatorios en cada posicion del nodo
            Random aleatorio=new Random();
            for (int j=0;j<tamaño;j++){
                list[j]=new Nodo(aleatorio.nextInt(tamaño)+1);
            }
            Archivo.CrearArchivo(list);//se crea el archivo con números desordenados
        }
        else{
           
           //devuelve lista tipo comparable con los números del archivo 
           list = Archivo.LeerArchivo();
           
               
        }
        System.out.println("");
        System.out.println("El arreglo antes de pasar por el algoritmo es: ");
        //se muestra el arreglo antes del algorimto
        System.out.print("[");
        for (int j =0; j < list.length; j++){

            System.out.print(list[j].toString().concat(", ")); 
        }
        System.out.print("]\n");
        System.out.println("");
        //El factory decide que clase instanciar
        //se manda como parámetro la lista desordenada y el método la ordena
        
       
        Factory _nFactory = new Factory();
       
        BaseSorts sort= _nFactory.getSort(entry, list);
        
         //se guarda la lista de números en la clase base
        sort.setListaNumeros(list);
         //se muestra el arreglo ordenado
        
        

        /**
         * Aqui se tienen que guardar los 2000 mil números ya ordenados
         * en otro archivo
         */
        
        Archivo.CrearArchivoOrdenado(sort.getListaNumeros());
        System.out.println("");
        System.out.println("El arreglo tras pasar por el algoritmo es: ");
        //se muestra el arreglo ordenado
        System.out.print("[");
        for (int j =0; j < sort.getListaNumeros().length; j++){

            System.out.print(sort.getListaNumeros()[j].toString().concat(", ")); 
        }
        System.out.print("]\n");
        
    }

}
