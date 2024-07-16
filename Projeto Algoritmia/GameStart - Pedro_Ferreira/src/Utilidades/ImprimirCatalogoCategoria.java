package Utilidades;

import java.io.FileNotFoundException;

import static Utilidades.criarMatrizes.criarMatriz;

public class ImprimirCatalogoCategoria {
    public static void imprimirCatalogoCategoria(String path, String categoriaNome) throws FileNotFoundException{

        // Declarar variaveis
        String[][] matrizInformacao = criarMatriz(path, true);
        String[][] matrizEditoraJogo = new String[matrizInformacao.length][3];
        int uniqueCount = 0;
        boolean duplicado = false;

        // Remover duplicados
        for (int i = 0; i < matrizInformacao.length; i++) {
            duplicado = false;
            for (int j = 0; j < uniqueCount; j++) {
                if(matrizInformacao[i][2].equals(matrizEditoraJogo[j][0]) && matrizInformacao[i][3].equals(matrizEditoraJogo[j][1]) && matrizInformacao[i][4].equals(matrizEditoraJogo[j][2])){
                    duplicado = true;
                    break;
                }
            }
            if(!duplicado){
                matrizEditoraJogo[uniqueCount][0] = matrizInformacao[i][2];
                matrizEditoraJogo[uniqueCount][1] = matrizInformacao[i][3];
                matrizEditoraJogo[uniqueCount][2] = matrizInformacao[i][4];
                uniqueCount++;
            }
        }

        // Apresentar jogos e as suas categorias da editora
        for (int i = 0; i < uniqueCount; i++) {
            if(matrizEditoraJogo[i][1].equalsIgnoreCase(categoriaNome)) {
                System.out.println("Jogo: " + matrizEditoraJogo[i][2]);
                System.out.println("Editora: " + matrizEditoraJogo[i][0]);
                System.out.println();
            }
        }
    }
}
