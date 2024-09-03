/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab01;

/**
 *
 * @author Ali Computers
 */
public class task04_Ex02 {
     public static void main(String args[]){
        //SEARCH ELEMENT BY LINEAR SEARCH
        int[] arr={4,6,2,8,10};
        int target =2;
        boolean found = false;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("element was found (target): "+target+" at index "+i);
                found=true;
                break;
            }
        }
        if(found==false){
            System.out.println("element was not found");
        }
    }
    
}
