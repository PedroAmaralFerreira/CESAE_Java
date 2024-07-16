package Utilidades;

import java.io.File;
import java.io.FileNotFoundException;

public class VerificarDuplicado {
    public static String[] verificarDuplicado(String[][] arrayOriginal, String nomeEditora) throws FileNotFoundException {


        String[] editoraSemDuplicados = new String[arrayOriginal.length];
        int countUnique = 0;

        for (int i = 0; i < arrayOriginal.length; i++) {
            if (arrayOriginal[i][2].equalsIgnoreCase(nomeEditora)) {
                boolean duplicado = false;

                for (int j = 0; j < countUnique; j++) {
                    if (editoraSemDuplicados[j].equals(arrayOriginal[i][4])) {
                        duplicado = true;
                        break;
                    }
                }
                if (!duplicado) {
                    editoraSemDuplicados[countUnique] = arrayOriginal[i][4];
                    countUnique++;
                }
            }
        }

        String[] jogosEditora = new String[countUnique];

        for (int i = 0; i < countUnique; i++) {
            jogosEditora[i] = editoraSemDuplicados[i];
        }

        return jogosEditora;
    }
}
