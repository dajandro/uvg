/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package postfix;
import java.util.Scanner;

/**
 *
 * @author Daniel Orozco
 */
public class Postfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner entrada_datos  = new Scanner(System.in);
        System.out.println("Ingrese expresión infix:");
        String entrada = entrada_datos.nextLine();
        TPostfix calc = new TPostfix(entrada);
        double res = calc.eval(100);
        System.out.println("Resultado: " + res);
    }
    
}
