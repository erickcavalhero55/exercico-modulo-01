//Faça um programa para ler as dimensões de um terreno (comprimento c e largura l),bem como o preço do metro de tela p.
//Imprima o custo para cercar este mesmo terreno com tela.

import java.util.Scanner;

public class exercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das dimensões do terreno e do preço do metro de tela
        System.out.print("Digite o comprimento do terreno em metros: ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite a largura do terreno em metros: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite o preço do metro de tela em reais: ");
        double precoMetroTela = scanner.nextDouble();

        // Cálculo da área do terreno
        double area = comprimento * largura;

        // Cálculo do custo para cercar o terreno com tela
        double custo = area * precoMetroTela;

        // Exibição do custo
        System.out.println("O custo para cercar o terreno com tela é de: R$ " + custo);
    }
}
