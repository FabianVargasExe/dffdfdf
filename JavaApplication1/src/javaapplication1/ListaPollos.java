/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Usuario
 */
public class ListaPollos {
    private NodoPollo first;
    private NodoPollo last;
    
    public ListaPollos(){
        this.first = null;
        this.last = null;
 
    }
    
    public void insertarUltimo(Pollo pollo){
        NodoPollo nuevo = new NodoPollo(pollo);
        // si la lista esta vacio
        if ( first == null){
            first = nuevo; 
        }else{
        last.setNext(nuevo);
        nuevo.setPrev(last);
        }
        last = nuevo;
    
    }
    
    public void imprimir(){
        NodoPollo aux = first;
        while(aux != null){
            Pollo pollo = aux.getPollo();
            System.out.println(pollo.getNombre());
            aux = aux.getNext();
        
        }
    public boolean eliminar (String nombre){
        NodoPollo aux = first;
        while(aux !=  null && !aux.getPollo().getNombre().equals(nombre)){
           
            aux = aux.getNext();
        
   
        }
        
        if (aux != null){
            // en caso de que sea el primero
            if (aux == first){
                first = first.getNext();
        //        aux.getNext().setPrev(null);        
            }else{
                // significa que no es el primero
               aux.getPrev().setNext(aux.getnext());
            }
            if (aux == last){
                last = last.getPrev();
          //      aux.getPrev().setNext(null);        
            }else{
                aux.getNext().setPrev(aux.getPrev());
            }
            return true;
            /* sirve cuando esta al medio
            aux.getPrev().setNext(aux.getnext());
            aux.getNext().setPrev(aux.getPrev());
        */
        }else{
            return false;
        }
    }
    
        public void insertarOrdenado(Pollo pollo){
            
            NodoPollo nuevo = new NodoPollo(pollo);
            NodoPollo aux = first;
            // si es mas chico avanza si se inserta un Z palabra mas grande es lo mismo
            // que insertarla a final
            while(aux != null && aux.getPollo().getNombre().equals(pollo) < 0){
               aux = aux.getNext();
            
            }
            if (aux != null){
                NodoPollo ant = aux.getPrev();
                if (aux == first){
                    first = nuevo;
                   /* aux.setPrev(nuevo);
                    nuevo.setNext(aux);  */    
                }else{
                ant.setNext(nuevo);
                nuevo.setPrev(ant);
            //    aux.setPrev(nuevo);
                }
                
            
            }else{
                if(first == null){
                   first = nuevo;
                }
                else{
                   last.setNext(nuevo);
                   nuevo.setPrev(last);   
                }
            last = nuevo;
        }
    
    }
    
        public boolean insertarPrimero(Pollo pollo){
            
            
    
        
         }
}
        
        
    
    }
    
