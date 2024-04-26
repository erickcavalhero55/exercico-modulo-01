//Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
//A formula de conversao é: C =5.0*(F-32.0)/9.0,sendo C a temperatura em Celsius e F a temperatura de Fahrenheit
import java.util.Scanner;

public class exercico07 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Fahrenheit: ");
        float f =scanner.nextFloat();
        float soma = (float) ((float) 5.0*(f-32.0)/9.0);
        System.out.println("A temperatura convertida de Fahrenheit para Celsius é :" + soma);

    }
}
