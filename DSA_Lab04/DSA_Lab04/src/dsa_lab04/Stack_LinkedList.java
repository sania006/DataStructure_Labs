/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab04;

/**
 *
 * @author Ali Computers
 */
public class Stack_LinkedList {
    int size=0;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node top;
    public Stack_LinkedList(){
        top=null;
    }
    //PUSH METHOD (INSERT AT LINKEDLIST/STACK
    public void push(int data){
        Node newNode=new Node(data);
        if(top==null){
            System.out.println("List is Empty");
        }
        newNode.next=top;
        top=newNode;
    }
    //PEEK METHOD (TOP VALUE SHOW)
    public void peek(){
        System.out.println(top.data);
    }
    //POP METHOD (REMOVE VALUE)
    public int  pop(){
        int pop_data=top.data;
        return pop_data;
    }
    //IS EMPTY METHOD TO CHECK LIST IS EMPTY
    public boolean isEmpty(){
        return top==null;
    }
    //CHECK  LIST SIZE 
    public int size(){
        return size;
    }
    public static void main(String args[]){
        Stack_LinkedList list = new Stack_LinkedList();
        
        System.out.println(list.isEmpty());
        list.push(10);
        list.push(20);
        list.peek();
        list.push(30);
        list.push(40);
        list.peek();
        
        System.out.println(list.pop());
        list.peek();
        System.out.println(list.isEmpty());
        
        System.out.println("THE SIZE OF A LIST IS: "+list.size());
        
    }
            
            
           
}
