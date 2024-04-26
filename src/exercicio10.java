// leia uma velocidade em km/h e apresente-a convertida em m/s
//A  formula de conversão é M = k/3.6, sendo K a velocidade em km/h e M em m/s
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma velocidade em km/h :");
        float k = scanner.nextFloat();
        float soma = (float) (k /3.6);
        System.out.println("A velocidade convertida de km/h para m/s é : " + soma);

    }
}
