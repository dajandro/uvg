/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Laboratorio 2
 * Daniel Orozco
 * Pablo Díaz 
 */




public class Postfix {

    /**
     * @param args the command line arguments
     * la entrada de datos se hace por medio del parametro args
     * Ejemplo de ejecucion:
     * javac PostFix.java
     * java Postfix 835*+ 12+4*3+
     * Se tiene que dejar un espacio para cada argumento
     */
    public static void main(String[] args) {
            
       
//<<<<<<< HEAD        
//=======
//>>>>>>> origin/master
        
        for (String s: args) {
            // Se crea el objeto tipo TPostfix para trabajar la cadena ingresada
            TPostfix calc = new TPostfix(s);
            // Se manda a llamar al método que calcula el valor
            double res = calc.eval(100);// El parámetro 100 es variable, este indica el tamaño de la pila
            System.out.println("Resultado: " + res);
        }
    }    
}
