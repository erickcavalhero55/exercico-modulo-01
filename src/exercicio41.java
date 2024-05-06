//Faça um programa que leia o valor da hora de trabalho (em reais) e numero de horas trabalhados no mes.
//Imprima o valor a ser pago ao funcionario, adicionando 10% sobre o valor calculado.

import java.util.Scanner;

public class exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora de trabalho: ");
        float hora = scanner.nextFloat();

        System.out.println("Digite o numero  de horas trabalhadas no mes: ");
        float numero = scanner.nextFloat();

        float soma1 = hora * numero;
        float soma2 = (float) (soma1 * 0.10);
        float soma3 = soma1 +soma2;

        System.out.println("O valor a ser pago com aumento de 10% é:  " + soma3);

    }

}
