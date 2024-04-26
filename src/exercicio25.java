//Leia um valor de área em  acres e apresente-o em metros quadrados.
//A fórmula de conversão é: M = A*4048.58, sendo M a área em metros quadrados e A a aréa em acres.

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em acres ");
        float a = scanner.nextFloat();

        float soma = (float) (a*4048.58);

        System.out.println("O valor em acres convertido para metros quadrados é " + soma);

    }
}
