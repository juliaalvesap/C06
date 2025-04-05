
public class SistemaOperacional {
    String nome;
    int tipo;

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void mostraSO() {
        System.out.println("Sistema Operacional: " + nome + " (" + tipo + " bits)");
    }
}