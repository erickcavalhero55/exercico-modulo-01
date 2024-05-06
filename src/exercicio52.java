//Tres amigos jogaram na loteria. Caso eles ganhem, o premio deve ser repartido proporcionalmente ao valor que cada um deu para a realização  da aposta.
//Faça o programa que leia quanto cada apostador investiu,o valor do premio, e imprima quanto cada um ganharia do premio com a base no valor  investido.

import java.util.Scanner;

public class exercicio52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor investido por cada amigo
        System.out.print("Digite o valor investido pelo primeiro amigo: ");
        double investimento1 = scanner.nextDouble();
        System.out.print("Digite o valor investido pelo segundo amigo: ");
        double investimento2 = scanner.nextDouble();
        System.out.print("Digite o valor investido pelo terceiro amigo: ");
        double investimento3 = scanner.nextDouble();

        // Leitura do valor do prêmio
        System.out.print("Digite o valor do prêmio: ");
        double premio = scanner.nextDouble();

        // Cálculo do total investido
        double totalInvestido = investimento1 + investimento2 + investimento3;

        // Cálculo da parte do prêmio de cada amigo
        double parte1 = (investimento1 / totalInvestido) * premio;
        double parte2 = (investimento2 / totalInvestido) * premio;
        double parte3 = (investimento3 / totalInvestido) * premio;

        // Exibição do resultado
        System.out.println("O primeiro amigo ganharia: " + parte1);
        System.out.println("O segundo amigo ganharia: " + parte2);
        System.out.println("O terceiro amigo ganharia: " + parte3);

    }
}
