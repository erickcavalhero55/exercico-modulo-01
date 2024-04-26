//Leia um valor de volume em metros cúbicos m3 e apresente-o convertido em litros.
//A formula de conversao é : L =1000* M, sendo L o volume em litros e M o volume em metros cubicos.
import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor em metros cúbicos");
        float m = scanner.nextFloat();
        float soma = 1000*m;
    System.out.println("O valor em metros cúbicos convertido em litros é " + soma);
    }
}
