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
    private char[] datos;
    
    public Stack()
    {
        datos = new char[100];
        sp = 100;
        tamaño = 100;
    }
    
    public Stack(int n)
    {
        datos = new char[n];
        sp = n;
        tamaño = n;
    }
    
    public boolean empty()
    {
        if (sp == tamaño)
            return true;
        else
            return false;
    }
    
    public char top()
    {
        if (sp <= tamaño)
            return datos[sp];        
        else
            return (' ');
    }
    
    public char pop()
    {
        if ((sp <= tamaño) && (sp > 0))
        {
            sp++;
            return datos[sp];            
        }
        else
        {
            System.out.println("Stack out of bounds");
            return (' ');            
        }
    }
    
    public void push(char c)
    {
        if ((sp <= tamaño) && (sp >0))
        {
            sp--;
            datos[sp] = c;
        }
        else
            System.out.println("Stack out of bounds");
    }
    
}