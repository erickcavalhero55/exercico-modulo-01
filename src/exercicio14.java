//Leia um angulo em graus e apresente-o convertido em radianos
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um angulo em graus ");
        float a = scanner.nextFloat();
        float soma = (float) (a * Math.PI/180.0);
        System.out.println("O angulo em graus convertido para radianos é " + soma);


    }
}
