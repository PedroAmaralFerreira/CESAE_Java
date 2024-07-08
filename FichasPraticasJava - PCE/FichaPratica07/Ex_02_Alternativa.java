package FichaPratica07;

import java.io.*;

public class Ex_02_Alternativa {

    public static void criarFicheiro(String path, String mensagem) throws FileNotFoundException{

        PrintWriter printWriter = new PrintWriter(new File(path));

        printWriter.println(mensagem);

        printWriter.close();

    }

    public static void criarFicheiroFileWriter(String path, String mensagem) throws IOException {

        FileWriter escrever = new FileWriter(new File(path));

        escrever.append(mensagem);

        escrever.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        criarFicheiro("exercicio_02_alternativa.txt", "Hello, World!");
    }
}
