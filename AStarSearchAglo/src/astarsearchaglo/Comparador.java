package astarsearchaglo;

import java.util.Comparator;

/**
* Universidad Del Valle 
* Pablo Díaz 13203
*/

/**
 *
 * @author Pablo
 */
public class Comparador implements Comparator<Nodo> {
    
   
    
    @Override
    public int compare(Nodo i, Nodo j)
    {
         if(i.getResultado_f()> j.getResultado_f()){
               return 1;
           }

           else if (i.getResultado_f() < j.getResultado_f()){
               return -1;
           }

           else{
               return 0;
           }
        }
 
    

}
