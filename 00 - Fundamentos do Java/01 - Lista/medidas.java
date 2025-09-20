/*
3. Crie um programa que peça ao usuário para digitar sua altura (em metros) e seu peso (em quilogramas).
O programa deve ler esses dois valores e, em seguida, imprimir uma mensagem como "Sua altura é [altura]m e seu peso é [peso]kg."
Dica: Use a classe Scanner para ler os dados do teclado.
*/

import java.util.Scanner;

public class medidas {
    
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite, em metros, sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println ("Digite, em quilogramas, seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println ("Você tem " + altura + " metros de altura e pesa19 " + peso + " quilogramas.");

        scanner.close();
    }
}