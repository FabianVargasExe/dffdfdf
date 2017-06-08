/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Usuario
 */
public class Main {
    
    public static void main(String[] args){
        ListaPollos lista = new ListaPollos();
        lista.insertarOrdenado(new Pollo(1,"m"));
        lista.insertarOrdenado(new Pollo(2,"s"));
        lista.insertarOrdenado(new Pollo(3,"d"));
        lista.insertarOrdenado(new Pollo(4,"f"));
    
    
    }
}
