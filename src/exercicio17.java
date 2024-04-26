//Leia um valor de comprimento em centimetro e apresente-o  convertido em polegadas.
//A formula de conversao e : P = C/2.54, sendo C o comprimento em centimetro e P o comprimento em polegadas
import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor em centimetro ");
        float c = scanner.nextFloat();
        float soma = (float) (c/2.54);
        System.out.println("O comprimento em centimetro convertido para polegas é " + soma );

    }
}
