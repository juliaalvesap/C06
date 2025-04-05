public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores = new Computador[10];
    int contador = 0;

    public void addComputador(Computador c) {
        if (contador < computadores.length) {
            computadores[contador] = c;
            contador++;
        }
    }

    public float calculaTotalPreco() {
        float total = 0;
        for (int i = 0; i < contador; i++) {
            total += computadores[i].preco;
        }
        return total;
    }

    public void mostraCompra() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Computadores adquiridos:");
        for (int i = 0; i < contador; i++) {
            computadores[i].mostraPCConfigs();
        }
        System.out.printf("Total da compra: R$ %.2f\n", calculaTotalPreco());
    }
}