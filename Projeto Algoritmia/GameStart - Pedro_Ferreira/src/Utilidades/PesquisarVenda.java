package Utilidades;

import java.io.FileNotFoundException;

import static Utilidades.criarMatrizes.criarMatriz;

public class PesquisarVenda {
    public static void pesquisarVenda(String path, String nomeJogo) throws FileNotFoundException{

        // Declarar variaveis
        String[][] jogoPesquisado = criarMatriz(path, true);
        String[][] nomeCliente = criarMatriz("GameStart/GameStart_Clientes.csv", true);
        boolean jogoEncontrado = false;

        // Verificar a pesquisa e apresentar a informacao sobre a compra
        for (int i = 0; i < jogoPesquisado.length; i++) {
            for (int j = 0; j < jogoPesquisado[i].length; j++) {
                if (jogoPesquisado[i][j].toLowerCase().contains(nomeJogo.toLowerCase())){
                    jogoEncontrado = true; // Encontrou o jogo
                    for (int k = 0; k < nomeCliente.length; k++) {
                        if(jogoPesquisado[i][1].equals(nomeCliente[k][0])){
                            System.out.println("Nome: "+ nomeCliente[k][1]);
                            System.out.println("Contacto: "+ nomeCliente[k][2]);
                            System.out.println("Email: "+ nomeCliente[k][3]);
                            System.out.println("Jogos comprado: "+jogoPesquisado[i][4]);
                            System.out.println();
                        }
                    }
                }
            }
        }
        if (!jogoEncontrado){
            System.out.println("Jogo não encontrado!\n"); // Apresentar mensagem, caso nao encontro o jogo pesquisado
        }
    }
}
