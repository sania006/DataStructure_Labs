/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab01;

/**
 *
 * @author Ali Computers
 */
public class task2_Ex3 {
    public static void main(String args[]){
        //INSEERTION OF  AN ARRAY IN THE END
        //EXERCISE 3
        int[] arr={3,6,9,12,15};
        int element=18;
        arr[arr.length-1]=18;
        for(int i=0;i<arr.length;i++){
            System.out.println("element of an index "+i+" :"+arr[i]);
        }
    }
    
}
