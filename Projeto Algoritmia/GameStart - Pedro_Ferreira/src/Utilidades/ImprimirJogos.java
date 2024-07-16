package Utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Utilidades.criarMatrizes.criarMatriz;

public class ImprimirJogos {
    public static void imprimirJogos(String path) throws FileNotFoundException{

        // Declarar variaveis
        String[][] vendas = criarMatriz(path, true);
        String[] nomeJogos = new String[vendas.length];
        int uniqueCount = 0;

        // Introduzir dados no array
        for (int i = 0; i < nomeJogos.length; i++) {
            nomeJogos[i] = vendas[i][4];
        }

        // Remover jogos duplicados
        for (int i = 0; i < nomeJogos.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < uniqueCount; j++) {
                if(vendas[i][4].equals(nomeJogos[j])){
                    duplicado = true;
                    break;
                }
            }
            if(!duplicado){
                nomeJogos[uniqueCount] = vendas[i][4];
                uniqueCount++;
            }
        }

        // Apresentar jogos
        System.out.println("CATÁLOGO DE JOGOS\n");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(nomeJogos[i]);
        }
        System.out.println();
    }
}
