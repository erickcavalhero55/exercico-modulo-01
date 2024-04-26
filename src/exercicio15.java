// Leia um angulo em radianos e apresente-o convertido em graus
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um angulo em radianos ");
        float a = scanner.nextFloat();
        float soma = (float) (a*180.0/Math.PI);
        System.out.println("O angulo em radianos convertido para graus é " + soma);

    }
}
