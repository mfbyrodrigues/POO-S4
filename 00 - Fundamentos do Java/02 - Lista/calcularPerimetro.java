// 4. Faça um código para calcular o perímetro de um espaço. O código deve solicitar ao usuário os lados do espaço que deseja calcular o perímetro. 

import java.util.Scanner;

// Será um triângulo porque a Fran escolheu!

public class calcularPerimetro {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite o tamanho do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.println ("Digite o tamanho do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.println ("Digite o tamanho do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        double perimetroTri = (lado1 + lado2 + lado3);

        System.out.println ("O perimetro do seu triângulo é: " + perimetroTri);

        scanner.close();
    }
}