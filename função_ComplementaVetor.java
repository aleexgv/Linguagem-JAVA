package exercicios;

import java.util.*;

public class Vetores2 {
    
    public static void main(String[] args){
        
        int i;
        //int[] x = new int[50];
        
        int[] x = {1, 2, 3, 4, 5, 6, 7};
        
        /* função biblioteca java que complementa algum vetor, começando da posião 2 até a posição 4 */
        java.util.Arrays.fill(x,  2,5,  20);
        
        for(i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
        
        
    }
}
