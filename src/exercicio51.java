//Escreva um programa que leia as coordenadas  x e y de pontos no R ao quadradro e calcule sua distancia da origem.

import java.util.Scanner;

public class exercicio51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das coordenadas x e y
        System.out.print("Digite a coordenada x: ");
        double x = scanner.nextDouble();
        System.out.print("Digite a coordenada y: ");
        double y = scanner.nextDouble();

        // Cálculo da distância da origem
        double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // Exibição da distância
        System.out.println("A distância da origem para o ponto (" + x + ", " + y + ") é: " + distancia);
    }
}
