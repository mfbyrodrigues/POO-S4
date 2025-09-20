public class Gato {
    
    // Atributos da classe Gato
    private String nome;
    private String corDoPelo;

    // Construtor da classe Gato
    public Gato(String nome, String corDoPelo) {
        this.nome = nome;
        this.corDoPelo = corDoPelo;
    }

    // Método para o gato emitir um som
    public void miar() {
        System.out.println(this.nome + " está miando: Miau!");
    }

    // Método para exibir informações do gato
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + ", Cor do Pelo: " + this.corDoPelo + ".");
    }

    // Métodos Getters (para acessar os atributos privados)
    public String getNome() {
        return nome;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }
}