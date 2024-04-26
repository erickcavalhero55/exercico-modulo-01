//Leia um numero real e imprima o resultado do quadrado desse numero

import java.util.Scanner;

public class exercicio04 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero ");
        float a = scanner.nextInt();

        float qadrado = a * a;

        System.out.println("o numero ao qadrado é: " + qadrado);


    }
}
