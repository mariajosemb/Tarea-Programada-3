/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author mac
 * @param <E>
 */
public class NodoAB <E>{
 
public interface BinTree<E> {

        void setElement(E element); //pone un valor al nodo
        E getElement();  //retorna el valor del nodo
        void setLeft(NodoAB<E> left); //establece el hijo izquierdo
        NodoAB<E> getLeft(); //retorna el hijo izquierdo
        void setRight(NodoAB<E> right); //establece el hijo derecho
        NodoAB<E> getRight(); //retorna el hijo derecho
        boolean isLeaf(); //retorna si el nodo es hoja
        
        
        void visitNode(NodoAB<E> node); //visita el nodo
        void preorderTraverse(NodoAB<E> root); //recorrido preorden
        void postorderTraverse(NodoAB<E> root); //recorrido postorden
        void inorderTraverse(NodoAB<E> root); //recorrido inorden
    }

    //atributos
    //BinNode<E> root;

}
    

