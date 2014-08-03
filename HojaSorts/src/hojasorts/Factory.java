/*
 * Universidad del Valle de Guatemala
 * Pablo Díaz 13203
 * Clase que decide que sort instanciar 
 * Factory.java
 */

package hojasorts;

/**
 *
 * @author Pablo
 */
public class Factory {
    
    
    
    //dependiendo de la entrada se instancia la clase 
    public BaseSorts getSort(String entry, Comparable[] list){
    //pre: recibe una lista de tipo comparable
    //post: devuelve una clase del tipo base sort que ordena la lista
        
        //se manda como parámetro la lista desordenada y el método la ordena
        
        
        if (entry.equals("1"))
            return new InsertionSort(list);
        if (entry.equals("2"))
            return  new BubbleSort(list);
        if (entry.equals("3"))
            return new QuickSort(list);
        else
            return new MergeSort(list);
       
        
    }

   
}
