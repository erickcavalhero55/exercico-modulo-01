//Receba o salario-base de um funcionario.Calcule e imprima o salario a receber,sabendo-se que esse funcionario te uma gratificação de 5% sobre  salario-base.
//Alem disso ele paga 7% de imposto sobre o salario-base

import java.util.Scanner;

public class exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario-base do funcionario: ");
        float salariobase =scanner.nextFloat();

        float salario1 = (float) (salariobase * 0.05);
        float salario2 = (float) (salariobase * 0.07);
        float soma = salariobase + salario1 - salario2;

        System.out.println("O salario a receber é: R$" + soma);


    }
}
