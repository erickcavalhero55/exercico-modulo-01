//Leia um numero real e o imprima o resuldado do qinta parte deste numero

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero :");
        float a = scanner.nextFloat();

        System.out.printf("O numero é %.5f  " , a);
    }

}
