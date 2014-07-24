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
        double a,b;
        Stack se = new Stack(n);
        int i = 0;
        String error = "";
        for (i = 0; i < exp.length(); i++ )
        {
            switch (exp.charAt(i))
            {
                case '0': se.push(exp.charAt(i)); break;
                case '1': se.push(exp.charAt(i)); break;
                case '2': se.push(exp.charAt(i)); break;
                case '3': se.push(exp.charAt(i)); break;
                case '4': se.push(exp.charAt(i)); break;
                case '5': se.push(exp.charAt(i)); break;
                case '6': se.push(exp.charAt(i)); break;
                case '7': se.push(exp.charAt(i)); break;
                case '8': se.push(exp.charAt(i)); break;
                case '9': se.push(exp.charAt(i)); break;
                case '+': 
                {
                    char o1 = se.pop();
                    char o2 = se.pop();
                    int n1 = Character.getNumericValue(o1);
                    int n2 = Character.getNumericValue(o2);
                    int n_res = n1 + n2;
                    char temp_res = (char)n_res;
                    se.push(temp_res);
                }
            }
        }
        return se.pop();
    }
}
