package Utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Utilidades.ImprimirCatalogoEditora.imprimirCatalogoEditora;
import static Utilidades.VerificarDuplicado.*;
import static Utilidades.criarMatrizes.criarMatriz;

public class ImprimirEditora {
    public static void imprimirEditora(String path, String editoraNome) throws FileNotFoundException {

        // Declarar variaveis
        String[][] matrizEditora = criarMatriz(path, true);
        String nomeEditora = "";
        boolean jogoEncontrado = false;

        // Procurar editora
        for (int i = 0; i < matrizEditora.length; i++) {
            for (int j = 0; j < matrizEditora[i].length; j++) {
                if (matrizEditora[i][2].equalsIgnoreCase(editoraNome)) {
                    nomeEditora = matrizEditora[i][2];
                    jogoEncontrado = true;
                }
            }
        }

        // Apresentar editora, se encontrada
        if (jogoEncontrado) {
            System.out.println("\n****" + " " + nomeEditora + " " + "****\n");

            String[] jogosEditora = verificarDuplicado(matrizEditora, editoraNome);
            imprimirCatalogoEditora(matrizEditora, jogosEditora, editoraNome);
        }
        else{
            System.out.println("Editora não encontrada!");
        }
    }
}
