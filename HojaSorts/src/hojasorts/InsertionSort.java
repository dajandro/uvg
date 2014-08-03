/*
 * Universidad del Valle de Guatemala
 * Pablo Díaz 13203
 * Clase que ordena una lista con el algoritmo de insertion Sort
 * InsertionSort.java
 */

package hojasorts;

/**
 *
 * @author Pablo
 */
public class InsertionSort extends BaseSorts{
    
    public InsertionSort(){
        
    }
    
    public InsertionSort(Comparable[] lista) 
   //pre: recibe un arreglo de tipo comparable desordenado
   //post: ordena el arreglo de forma ascendente
   {
       
       int numSorted =1;
       
       int index;
       while(numSorted<lista.length)
       {
           //se toma el primer valor no ordenado
           Comparable temp=lista[numSorted];
           //se inserta en la parte del arreglo ordenado
           for(index=numSorted;index>0;index--)
           {
              
               if (temp.compareTo(lista[index-1])>0)
               {
                   lista[index]=lista[index-1];
               }
               else
                   break;
           }
           //se reinserta el valor
           lista[index]=temp;
           numSorted++; //aumenta la cantidad de números ordenados
       }//termina while
       
       
       
   }//termina insertion sort ascendente
        
    
    
}
