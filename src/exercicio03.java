// Peça ao usuario para digitar tres valores inteiros e imprima a soma deles

import java.util.Scanner;
public class exercicio03 {
    public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite um Numero ");
       int  a = scanner.nextInt();

       System.out.println("Digite o Segundo Numero ");
       int b = scanner.nextInt();

       System.out.println("Digite o Terceiro Numero");
       int c = scanner.nextInt();

       int soma = a + b + c;
        System.out.println("O numero é " + soma);
    }
}

