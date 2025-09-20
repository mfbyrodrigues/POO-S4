public class ExemploCarro {
    public static void main (String[ ] args) {

        // Criando o primeiro objeto

        // Aqui, chamamos o construtor da classe Carro para criar um objeto
        Carro meuCarro = new Carro ("Ford", "Ka", 2022);

        System.out.println("Informações do meu Carro:");
        meuCarro.exibirInformacoes(); // Exibe as informações iniciais

        // Chamando métodos para modificar o estado do objeto
        meuCarro.acelerar(50);
        meuCarro.frear(20);

        System.out.println ("Informações do meu Carro após ações:");
        meuCarro.exibirInformacoes();

        System.out.println ("\n-----------------------------------\n");

        // Criando um segundo objeto

        // Outro carro, totalmente independente do primeiro
        Carro seuCarro = new Carro("Toyota", "Corolla", 2023);

        System.out.println ("Informações do seu Carro");
        seuCarro.exibirInformacoes();

        // Chamando métodos para modificar o estado do segundo objeto
        seuCarro.acelerar(80);
       
        System.out.println ("Informações do seu Carro após ações:");
        seuCarro.exibirInformacoes();
    }
}