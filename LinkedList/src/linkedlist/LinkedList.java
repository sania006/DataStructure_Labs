/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

/**
 *
 * @author Ali Computers
 */
public class LinkedList {
    int list_size=0;

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    LinkedList(){
        this.head=null;
    }
    public void inserAtStart(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void display(){
        if(head==null){
         System.out.println("the list is empty");   
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        
    }
    public void deleteAtStart(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        head=head.next;
    }
    public void size(){
        int size=0;
        if(head==null){
            System.out.println(size);
            return;
        }
        Node current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        System.out.println(size);
    }
    public void insertionAtend(int data){
        Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
    } else {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
               //HOME WORK SUBMIT ON THE CLASSROOM TILL 11:55 
    }
    
    public void deleteatend(){
   // HOME WORK SUBMIT ON THE CLASSROOM TILL 11:55 
   if (head == null) {
        System.out.println("The list is empty");
        return;
    }
    if (head.next == null) {
        head = null;
        return;
    }
    Node current = head;
    while (current.next.next != null) {
        current = current.next;
    }
    current.next = null;
    }
   
   
    public static void main(String[] args) {
        // TODO code application logic here
       // System.out.println("Hello World!");
       LinkedList list = new LinkedList();
        System.out.println("--INSERTION AT START--");
       list.inserAtStart(10);
       list.inserAtStart(20);
       list.inserAtStart(30);
       list.inserAtStart(40);
       list.display();
        System.out.println("--DELETETION AT START--");
       list.deleteAtStart();
       list.display();
        System.out.println("--SIZE OF LIST--");
       list.size();
        System.out.println("----------------------");
        System.out.println("INSERTION AT END:");
        list.insertionAtend(70);
        list.display();
        System.out.println("DELETION AT END");
        list.deleteatend();
        list.display();
       
       //time complexity of methods of linkedlists (Linked vs array)
       //insert at start = O(1)   |   O(n)
       //display = O(n)           |   O(n)
       //size = O(n)              |   size is available in array
       //deleteatstart = O(1)     |   O(n)
       //insertatend = O(n)       |
       
       //in space complexity array is better than list bcz it takes alot of space.
       //in time complexity linkedlist is better than array.
       
    }
    
}
