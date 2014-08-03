/*
 * Universidad del Valle de Guatemala
*/
package hojasorts;
/**
 *
 * @author Pablo
 */
public class QuickSort extends BaseSorts{

    public QuickSort(Comparable numeros[]) {
        
        /*Mando a llamar el ordenamiento, que recibe como parámetros:
                    - el arreglo de numeros enteros
                    - el pivote para particionar la lista en el principio, que en nuestro caso
                        es tambien mi first index o minimium index
                    - el last index o maximium index*/
        quicksort(numeros, 0, numeros.length-1);
    }
    
    
    public void  quicksort(Comparable numeros[], int izq, int der){
        int pivot;
        /*Verifico que los index sean correctos*/
        if (izq >= der) return;
        
        //mis index que funcionan como constantes que almacenan los index en condiciones iniciales
        //int i = izq;
        //int d = der;
        pivot=partition(numeros,izq,der);
        quicksort(numeros,izq,pivot-1);
        quicksort(numeros,pivot+1,der);
        
       
        
    }
        
        private int partition(Comparable numeros[],int izq, int der){
            while(true){
                while(izq<der&&(numeros[izq].compareTo(numeros[der]))>0)der--;
                if(izq<der)swap(numeros,izq++,der);
                else return izq;
                while(izq<der&&(numeros[izq].compareTo(numeros[der])>0))izq++;
                if(izq<der)swap(numeros,izq,der--);
                else return der;
            }
        }
        public void swap(Comparable[] data, int i , int j)
        {
            Comparable temp;
            temp=data[i];
            data[i]=data[j];
            data[j]=temp;
            
        }
    

}
