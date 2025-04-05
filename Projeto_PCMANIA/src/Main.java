
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.nome = "Cliente da Silva Sauro";
        cliente.cpf = 123456789L;

        Float matricula = 2036F;

        System.out.println("Bem-vindo a PCMANIA! :)");
        System.out.println("Conheça nossas promoções:");
        System.out.println("1 - PC Apple");
        System.out.println("2 - PC Samsung");
        System.out.println("1 - PC Dell");


        // Computador 1 - Apple
        Computador pc1 = new Computador();
        pc1.marca = "Apple";
        pc1.preco = matricula;
        pc1.adicionaHardware(new HardwareBasico("Pentium Core i3", 2200), 0);
        pc1.adicionaHardware(new HardwareBasico("Memória RAM", 8), 1);
        pc1.adicionaHardware(new HardwareBasico("HD", 500), 2);
        pc1.sistema = new SistemaOperacional("Linux Ubuntu", 32);
        pc1.usb = new MemoriaUSB("Pen-drive", 16);

        // Computador 2 - Samsung
        Computador pc2 = new Computador();
        pc2.marca = "Samsung";
        pc2.preco = matricula + 1234;
        pc2.adicionaHardware(new HardwareBasico("Pentium Core i5", 3370), 0);
        pc2.adicionaHardware(new HardwareBasico("Memória RAM", 16), 1);
        pc2.adicionaHardware(new HardwareBasico("HD", 1000), 2);
        pc2.sistema = new SistemaOperacional("Windows 8", 64);
        pc2.usb = new MemoriaUSB("Pen-drive", 32);

        // Computador 3 - Dell
        Computador pc3 = new Computador();
        pc3.marca = "Dell";
        pc3.preco = matricula + 5678;
        pc3.adicionaHardware(new HardwareBasico("Pentium Core i7", 4500), 0);
        pc3.adicionaHardware(new HardwareBasico("Memória RAM", 32), 1);
        pc3.adicionaHardware(new HardwareBasico("HD", 2000), 2);
        pc3.sistema = new SistemaOperacional("Windows 10", 64);
        pc3.usb = new MemoriaUSB("HD Externo", 1000);

        boolean comprouPromo1 = false;
        boolean comprouPromo2 = false;
        boolean comprouPromo3 = false;

        int opcao;

        do {

            if (comprouPromo1 && comprouPromo2 && comprouPromo3){
                System.out.println("Obrigada por comprar conosco!");
                opcao = 0;
            }
            else {
                System.out.println("Escolha a promoção desejada ou  digite 0 para finalizar:");
                opcao = sc.nextInt();

                switch (opcao) {

                    case 1:
                        if (!comprouPromo1) {
                            cliente.addComputador(pc1);
                            comprouPromo1 = true;
                            System.out.println("Promoção 1 adicionada com sucesso!");
                        } else {
                            System.out.println("Você já comprou um notebook da promoção 1.");
                        }
                        break;

                    case 2:
                        if (!comprouPromo2) {
                            cliente.addComputador(pc2);
                            comprouPromo2 = true;
                            System.out.println("Promoção 2 adicionada com sucesso!");
                        } else {
                            System.out.println("Você já comprou um notebook da promoção 2.");
                        }
                        break;

                    case 3:
                        if (!comprouPromo3) {
                            cliente.addComputador(pc3);
                            comprouPromo3 = true;
                            System.out.println("Promoção 3 adicionada com sucesso!");
                        } else {
                            System.out.println("Você já comprou um notebook da promoção 3.");
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Código inválido!");
                }


            }
        } while (opcao != 0);

        // Exibir resumo da compra
        cliente.mostraCompra();
    }
}