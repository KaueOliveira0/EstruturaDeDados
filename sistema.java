package trabalhoed.EstruturaDeDados;

import java.util.LinkedList; // import do LinkedList para criar a fila de impressao
import java.util.Queue; // import do Queue para criar a fila de impressao
import java.util.Scanner; // import do Scanner para ler o que o usuario digitar

public class sistema { // classe sistema para gerenciar a fila de impressao e as acoes relacionadas a impressao

    private static Queue<String> filaImpressao = new LinkedList<>(); // fila de impressao para armazenar os documentos que serao impressos
    private static String documentoAtual = null; // variavel para armazenar o documento que esta sendo impresso no momento
    private static int totalImpressos = 0; // variavel para armazenar o total de documentos que foram impressos


    public static void chegadaPedido(Scanner entrada) { // metodo para adicionar um documento a fila de impressao
        limparTela();
        System.out.print("Digite o nome do documento: ");
        String documento; // variavel para armazenar o nome do documento que o usuario deseja imprimir
        documento = entrada.nextLine(); // le o nome do documento que o usuario deseja imprimir e armazena na variavel documento
        filaImpressao.add(documento); // adiciona o documento a fila de impressao
        System.out.println("Documento '" + documento + "' adicionado à fila.");
    }
    
    public static void iniciarImpressao() { // metodo para iniciar a impressao do documento atual
        limparTela();
        if (documentoAtual != null) // verifica se ja existe um documento sendo impresso no momento
        {
            System.out.println("Já existe um documento sendo impresso: " + documentoAtual);
        } else if (filaImpressao.isEmpty()) // verifica se a fila de impressao esta vazia
        {
            System.out.println("A fila de impressão está vazia.");
        } else {
            documentoAtual = filaImpressao.poll();// remove o proximo documento da fila e armazena na variavel documentoAtual
            System.out.println("Impressão iniciada para o documento: " + documentoAtual);
        }
    }

    public static void finalizarImpressao() { // metodo para finalizar a impressao do documento atual
            limparTela();
        if (documentoAtual == null) // verifica se existe um documento sendo impresso no momento
        {
            System.out.println("Nenhum documento está sendo impresso no momento.");
        } else {
            System.out.println("Impressão finalizada para o documento: " + documentoAtual);
            totalImpressos++; // incrementa o total de documentos impressos
            documentoAtual = null; // reseta a variavel documentoAtual para null,  mostrando que nao existe mais um documento sendo impresso no momento
        }
    }

    public static void mostrarFila() { // metodo para exibir os documentos que estao na fila de impressao
            limparTela();
        if (filaImpressao.isEmpty()) // verifica se a fila de impressao esta vazia
        {
            System.out.println("A fila de impressão está vazia.");
        } else {
            System.out.println("Documentos na fila de impressão:");
            int posicao = 1; // variavel para mostrar a posicao do documento na fila de impressao
            for (String doc : filaImpressao) // loop para exibir os documentos que estao na fila de impressao, mostrando a posicao de cada documento
            {
                System.out.println(posicao + ". " + doc);
                posicao++; // incrementa a posicao para o proximo documento na fila de impressao
            }
        }
    }

    public static void mostrarTotalizador() { // metodo para exibir o total de documentos que foram impressos
        limparTela();
        System.out.println("Total de documentos impressos: " + totalImpressos);
    }


    public static void cancelarProximo() { // metodo para cancelar o proximo documento que sera impresso, removendo o proximo documento da fila de impressao
        limparTela();
        if (filaImpressao.isEmpty()) // verifica se a fila de impressao esta vazia
        {
            System.out.println("A fila de impressão está vazia.");
        } else {
            String cancelado = filaImpressao.poll(); // remove o proximo documento da fila de impressao e armazena na variavel cancelado
            System.out.println("Documento '" + cancelado + "' cancelado e removido da fila.");
        }
    }

    public static void mostrarDocumentoAtual() { // metodo para exibir o documento que esta sendo impresso no momento
        limparTela();
        if (documentoAtual == null) // verifica se existe um documento sendo impresso no momento
        {
            System.out.println("Nenhum documento está sendo impresso no momento.");
        } else {
            System.out.println("Documento sendo impresso: " + documentoAtual);
        }
    }
        public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
