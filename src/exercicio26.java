//Leia um valor de área em metros quadrados m2 e apresente-o convertido em hectares.
//A fórmula de conversão é: H = M * 0.0001, sendo M a área em metros quadrados e H a área em hectares.

import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em metros quadrados ");
        float m = scanner.nextFloat();

        float soma = (float) (m*0.0001);

        System.out.println("O valor de metros quadrados convertido para hectares é " + soma);

    }
}
