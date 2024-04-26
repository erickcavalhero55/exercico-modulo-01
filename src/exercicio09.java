//Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin.
//A formula de conversao é: K = C+273.15,sendo C a temperatura em Celsius e K a temperatura de Kelvin
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Celsius: ");
        float c = scanner.nextFloat();
        float soma = (float) (c + 273.15);
        System.out.println("A temperatura convertida de Celsius para Kelvin é " + soma);
    }
}
