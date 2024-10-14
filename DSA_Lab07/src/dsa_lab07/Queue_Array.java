/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab07;

/**
 *
 * @author Ali Computers
 */
public class Queue_Array {
    int[] array;
    int maxSize;
    int front;
    int rear;
    public Queue_Array(int size){
        array=new int[size];
        maxSize=size;
        front=0;
        rear=-1;
    }
    public void enqueue(int data){
        if(rear==maxSize-1){
            System.out.println("stack is full");
            return;
        }
        array[++rear]=data;
    }
    public int deqeue(){
        if(rear==-1){
            return -1;
        }
       return array[front++];
    }
    public int peek(){
        if(rear==-1){
            return -1;
        }
        return array[front];
    }
    public void display(){
        if(rear==-1){
            System.out.println("stack is empty");
        }
        for(int  i=0;i<=rear;i++){
            System.out.println("index: "+i+" : "+array[i]);
        }
        
    }
    public static void main(String args[]){
        Queue_Array array = new Queue_Array(5);
        array.enqueue(10);
        array.enqueue(20);
        array.enqueue(30);
        array.enqueue(40);
        array.enqueue(50);
        System.out.println("dequque: "+array.deqeue());
        System.out.println("peek: "+array.peek());
        array.display();
                
    }        
        
    
}

