package User;

import java.io.FileNotFoundException;

import static Utilidades.criarMatrizes.criarMatriz;

public class Venda {
    public static void vendaProdutos() throws FileNotFoundException {

        String[][] matrizConteudo = criarMatriz("GameStart/GameStart_Vendas.csv", true);

        for (int i = 0; i < matrizConteudo.length; i++) {
            System.out.println("ID Venda: "+matrizConteudo[i][0]);
            System.out.println("ID Cliente: "+matrizConteudo[i][1]);
            System.out.println("Editora: "+matrizConteudo[i][2]);
            System.out.println("Jogo: "+matrizConteudo[i][3]);
            System.out.println("Valor: "+matrizConteudo[i][4]);
            System.out.println();
        }
    }
}
