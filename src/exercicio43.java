//Escreva um programa  de ajuda para vendedores.A partir de um valor total lido,mostre:
//O total a pagar com desconto de 10%.
//O valor de cada parcela, no parcelaento de 3X sem juros.
//A comissao do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto).
//A comissao do vendedor, no caso da venda ser parcelada(5% sobre o valor total).

import java.util.Scanner;

public class exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        float valorcompra = scanner.nextFloat();

        float desconto = (float) (valorcompra * 0.10);
        float desconto10 = valorcompra - desconto;

        float parcelado = valorcompra / 3;

        float comissaoavista = (float) (desconto10 * 0.05);

        float comissaoparcelada = (float) (valorcompra * 0.05);

        System.out.println("O total a pagar com desconto de 10% é: R$" + desconto10);
        System.out.println("Valor de cada parcela (3x sem juros): R$" + parcelado);
        System.out.println("Comissão do vendedor (venda à vista): R$" + comissaoavista);
        System.out.println("Comissão do vendedor (venda parcelada): R$" + comissaoparcelada);



    }
}
