//leia uma distancia em quilometros e apresente-a convertida em milhas.
//A formula de conversao é M = k/1.61, sendo K a distancia em quilometros e M em milhas
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma distancia em quilometros ");
        float k = scanner.nextFloat();
        float soma = (float) (k/1.61);
        System.out.println("A distancia em quilometros convertida em milhas é " + soma);
    }
}
