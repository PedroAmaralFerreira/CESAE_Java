package Utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Utilidades.criarMatrizes.criarMatriz;

public class JogoMaisCaro {
    public static void jogoMaisCaro() throws FileNotFoundException{

        // Declarar variaveis
        double maiorPreco = 0;
        String jogoCaro = "";
        String[][] matrizJogoCaro = criarMatriz("GameStart/GameStart_Vendas.csv", true);
        String[][] matrizCliente = criarMatriz("GameStart/GameStart_Clientes.csv", true);

        // Verificar o jogo mais caro
        for (int i = 0; i < matrizJogoCaro.length; i++) {
            for (int j = 0; j < matrizJogoCaro[i].length; j++) {
                if (Double.parseDouble(matrizJogoCaro[i][5]) > maiorPreco){
                    maiorPreco = Double.parseDouble(matrizJogoCaro[i][5]);
                    jogoCaro = matrizJogoCaro[i][4];
                }
            }
        }

        // Apresentar o jogo mais caro
        System.out.println("\nJogo mais caro: "+jogoCaro+"\n");
        System.out.println("Clientes que compraram:");

        // Apresentar os clientes que comprar o jogo mais caro
        for (int i = 0; i < matrizJogoCaro.length; i++) {
            if (matrizJogoCaro[i][4].equals(jogoCaro)){
                for (int j = 0; j < matrizCliente.length; j++) {
                    if (matrizJogoCaro[i][1].equals(matrizCliente[j][0])){
                        System.out.println(matrizCliente[j][1]);
                    }
                }
            }
        }
        System.out.println();
    }
}
