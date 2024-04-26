//Leia um valor de área em hectares e apresente-o convertido em metros quadrados m2.
//A fórmula de conversão é: M = H *10000, sendo M a área em metros quadrados e H a área em hectares.

import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em hectares ");

        float h = scanner.nextFloat();

        float soma = h*10000;

        System.out.println("O valor em hectares convertido para metros quadrados é " + soma);

    }
}
