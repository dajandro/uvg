package hojasorts;

/*
 * Universidad del Valle de Guatemala
 * Pablo Díaz
 * Daniel Orozco
 * Diego Jacobs
 * Roberto Chiroy
 */

public class Nodo implements Comparable {
    private int _valor;
    private Nodo _siguiente;
    
public Nodo(){
    _valor = -1;
    _siguiente = null;
}
 
 
public Nodo(int valor, Nodo siguiente){
    _valor = valor;
    _siguiente = siguiente;
}


public Nodo(int valor){
    _valor = valor;
    _siguiente = null;
}
    

public void setValor(int valor){
    this._valor = valor;
}


public void setSiguiente(Nodo siguiente){
    _siguiente =  siguiente;
}

public int getValor(){
    return _valor;
}


public Nodo getSiguiente(){
    return _siguiente;
}

    public boolean equals(Object other){
        
        return this._valor==((Nodo)other).getValor();
    }

    @Override
    public int compareTo(Object other) {
        int resultado;
        int otroValor = ((Nodo)other).getValor();
        if (this._valor>otroValor)
            resultado=1;
        else if (this._valor<otroValor)
            resultado=-1;
        else
            resultado=0;
        
        
        return resultado;
            
    }
    
    public String toString ()
    {
        return Integer.toString(this._valor) ;
    }
    

}
