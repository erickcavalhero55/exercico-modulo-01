//Seja a e b os catetos de um triangulo, onde a hipotenusa e obtida pela equação:
//hipotenusa == raiz a ao quadrado = b ao quadrado. Faça um programa que receba os valores de a e b e calcule o valor da hipotenusa atraves da equação
//Imprima o resultado dessa operação.

import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do cateto a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do cateto b: ");
        double b = scanner.nextDouble();

        double hipotenusa = Math.sqrt(a * a + b * b);

        System.out.println("O valor da hipotenusa é: " + hipotenusa);

        scanner.close();
    }
}