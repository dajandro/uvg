/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Laboratorio 2
 * Daniel Orozco
 * Pablo Díaz
 * Javier Fong
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
        System.out.println("Ingrese expresión infix: \n");
        String entrada = entrada_datos.nextLine();
        TPostfix calc = new TPostfix(entrada);
        double res = calc.eval(100);
        System.out.println("Resultado: " + res);
    }
    
}
