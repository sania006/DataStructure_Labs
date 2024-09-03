/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab01;

/**
 *
 * @author Ali Computers
 */
public class task2 {
   public static void main(String args[]){
       //INSERTION OF AN ARRAY
       int[] num=new int[8];
        num[0]=12;
        num[1]=24;
        num[2]=36;
        num[3]=48;
        num[4]=60;
       int element = 6;
       //EXERCISE:1
       //AT THE BEGINNING OF AN ARRAY INSERT
       for(int i=num.length-1;i>0;i--){
           num[i]=num[i-1];
       }
       num[0]=element;
       for(int i=0;i<num.length;i++){
           System.out.println("element of a index "+i+" :"+num[i]);
       }
      
      
   } 
}
