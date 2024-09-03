/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab01;

/**
 *
 * @author Ali Computers
 */
public class task05 {
    public static void main(String args[]){
        //REVERSE ARRAY
        int[] arr={1,3,5,7,9};
        System.out.println("ORIGINAL ARRAY");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "+"\n");    
        }
        System.out.println("REVERSE ARRAY");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
