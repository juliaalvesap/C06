import java.util.HashSet;

public class Conta {
    private double saldo;
    private double limite;
    private HashSet<Cliente> clientes;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
        this.clientes = new HashSet<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostrainfo() {
        System.out.println("=== Informações da Conta ===");
        System.out.printf("Saldo: R$%.2f\n", saldo);
        System.out.printf("Limite: R$%.2f\n", limite);
        System.out.println("\n=== Clientes Associados ===");

        for (Cliente cliente : clientes) {
            try {
                System.out.println(cliente.toString());
            } catch (NullPointerException e) {
                System.out.println("[Cliente nulo encontrado]");
            }
        }
    }
}