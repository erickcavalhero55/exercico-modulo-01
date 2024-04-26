//Leia um valor de comprimento em metros e apresente-o convertido em jardas.
//A fórmula de conversão é: J = M/0.91, sendo J o comprimento em jardas e M o comprimento em metros.

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em metros ");
        float m = scanner.nextFloat();

        float soma = (float) (m/0.91);

        System.out.println("O valor em metros convertido para jardas é " + soma);

    }
}
