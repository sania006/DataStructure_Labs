/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab11_graph;

/**
 *
 * @author Ali Computers
 */
/*import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;*/

import java.util.*;

public class AdjacentMatrix {
    int[][] adjacent_matrix;
    int no_vertics;
    //Constructor
    public AdjacentMatrix(int no_vertics){
        this.no_vertics=no_vertics;
        adjacent_matrix=new int[no_vertics][no_vertics];
    }
    //Add edges 
    //TASK01    
    public void addEdges(int u, int v){
        adjacent_matrix[u-1][v-1]=1;
    }
    //print matrix
    //TASK02
    public void print_matrix(){
        System.out.println("Adjacent Matrix");
        for(int i=0;i<no_vertics;i++){
            for(int j=0;j<no_vertics;j++){
                System.out.print(adjacent_matrix[i][j]+"");
            }
            System.out.println();
        }
    }
    //TASK3
    //FIND SHORTEST PATH
    public void shortestPath(int start, int destination){
        
    }
    //TASK04
    //FIND ALL PATH
    public void findallPath(){
        
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter a vertics");
        int vertics=input.nextInt();
        
        AdjacentMatrix graph = new AdjacentMatrix(vertics);
        
        System.out.println("enter a number of edges");
        int edges = input.nextInt();
        
        System.out.println("enter a edges as u,v");
        
        for (int i = 0; i < edges; i++) {
            int u = input.nextInt();
            int v = input.nextInt();
            graph.addEdges(u, v);
        }
        graph.print_matrix();
        graph.shortestPath(1, 4);
    }
}
