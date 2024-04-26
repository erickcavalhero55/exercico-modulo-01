//Leia o sálario de um funcionario.Calcule e imprima o valor do novo salario, sabendo que ele recebeu um aumento de 25 porcento

import java.util.Scanner;

public class exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario do funcionario: ");
        float salario = scanner.nextFloat();

        float soma = (float) (salario *  0.25);
        float resultado = salario + soma;

        System.out.println("O salario do funcionario com o aumento de 25 porcento é: " + resultado);
    }
}
