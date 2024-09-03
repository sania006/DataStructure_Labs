/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab01;

/**
 *
 * @author Ali Computers
 */
public class task06 {
    //PALINDROME CHECKER
    public static void main(String args[]){
      char[] word={'r','a','d','a','r'};
    int left=0;
    int right=word.length-1;
    boolean isPalindrome=true;
    while (left<=right){
    if(word[left] != word[right]){
        isPalindrome=false;
        break;
    }
    left++;
            right--;
} 
    if(isPalindrome){
        System.out.println("this is palindrome");
    } else{
        System.out.println("this is not palindrome");
    }
    }
    
    
    
    
}
