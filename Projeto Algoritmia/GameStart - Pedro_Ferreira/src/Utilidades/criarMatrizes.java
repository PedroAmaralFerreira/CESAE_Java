package Utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class criarMatrizes {

    public static int contarLinhas(String path) throws FileNotFoundException{

        Scanner scannerFicheiro = new Scanner(new File(path));

        int contadorLinhas = 0;

        while (scannerFicheiro.hasNextLine()){
            contadorLinhas++;
            scannerFicheiro.nextLine();
        }

        return contadorLinhas;
    }

    public static int contarColunas(String path) throws FileNotFoundException{

        Scanner scannerFicheiro = new Scanner(new File(path));

        String linha = scannerFicheiro.nextLine();
        String[] dividirLinha = linha.split(";");

        return dividirLinha.length;
    }

    public static String[][] criarMatriz(String path, boolean ignorarCabecalho) throws FileNotFoundException{

        String[][] matrizCompleta;
        String linha;
        int contadorLinhasMatriz = 0;

        if (ignorarCabecalho){
            matrizCompleta = new String[contarLinhas(path) - 1][contarColunas(path)];
        }else{
            matrizCompleta = new String[contarLinhas(path)][contarColunas(path)];
        }

        Scanner scannerFicheiro = new Scanner(new File(path));

        if (ignorarCabecalho){
            scannerFicheiro.nextLine();
        }

        while (scannerFicheiro.hasNextLine()){
            String[] linhaDividida = scannerFicheiro.nextLine().split(";");

            for (int colunas = 0; colunas < matrizCompleta[0].length; colunas++) {
                matrizCompleta[contadorLinhasMatriz][colunas] = linhaDividida[colunas];
            }
            contadorLinhasMatriz++;
        }

        return matrizCompleta;
    }
}
