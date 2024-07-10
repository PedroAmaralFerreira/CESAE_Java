package Consola;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Venda {
    public static void idVenda(String path) throws FileNotFoundException{

        Scanner scannerFicheiro = new Scanner(new File(path));

        if (scannerFicheiro.hasNextLine()){
            scannerFicheiro.nextLine();
        }

        while (scannerFicheiro.hasNextLine()){
            String linha = scannerFicheiro.nextLine();

            String[] linhaDividida = linha.split(";");
            String idVenda = linhaDividida[0];
            int idCliente = Integer.parseInt(linhaDividida[1]);
            String editora = linhaDividida[2];
            String categoria = linhaDividida[3];
            String jogo = linhaDividida[4];
            Double valor = Double.parseDouble(linhaDividida[5]);
            System.out.println("ID Venda: "+idVenda);
            System.out.println("ID Cliente: "+idCliente);
            System.out.println("Editora: "+editora);
            System.out.println("Jogo: "+jogo);
            System.out.println("Valor: "+valor);
            System.out.println();
        }

    }
}
