/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de datos
 * Laboratorio 2
 * Daniel Orozco
 * Pablo Díaz 
 */
package postfix;


public class TPostfix {
    
    private String exp;
    private int tamaño;
    
    public TPostfix(String s)
    /**pre: recibe un string de lo ingresado en consola
    * post: el string es usado como la operacion a realizar
    */
    {
        exp = s;
    }
    
    public double eval(int n)
    /**pre: recibe el tamaño de la pila
    * post: regresa el resultado de la operacion
    */
    {        
        Stack se = new Stack(n);
        int i = 0;        
        //se recorre todo el string ingresado
        for (i = 0; i < exp.length(); i++ )
        {
            switch (exp.charAt(i))
            {
                //si el string es un numero en caracter, se envia a la pila como numero
                case '0': se.push(0); break;
                case '1': se.push(1); break;
                case '2': se.push(2); break;
                case '3': se.push(3); break;
                case '4': se.push(4); break;
                case '5': se.push(5); break;
                case '6': se.push(6); break;
                case '7': se.push(7); break;
                case '8': se.push(8); break;
                case '9': se.push(9); break;
                //cuando se lea la operacion de suma se hace la operacion y se 
                //envia el resultado a la pila
                case '+': 
                {
                    int o1 = se.pop();
                    int o2 = se.pop();                    
                    int n_res = o1 + o2;                                        
                    se.push(n_res);
                    break;
                }
                case '-':
                //cuando se lea la operacion de la resta se hace la operacion y se 
                //envia el resultado a la pila
                    
                {
                    int o1 = se.pop();
                    int o2 = se.pop();                    
                    int n_res = -o1 + o2;                                        
                    se.push(n_res);
                    break;                   
                }
                case '*':
                //cuando se lea la operacion de la mult. se hace la operacion y se 
                //envia el resultado a la pila
                {
                    int o1 = se.pop();
                    int o2 = se.pop();                    
                    int n_res = o1 * o2;                                        
                    se.push(n_res);
                    break;                    
                }
                case '/':
                 //cuando se lea la operacion de la division se hace la operacion y se 
                //envia el resultado a la pila
                {
                    int o1 = se.pop();
                    int o2 = se.pop(); 
                    int n_res = 0;
                    if (o1 != 0)
                        n_res = o2 / o1;
                    else
                        System.out.println("No se puede divir por 0");                    
                    se.push(n_res);
                    break;                    
                }
            }//termina switch
        }//termina for
        return se.pop();
    }//termina método
    
    // Sobrecarga de método eval para darle un tamaño default de 100 a la pila
    public double eval()
    /**pre: recibe el tamaño de la pila
    * post: regresa el resultado de la operacion
    */
    {        
        Stack se = new Stack();
        int i = 0;        
        //se recorre todo el string ingresado
        for (i = 0; i < exp.length(); i++ )
        {
            switch (exp.charAt(i))
            {
                //si el string es un numero en caracter, se envia a la pila como numero
                case '0': se.push(0); break;
                case '1': se.push(1); break;
                case '2': se.push(2); break;
                case '3': se.push(3); break;
                case '4': se.push(4); break;
                case '5': se.push(5); break;
                case '6': se.push(6); break;
                case '7': se.push(7); break;
                case '8': se.push(8); break;
                case '9': se.push(9); break;
                //cuando se lea la operacion de suma se hace la operacion y se 
                //envia el resultado a la pila
                case '+': 
                {
                    int o1 = se.pop();
                    int o2 = se.pop();                    
                    int n_res = o1 + o2;                                        
                    se.push(n_res);
                    break;
                }
                case '-':
                //cuando se lea la operacion de la resta se hace la operacion y se 
                //envia el resultado a la pila
                    
                {
                    int o1 = se.pop();
                    int o2 = se.pop();                    
                    int n_res = -o1 + o2;                                        
                    se.push(n_res);
                    break;                   
                }
                case '*':
                //cuando se lea la operacion de la mult. se hace la operacion y se 
                //envia el resultado a la pila
                {
                    int o1 = se.pop();
                    int o2 = se.pop();                    
                    int n_res = o1 * o2;                                        
                    se.push(n_res);
                    break;                    
                }
                case '/':
                 //cuando se lea la operacion de la division se hace la operacion y se 
                //envia el resultado a la pila
                {
                    int o1 = se.pop();
                    int o2 = se.pop(); 
                    int n_res = 0;
                    if (o1 != 0)
                        n_res = o2 / o1;
                    else
                        System.out.println("No se puede divir por 0");                    
                    se.push(n_res);
                    break;                    
                }
            }//termina switch
        }//termina for
        return se.pop();
    }//termina método
}
