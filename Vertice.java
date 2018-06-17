/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Estructuras.Lugar;

/**
 *
 * @author mac
 */
public class Vertice {
    /**Atributos del Vertice
     * Lugar: Guarda los datos generados mediante el API de Google Maps
     * Visitado: Determina si el nodo fue visitado mediante algun tipo de recorrido
     */
    private Lugar valor;
    boolean visitado;
    /*Constructures*/
    public Vertice(){
        valor=null;
        visitado=false;
    }
    public Vertice(Lugar pValor){
        valor=pValor;
        visitado=false;
    }
    //Setters
    public void setValor(Lugar pValor){
        valor = pValor;
    }    
    public void setVisitado(boolean pVisitado) {
        visitado = pVisitado;
    }    
    //Getters
    public Lugar getValor() {
        return valor;
    }
    
    /*Determina si un nodo fue visitado en algun recorrido*/
    public boolean isVisitado() {
        return visitado;
    }
    
    /*RECORDAR EL METODO PARA MOSTRAR LA INFORMACION DEL VERTICE COMO STRING*/


}