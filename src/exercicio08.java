//Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius.
//A formula de conversao é: C = K-273.15,sendo C a temperatura em Celsius e K a temperatura de Kelvin
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Kelvin: ");
        float k = scanner.nextFloat();
        float soma = (float) (k-273.15);
        System.out.println("A temperatura convertida de Kelvin para Celsius é " + soma);

    }
}
