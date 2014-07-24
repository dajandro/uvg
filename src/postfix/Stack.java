/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package postfix;

/**
 *
 * @author Daniel Orozco
 */
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
        if (sp == tamaño)
            return true;
        else
            return false;
    }
    
    public int top()
    {
        if (sp < tamaño)
            return datos[sp];        
        else
            return (' ');
    }
    
    public int pop()
    {
        int temp = 0;
        if ((sp < tamaño) && (sp > 0))
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
        if ((sp < tamaño) && (sp >0))
        {           
            datos[sp] = c;            
            sp--;
        }
        else
            System.out.println("Stack out of bounds");
    }
    
}