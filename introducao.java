package exercicios;

public class Inteiros{
    
    public static void main(String[] args){
        
        int x, y; 
        x = 150;
        y = 200;
        int soma = x+y;
        double z = 20.7;
        
        double resultado = z*z;
        int dia = 5;
        
        System.out.print("Hoje é dia \n" + dia);
        System.out.println("\nA soma é " + resultado);
        System.out.println("O valor de x é " + x);
        System.out.println("Voce tem " + x + " reais!");
        
        // tipos de dados primitivos
        /* inteiros */
        byte a = -128;
        byte b = 127;
 
        short c = -32768;
        short d = 3277;
 
        int e = -2147483648;
        int f = 2147483647;
 
        //Perceba a letra L no final do número
        long g = -9223372036854775808L;
        long h = 9223372036854775807L;
 
        //Perceba a letra f no final do número
        float i = -100.4345f;
        float j = 123243.4345f;
 
        double k = -3123.434354;
        double l = 321321.3123435;
 
        boolean m = false;
        boolean n = true;
 
        char o = 'a';
        char p = '4';
        char q = '?'; 
        
        // calcular area de um retângulo
        double altura = 39.9;
        double largura = 20.8;
        
        double area = altura * largura;
        double perimetro = (altura*2) + (largura*2);
        
        System.out.println("A area do retangulo é: " + area + "\nO perimetro do"
        + "retangulo é: " + perimetro);
        
    }
}
