package Utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PesquisarCliente {
    public static void pesquisarCliente(String path, int idCliente) throws FileNotFoundException{

        // Ler ficheiro
        Scanner scannerFicheiro = new Scanner(new File(path));

        // Declarar variavel
        String [] informacaoCliente = new String[4];

        // Ignorar o cabecalho
        scannerFicheiro.nextLine();

        // Criar um vetor da linha do cliente escolhido
        while (scannerFicheiro.hasNextLine()){
            String linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(";");

            if (Integer.parseInt(linhaDividida[0]) == idCliente){
                for (int i = 0; i < linhaDividida.length; i++) {
                    informacaoCliente[i] = linhaDividida[i];
                }
                break;
            }
        }

        // Apresentar informacao
        System.out.println("ID Cliente: "+informacaoCliente[0]);
        System.out.println("Nome: "+informacaoCliente[1]);
        System.out.println("Número: "+informacaoCliente[2]);
        System.out.println("Email: "+informacaoCliente[3]);
        System.out.println();
    }
}
