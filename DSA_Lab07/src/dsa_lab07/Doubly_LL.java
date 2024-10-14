/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab07;

/**
 *
 * @author Ali Computers
 */
public class Doubly_LL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
   private Node head;
   private Node tail;
   public Doubly_LL(){
       head=null;
       tail=null;
   }
    public void insert_start(int data){
        Node newNode =new Node(data);
        if(head==null && tail==null){
            head=tail=newNode;
            return;
        }
        head.prev=newNode;
        head=newNode;
    }
    public void insert_end(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        head.next=newNode;
        newNode.prev=tail;
    }
}
