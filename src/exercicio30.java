//Leia um valor em real e a cotação do dolar.Em seguida, imprima o valor correspondente do dolares.

import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em real: ");
        float r = scanner.nextFloat();

        System.out.println("Digite a cotação do dolar: ");
        float d = scanner.nextFloat();

        float soma = r * d;

        System.out.println("O valor em reais convertido para dolares na cotação de hj é: " + soma);

    }
}
