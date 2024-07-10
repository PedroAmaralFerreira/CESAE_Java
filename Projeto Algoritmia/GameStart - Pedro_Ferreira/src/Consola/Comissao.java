package Consola;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Comissao {
    public static void comissaoCategoria(String path) throws FileNotFoundException{

        Scanner scannerFicheiro = new Scanner(new File(path));

        if (scannerFicheiro.hasNextLine()){
            scannerFicheiro.nextLine();
        }

        while (scannerFicheiro.hasNextLine()){
            String linha = scannerFicheiro.nextLine();

            String[] linhaDividida = linha.split(";");
            String nomeCategoria = linhaDividida[0];
            Double percentagemMargem = Double.parseDouble(linhaDividida[1]);
            System.out.println("Categoria: "+nomeCategoria);
            System.out.println("Percentagem de lucro: "+percentagemMargem+"%");
            System.out.println();
        }

    }
}
