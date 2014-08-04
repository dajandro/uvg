/*
 * Universidad del Valle de Guatemala
 * Pablo Díaz
 * Daniel Orozco
 * Diego Jacobs
 * Roberto Chiroy
 * Clase que sirve como base para instanciar 4 algoritmos de ordenamiento
 * Se hace una clase para cada sort
 */

package hojasorts;

/**
 *
 * @author Pablo
 */
public class BaseSorts {
    //aqui se guarda la lista de números creadas
    protected Comparable[] listaNumeros;

    public BaseSorts() {
    }

    public Comparable[] getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(Comparable[] listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    

}
