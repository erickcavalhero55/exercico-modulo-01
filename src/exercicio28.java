//faca a leitura de tres valores e apresente como resultado a soma dos quadrados dos tres valores lidos

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();

        double soma = valor1 * valor1 + valor2 * valor2 + valor3 * valor3;

        System.out.println("A soma dos quadrados dos valores é: " + soma);


    }
}


