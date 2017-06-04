/* EXEMPLO 1 */

/*
PARAMETRO --> TIPO DE ARGUMENTO QUE UMA FUNÇÃO/METODO RECEBE

ARGUMENTO --> VALOR DO DADO QUE SERÁ PASSADO PARA A FUNÇÃO/METODO
*/

package exercicios;

import java.util.*;

public class Metodos {
    
    public static void main(String[] args){
        
        double areaRetangulo = retangulo();
        
        System.out.println("Area é: " + areaRetangulo);
    }
    
    /* criando um novo metodo, fora do metodo main */
    /* praticamente, semelhante a função vista em outras linguagens */
    public static double retangulo(){
        
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo =0;
          
        System.out.println("Informe a base do retangulo: ");
        base = input.nextDouble();
        System.out.println("Informe a altura do retangulo: ");
        altura = input.nextDouble();
        areaRetangulo = base * altura;
        //System.out.println("A area do retangulo é: " + areaRetangulo);    
        
        return areaRetangulo;
    }
}

// ------------------ EXEMPLO 2 ------------------ //
package exercicios;

import java.util.*;

public class Metodos {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double base, altura;
        
        System.out.println("Informe a base do retangulo: ");
        base = input.nextDouble();
        System.out.println("Informe a altura do retangulo: ");
        altura = input.nextDouble();
        double areaRetangulo = retangulo(base, altura);
        
        System.out.println("Area é: " + areaRetangulo);
    }
    
    /* criando um novo metodo, fora do metodo main */
    /* praticamente, semelhante a função vista em outras linguagens */
    public static double retangulo(double base, double altura){
   
        double areaRetangulo;
          
        areaRetangulo = base * altura;
        
        return areaRetangulo;
        
        // OU
        
        return base * altura;
    }
}
