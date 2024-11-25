/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bst;

/**
 *
 * @author Ali Computers
 */
import java.util.LinkedList;
import java.util.Queue;
public class Binary_ST {
    Node root;
    public Binary_ST(){
        root=null;
    }
    //INSERTION METHOD
    public void insertion(int value){
        root = insertRec(root, value);
    }
    public Node  insertRec(Node root,int value){
        if (root == null) {
         root = new Node(value);
        }

        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }
    public void deletion(int key){
       root = deleteRec(root, key);
    }
    public Node deleteRec(Node root,int key){
        if(root==null){
            return root;
        }
        //Case 1: If the deleted node is leaf node just directly delete it
        // Find the node to delete
        if (key < root.data) {
            root.left = deleteRec(root.left, key); // If the key is smaller, go left
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key); // If the key is greater, go right
        } else {
            // If key is the same as root's data, then this is the node to be deleted
            // Case 2: Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Node with two children
            // Get the inorder successor (smallest in the right subtree)
            root.data = MinValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }
    public int MinValue(Node root){
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
    public void Inorder() {
        InorderRec(root);
    }

    // Recursive inorder traversal
    private void InorderRec(Node root) {
        if (root != null) {
            InorderRec(root.left);
            System.out.print(root.data + " ");
            InorderRec(root.right);
        }
    }
    public boolean searchNode(int data){
        return search(root,data);
    }
    public boolean search(Node current,int data){
        if(current==null){
            return false;
        }
        if(data<current.data){
            return search(current.left,data);
        }
        else if(data>current.data){
            return search(current.right,data);
        } else{
            return true;
        }
    }
    public void inorder(){
        inorderTraversal(root);
    }
    private void inorderTraversal(Node current){
        if(current!=null){
            inorderTraversal(current.left);
            System.out.println(current.data+" ");
            inorderTraversal(current.right);
        }
    }
    public void preorder(){
        inorderTraversal(root);
    }
    private void preoderTraversal(Node current){
        if(current!=null){
           System.out.println(current.data+" ");
            inorderTraversal(current.left);
            inorderTraversal(current.right);
        }
    }
    public void postorder(){
        inorderTraversal(root);
    }
    private void postoderTraversal(Node current){
        if(current!=null){
           inorderTraversal(current.left);
            inorderTraversal(current.right);
            System.out.println(current.data+" ");
        }
    }
    public void levelorder(){
        if(root==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.println(current.data+" ");
            if(current.left!=null){
                queue.add(current.left);
            } if(current.right!=null){
                queue.add(current.right);
            }
        }
    }
    public static void main(String args[]){
        Binary_ST tree = new Binary_ST();   
        tree.insertion(50);
        tree.insertion(30);
        tree.insertion(20);
        tree.insertion(40);
        tree.insertion(70);
        tree.insertion(60);
        tree.insertion(80);
        
        System.out.println("Inorder traversal of the tree:");
        tree.Inorder(); 
        System.out.println("PRE ORDER");
        tree.preorder();
        System.out.println("POST ORDER");
        tree.postorder();
        tree.searchNode(40);
        tree.searchNode(50);
        System.out.println("LEVEL ORDER");
        tree.levelorder();
       /* System.out.println("\nDelete 20:");
        tree.deletion(20); // Deleting a leaf node
        tree.Inorder(); 
        
        System.out.println("\nDelete 30:");
        tree.deletion(30); // Deleting a node with one child
        tree.Inorder(); 

        System.out.println("\nDelete 50:");
        tree.deletion(50); // Deleting a node with two children
        tree.Inorder(); */
    }
    
}
