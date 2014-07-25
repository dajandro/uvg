/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Laboratorio 2
 * Daniel Orozco
 * Pablo Díaz
 * Javier Fong
 */
package postfix;


public class Stack {
    private int sp;
    private int tamaño;
    private int[] datos;
    
    public Stack()
    {
        datos = new int[100];
        sp = 99;
        tamaño = 100;
    }
    
    public Stack(int n)
    {
        datos = new int[n];
        sp = n-1;
        tamaño = n;
    }
    
    public boolean empty()
    {
        if (this.sp == this.tamaño)
            return true;
        else
            return false;
    }
    
    public int top()
    {
        if (this.sp < this.tamaño)
            return datos[sp];        
        else
            return (' ');
    }
    
    public int pop()
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