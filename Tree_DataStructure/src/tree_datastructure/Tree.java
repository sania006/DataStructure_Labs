/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree_datastructure;

/**
 *
 * @author Ali Computers
 */
public class Tree {
    TNode root;
    public Tree(String data,int TotalChild){
        root = new TNode(data,TotalChild);
        System.out.println("Node "+data+" have been created");
    }
    
    
    public static void main(String args[]){
        Tree tree= new Tree("A",2);
        TNode B = new TNode("B",3);
        TNode C = new TNode ("C",4);
        tree.root.addChild(B);
        tree.root.addChild(C);
        //tree.root.display();
    }        
}
