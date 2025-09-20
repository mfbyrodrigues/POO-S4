import classes.Cliente;
import classes.Vendedor;

public class Loja {

    public static void main (String[] args) {

        // 1. Criando um objeto para a classe 'cliente'
        Cliente meuCliente = new Cliente ("Safira", "369.123.000.19", 123);

        // 2. Mostrando as atribuições
        System.out.println ("Informações sobre o cliente: ");
        meuCliente.exibirInfo();

        // 3. Mostrando os métodos
        meuCliente.comprarProduto();
        meuCliente.devolverProduto();
        
        System.out.println("--------------------------------------------------------------");

        // 1. Criando um onjeto para a classe 'vendedor'
        Vendedor meuVendedor = new Vendedor ("Eda", 123, "Manhã");

        // 2. Mostrando as atribuições
        System.out.println("Informações sobre o vendedor: ");
        meuVendedor.exibirInfo();

        // 3. Mostrando os métodos
        meuVendedor.venderProduto();
        meuVendedor.xingarCliente();
    }
}