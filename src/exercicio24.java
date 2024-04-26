//Leia um valor de área em metros quadrados m2 e apresente-o em acres.
//A fórmula de conversão é: A = M*0.000247, sendo M a área em metros quadrados e A a aréa em acres.

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma área em metros quadrado ");
        float m = scanner.nextFloat();

        float soma = (float) (m*0.000247);

        System.out.println("O em metros quadrados convertido para acres é " + soma);

    }
}
