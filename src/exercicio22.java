//Leia um valor de comprimento em jardas e apresente-o convertido em metros.
//A fórmula de conversão é: M = 0.91*J, sendo J o comprimento em jardas e M o comprimento em metros.

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um comprimento em jardas ");
        float j = scanner.nextFloat();

        float soma = (float) (0.91*j);

        System.out.println("O valor em jardas convertido para metros é " + soma);

    }
}
