public class Cachorro {
    
    // Atributos da classe Cachorro
    private String nome;
    private int idade;

    // Construtor da classe Cachorro
    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para o cachorro emitir um som
    public void latir() {
        System.out.println(this.nome + " está latindo: Au Au!");
    }

    // Método para exibir informações do cachorro
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade + " anos.");
    }

    // Métodos Getters (para acessar os atributos privados)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}