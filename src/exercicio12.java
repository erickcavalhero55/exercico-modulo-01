//leia uma distancia em milhas e apresente-a convertida em quilometros
//A formula de conversao é k = 1.61* M, sendo K a distancia em quilometros e M em milhas

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite uma distancia em Milhas: ");
        float m = scanner.nextFloat();

        float soma = (float) (1.61* m);

        System.out.println("A Distancia em Milhas convertida para Quilometros é " + soma);

    }
}
