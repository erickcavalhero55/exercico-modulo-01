//Faça um programa que leia o valor de um produto e imprima o valor com desconto, tendo em vista que o desconto foi de 12 porcento

import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor de um produto: ");
        float produto = scanner.nextFloat();

        float desconto = (float) (produto * 0.12);
        float resultado = produto - desconto;

        System.out.println("O valor do produto com desconto é: " + resultado);

    }
}
