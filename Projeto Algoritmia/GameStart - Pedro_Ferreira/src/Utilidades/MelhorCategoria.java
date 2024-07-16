package Utilidades;

import java.io.FileNotFoundException;

import static Utilidades.criarMatrizes.criarMatriz;

public class MelhorCategoria {
    public static void melhorCategoria(String path) throws FileNotFoundException{

        // Declarar variaveis
        String[][] matrizCategoria = criarMatriz(path, true);
        String[][] melhorCategoria = new String[matrizCategoria.length][2];
        int uniqueCount = 0;

        // Remover duplicados e somar o numero de vezes que aparece a categoria
        for (int i = 0; i < matrizCategoria.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (melhorCategoria[j][0].equals(matrizCategoria[i][3])) {
                    melhorCategoria[j][1] = String.valueOf(Integer.parseInt(melhorCategoria[j][1]) + 1);
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                melhorCategoria[uniqueCount][0] = matrizCategoria[i][3];
                melhorCategoria[uniqueCount][1] = "1";
                uniqueCount++;
            }
        }

        // Ordenar por ordem decrescente
        for (int i = 0; i < uniqueCount - 1; i++) {
            for (int j = i + 1; j < uniqueCount; j++) {
                if (Integer.parseInt(melhorCategoria[i][1]) < Integer.parseInt(melhorCategoria[j][1])) {
                    String tempConta = melhorCategoria[i][1];
                    melhorCategoria[i][1] = melhorCategoria[j][1];
                    melhorCategoria[j][1] = tempConta;
                    
                    String tempCategoria = melhorCategoria[i][0];
                    melhorCategoria[i][0] = melhorCategoria[j][0];
                    melhorCategoria[j][0] = tempCategoria;
                }
            }
        }

        // Apresentar a melhor categoria
        System.out.println("\nMelhor categoria: "+melhorCategoria[0][0]);
        System.out.println("Numero Total de Vendas: "+melhorCategoria[0][1]+"\n");


    }
}
