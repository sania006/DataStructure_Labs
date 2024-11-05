/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree_datastructure;

/**
 *
 * @author Ali Computers
 */
public class TNode {
        String data;
        int childCount;
        TNode[] children;
        public TNode(String value,int TreeSize){
            this.data=value;
            children = new TNode[TreeSize];
            childCount=0;
        }
   public void addChild(TNode child){
       if(childCount<children.length){
           children[childCount++]=child;
           System.out.println(child.data+" have been added");
       } else{
           System.out.println("node is already filled");
       }
   }
   public void display(TNode node , int level){
    if(node==null){
        System.out.println("tree is null");
        return; }
     //System.out.println(" ".repeat(*2)+node.data);
       for(int i=0;i<node.childCount;i++){
           display(node.children[i],level+1);
       }
   }
}

      
      
   
  

   


