//Leia um valor de comprimento em polegas e apresente-o  convertido em centimetro.
//A formula de conversao e : C = P * 2.54, sendo C o comprimento em centimetro e P o comprimento em polegadas
import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor em polegas ");
        float p = scanner.nextFloat();
        float soma = (float) (p * 2.54);
        System.out.println("O comprimento em polegas convertido para centimentro é " + soma);



    }
}
