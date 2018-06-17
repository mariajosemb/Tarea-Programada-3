/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author mac
 */
public class NodoArbol {
    public NodoArbol hijoizquierdo;
    public NodoArbol hijoderecho;
    Lugar lugar;
    
    //Constructor para un nodo vacio
    public NodoArbol(){
        lugar = null;
        hijoizquierdo = null;
        hijoderecho = null;
        
    }
    
    //Contructor en el que se le pasa como parametro el lugar favorito
    public NodoArbol(Lugar lugar){
        this.lugar = lugar;
        this.hijoderecho = hijoizquierdo;
        this.hijoderecho = hijoderecho;
    }
    
}
