package trabalhoed.EstruturaDeDados;

import  java.util.Scanner; // import do Scanner para ler o que o usuario digitar

public class kaueManoel { // classe principal do programa
    public static void main(String[] args) { // main do programa, onde o programa inicia a execucao
        Scanner entrada = new Scanner(System.in); // cria um objeto Scanner para ler o que o usuario digitar
        int opcao; // variavel para a opcao escolhida pelo usuario

        do { // loop para exibir o menu e ler a opcao escolhida pelo usuario, o loop ira continua executando enquanto a opcao escolhida não for 0

            menu.Menu(); // chama o metodo Menu da classe menu para exibir as opcoes para o usuario
            System.out.println("Escolha uma opcao: "); // pede para o usuario escolher uma opcao
            opcao = entrada.nextInt(); // le a opcao escolhida pelo usuario
            entrada.nextLine(); // Quebra de linha

            switch (opcao) { // estrutura de controle para executar a acao correspondente a opcao escolhida pelo usuario
                case 1:
                    sistema.chegadaPedido(entrada); // chama o metodo chegadaPedido da classe sistema para adicionar um documento a fila de impressao
                    break; // break para sair do switch depois de executar a acao escolhida pelo usuario
                case 2:
                    sistema.iniciarImpressao(); // chama o metodo iniciarImpressao da classe sistema para iniciar a impressao do documento atual
                    break;
                case 3:
                    sistema.finalizarImpressao(); // chama o metodo finalizarImpressao da classe sistema para finalizar a impressao do documento atual
                    break;
                case 4:
                    sistema.mostrarFila();// chama o metodo mostrarFila da classe sistema para exibir os documentos que estao na fila de impressao
                    break;
                case 5:
                    sistema.mostrarTotalizador(); // chama o metodo mostrarTotalizador da classe sistema para exibir o total de documentos que foram impressos
                    break;
                case 6:
                    sistema.cancelarProximo(); // chama o metodo cancelarProximo da classe sistema para cancelar o proximo documento que sera impresso
                    break;
                case 7:
                    sistema.mostrarDocumentoAtual(); // chama o metodo mostrarDocumentoAtual da classe sistema para exibir o documento que esta sendo impresso no momento
                    break;
                case 0:
                    System.out.println("Fechando o Sistema..."); // mensagem de encerramento do programa
                    break;
                default:
                    System.out.println("Opcao Invalida. Tente Novamente."); // mensagem de erro para opcao invalida escolhida pelo usuario
            }
        } while (opcao != 0); // o loop continua sendo executando enquanto a opcao escolhida pelo usuario não for 0
    }
}
