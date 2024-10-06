/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab05;

/**
 *
 * @author Ali Computers
 */
public class Task03 {
    // Sort a List of Strings by Length
    public void sorted_Strings(String[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;i++){
                if(arr[j].length()>arr[j+1].length()){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        Task03 sortString = new  Task03();
        String[] arr = {"apple","pie","banana","cat"};
        System.out.println("ORIGINAL ARRAY WITHOUT SORTED");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        sortString.sorted_Strings(arr);
        System.out.println("SORTED STRING ARRAYS");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
