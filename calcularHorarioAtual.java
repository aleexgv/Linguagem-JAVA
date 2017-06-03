package exercicios;

import java.util.*;

public class CalcularHorario {
    
    public static void main(String[] args){
        
        long totalMilisegundos = System.currentTimeMillis() - 10800000; // a subtração significa a diferença de horário aqui no Brasil.
        
        long totalSegundos = totalMilisegundos / 1000;
        long segundoAtual = totalSegundos % 60;
        
        long totalMinutos = totalSegundos / 60;
        long minutoAtual = totalMinutos %60;
        
        long totalHora = totalMinutos / 60;
        long horaAtual = totalHora % 24;
        
        System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAtual);
    }
}
