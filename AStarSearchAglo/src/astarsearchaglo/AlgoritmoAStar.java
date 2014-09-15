package astarsearchaglo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/**
* Universidad Del Valle 
* Pablo Díaz 13203
*/

/**
 *
 * @author Pablo
 */
public class AlgoritmoAStar {
    
    private final int VerticalCost = 10;
    private final int HorizontalCost=10;
    private Nodo destino;

    public AlgoritmoAStar(Nodo inicio, Nodo destino) {
        this.destino=destino;
        Busqueda(inicio,destino);
        
    }
    
    
    private void Busqueda(Nodo inicio, Nodo destino){
        
        System.out.println(inicio+" inicio");
        System.out.println(destino+" destino");
        //Set de nodos que ya han sido evaluados
        //no permite nodos repetidos
        Set<Nodo> NodosEvaluados= new HashSet<>();
        //Cola de nodos a evaluar, capacidad inicial 20, compara el resultado f=g+h
        PriorityQueue<Nodo> NodoAEvaluar = new PriorityQueue<>(20,  new Comparador());
                                
        //costo inicial del nodo inicial
        inicio.setFuncion_g(0);
        //el primer nodo a evaluar
        NodoAEvaluar.add(inicio);
        //f_score[start] := g_score[start] + heuristic_cost_estimate(start, goal)

        boolean destinoEncontrado = false;

        while((!NodoAEvaluar.isEmpty())&&(!destinoEncontrado))
        {
            //se obtiene el primero nodo de la cola de los nodos no evaluados
            Nodo actual = NodoAEvaluar.poll();

            //se marca el nodo actual como evaluado
            NodosEvaluados.add(actual); 
             System.out.println("");
             System.out.println(NodosEvaluados.toString()+" ->evaluados");
            //se encuentra el destino
            if(actual.getValor().equals(destino.getValor())){
                    destinoEncontrado = true;
            }

            //revisar cada nodo conectado por las aristas creadas
            for(Arista e : actual.getAristas())
            {
                Nodo adyacente = e.getDestino();
                System.out.println(adyacente +" ady");

                double temp_g = actual.getFuncion_g() +  e.getPeso();
                double temp_f = temp_g + adyacente.getFuncion_h();


                /*si el nodo adyacente tiene mayor peso (funcion_f) se salta el nodo*/
                if((NodosEvaluados.contains(adyacente)) && (temp_f >= adyacente.getResultado_f())){
                    continue; //saltar iteracion
                }


                /*en el caso que el nodo adyacente no está en la cola o la funcion
                f es menor*/
                else if((!NodoAEvaluar.contains(adyacente)) || (temp_f < adyacente.getResultado_f())){

                    adyacente.setResultado(actual); //se agrega el nodo actual al set del camino más corto
                    System.out.println(actual + " ganador");
                    adyacente.setFuncion_g(temp_g); 
                    System.out.println("g " + adyacente.getFuncion_g());
                    System.out.println("h "+ adyacente.getFuncion_h());
                    System.out.println("f " + adyacente.getResultado_f());
                    adyacente.setResultado_f(temp_f);//se le pone el costo de la g+h

                    //si el conjunto de nodos no evaluados, ya contiene el nodo 
                    //que toca evaluar se quita el nodo
                    //regreso del algoritmo en caso que se encuentre 
                    //un mejor camino
                    if(NodoAEvaluar.contains(adyacente)){
                            NodoAEvaluar.remove(adyacente);
                    }

                    //después de haber evaluado el nodo actual
                    //se define el nuevo nodo a evaluar
                    NodoAEvaluar.add(adyacente);
                    System.out.println("");
                    System.out.println(NodoAEvaluar.toString()+" -> por evaluar");
                    
                   

                }//cierra else if

            }//cierra for

        }//cierra while

    }//cierra método búsqueda
        
    
    public int calculateHeuristic(Nodo actual, Nodo destino) {
       /* int hcost = (Math.abs(x - destination.x) + Math.abs(y - destination.y)) // 
            * (VerticalCost+ HorizontalCost) / 2;*/

    return 0;
    }
    
    public void mostrarCamino()
    {
        List<Nodo> path = new ArrayList<>();
        
        for(Nodo node = this.destino; node!=null; node = node.getResultado()){
            path.add(node);
        }
        
        Collections.reverse(path);
        System.out.println("");
        System.out.println(path.toString() + " ->Camino más corto");
    
    }//cierra método mostrar camino
    

}//cierra clase
