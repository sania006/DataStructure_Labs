/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab01;

/**
 *
 * @author Ali Computers
 */
public class task2_Ex2 {
    public static void main(String args[]){
      int[] arr={100,200,300,400,500};
    int element=250;
    int position=2;
    //INSERTION OF AN ARRAY IN THE MIDDLE
    for(int i=arr.length-1;i>0;i--){
       arr[i]=arr[i-1];
    }
    arr[position]=element;
    for(int i=0;i<arr.length;i++){
       System.out.println("element of the index "+i+" :"+arr[i]); 
    }
    
    }
    
    
}
