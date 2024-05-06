//Faça um programa para converter uma letra maiuscula em letra minuscula.Use a tabela ASCII para resolver o problema.

import java.util.Scanner;

public class exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a letra maiúscula ao usuário
        System.out.print("Digite uma letra maiúscula: ");
        char letraMaiuscula = scanner.next().charAt(0);

        // Converte a letra maiúscula em minúscula usando a tabela ASCII
        // A diferença entre 'A' e 'a' na tabela ASCII é 32
        char letraMinuscula = (char) (letraMaiuscula + 32);

        // Imprime a letra minúscula
        System.out.println("A letra minúscula correspondente é: " + letraMinuscula);

    }
}
