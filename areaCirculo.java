package exercicios;

import java.util.*;

public class Casting {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 10;
        int y = 6; int z=3;
        double c = 1.5;
       
        double casting = (double) x/y;
        
        System.out.println("x = " + casting);
        
        // calcular area de um circulo
        final double pi = 3.1456;
        
        System.out.println("Digite o raio do circulo : ");
        double raio = input.nextDouble();
        
        double area = pi * (raio*raio);
        System.out.println("O valor da area do circulo é: " + area);
    }
}
