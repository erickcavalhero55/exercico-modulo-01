//Leia o tamanho do lado de um quadrado e imprima com o resultado a sua área.

import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);


    }
}

