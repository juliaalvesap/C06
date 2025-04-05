public class MemoriaUSB {
    String nome;
    int capacidade;


    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostraUSB() {
        System.out.println("Memória USB: " + nome + " - " + capacidade + "Gb");
    }
}