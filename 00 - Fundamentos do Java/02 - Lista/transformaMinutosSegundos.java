// 1. Se um minuto tem 60 segundos, quantos segundos existem em X minutos? Faça um programa que receba um valor em minutos e transforme em segundos.

import java.util.Scanner;

public class transformaMinutosSegundos {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite o valor em minutos: ");
        int minutos = scanner.nextInt();

        int segundos = minutos * 60;

        System.out.println (minutos + " minutos equivalem a " + segundos + " segundos.");

        scanner.close();
    }
}