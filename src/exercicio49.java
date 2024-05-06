//Faça um programa para leia horário (hora,minuto e segundo) de inicio e a duração,em segundos, de  uma experiencia biologica
//O progama deve resultar com o novo horario (hora, minuto e segundo) do termino da mesma.

import java.util.Scanner;

public class exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do horário de início
        System.out.println("Digite o horário de início:");
        System.out.print("Hora: ");
        int horaInicio = scanner.nextInt();
        System.out.print("Minuto: ");
        int minutoInicio = scanner.nextInt();
        System.out.print("Segundo: ");
        int segundoInicio = scanner.nextInt();

        // Leitura da duração em segundos da experiência
        System.out.print("Digite a duração da experiência em segundos: ");
        int duracaoSegundos = scanner.nextInt();

        // Cálculo do horário de término
        int segundoTotalInicio = horaInicio * 3600 + minutoInicio * 60 + segundoInicio;
        int segundoTotalTermino = segundoTotalInicio + duracaoSegundos;

        int horaTermino = segundoTotalTermino / 3600;
        int minutoTermino = (segundoTotalTermino % 3600) / 60;
        int segundoTermino = segundoTotalTermino % 60;

        // Exibição do horário de término
        System.out.println("\nHorário de término da experiência:");
        System.out.println("Hora: " + horaTermino);
        System.out.println("Minuto: " + minutoTermino);
        System.out.println("Segundo: " + segundoTermino);
    }
}
