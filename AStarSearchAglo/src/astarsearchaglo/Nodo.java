package astarsearchaglo;

/**
* Universidad Del Valle 
* Pablo Díaz 13203
*/

/**
 *
 * @author Pablo
 */
public class Nodo{
 
    private String _valor;
    private double _funcionG;
    private double _funcionH;
    private double _resultado_f = 0;
    private Arista[] _aristas;
    private Nodo _resultado;
    private int _PosX;
    private int _PosY;
 
    public Nodo(String nombre, double valorH, int x, int y){
            this._valor = nombre;
            this._funcionH = valorH;
            this._PosX=x;
            this._PosY=y;
    }

    
    public int getPosX() {
        return _PosX;
    }

    public void setPosX(int _PosX) {
        this._PosX = _PosX;
    }

    public int getPosY() {
        return _PosY;
    }

    public void setPosY(int _PosY) {
        this._PosY = _PosY;
    }

    

    public double getFuncion_h() {
        return _funcionH;
    }

    public void setFuncion_h(double _funcion_h) {
        this._funcionH = _funcion_h;
    }

    
    public String getValor() {
        return _valor;
    }

    public void setValor(String _valor) {
        this._valor = _valor;
    }

    
    public double getFuncion_g() {
        return _funcionG;
    }

    public void setFuncion_g(double _funcion_g) {
        this._funcionG = _funcion_g;
    }

    public double getResultado_f() {
        return _resultado_f;
    }

    public void setResultado_f(double _resultado_f) {
        this._resultado_f = _resultado_f;
    }

    public Arista[] getAristas() {
        
        return _aristas;
    }
     public String mostrarAristas() {
        String res="";
        for (int i=0;i<_aristas.length;i++)
        {
            res+=_aristas[i];
        }
        return res;
    }

    public void setAristas(Arista[] _aristas) {
        for (int j=0;j<_aristas.length;j++)
            System.out.println(_aristas[j].getPeso()+ " des");
        
        this._aristas = _aristas;
    }

    public Nodo getResultado() {
        return _resultado;
    }

    public void setResultado(Nodo _resultado) {
        this._resultado = _resultado;
    }

   
    
    
        
    @Override
    public String toString(){
            return _valor;
    }
 
}