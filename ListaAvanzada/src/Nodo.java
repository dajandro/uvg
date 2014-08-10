
import java.util.Objects;

/*
 * Universidad del Valle de Guatemala
 * Pablo Díaz 13203
 */

public class Nodo<T> implements Comparable {
    protected T _valor;           //valor del nodo
    protected Nodo<T> _siguiente; // siguiente nodo
    
    public Nodo(){
        _valor = null;
        _siguiente = null;
    }
    
    
    public Nodo(T valor, Nodo<T> siguiente){
    //pre: se recibe un valor generico y el siguiente nodo a referenciar
    //post: un nuevo elemento es contruido como la cabeza de la lista
        _valor = valor;
        _siguiente = siguiente;
    }
    
    
    public Nodo(T valor){
        _valor = valor;
        _siguiente = null;
//        
    }
    
    
    public void setValor(T valor){
    //post: pone el valor del nodo
        this._valor = valor;
    }
    
    
    public void setSiguiente(Nodo<T> siguiente){
    //post: se pone la referencia al siguiente nodo
        _siguiente =  siguiente;
    }
    
    public T getValor(){
    //post: regresa el valor del nodo
        return _valor;
    }
    
    
    public Nodo<T> getSiguiente(){
     //post: regresa la referencia al siguiente nodo
        return _siguiente;
    }
    
    
    public boolean equals(Object other){
        
        return this._valor.equals(((Nodo)other).getValor());
    }
    
    @Override
    public int compareTo(Object other) {
        return (((Comparable)this._valor)).compareTo(other);
        
    }
    
    
    
}