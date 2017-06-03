package exercicios;

import java.util.*;

public class IntrodStrings {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual seu primeiro nome?");
        String primeiroNome = input.next();
        
        System.out.println("Qual seu ultimo nome?");
        String ultimoNome = input.next();
        
        System.out.println("Qual sua idade?");
        int idade = input.nextInt();
        
        
        System.out.println("Olá " + primeiroNome + " " + ultimoNome + " de " + idade + " anos");    
    }
}
