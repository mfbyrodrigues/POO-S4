package classes;

public class Vendedor {
    
    // Atributos da classe 'vendedor'
    private String nome;
    private int id_funcionario;
    private String turnoTrabalho;

    // Construtor da classe 'vendedor'
    public Vendedor (String nome, int id_funcionario, String turnoTrabalho) {
        this.nome = nome;
        this.id_funcionario = id_funcionario;
        this.turnoTrabalho = turnoTrabalho;
    }

    // Método para o 'vendedor' fazer a venda de algum produto
    public void venderProduto() {
        System.out.println ("Produto vendido!");
    }

    // Método para o 'vendedor' xingar 'cliente'
    public void xingarCliente() {
        System.out.println ("Vá pro inferno!");
    }

    // Métodos Getters (acessa atributos privados):
    public String getNome() {
        return nome;
    }

    public int getif_funcionario() {
        return id_funcionario;
    }

    public String getturnoTrabalho() {
        return turnoTrabalho;
    }

    // Método para exibir todas as atribuições (informações) da classe 'vendedor'
    public void exibirInfo() {
        System.out.println ("Nome: " + this.nome + ", id do funcionário: " + this.id_funcionario + " e turno de trabalho: " + this.turnoTrabalho);
    }
}