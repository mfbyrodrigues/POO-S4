// 3. Crie um programa que peça ao usuário para digitar sua altura (em metros) e seu peso (em quilogramas). O programa deve ler esses dois valores e, em seguida, imprimir uma mensagem como "Sua altura é [altura]m e seu peso é [peso]kg."
// Dica: Use a classe Scanner para ler os dados do teclado.

import java.util.Scanner;

public class medidas {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: (Em metros)");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso: (em kg)");
        double peso = scanner.nextDouble();

        System.out.println("SUa altura é: " + altura + "m e seu peso é: " + peso + "kg");

        scanner.close();
    }
}
