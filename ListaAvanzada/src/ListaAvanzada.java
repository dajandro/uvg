/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Oscar
 */
public class ListaAvanzada {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista _lista = new Lista();
        Scanner teclado  = new Scanner(System.in);
        
        int opcion =0;
        Random aleatorio = new Random();
        
        
        int i = aleatorio.nextInt(10)+1;
        
        while (opcion!= 10){
            System.out.print("1. Agregar al final\n");
            System.out.print("2. Mostrar\n");
            System.out.print("3. Agregar en posicion\n");
            System.out.println("4. Agregar al principio");
            System.out.println("5. Remover ultimo");
            System.out.println("6. Remover al principio");
            System.out.println("7 . contiene valor");
            System.out.println("8. salir");
            opcion = teclado.nextInt();
            System.out.println("");
            switch(opcion)
            {
                    
                case 1:
                    _lista.AgregarFinal(i);
                   i = aleatorio.nextInt(10)+1;
                    
                   
                    break;
                case 2:
                    
                    System.out.print(_lista.toString());
                    System.out.print("\n");
                    break;
                case 3:
                    int valor = teclado.nextInt();
                    int posicion = teclado.nextInt();
                    _lista.Agregar(valor, posicion);
                    break;
                case 4:
                    valor = teclado.nextInt();
                    _lista.AgregarPrincipio(valor);
                    break;
                case 5:
                    _lista.RemoverUltimo(); break;
                case 6:
                    _lista.RemoverPrimero(); break;
                case 7:
                    valor = teclado.nextInt();
                    if (_lista.contieneValor(valor)==true){
                        System.out.println("Si lo tiene");
                    }
                    else System.out.println("No lo tiene");
                    break;
                case 8:
                    valor=teclado.nextInt();
                    System.out.println(_lista.get(valor));
                    break;
                case 9:
                    Comparable[] lista = _lista.toArray();
                    
                    Comparable[] listaOrdenada = Sorting.bubbleSort(lista);
                    for (int j =0;j<listaOrdenada.length;j++){
                        System.out.println(listaOrdenada[j]);
                    }
            System.out.println("");
            }
            
          
        } 
                
        
     
    }
    
    

    
}
