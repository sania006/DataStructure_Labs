/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab05;

/**
 *
 * @author Ali Computers
 */
public class Task02 {
    //Implement Optimized Bubble Sort with Early Stopping
    public void earlySortBubbleSort(int[] arr){
        boolean swapped = true;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        
    }
    public static void main(String args[]){
        Task02 sort = new Task02();
        int[] arr = {2,1,3,4,5,6};
        System.out.println("UNSORTED ELEMENTS");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");          
        }
        System.out.println("\n");
        System.out.println("SORTED ELEMENTS");
        sort.earlySortBubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
                
    }
    
}
