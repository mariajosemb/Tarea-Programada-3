/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
import java.util.Vector;

/**
 *
 * @author mac
 * */

public class Arbol {
    NodoArbol raiz;
    Arbol hijoderecho;
    Arbol hijoizquierdo;
  
    
 //Metodo para verificar si el nodo esta vacio   
public boolean esVacio() {
    boolean vacio = true;

    if ( raiz != null )
        vacio = false;

    return vacio;
}



public void insertar(Lugar lugar){
    NodoArbol Nodo = new NodoArbol();
    Nodo.lugar = lugar;
    
    if(raiz == null){
        System.out.println("entro al IF");
        System.out.println("Empezando el arbol desde cero");
        raiz = Nodo;
        hijoderecho = new Arbol();
        hijoizquierdo = new Arbol();
  
         
    } 
    
    else{ 
        System.out.println("entro al ELSE");
        
        if (Nodo.lugar.getDireccion().compareTo(raiz.lugar.getDireccion()) > 0){
            System.out.println("La primera cadena es menor. Va a la izq.");
            hijoizquierdo.insertar(lugar);
          

         } else {
            System.out.println("La primera cadena es mayor. Va a la der.");
          hijoderecho.insertar(lugar);
        
                    
        }  
    
   
    }
}
public void inorden(){
    System.out.println("imprimiendo los nodos (la referencia)");
    inordenRec (raiz);
}

public void inordenRec (NodoArbol raiz){
    if (raiz != null){
        inordenRec (raiz.hijoizquierdo);
        System.out.println(raiz);
        inordenRec (raiz.hijoderecho);
    }
    
}

    
    
    
    

}
     

