/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab01;

/**
 *
 * @author Ali Computers
 */
public class task04_Ex03 {
    public static void main(String args[]){
        //SEARCH ELEMENT BY BINARY SEARCH
        int[] arr={10,20,30,40,50};
        int target=30;
        int left=0;
        int right=arr.length-1;
        int middle;
        boolean found =true;
        while (left<=right){
            middle=left+(right-left)/2;
            if(arr[middle]==target){
                System.out.println("element was found (target) "+target+" at index: "+middle);
                found=true;
                break;
                
            }
            if(arr[middle]<target){
              left=middle+1;  
            }
            else{
                right=middle-1;
            }
        }
        if(found==false){
            System.out.println("element was not found");
        }
        
    }
    
}
