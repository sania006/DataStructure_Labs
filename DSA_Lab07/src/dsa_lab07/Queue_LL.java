/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab07;

/**
 *
 * @author Ali Computers
 */
public class Queue_LL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }  
    }
    private Node front;
    private Node rear;
    public Queue_LL(){
        front=null;
        rear=null;
    }
    public void enqeue(int data){
        Node newNode = new Node(data);
        if(rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public int dequeue(){
        if(front==null){
            return -1;
        }
        int deqeue=front.data;
        front=front.next;
        return deqeue;
    }
    public int peek(){
        if(rear==null){
            return -1;
        }
        return front.data;
    }
    public static void main(String args[]){
        Queue_LL ll = new Queue_LL();
        ll.enqeue(10);
        ll.enqeue(20);
        ll.enqeue(30);
        System.out.println("dequque: "+ll.dequeue());
        System.out.println("peek: "+ll.peek());
    }
}
