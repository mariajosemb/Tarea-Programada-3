/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import javax.swing.JOptionPane;

/**
 *
 * @author Maria Jose M
 */
public class BinarySearchTree {
    /* Class containing left and right child of current node and key value*/
	public class Node {
		String key;
		Node left, right;

		public Node(String item) {
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	public BinarySearchTree() { 
		root = null; 
	}
        
        
        

	// This method mainly calls insertRec()
	public void insert(String key) {
	root = insertRec(root, key);
	}
	
	/* A recursive function to insert a new key in BST */
	public Node insertRec(Node root, String key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
                    System.out.println("Empezando el arbol");
			root = new Node(key);
			return root;
		}
                else if (root != null){
                
                    /* Otherwise, recur down the tree */
                    //if (key < root.key){
                    if (key.compareTo(root.key) < 0) {
                        System.out.println("La primera cadena es menor. Va a la izq.");
                        root.left = insertRec(root.left, key);
                    }
                    else {
                        System.out.println("La primera cadena es mayor. Va a la der.");
                            root.right = insertRec(root.right, key);
                    }

		/* return the (unchanged) node pointer */
		
                }
                return root;
        }

	// This method mainly calls InorderRec()
	public void inorder() {
	inorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
                
	}
         // This method mainly calls deleteRec()
    public void deleteKey(String key)
    {
        root = deleteRec(root, key);
    }
 
    /* A recursive function to insert a new key in BST */
    public Node deleteRec(Node root, String key)
    {
        System.out.println("________Eliminando______");
        /* Base Case: If the tree is empty */
        if (root == null)  return root;
    
        /* Otherwise, recur down the tree */
        if (key.compareTo(root.key) < 0)
            root.left = deleteRec(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = deleteRec(root.right, key);
 
        // if key is same as root's key, then This is the node
        // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.key = minValue(root.right);
 
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
        
        return root;
       
    }
    
    public String minValue(Node root)
    {
        String minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
        
     
    
}
