//Receba a altura do degrau de uma escadae e a altura que o usuario deseja alcançar subindo a escada
//Calcule e mostre quantos degraus o usuario devera subir para atingir seu objetivo.

import java.util.Scanner;

public class exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a altura do degrau (em cm): ");
        double alturaDegrau = scanner.nextDouble();


        System.out.print("Digite a altura que deseja alcançar (em cm): ");
        double alturaDesejada = scanner.nextDouble();


        int degrausNecessarios = (int) Math.ceil(alturaDesejada / alturaDegrau);

        System.out.println("Você precisa subir " + degrausNecessarios + " degraus para alcançar sua altura desejada.");

    }
}
