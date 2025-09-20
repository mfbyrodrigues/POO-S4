package classes;

public class Cliente {

    // Atributos da classe 'cliente'
    private String nome;
    private String CPF;
    private int id_compra;

    // Construtor da classe 'cliente'
    public Cliente (String nome, String CPF, int id_compra) {
        this.nome = nome;
        this.CPF = CPF;
        this.id_compra = id_compra;
    }

    // Método para a classe 'cliente' comprar algum produto
    public void comprarProduto() {
        System.out.println ("Produto comprado!");
    }

    // Método para a classe 'cliente' devolver algum produto
    public void devolverProduto() {
        System.out.println ("Devolução de produto feita!");

    }

    // Métodos Getters (acessa atributos privados):
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getid_compra() {
        return id_compra;
    }

    // Método para exibir todas as atribuições (informações) da classe 'cliente'
    public void exibirInfo() {
        System.out.println ("Nome: " + this.nome + ", CPF: " + this.CPF + " e id da compra: " + this.id_compra);
    }
}