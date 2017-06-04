package exercicios;

import java.util.*;

public class Vetores {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int numAlunos = 5;
        double[] notasAlunos = new double[numAlunos];
        
        /*
        notasAlunos[0] = 6.7;
        notasAlunos[1]= 5.1;
        notasAlunos[2] = 4.5;
        notasAlunos[3] = 3.9;
        notasAlunos[4] = 4.0;
        System.out.println(notasAlunos[1]);
        */
        
        // int i, j;
        
        for(int i=0; i< numAlunos; i++){
            System.out.println("Insira a nota do " + (i+1) + " aluno: ");
            notasAlunos[i] = input.nextDouble();
        }
        
        for(int j=0; j< numAlunos; j++){
            System.out.println("--> " + notasAlunos[j]);
        }
    }
}
