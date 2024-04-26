//Leia um valor de massa em quilogramas e apresente-o convertido em libras.
//A fórmula de conversão é: L = k/0.45, sendo K a massa em quilogramas e L a massa em libras.

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em quilogramas: ");
        float k = scanner.nextFloat();

        float soma = (float) (k/0.45);


        System.out.println("O valor em quilogramas convertido para libras é " + soma);



    }
}
