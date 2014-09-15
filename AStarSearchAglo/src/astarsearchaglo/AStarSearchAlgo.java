/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
*/

package astarsearchaglo;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Pablo
 */


 
 
public class AStarSearchAlgo{
 
 
    //h scores is the stright-line distance from the current city to Bucharest
    public static void main(String[] args)
    {

        //initialize the graph base on the Romania map
        
        int tamanio=4;
            
        ArrayList<Nodo>[][] matrix = new ArrayList[tamanio][tamanio];

        List<Nodo> listaNodos = new ArrayList();



        for (int j =0;j<tamanio;j++)
       {
           for (int i=0;i<tamanio;i++)
           {

               matrix[j][i] = new ArrayList<>();
               matrix[j][i].add(new Nodo("("+String.valueOf(i)+" "+String.valueOf(j)+")",255,i,j));
               listaNodos.addAll(matrix[j][i]);

           }

       }

//
//                //System.out.println(listaNodos);
//                 System.out.println(listaNodos.size());
//                 int cont = 0;
//                 int contTamanio = tamanio;
//                 
//                 
//                 for(int i=0;i<listaNodos.size();i++){
//                     int x = listaNodos.get(i).getPosX();
//                     int y = listaNodos.get(i).getPosY();
//                     
//                     if (y==0){
//                         Arista[] temp = new Arista[2];
//                        
//                            
//                            temp[0] = new Arista(listaNodos.get(1),10);
//                            temp[1] = new Arista(listaNodos.get(4),10);
//
//
//                        
//                        listaNodos.get(i).setAristas(temp);
//                        listaNodos.get(4).setAristas(new Arista[] {
//                            new Arista(listaNodos.get(0),10)
//                        });
//                        listaNodos.get(1).setAristas(new Arista[]{
//                            new Arista(listaNodos.get(0),10)
//                        });
//                     }
//                     
                     
//                     //System.out.println(listaNodos.get(i) +", " + i);
//                     if (y==0&&x<tamanio-1){
//                         
//                        int indice_matriz = listaNodos.indexOf(listaNodos.get(i));
//                        // System.out.println(indice_matriz);
//                   
//                        listaNodos.get(indice_matriz).setAristas(new Arista[]{
//                            new Arista(listaNodos.get(indice_matriz+1),10)
//                     
//                        });
//                       
//                       
//                     
//                     }
//                     if (x==0&&y<tamanio-1){
//                        int indice_matriz = listaNodos.indexOf(listaNodos.get(i));
//                         System.out.println(indice_matriz);
//                        listaNodos.get(4).setAristas(new Arista[]{
//                            new Arista(listaNodos.get(8),11)
//                     
//                        });
//                     }
//                     
                   /* 
                   
                    
                    if(y!=0){
                        listaNodos.get(y).setAristas(new Arista[]{
                            new Arista(listaNodos.get(x+1),10.0)
                        });
                    }
                    
                    /*if (x ==tamanio-1){
                        listaNodos.get(x).setAristas(new Arista[]{
                            new Arista(listaNodos.get(x-1),10)
                        });
                    }
                    if (y==tamanio-1){
                        listaNodos.get(y).setAristas(new Arista[]{
                            new Arista(listaNodos.get(y-1),10)
                        });
                    }
                     if (y != 0) {
                         listaNodos.get(x).setAristas(new Arista[]{
                             new Arista(listaNodos.get(y+1),10)
                         });
                   
                    }
                     
                    if (x != 0 && y != (tamanio - 1)) {
                        listaNodos.get(x-1).setAristas(new Arista[]{
                            new Arista(listaNodos.get(y+1),10)                            
                        });
                    
                    }
                    if (x != 0) {
                        listaNodos.get(x-1).setAristas(new Arista[] {
                           new Arista(listaNodos.get(y),10) 
                        });
               
                    }
                    if (x != 0 && y != 0){
                        listaNodos.get(x-1).setAristas(new Arista[] {
                            new Arista(listaNodos.get(y-1),10)
                        });
               
                }*/
                    
                    
//                 }
//                 for (int h = 0;h<listaNodos.size();h++){
//                      System.out.print(listaNodos.get(h));
//                      //System.out.println(listaNodos.get(h).getAristas());
////                     Arista[] lista =listaNodos.get(h).getAristas();
////                     for (int k =0;k<lista.length;k++)
////                         System.out.println(lista[k].getPeso());
////                     
//                     if (listaNodos.get(h).getPosX()==tamanio-1)
//                         System.out.println("");
//                 }
                

                 System.out.println(listaNodos);
                 calculateAdjacentNodes(listaNodos.get(0));

        AlgoritmoAStar algo = new AlgoritmoAStar(listaNodos.get(0),listaNodos.get(1));

        algo.mostrarCamino();



    }
    
     public static void  calculateAdjacentNodes(Nodo actual) {
            ArrayList<Nodo> results = new ArrayList<Nodo>();
            results.clear();
            for (int yy = actual.getPosY(); yy < actual.getPosY() + 1; yy++) {
               
                for (int xx = actual.getPosX(); xx < actual.getPosX() + 1; xx++) {
                 
                    
                    results.add(new Nodo("k",0.0, xx, yy));
                }
            }
            System.out.println(results.size());
            for (int l=0;l<results.size();l++){
                System.out.println("("+results.get(l).getPosX()+","+results.get(l).getPosY()+")");
            }
            
        }
    
    
     public static void crearArista(Nodo fuente, Nodo destino,int peso){
        fuente.setAristas(new Arista[]{
            new Arista(destino, peso)
        });
        destino.setAristas(new Arista[]{
            new Arista(fuente,peso)
        });
        
    }

}

//