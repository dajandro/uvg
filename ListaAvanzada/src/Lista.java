/*
 * Universidad del Valle de Guatemala
 * Pablo Díaz 13203
 */




public class Lista<T> {
    
    protected Nodo<T> Cabeza;
    protected int tamaño;
    
    public Lista(){
    //constructor pone la lista vacía
        Cabeza = null;
        tamaño = 0;
    }
    
    public int getTamaño()
    {
        int elemento=0;
        Nodo<T> NodoActual = Cabeza;
        while (NodoActual!=null)
        {
            elemento++;
            NodoActual=NodoActual.getSiguiente();
        }
        return elemento;
    }
    
    public boolean contieneValor(T valor){
        //pre: valor no es nulo
        //post: regrsa true si el valor es encontrado en la lista
        Nodo<T> NodoActual=Cabeza;
        while(NodoActual!=null&&!NodoActual.getValor().equals(valor))
        {
            NodoActual= NodoActual.getSiguiente();
        }
        return NodoActual!=null;
    }
    
     public T Cabeza()
    //pre: lista no esta vacía
    //post: regresa el primer valor de la lista
    {
        return (T) Cabeza.getValor();
    }
    
    public void AgregarFinal(T valor){
     //post: agrega un nodo al final de la lista
        
        Nodo<T> _newNodo = new Nodo(valor);
        
        if (Cabeza != null){
           
            Nodo<T> NodoActual = Cabeza;
            while(NodoActual.getSiguiente()!=null){
                NodoActual = NodoActual.getSiguiente();
            }
            NodoActual.setSiguiente(_newNodo);
        }
        else
            Cabeza = _newNodo;
        
        tamaño++;
        }
    
    public void AgregarPrincipio(T valor)
    //post: valor es agregado la principio de la lista
    {
        //primero Cabeza es asignado y despues es instanciado
        Cabeza = new Nodo(valor, Cabeza);
        tamaño++;
    }
    public void Agregar (T valor, int posicion)
     //pre: la posicion esta dentro el rango de la lista creada
     //post: añade valor en la posicion de la lista
    {
        if (!(0<=posicion||posicion>=getTamaño())){
            System.out.println("Out of bounds");
        }
        
        if (posicion==getTamaño()-1)
            AgregarFinal(valor);
        else if (posicion==0){
            AgregarPrincipio(valor); tamaño++;
        } 
        else
        {
            
            Nodo<T> NodoActual = Cabeza;
            //buscar a la posicion
            for (int i = 0;i<posicion-1;i++)
            {
                NodoActual = NodoActual.getSiguiente();
            }
           //el nodo actual es el nodo anterior
           NodoActual.setSiguiente(new Nodo(valor,NodoActual.getSiguiente()));
           tamaño++;
        }
        
    }
    public T RemoverPrimero()
    //pre: lista no esta vacia
    //post: remueve y regresa el valor del principio de la lista
    {
        Nodo<T> temp = Cabeza;
        Cabeza = Cabeza.getSiguiente();
        tamaño--;
        return temp.getValor();
    }
    
    
    public T RemoverUltimo()
    //pre: lista no esta vacia
    //post: remueve el ultimo valor de la lista
    {
        Nodo<T> NodoActual = Cabeza;
        Nodo<T> NodoAnterior = null;
        while (NodoActual.getSiguiente()!=null)
        {
            NodoAnterior= NodoActual;
            NodoActual = NodoActual.getSiguiente();
        }
        //nodo actual no esta vacio
        if (NodoAnterior == null)
        {
            //tiene un solo elemento
            Cabeza= null;
        }
        else
        {
            NodoAnterior.setSiguiente(null);
        }
        tamaño--;
        return NodoActual.getValor();
        
    }
   
    
    public T Remover(T valor)
    {
        Nodo<T> NodoActual= Cabeza;
        Nodo<T> NodoAnterior = null;
        while (NodoActual.getSiguiente()!=null&&!NodoActual.getValor().equals(valor))
        {
            NodoAnterior = NodoActual;
            NodoActual = NodoActual.getSiguiente();
        }
        if (NodoActual!=null)
        {
            if (NodoAnterior!=null)
            {
                Cabeza = NodoActual.getSiguiente();
            }else {
                NodoAnterior.setSiguiente(NodoActual.getSiguiente());
            }
            tamaño--;
            return NodoActual.getValor();
        }
        return null;
    }

    public T get(int pos)
    {
       if (pos<0||pos>=getTamaño()){
           System.out.println("position out of bounds");
           
       }
    
    Nodo<T> NodoActual = Cabeza;
    for (int i = 0; i<pos;i++)
    {
     
        NodoActual = NodoActual.getSiguiente();
    }
    return NodoActual.getValor();
          
     
    }
    
    public Comparable[] toArray()
    {
         Nodo<T> NodoActual = Cabeza;
        Comparable[] arreglo = new Comparable[getTamaño()];
        int i=0;
        while (NodoActual.getSiguiente()!=null)
        {
            arreglo[i]=(Comparable) NodoActual.getValor();
            NodoActual = NodoActual.getSiguiente();
            i++;
        }
        arreglo[i]=(Comparable) NodoActual.getValor();
        return arreglo;
    }
    
    
    public String toString(){
       Nodo Inicio = Cabeza;
       String strLista = "";
        StringBuilder _sb = new    StringBuilder();

        if (Inicio != null){        
            while (true)
            {
                _sb.append(Inicio.getValor());
                _sb.append("  -> ");            
                
                if (Inicio.getSiguiente()==null)
                    break;
                Inicio = Inicio.getSiguiente();
            }
        }
                

    _sb.append(" null");
    
    return _sb.toString();
    }

    
    
}

