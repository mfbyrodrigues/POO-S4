// 3. Calcule o IMC de uma pessoa. Use a fórmula IMC = massa/(altura*altura).

import java.util.Scanner;

public class calculadoraIMC {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite, em quilogramas, seu peso: ");
        double massa = scanner.nextDouble();

        System.out.println ("Digite, em metros, sua altura: ");
        double altura = scanner.nextDouble();

        double IMC = massa / (altura * altura);

        System.out.println ("Seu IMC é: " + IMC);

        scanner.close();
    }
}