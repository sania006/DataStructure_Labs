/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab04;

/**
 *
 * @author Ali Computers
 */
public class Stack_Array {
    private int[] array;
    private int top;
    private int maxSize;
    
    //CONSTRUCTOR TO INITIALIZE A STACK
    public Stack_Array(int size){
        array=new int[size];
       // top=-1;
        maxSize=size;
        top=-1;//INDICATES AN EMPTY ARRAY
    }
   //PUSH METHOD  TP PUSH A VALUE IN A STACK(INSERT AN ELEMENT AN ARRAY
    public void push(int element){
        if (top==maxSize-1){
            System.out.println("STACK IS FULL");
           return;
        }
        array[++top]=element;
    }
    //POP METHOD TO REMOVE AN ELEMENT FROM AN ARRAY
    public int pop(){
        if(top==-1){
            System.out.println("STACK IS EMPTY");
            return -1;
        }
        return array[top--];
    }
    //ISEMPTY METHOD TO HCECK STACK IS EMPTYT OR NOT
    public boolean isEmpty(){
        return top==-1;
    }
    public int peek(){
        if(top==-1){
            System.out.println("STACK IS EMPTY");
            return -1;
            
        }
        return array[top];
    }
    public int size(){
        return top+1;
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    //PRINT STACK ELEMENTS
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        Stack_Array stack = new Stack_Array(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.display();
        System.out.println("STACK POP ELEMENT: "+stack.pop());
        System.out.println("STACK PEEK ELEMENT: "+stack.peek());
        System.out.println("STACLK IS EMPTY: "+stack.isEmpty());
    }
    
}
