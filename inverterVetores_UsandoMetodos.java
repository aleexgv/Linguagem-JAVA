package exercicios;

import java.util.*;

public class RetornarVetoresDeUmMetodo {
    
    public static void main(String[] args){
        
        double[] aaa = {10.2, 34.7, 35.4, 46.3, 38.9};
        double[] ccc = inveterVetor(aaa);
        
        for(int i =0; i<ccc.length; i++){
            System.out.println(ccc[i]);
        }
        
    }
    
    public static double[] inveterVetor(double[] abc){
        
        double[] xyz = new double[abc.length];
        
        for(int i =0, j = xyz.length - 1; i<abc.length; i++, j-- ){
            xyz[j] = abc[i];
        }
        
        return xyz;
    }
}
