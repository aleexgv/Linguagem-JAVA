package exercicios;

import java.util.*;

public class InteragirUsuario {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo;
        
        System.out.println("Informe o valor da base: ");
        base = input.nextDouble();
        
        System.out.println("Informe a altura agora: ");
        altura= input.nextDouble();
        
        
        areaRetangulo = base * altura;
        
        System.out.println("A area do retangulo eh: "+ areaRetangulo);
    }
}
