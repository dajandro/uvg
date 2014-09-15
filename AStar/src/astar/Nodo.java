package astar;

import java.util.ArrayList;




/**
* Universidad Del Valle 
* Pablo Díaz 13203
*/

/**
 *
 * @author Pablo
 */
public class Nodo implements Comparable<Nodo>{
    
    private boolean isTerminado;
    private boolean isMeta;
    private boolean isObstaculo;
    private boolean isVisitado;
    private boolean isRaiz;
    private Nodo raiz;
    private Nodo arriba;
    private Nodo abajo;
    private Nodo izq;
    private Nodo der;
    private Grafo mapa;

    private int x;
    private int y;

    private double funcionh;//costo de llegar a la meta desde el nodo actual
    private double funciong;//costo de llegar al nodo actual desde la meta
    
    private final int costoVertical=0;
    private final int costoHorizontal=0;
    
    public Nodo(int x, int y, Grafo mapa) {
        this.x = x;
        this.y = y;
        this.isVisitado= false;
        this.funciong = costoVertical;
        this.isObstaculo = false;
        this.isRaiz = false;
        this.isMeta = false;
        this.mapa = mapa;
	}
    
    public ArrayList<Nodo> getNeighborsList() 
    {
        ArrayList<Nodo> listaNodoAdyacente = new ArrayList<Nodo>();
        
	if (y != 0) {
                listaNodoAdyacente.add(mapa.getNodo(x, (y - 1)));
        }
        if (y != 0 && x != mapa.getAncho()- 1) {
                listaNodoAdyacente.add(mapa.getNodo(x + 1, y - 1));
        }
        if (x != (mapa.getAncho()- 1)) {
                listaNodoAdyacente.add(mapa.getNodo(x + 1, y));
        }
        if ((x != (mapa.getAncho() - 1)) && (y != (mapa.getAlto() - 1))) {
                listaNodoAdyacente.add(mapa.getNodo(x + 1, y + 1));
        }
        if (y != (mapa.getAlto() - 1)) {
                listaNodoAdyacente.add(mapa.getNodo(x, y + 1));
        }
        if (x != 0 && y != (mapa.getAlto() - 1)) {
                listaNodoAdyacente.add(mapa.getNodo(x - 1, y + 1));
        }
        if (x != 0) {
                listaNodoAdyacente.add(mapa.getNodo(x - 1, y));
        }
        if (x != 0 && y != 0){
                listaNodoAdyacente.add(mapa.getNodo(x - 1, y - 1));
        }
        Object[] lol = listaNodoAdyacente.toArray();
        for (int i=0;i<lol.length;i++){
            System.out.println(lol[i].toString());
        }
        return listaNodoAdyacente;
    }
	

    public boolean equals(Nodo nodo) 
    {
        return (this.x == nodo.getX()) && (this.y == nodo.getY());
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override//comparar las distancias entre dos nodos
    public int compareTo(Nodo other) 
    {
        double distanciaTotal = this.funciong + this.funcionh;
	double otraDistanciaTotal = other.funciong + other.funcionh;
        if (distanciaTotal < otraDistanciaTotal)
                return -1; 
        if (otraDistanciaTotal < distanciaTotal)
                return 1;
        return 0;//si las distancias son iguales regresa 0

    }

    
}
