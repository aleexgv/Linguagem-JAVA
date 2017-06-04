package exercicios;

import java.util.*;

public class Switch {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selecione um numero entre 1 a 4: ");
        int num = input.nextInt();
        
        switch(num){
            case 1:
                //System.out.println("Voce escolheu UM!");
                //break;
            case 2:
                //System.out.println("Voce escolheu DOIS!");
                //break;
            case 3:
                System.out.println("Voce escolheu um numero ENTRE UM E TRES!");
                break;
            case 4:
                System.out.println("Voce escolheu QUATRO!");
                break;
            default:
                System.out.println("Voce escolheu um numero invalido!");
                break;
        }
    }
    
}
