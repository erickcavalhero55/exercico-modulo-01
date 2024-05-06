//Faça um programa que leia um numero inteiro positivo de 3 digitos (de 100 a 999).
//Gere outro numero formado pelos digitos invertidos do numero lido.

import java.util.Scanner;

public class exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número de 3 dígitos ao usuário
        int numero;
        do {
            System.out.print("Digite um número de 3 dígitos (entre 100 e 999): ");
            numero = scanner.nextInt();
        } while (numero < 100 || numero > 999);

        // Calcula o número invertido
        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;
        int numeroInvertido = unidades * 100 + dezenas * 10 + centenas;

        // Imprime o número invertido
        System.out.println("O número invertido é: " + numeroInvertido);

    }
}
