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
import Estructuras.Lugar;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
    public class Grafo {
        public static int n = 0;
        public static int[][] matriz;
        public static LinkedList <Vertice> vertices;  //Lista para almacenar los vértices del grafo
        //public static DatosTXT dato;

        //Constructor del grafo
        public Grafo(){
                this.vertices = new LinkedList<Vertice>();
                this.n = n;
                this.matriz = matriz;
        }
        //Metodo para agregar una vertice al grafo por medio de la latitud longitud y direccion
        public void agregarVertice(String pDireccion, double pLatitud, double pLongitud){
            Lugar nuevoLugar = new Lugar(pLatitud,pLongitud, pDireccion);
            vertices.add(new Vertice(nuevoLugar));  //Agrega el vértice al final de la lista de vértices
            System.out.print("nodo creado");
            System.out.print(vertices.size());}

        //Metodo para agragar vertices con un objeto de tipo lugar como parametro que ya tiene los datos
        public void agregarVertice(Lugar pLugar){
            vertices.add(new Vertice(pLugar));  //Agrega el vértice al final de la lista de vértices
            System.out.print("nodo creado");
            System.out.print(vertices.size());

        }
       //Método para buscar un vértice en la lista de vertices del grafo según el dato indicado
	//public Lugar buscarVertice(Lugar pLugar){
	//	for(int indice = 0; indice < this.vertices.size(); indice++){ //se recorre la lista de vertices
	//		if(this.vertices.get(indice)== Vertice)  //Si encuentra el vértice lo devuelve
	//			return this.vertices.get(indice);
	//	}
	//	return null;
	//}
        
       //Método para eliminar un vértice del grafo
	//public void eliminarVertice(Lugar pLugar){
	//	this.vertices.remove(buscarVertice(pLugar));  //Elimina el vértice de la lista de vértices
		//Elimina todas las aristas en las que el vértice eliminado aparezca como destino
	//	for(int i = 0; i < vertices.size(); i++)
	//		eliminarArista(vertices.get(i).vertice,pLugar);
	//}
        //Metodo para saber cuantas aritas asociadas posee un vertice
        public void buscarAristas(){

        }

        public void escribir(String ruta){
                FileWriter fichero = null;
                PrintWriter pw = null;

                try
                {
                    fichero = new FileWriter(ruta);
                    pw = new PrintWriter(fichero);

                    for (int i = 0; i < vertices.size(); i++){
                        pw.println (vertices.get(i).getValor().getDireccion() +","+ vertices.get(i).getValor().getLatitud() + "," + vertices.get(i).getValor().getLongitud());
                        System.out.println("guarde la linea");
                        //vertices.get(i).escribirArista("/Users/mac/Desktop/PlacesTEC/fichero_escritura.txt");
                    } 

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                   try {
                   // Nuevamente aprovechamos el finally para 
                   // asegurarnos que se cierra el fichero.
                   if (null != fichero)
                      fichero.close();
                   } catch (Exception e2) {
                      e2.printStackTrace();
                   }
                }
            }

        public ArrayList<String> leerTxt(String direccion){ //direccion del archivo
        ArrayList<String> al = new ArrayList<String>();


        String texto = "";

        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ //Hce el ciclo, mientras bfRead tenga datos
                temp = bfRead; //guardado el texto del archivo
                al.add(temp);
            }

            texto = temp;

        }catch(Exception e){ 
            System.err.println("No se han encontrado archivos");
        }


        return al;
        }



    }
