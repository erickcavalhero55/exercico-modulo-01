//Leia um valor de volume em litros e apresente-o convertido em metros cúbicos m3 .
//A formula de conversao é : M = L /1000, sendo L o volume em litros e M o volume em metros cubicos.

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um volume em litros");
        float l = scanner.nextFloat();

        float soma = l/1000;

        System.out.println("O valor em litros convertido para metros cúbicos é " + soma );
    }
}
