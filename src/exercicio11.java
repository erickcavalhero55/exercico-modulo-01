// leia uma velocidade em m/s e apresente-a convertida em km/h
//A  formula de conversão é K = M *3.6, sendo K a velocidade em km/h e M em m/s
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a velocidade por m/s: ");
        float m = scanner.nextFloat();
        float soma = (float) (m*3.6);
        System.out.println("A velocidade em m/s convertida para km/h é " + soma);


    }
}
