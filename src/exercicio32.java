//Leia um numero inteiro e imprima a soma do seu sussesor de seu triplo com o antecessor de seu dobro.

import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        int soma = (numero * 3 + 1) + (numero * 2 - 1);

        System.out.println("O resultado da soma é: " + soma);


    }
}
