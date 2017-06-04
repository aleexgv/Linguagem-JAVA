package exercicios;

import java.util.*;

public class Bissexto {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um ano: ");
        int ano = input.nextInt();
        
        boolean x = (ano % 400==0) || (ano % 4 == 0 && ano%100 !=0);
        
        /*
        if((ano % 400==0) || (ano % 4 == 0 && ano%100 !=0)){
            System.out.println("BISSEXTO");
        }else{
            System.out.println("NÃO BISSEXTO!");
        }
        */
        
        System.out.println(x);
    }
    
}
