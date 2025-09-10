/* 
Construa um programa para um caixa registradora de uma loja. Na loja todos os produtos custam 7 reais.
Então crie um programa que permita que o caixa só aceite notas de 5 reais e mostre sempre qual será o troco. 
*/

import java.util.Scanner;

public class caixaRegistradora {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        double preco = 7.0;

        System.out.print ("Quantos produtos? ");
        int quantidade = scanner.nextInt();

        System.out.print ("Quantas notas de R$5 o cliente deu? ");
        int notasDe5 = scanner.nextInt();

        double troco = (notasDe5 * 5) - (quantidade * preco);

        System.out.println ("Troco: R$ " + troco);

        scanner.close();
    }
}
