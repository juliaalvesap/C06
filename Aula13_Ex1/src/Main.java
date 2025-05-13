public class Main {
    public static void main(String[] args) {

        Conta minhaConta = new Conta(1500.50, 1000.00);

        minhaConta.adicionarCliente(new Cliente("Ana Pereira", "123.345.567-89"));
        minhaConta.adicionarCliente(new Cliente("Carlos Santos", "987.765.543-21"));
        minhaConta.adicionarCliente(null); // Cliente nulo

        minhaConta.mostrainfo();

        System.out.println("\nPrograma executado com sucesso!");
    }
}