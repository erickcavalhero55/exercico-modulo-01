//Leia quatros notas, calcule a média aritmética e imprima o resultado.

import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();

        System.out.println("Digite a quarta nota: ");
        float nota4 = scanner.nextFloat();

        float soma = nota1 + nota2 + nota3 + nota4 / 4 ;

        System.out.println("A media do aluno é: " + soma);

    }
}
