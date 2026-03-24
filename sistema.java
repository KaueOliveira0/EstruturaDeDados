package trabalhoed.EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sistema {
    private static Queue<String> filaImpressao = new LinkedList<>();
    private static String documentoAtual = null;
    private static int totalImpressos = 0;


    public static void chegadaPedido(Scanner entrada) {
        System.out.print("Digite o nome do documento: ");
        String documento = entrada.nextLine();
        filaImpressao.add(documento);
        System.out.println("Documento '" + documento + "' adicionado à fila.");
    }

    public static void iniciarImpressao() {
        if (documentoAtual != null) {
            System.out.println("Já existe um documento sendo impresso: " + documentoAtual);
        } else if (filaImpressao.isEmpty()) {
            System.out.println("A fila de impressão está vazia.");
        } else {
            documentoAtual = filaImpressao.poll();
            System.out.println("Impressão iniciada para o documento: " + documentoAtual);
        }
    }

    public static void finalizarImpressao() {
        if (documentoAtual == null) {
            System.out.println("Nenhum documento está sendo impresso no momento.");
        } else {
            System.out.println("Impressão finalizada para o documento: " + documentoAtual);
            totalImpressos++;
            documentoAtual = null;
        }
    }

    public static void mostrarFila() {
        if (filaImpressao.isEmpty()) {
            System.out.println("A fila de impressão está vazia.");
        } else {
            System.out.println("Documentos na fila de impressão:");
            int posicao = 1;
            for (String doc : filaImpressao) {
                System.out.println(posicao + ". " + doc);
                posicao++;
            }
        }
    }

    public static void mostrarTotalizador() {
        System.out.println("Total de documentos impressos: " + totalImpressos);
    }


    public static void cancelarProximo() {
        if (filaImpressao.isEmpty()) {
            System.out.println("A fila de impressão está vazia.");
        } else {
            String cancelado = filaImpressao.poll();
            System.out.println("Documento '" + cancelado + "' cancelado e removido da fila.");
        }
    }

    public static void mostrarDocumentoAtual() {
        if (documentoAtual == null) {
            System.out.println("Nenhum documento está sendo impresso no momento.");
        } else {
            System.out.println("Documento sendo impresso: " + documentoAtual);
        }
    }
}
