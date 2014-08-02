/*
 * Universidad del Valle de Guatemala
 */

package hojasorts;

/**
 *
 * @author Pablo
 */
public class BubbleSort extends BaseSorts{
    
    /**
         * @param list 
         * Algoritmo que compara valores adyacentes
         * y los va intercambiando en caso que no esten ordenados
         * poniendo el mayor en el index atual
         *  
         */
      public BubbleSort (Comparable[] list)
      //pre:recibe una lista de tipo comparabale desordenada
       //post:los valores son ordenados ascendentemente
      {
       int numSorted=0;//almacena la cantidad de numeros ordenados
       Comparable temp;
       
       while (numSorted<list.length)
       {
           for (int index=1;index<(list.length-numSorted);index ++)
           {
               //compara el valor proximo y el anterior
               //si es mayor el valor del index anterior
               //realiza el swap
               if (list[index-1].compareTo(list[index]) < 0)
               {
                    // intercambio de valores
                    temp = list[index-1];
                    list[index-1] = list[index];
                    list[index] = temp;
               }
                   
           }
           numSorted++;//aumenta la cantidad de valores ordenados
       }//termina while
   }//termina bubble sort

}
