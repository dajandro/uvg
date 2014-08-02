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
    
    private final String entry;
    
    public Factory(String entry){
        this.entry=entry;
    }
    //dependiendo de la entrada se instancia la clase 
    public BaseSorts getSort(Comparable[] list){
    //pre: recibe una lista de tipo comparable
    //post: devuelve una clase del tipo base sort que ordena la lista
        
        if (this.entry.equals("1"))
            return new InsertionSort(list);
        if (this.entry.equals("2"))
            return new BubbleSort(list);
        if (this.entry.equals("3"))
            return null; //QuickSort(list)
        else
            return null;//MergeSort(list)
        
    }

}
