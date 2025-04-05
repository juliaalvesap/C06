
public class Computador {
    String marca;
    Float preco;
    HardwareBasico[] hardwareBasicos = new HardwareBasico[3];
    SistemaOperacional sistema;
    MemoriaUSB usb;


    public void adicionaHardware(HardwareBasico h, int posicao) {
        if (posicao >= 0 && posicao < hardwareBasicos.length) {
            hardwareBasicos[posicao] = h;
        }
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        for (HardwareBasico h : hardwareBasicos) {
            if (h != null) h.mostraHardware();
        }
        if (sistema != null) sistema.mostraSO();
        if (usb != null) usb.mostraUSB();
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("--------------------------");
    }
}