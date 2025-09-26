import classes.Cliente; // Importação para o uso da classe 'Cliente'

public class Loja { // Classe princípal e pública (para acesso de outras classes)
    public static void main (String[] args) { // Método princípal 'main', é aqui que a mágica acontece

       Cliente cliente1 = new Cliente(); // Instânciando o NOVO ('new') objeto 'cliente1' da classe 'Cliente'
        
        // Aqui, o objeto 'cliente1' têm seus atributos modificados pelo método '.set' 
        cliente1.setNome ("Maria Silva");
        cliente1.setCpf ("123.456.789-00");
        cliente1.setEmail ("maria.silva@email.com");

        // E aqui, as atribuições feitas ao objeto são acessadas e mostradas através do método'.get'
        System.out.println ("--- Dados do Cliente Cadastrado ---");
        System.out.println ("Nome: " + cliente1.getNome());
        System.out.println ("CPF: " + cliente1.getCpf());
        System.out.println ("Email: " + cliente1.getEmail());
    }
}