//Implemente um programa que calcule o ano de nascimento de uma pessoa a parti de sua idade e do ano atual.

import java.util.Scanner;

public class exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int anoNascimento = anoAtual - idade;

        // Exibição do ano de nascimento
        System.out.println("O ano de nascimento da pessoa é: " + anoNascimento);
    }
}
