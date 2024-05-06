//Uma empresa contrata um encanador a R$30,00 por dia.Faça um programa que solicite o número de dias trabalhado pelo encanador
//imprima a quantia liquida que devera ser paga, sabendo que sao 8% para imposto de renda.

import java.util.Scanner;

public class exercicio40{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite quantos dias que o encanador irá trabalhar:  ");
        float dia = scanner.nextFloat();

        float a = (float) (dia * 30.00);
        float b = (float) (a * 0.08);
        float soma = a - b;

        System.out.println("O salario liqido a ser pago é: R$" + soma);



    }
}
