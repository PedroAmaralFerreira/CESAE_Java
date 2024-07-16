    package Utilidades;

    import java.io.FileNotFoundException;

    public class ImprimirCatalogoEditora {
        public static void imprimirCatalogoEditora(String[][] matrizEditora, String[] jogosEditora, String editoraNome) throws FileNotFoundException{

            boolean duplicado = false;
            int uniqueCount1=0, uniqueCount2=0;

            String[][] matrizEditoraCategoria = new String[matrizEditora.length][2];
            String[][] matrizCategoriaJogo = new String[matrizEditora.length][3];

            // EditoraCategoria
            for (int i = 0; i < matrizEditora.length; i++) {
                duplicado = false;
                for (int j = 0; j < i; j++) {
                    if(matrizEditora[i][2].equals(matrizEditora[j][2]) && matrizEditora[i][3].equals(matrizEditora[j][3])){
                        duplicado = true;
                        break;
                    }
                }
                if(!duplicado){
                    matrizEditoraCategoria[uniqueCount1][0] = matrizEditora[i][2];
                    matrizEditoraCategoria[uniqueCount1][1] = matrizEditora[i][3];
                    uniqueCount1++;
                }
            }

            // CategoriaJogo
            for (int i = 0; i < matrizEditora.length; i++) {
                duplicado = false;
                for (int j = 0; j < i; j++) {
                    if (matrizEditora[i][2].equals(matrizEditora[j][2]) && matrizEditora[i][3].equals(matrizEditora[j][3]) && matrizEditora[i][4].equals(matrizEditora[j][4])){
                        duplicado = true;
                        break;
                    }
                }
                if(!duplicado){
                    matrizCategoriaJogo[uniqueCount2][0] = matrizEditora[i][2];
                    matrizCategoriaJogo[uniqueCount2][1] = matrizEditora[i][3];
                    matrizCategoriaJogo[uniqueCount2][2] = matrizEditora[i][4];
                    uniqueCount2++;
                }
            }

            for (int i = 0; i < uniqueCount1; i++) {
                if(matrizEditoraCategoria[i][0].equalsIgnoreCase(editoraNome)) {
                    System.out.print("___" + matrizEditoraCategoria[i][1] + "___");
                    System.out.println();
                    for (int j = 0; j < uniqueCount2; j++) {
                        if (matrizCategoriaJogo[j][1].equals(matrizEditoraCategoria[i][1]) && matrizCategoriaJogo[j][0].equalsIgnoreCase(editoraNome)) {
                            System.out.println(matrizCategoriaJogo[j][2]);
                        }
                    }
                    System.out.println();
                }
            }
    }
}