//Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
//A formula de conversao é: F = C*(9.0/5.0)+32.0,sendo F a temperatura em Fahrenheit e C a temperatura de Celsius

import java.util.Scanner;


public class exercicio06 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celsius:");
        float c =scanner.nextFloat();

        float soma = (float) (c*(9.0/5.0)+32.0);

        System.out.println(" A temperatura  convertido de Celsius para Fahrenheit é: " + soma);


        
    }
}
