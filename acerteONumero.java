package exercicios;

import java.util.*; /* importar todas as bibliotecas util */

public class Loops {
    
    public static void main(String[] args){
        
        /* Jogo Acerte o Número */
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        boolean acertou = false;
        int tentativas = 10;
        int numeroSecreto = random.nextInt();
        long chute = 0;
        
        while(tentativas > 0 && acertou == false){
            System.out.println("Informe um chute: ");
            chute = input.nextLong();
            
            if(numeroSecreto == chute){
                System.out.println("Você acertou!");
                acertou = true;
            } else if(chute< numeroSecreto){
                System.out.println("Numero muito pequeno!");
                tentativas -=1;
                System.out.println("Agora você tem apenas " + tentativas + " tentativas!");
            }else{
                System.out.println("Numero muito grande!");
                tentativas -=1;
                System.out.println("Agora você tem apenas " + tentativas + " tentativas!");
            }
        }
        
    }
    
}
