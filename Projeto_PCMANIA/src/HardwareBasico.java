
public class HardwareBasico {
    String nome;
    float capacidade;


    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostraHardware() {
        System.out.println("Hardware: " + nome + " - " + capacidade);
    }
}