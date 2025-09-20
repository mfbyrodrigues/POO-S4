import javax.swing.JOptionPane; // Pacote para uso da interface gráfica

public class calculadora { // Nome da classe
    public static void main (String[] args) { // Método principal

        // Declaração das variáveis
        float a;
        float b;   

        // Interface gráfica, cria uma caixa de diálogo
        a = Float.parseFloat (JOptionPane.showInputDialog ("Digite valor de 'a': "));   
        b = Float.parseFloat (JOptionPane.showInputDialog ("Digite valor de 'b': "));  

        // Mostra o resultado das operações matemáticas
        JOptionPane.showMessageDialog (null, "Os resultados das operações são: \n Soma: " + (a + b) + "\n Subtração: " + (a - b) + "\n Multiplicação: " + (a * b) + "\n Divisão: " + (a / b));
    }
}