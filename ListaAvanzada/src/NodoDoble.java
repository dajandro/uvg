/*
 * Universidad del Valle de Guatemala.
*/

/**
 *
 * @author Pablo
 */
public class NodoDoble<T> implements Comparable{

    protected T _valor;
    protected NodoDoble<T> _siguiente;
    protected NodoDoble<T> _anterior;
    
    public NodoDoble(T valor)
    {
        _valor=valor;
        _siguiente = null;
        _anterior = null;
    }
    public NodoDoble (T valor, NodoDoble<T> siguiente, NodoDoble<T> anterior)
    {
      _valor = valor;
      _siguiente = siguiente;
      if (_siguiente!= null)
          _siguiente._anterior=this;
      _anterior=anterior;
      if (_anterior!=null)
          _anterior._siguiente=this;
    }

    @Override
    public int compareTo(Object other) {
        return (((Comparable)this._valor)).compareTo(other);
        
    }
    
    
    
    
}
