public class main {
    public static void main(String[] args) {
        // 1. Criando um objeto da classe Cachorro
        Cachorro meuCachorro = new Cachorro("Rex", 5);

        // 2. Chamando os métodos do objeto 'meuCachorro'
        System.out.println("--- Informações do Cachorro ---");
        meuCachorro.exibirInfo();
        meuCachorro.latir();
        System.out.println("O nome do cachorro é: " + meuCachorro.getNome());

        System.out.println("\n----------------------------\n");

        // 3. Criando um objeto da classe Gato
        Gato meuGato = new Gato("Mimi", "Branco");

        // 4. Chamando os métodos do objeto 'meuGato'
        System.out.println("--- Informações do Gato ---");
        meuGato.exibirInfo();
        meuGato.miar();
        System.out.println("A cor do pelo do gato é: " + meuGato.getCorDoPelo());
    }
} 