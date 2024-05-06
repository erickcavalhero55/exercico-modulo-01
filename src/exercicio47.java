//Leia um numeo inteiro de 4 digitos (de 1000 a 9999)e imprima 1 digito por linha.

import java.util.Scanner;

public class exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro de 4 dígitos (entre 1000 e 9999): ");
        int numero = scanner.nextInt();

        if (numero < 1000 || numero > 9999) {
            System.out.println("Número inválido. Por favor, digite um número de 4 dígitos.");
        } else {
            int digito1 = numero / 1000;
            int digito2 = (numero % 1000) / 100;
            int digito3 = (numero % 100) / 10;
            int digito4 = numero % 10;

            System.out.println(digito1);
            System.out.println(digito2);
            System.out.println(digito3);
            System.out.println(digito4);
        }
    }
}