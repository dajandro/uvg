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
public class TPostfix {
    private String exp;
    private int tamaño;
    
    public TPostfix(String s)
    {
        exp = s;
    }
    
    public double eval(int n)
    {        
        Stack se = new Stack(n);
        int i = 0;        
        for (i = 0; i < exp.length(); i++ )
        {
            switch (exp.charAt(i))
            {
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
                case '+': 
                {
                    int o1 = se.pop();
                    int o2 = se.pop();                    
                    int n_res = o1 + o2;                                        
                    se.push(n_res);
                    break;
                }
                case '-':
                {
                    int o1 = se.pop();
                    int o2 = se.pop();                    
                    int n_res = -o1 + o2;                                        
                    se.push(n_res);
                    break;                   
                }
                case '*':
                {
                    int o1 = se.pop();
                    int o2 = se.pop();                    
                    int n_res = o1 * o2;                                        
                    se.push(n_res);
                    break;                    
                }
                case '/':
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
            }
        }
        return se.pop();
    }
}
