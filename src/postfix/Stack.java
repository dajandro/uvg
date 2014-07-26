/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Laboratorio 2
 * Daniel Orozco
 * Pablo Díaz 
 */
package postfix;


public class Stack {
    
    private int sp; //atributo que representa el stack pointer de la pila
    private int tamaño;//atributo que representa el tamaño total de la pila
    private int[] datos;//atributo tipo vector para meter los valores en la pila
    
    public Stack()
    //pre: nada
    //post: inicia la pila con tamaño de 100 y apunta al proximo valor mas grande
    {
        datos = new int[100];
        sp = 99;
        tamaño = 100;
    }
    
    public Stack(int n)
   /**pre:constructor que recibe un entero no negativo
    * post:inicia la pila con el tamaño ingresado y coloca el valor al puntero
    */
    {
        datos = new int[n];
        sp = n-1;
        tamaño = n;
    }
    
    public boolean isempty()
    /**
    * post: regresa true si hay un valor en el puntero actual, falso en otro caso
    */
    {
        if (this.sp == this.tamaño)
            return true;
        else
            return false;
    }
    
    public int top()
    /**
    * post: regresa el valor de hasta arriba de la pila, si esta vacio 
    * manda un caracter vacio
    */
    {
        if (this.sp < this.tamaño)
            return datos[sp];        
        else
            return (' ');
    }
    
    public int pop()
    /**
    * post: regresa como entero el valor el valor que esta apuntando el puntero
    */
    {
        int temp = 0;
        if ((this.sp < this.tamaño) && (this.sp > 0))
        {            
            sp++;
            temp = datos[sp];
        }
        else
        {
            System.out.println("Stack out of bounds");
            temp = 0;
        }
        return temp;
    }
    
    public void push(int c)
    /**pre: recibe un entero como el valor a meter en la pila
    * post: asigna el valor en la posicion segun el puntero actual 
    * en caso de llegar a la ultima posicion de la pila se muestra el mensaje de error
    */
    {
        if ((this.sp < this.tamaño) && (this.sp >0))
        {           
            datos[sp] = c;            
            sp--;
        }
        else
            System.out.println("Stack out of bounds");
    }
    
}