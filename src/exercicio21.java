//Leia um valor de massa em libras e apresente-o convertido em quilogramas.
//A fórmula de conversão é: k = L*0.45, sendo K a massa em quilogramas e L a massa em libras.

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em libras ");
        float l = scanner.nextFloat();

        float soma = (float) (l*0.45);

        System.out.println("O valor em libras convertido para quilogramas é " + soma);


    }
}
