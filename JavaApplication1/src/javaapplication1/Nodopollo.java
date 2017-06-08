/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Usuario
 */
public class Nodopollo {
    
    private Pollo pollo;
    private NodoPollo next;
    private NodoPollo prev;

    public Nodopollo(Pollo pollo) {
        this.pollo = pollo;
        this.next = null;
        this.prev = null;
    }
    
    
}
