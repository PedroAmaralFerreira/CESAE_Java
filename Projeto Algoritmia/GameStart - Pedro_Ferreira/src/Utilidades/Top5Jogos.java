package Utilidades;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static Utilidades.criarMatrizes.criarMatriz;

public class Top5Jogos {
    public static void top5Jogos(String path) throws FileNotFoundException {

        // Declarar variaveis
        String[][] vendas = criarMatriz(path, true);
        String[][] matrizCategoriaJogoVenda = new String[vendas.length][3];
        int uniqueCount = 0;
        double valorTotal = 0;

        // Inserir conteudo na matriz
        for (int i = 0; i < matrizCategoriaJogoVenda.length; i++) {
            matrizCategoriaJogoVenda[i][0] = vendas[i][3];
            matrizCategoriaJogoVenda[i][1] = vendas[i][4];
            matrizCategoriaJogoVenda[i][2] = vendas[i][5];
        }

        // Aplicar margem para cada valor, base na categoria
        for (int i = 0; i < vendas.length; i++) {
            double lucro = Double.parseDouble(matrizCategoriaJogoVenda[i][2]);
            switch (matrizCategoriaJogoVenda[i][0]){
                case "RPG":
                    lucro *= 0.1;
                    break;
                case "Metroidvania":
                    lucro *= 0.25;
                    break;
                case "Estrategia":
                    lucro *= 0.175;
                    break;
                case "Festa":
                    lucro *= 0.5;
                    break;
                case "MMORPG":
                    lucro *= 0.05;
                    break;
                case "Desporto":
                    lucro *= 0.425;
                    break;
                case "Luta":
                    lucro *= 0.275;
                    break;
                case "Tiros":
                    lucro *= 0.12;
                    break;
                case "Corridas":
                    lucro *= 0.13;
                    break;
                case "Aventura":
                case "Simulador":
                    lucro *= 0.3;
                    break;
                case "Arcada":
                case "Terror":
                    lucro *= 0.45;
                    break;
                case "Puzzle":
                    lucro *= 0.38;
                    break;
                case "Zombies":
                    lucro *= 0.39;
                    break;
                case "Misterio":
                    lucro *= 0.33;
                    break;
            }
            matrizCategoriaJogoVenda[i][2] = Double.toString(lucro);
        }

        String[][] matrizJogoLucro = new String[matrizCategoriaJogoVenda.length][2];

        // Remover duplicados e somar o valor deles
        for (int i = 0; i < matrizCategoriaJogoVenda.length; i++) {
            boolean duplicado = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (matrizCategoriaJogoVenda[i][1].equals(matrizJogoLucro[j][0])) {
                    double valorLucro = Double.parseDouble(matrizJogoLucro[j][1]);
                    valorLucro += Double.parseDouble(matrizCategoriaJogoVenda[i][2]);
                    matrizJogoLucro[j][1] = String.valueOf(valorLucro);
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                matrizJogoLucro[uniqueCount][0] = matrizCategoriaJogoVenda[i][1];
                matrizJogoLucro[uniqueCount][1] = matrizCategoriaJogoVenda[i][2];
                uniqueCount++;
            }
        }

        // Ordenar por ordem decrescente
        for (int i = 0; i < uniqueCount - 1; i++) {
            for (int j = i + 1; j < uniqueCount; j++) {
                if (Double.parseDouble(matrizJogoLucro[i][1]) < Double.parseDouble(matrizJogoLucro[j][1])) {
                    String tempLucro = matrizJogoLucro[i][1];
                    matrizJogoLucro[i][1] = matrizJogoLucro[j][1];
                    matrizJogoLucro[j][1] = tempLucro;

                    String tempJogo = matrizJogoLucro[i][0];
                    matrizJogoLucro[i][0] = matrizJogoLucro[j][0];
                    matrizJogoLucro[j][0] = tempJogo;
                }
            }
        }

        // Apresentar TOP 5 jogos com mais lucro
         for (int i = 0; i < 5 && i < uniqueCount; i++) {
             System.out.println("Jogo: "+matrizJogoLucro[i][0]);
             System.out.print("Lucro: ");
             System.out.printf("%.2f", Double.parseDouble(matrizJogoLucro[i][1]));
             System.out.println();
        }
    }
}
