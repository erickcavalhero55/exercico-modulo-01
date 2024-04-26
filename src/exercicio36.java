//Leia a altura e o raio de um cilindro circular e o imprima o volume do cilindro.O volume de um cilindro circular é calculado por meio da seguinte formula.
//V= RAIZ  * RAIO AO QUADRADO * ALTURA , ONDE RAIZ = 3.141592.

import java.util.Scanner;

public class exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.141592; // Definindo o valor de PI como constante

        System.out.print("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();

        double volume = PI * raio * raio * altura;

        System.out.println("O volume do cilindro é: " + volume);

        scanner.close();
    }
}

