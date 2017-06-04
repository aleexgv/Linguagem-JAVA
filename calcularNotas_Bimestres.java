package exercicios;

import java.util.*;

public class RevisaoVetores {
    
    public static void main(String[] args){
        
        //Scanner input = new Scanner(System.in);
        
        final int TOTAL_ALUNOS = 4; // variavel constante
        final int TOTAL_BIMESTRES = 4; // '' constante
        final double NOTA_MINIMA = 70.0;
        
        Scanner input = new Scanner(System.in);
        String[] nomeAlunos = new String[TOTAL_ALUNOS];
        double[][] notaAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMESTRES];
        double[] mediaAlunos = new double[TOTAL_ALUNOS];
        
        // obter nome dos alunos
        for(int i=0; i< TOTAL_ALUNOS; i++){
            System.out.println("Informe o nome do " + (i+1) + " aluno: ");
            nomeAlunos[i] = input.nextLine();
        }
        
        System.out.println("");
        
        // obter nota dos alunos todos os bimestres
        for(int i=0; i< TOTAL_ALUNOS; i++){
            for(int j=0; j< TOTAL_BIMESTRES; j++){
                System.out.println("Informe a nota do aluno " + nomeAlunos[i] + " para o " + (j+1) + " bimestre: ");
                notaAlunos[i][j] = input.nextDouble();
            }
        }
        
        //calcular media dos alunos
        for(int i=0; i< TOTAL_ALUNOS; i++){
            for(int j=0; j< TOTAL_BIMESTRES; j++){
                mediaAlunos[i] += notaAlunos[i][j];
            }
            mediaAlunos[i] /= TOTAL_BIMESTRES;
        }
        
        // mostrar situação dos alunos
        System.out.println("========= RESULTADO FINAL =======");
        
        for(int i=0; i< TOTAL_ALUNOS; i++){
            
            if(mediaAlunos[i] >= NOTA_MINIMA){
                System.out.println("Nome: " + nomeAlunos[i] + "\nMedia: "+ mediaAlunos[i] + "\nSituação: Aprovado!\n\n");
            }else{
                System.out.println("Nome: " + nomeAlunos[i] + "\nMedia: "+ mediaAlunos[i] + "\nSituação: Reprovado!\n\n");
            }
        }
        
    }
}
