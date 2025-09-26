package classes; // Pacote que a classe 'Cliente' está inserida

public class Cliente { // Classe cujo nome é 'Cliente' e sua visibilidade é pública (permitindo o acesso perante outras classes)

    // Atributos com visibilidade privada (acesso restrito à classe 'Cliente'), do tipo String (suporte a caracteres) e seus respectivos nomes
    private String nome;
    private String cpf;
    private String email;

    // Métodos (Getters e Setters)
    // Para cada atributo, vai ter um método 'get' e 'set'
    public String getNome() { // Método 'get' acessa o atributo 'nome', que por si só, possui sua visibilidade pública e seu tipo é String 
        return nome; // Retorna a atribuição de 'nome'
    }

    public void setNome (String nome) { // Método 'set' modifica o atributo 'nome'
        this.nome = nome; // O método 'this.' é usado para indicar uma referência ao próprio objeto: que naquela instância, o atributo que será usado será AQUELE ATRIBUTO 
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail (String email) {
        this.email = email; 
    }
}
