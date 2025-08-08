// 1. Crie um programa que declare três variáveis: nome (String), idade (int) e salario (double). 
// Atribua valores a elas e, em seguida, imprima uma frase no console que combine todas as variáveis.
// Exemplo de saída: "Olá, [seu nome]! Você tem [sua idade] anos e seu salário é de R$ [seu salário]."

public class combinaFrase {

    public static void main(String[] args) {
        
        String nome = "Jurupebas";
        byte idade = 80;
        int salario = 1532;

        System.out.println();
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos e seu salário é de: " + salario);
    }
}
