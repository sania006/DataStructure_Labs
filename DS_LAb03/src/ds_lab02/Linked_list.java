/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds_lab02;

/**
 *
 * @author Ali Computers
 */
public class Linked_list {
         int data;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
    }
    }
    private Node head;
    public Linked_list(){
        this.head=null;
    }
    //Insert at Start:
    public void insertatStart(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    //Insert at end:
    public void insertAtend(int data){
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
    }
    //Insert At Position:
    public void insertAtPosition(int data,int pos){
        Node neWNode= new Node(data);
     if(pos==0){
        neWNode.next=head;
        head=neWNode;
        return;
     }
     Node Current = head;
    for(int i=0; i<pos-1; i++){
        Current = Current.next;
    }
    neWNode.next=Current.next;
    Current.next=neWNode;
    }
    //Display Method
    public void display(){
        if(head==null){
                System.out.println("The List is empty");
                return;
            }
       Node Current=head;
    while(Current!=null){
        System.out.print(Current.data+"->");
        Current=Current.next;
    }
    System.out.println("null");
    }
    //DELETION OPERATIONS
    public void deleteAtStart(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void deletefromEnd(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Deleted node from end");
            return;
       }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public void deleteByValue(int data){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted node with value " + data);
            return;
        }
        Node Current = head;
        while (Current.next != null && Current.next.data != data) {
            Current = Current.next;
        }
        if (Current.next == null) {
            System.out.println("Value not found");
            return;
        }
        Current.next = Current.next.next;
    }
    public void SEarchbyValue(int value){
        Node Current = head;
        int index = 0;
        while (Current != null) {
            if (Current.data == value) {
                System.out.println("Value " + value + " found at position " + index);
                return;
            }
            Current = Current.next;
            index++;
        }
        System.out.println("Value not found");
    }
    public void  reverseList(){
        Node Previous = null;
        Node current = head;
        while (current != null) {
            Node Next = current.next;
            current.next = Previous;
            Previous = current;
            current = Next;
        }
        head = Previous;
        System.out.println("List reversed");
    }
    public int countNodes(){
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public void sizeList(){
        int Size=0;
        if(head==null){
            System.out.println(Size);
            return;
        }
        Node current = head;
        while(current != null){
            Size++;
            current = current.next;
        }
        System.out.println(Size);
    }
    
    public static void main(String aargs[]){
        Linked_list LL = new Linked_list();
        System.out.println("INSERTION OPERATIONS");
        System.out.println("-----------------------");
        System.out.println("INSERTION AT START");
        LL.insertatStart(10);
        LL.insertatStart(20);
        LL.insertatStart(30);
        LL.insertatStart(40);
        LL.display();
        System.out.println("INSERT AT END");
        LL.insertAtend(60);
        LL.insertAtend(70);
        LL.insertAtend(80);
        LL.display();
        System.out.println("INSERT AT POSITION");
        LL.insertAtPosition(120, 3);
        LL.insertAtPosition(34, 2);
        LL.display();
        System.out.println("-----------------------");
        System.out.println("DELETION OPERATIONS");
        System.out.println("-------------");
        System.out.println("DELETE AT START");
        LL.deleteAtStart();
        LL.display();
        System.out.println("DELETE AT END");
        LL.deletefromEnd();
        LL.display();
        System.out.println("DELETE BY VALUE");
        LL.deleteByValue(34);
        LL.deleteByValue(20);
        LL.display();
        System.out.println("----------------------");
        System.out.println("SEARCH OPERATION");
        LL.SEarchbyValue(60);
        System.out.println("------------------");
        System.out.println("REVERSE LIST");
        LL.reverseList();
        System.out.println("COUNT NODES:------");
        LL.countNodes();
        System.out.println("SIZE LIST:----");
        LL.sizeList();
    }
    
    
}
