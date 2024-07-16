package User;

import java.io.FileNotFoundException;

import static Utilidades.criarMatrizes.criarMatriz;

public class Categoria {
    public static void categoriaProdutos() throws FileNotFoundException {

        String[][] matrizConteudo = criarMatriz("GameStart/GameStart_Categorias.csv", true);

        for (int i = 0; i < matrizConteudo.length; i++) {
            System.out.println("Categoria: "+matrizConteudo[i][0]);
            System.out.println("Percentagem da Margem: "+matrizConteudo[i][1]+"%");
            System.out.println();
        }
    }
}
