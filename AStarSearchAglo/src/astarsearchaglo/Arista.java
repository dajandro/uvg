package astarsearchaglo;

/**
* Universidad Del Valle 
* Pablo Díaz 13203
*/

/**
 *
 * @author Pablo
 */
public class Arista{
    
    private double _peso;
    private Nodo _destino;
 
    public Arista(Nodo nodoDestino, double peso){
        _destino = nodoDestino;
        _peso = peso;
    }

    public double getPeso() {
        return _peso;
    }

    public void setPeso(double _peso) {
        this._peso = _peso;
    }

    public Nodo getDestino() {
        return _destino;
    }

    public void setDestino(Nodo _destino) {
        this._destino = _destino;
    }

  
        
        
}