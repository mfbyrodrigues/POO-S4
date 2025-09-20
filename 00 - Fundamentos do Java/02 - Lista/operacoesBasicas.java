/* 
2. Faça um programa com as quatro operações básicas da matemática e 
mostre o resultado para de cada uma das operações para 2 números inteiros.  
*/

import java.util.Scanner;

public class operacoesBasicas {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println ("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

        System.out.println ("Soma: " + soma);
        System.out.println ("Subtração: " + subtracao);
        System.out.println ("Multiplicação: " + multiplicacao);
        System.out.println ("Divisão: " + divisao);

        scanner.close();
    }
}