/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab05;

/**
 *
 * @author Ali Computers
 */
import java.util.Scanner;
public class Task01 {
    /*Write a Java program to implement the Bubble Sort algorithm. Your task is to sort an
array of integers in ascending order using Bubble Sort.*/
    
    public void bubble_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }   
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Task01 sorting = new Task01();
        System.out.println("ENTER AN ARRAY SIZE");
        int size=input.nextInt();
        
        int[] arr = new int[size];
        System.out.println("ENTER ELEMENTS OF AN ARRAY");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();   
        }
        sorting.bubble_sort(arr);
        System.out.println("ELEMENTS OF AN ARRAY");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
     
        
                
    }
    
}
