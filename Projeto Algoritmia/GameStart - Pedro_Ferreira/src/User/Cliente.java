package User;

import java.io.FileNotFoundException;

import static Utilidades.criarMatrizes.*;

public class Cliente {
    public static void consultaDeFicheiros() throws FileNotFoundException {

        String[][] matrizConteudo = criarMatriz("GameStart/GameStart_Clientes.csv", true);
        for (int i = 0; i < matrizConteudo.length; i++) {
            System.out.println("ID Cliente: " + matrizConteudo[i][0]);
            System.out.println("Nome Cliente: " + matrizConteudo[i][1]);
            System.out.println("Contacto: " + matrizConteudo[i][2]);
            System.out.println("Email: " + matrizConteudo[i][3]);
            System.out.println();
        }
    }
}
