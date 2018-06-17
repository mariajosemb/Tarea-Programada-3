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
public class Arista {
    private Lugar origen;
    private Lugar destino;
    private int peso;
    
    public Arista(){
        origen=null;
        destino=null;
        peso=0;
    }
    public Arista(Lugar pOrigen, Lugar pDestino, int pPeso){
        origen=pOrigen;
        destino=pDestino;
        peso=pPeso;
        
    }

    //Métodos getters and setters
    public void setOrigen(Lugar pOrigen){
        origen=pOrigen;
    }
    void setDestino(Lugar pDestino){
        destino=pDestino;
    }
    
    
    public Lugar getOrigen(){
        return origen;
    }
    
    public Lugar getDestino(){
        return destino;
    }


}

