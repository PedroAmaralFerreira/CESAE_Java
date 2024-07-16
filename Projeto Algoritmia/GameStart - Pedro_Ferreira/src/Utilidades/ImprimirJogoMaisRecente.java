package Utilidades;

import java.io.FileNotFoundException;

import static Utilidades.criarMatrizes.criarMatriz;

public class ImprimirJogoMaisRecente {
    public static void imprimirJogoMaisRecente(String path) throws FileNotFoundException{

        // Declarar variaveis
        String[][] vendas = criarMatriz(path, true);
        String[] nomeJogos = new String[vendas.length];
        int linhas=0;
        String jogoMaisRecente = "";

        // Introduzir dados e contar linhas do array
        for (int i = 0; i < nomeJogos.length; i++) {
            nomeJogos[i] = vendas[i][4];
            linhas++;
        }

        // Verificar se existem jogos duplicados
        for (int i = linhas - 1; i >= 0; i--) {
            boolean duplicado = false;
            for (int j = 0; j < nomeJogos.length; j++) {
                if (i != j && nomeJogos[i].equals(nomeJogos[j])){
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado){
                jogoMaisRecente = nomeJogos[i];
                break;
            }
        }

        // Apresentar jogo mais recente com uma venda
        System.out.println(jogoMaisRecente);
    }
}
