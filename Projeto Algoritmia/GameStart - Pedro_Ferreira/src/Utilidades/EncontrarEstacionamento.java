package Utilidades;

import java.io.FileNotFoundException;

public class EncontrarEstacionamento {
    public static void encontrarEstacionamento() throws FileNotFoundException{

        // Declarar variaveis
        int lugares = 121;
        int numeroTriangular = 0;

        // Apresentar lugares livres (numeros triangulares multiplos de 5 em 121 lugares)
        System.out.println("Lugares Livres:");
        for (int i = 1; numeroTriangular <= lugares; i++) {
            numeroTriangular = (i * (i + 1)) / 2;
            if (numeroTriangular <= lugares && numeroTriangular % 5 == 0) {
                System.out.println("- "+numeroTriangular);
            }
        }
        System.out.println();
    }
}
