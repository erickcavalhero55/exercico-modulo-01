//Leia o valor do raio de um circulo e calcule e imprima a área do circulo correspondente.
//

import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}