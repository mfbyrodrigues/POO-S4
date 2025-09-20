import javax.swing.JOptionPane;

public class exemplo {
    public static void main(String[] args) {
        
        String nome;

        nome = JOptionPane.showInputDialog ("Qual é o seu nome?");
        JOptionPane.showMessageDialog (null, "O seu nome é " + nome);

        // Em uma caixa de diálogo a saída de dados ocorre e logo depois guarda a informação.
    }
}