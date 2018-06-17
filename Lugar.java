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
public class Lugar {
    
    private double latitud;
    private double longitud;
    private String direccion;
    
    public Lugar(){
        latitud=0.0;
        longitud=0.0;
        direccion="";
    }

    public Lugar(double pLatitud, double pLongitud, String pDireccion) {
        latitud = pLatitud;
        longitud = pLongitud;
        direccion = pDireccion;
    }

    public void setLatitud(double pLatitud) {
        latitud = pLatitud;
    }

    public void setLongitud(double pLongitud) {
        longitud = pLongitud;
    }

    public void setDirección(String pDirección) {
        direccion = pDirección;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getDireccion() {
        return direccion;
    }
    
     /*RECORDAR EL METODO PARA MOSTRAR LA INFORMACION DEL LUGAR COMO STRING*/

    
    
    
    
    
    
}
