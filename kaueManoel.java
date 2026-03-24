package trabalhoed.EstruturaDeDados;

import java.util.Scanner;

public class kaueManoel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            menu.exibirMenu();
            System.out.println("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Quebra de linha

            switch (opcao) {
                case 1:
                    sistema.chegadaPedido(entrada);
                    break;
                case 2:
                    sistema.iniciarImpressao();
                    break;
                case 3:
                    sistema.finalizarImpressao();
                    break;
                case 4:
                    sistema.mostrarFila();
                    break;
                case 5:
                    sistema.mostrarTotalizador();
                    break;
                case 6:
                    sistema.cancelarProximo();
                    break;
                case 7:
                    sistema.mostrarDocumentoAtual();
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao Invalida. Tente Novamente.");
            }
        } while (opcao != 0);
    }
}
