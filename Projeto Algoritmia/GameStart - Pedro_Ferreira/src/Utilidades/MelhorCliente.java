package Utilidades;

import java.io.FileNotFoundException;

import static Utilidades.criarMatrizes.criarMatriz;

public class MelhorCliente {
    public static void melhorCliente(String path1, String path2) throws FileNotFoundException{

        // Declarar variaveis
        String[][] vendas = criarMatriz(path1, true);
        String[][] clientes = criarMatriz(path2, true);

        String[][] idValor = new String[vendas.length][2];
        String[] vetorIdCliente = new String[vendas.length];
        double[] vetorVendaTotal = new double[vendas.length];
        int uniqueCount = 0;

        // Atribuir informacao ao array
        for (int i = 0; i < idValor.length; i++) {
                idValor[i][0] = vendas[i][1];
                idValor[i][1] = vendas[i][5];
        }

        // Remover duplicados e somar as vendas
        for (int i = 0; i < idValor.length; i++) {
            String idCliente = idValor[i][0];
            double valorTotal = Double.parseDouble(idValor[i][1]);
            boolean duplicado = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (idCliente.equals(vetorIdCliente[j])){
                    vetorVendaTotal[j] += valorTotal;
                    duplicado = true;
                    break;
                }
            }
            if(!duplicado){
                vetorIdCliente[uniqueCount] = idCliente;
                vetorVendaTotal[uniqueCount] = valorTotal;
                uniqueCount++;
            }
        }

        // Verificar o(s) cliente(s) que gastou/gastaram mais
        double gastouMais = 0;
        String[] melhoresClientes = new String[vetorIdCliente.length];
        int numeroMelhorCliente = 0;
        for (int i = 0; i < uniqueCount; i++) {
            if (vetorVendaTotal[i] > gastouMais){
                gastouMais = vetorVendaTotal[i];
                melhoresClientes[numeroMelhorCliente] = vetorIdCliente[i];
                numeroMelhorCliente++;
            }
            else if(vetorVendaTotal[i] == gastouMais){
                melhoresClientes[numeroMelhorCliente++] = vetorIdCliente[i];
            }
        }

        // Apresentar cliente(s)
        for (int i = 0; i < numeroMelhorCliente; i++) {
            for (int j = 0; j < clientes.length; j++) {
                if((clientes[j]) != null && melhoresClientes[i].equals(clientes[j][0])){
                    System.out.println("\nMelhor Cliente: " + clientes[j][1] + "\nValor Total Gasto: " + gastouMais + "\n");
                }
            }
        }
    }
}
