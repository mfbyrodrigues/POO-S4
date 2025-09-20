/* 
4. Desenvolva um programa que solicite ao usuário que digite seu nome e, em seguida,
imprima uma mensagem de saudação personalizada, como "Bem-vindo, [nome do usuário]!".
*/

import java.util.Scanner;

public class saudacao {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println ("Bem-vindo, " + nome + "!");

        scanner.close();
    }
}