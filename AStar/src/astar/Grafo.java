/**
* Universidad Del Valle 
* Pablo Díaz 13203
* Adolfo Morales 13014
*/

package astar;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class Grafo {
   private int ancho;
   private int alto;
   private ArrayList<ArrayList<Nodo>> mapa;
   
   public Grafo(int x, int y)
   {
       this.ancho=x;
       this.alto=y;
       crearGrafo();
   }
   
   public Nodo getNodo(int x, int y) {
        return mapa.get(x).get(y);
    }
   private void crearGrafo()
   {
        Nodo node;
        mapa = new ArrayList<ArrayList<Nodo>>();
        for (int y = 0; y < this.alto; y++) 
        {
            mapa.add(new ArrayList<Nodo>());
            for (int x = 0; x < this.ancho; x++) {
                    node = new Nodo(x, y, this);
                    mapa.get(y).add(node);
            }
        }
    }
   public void obtenerGrafo(){
        for (int y = 0; y < this.alto; y++) 
        {
            mapa.get(y);
            for (int x = 0; x < this.ancho; x++) {
                   mapa.get(x).get(x);
            }
        }
   }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public ArrayList<ArrayList<Nodo>> getMapa() {
        return mapa;
    }

    public void setMapa(ArrayList<ArrayList<Nodo>> mapa) {
        this.mapa = mapa;
    }
   
}
