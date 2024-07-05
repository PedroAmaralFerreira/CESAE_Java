package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {

    public static void lerFicheiro(String path, String path2) throws FileNotFoundException{

        // Criar Variavel
        String mensagem;

        // Ler ficheiro
        Scanner scannerFicheiro = new Scanner(new File(path));

        // Criar novo ficheiro
        File novoFicheiro = new File(path2);
        PrintWriter printWriter = new PrintWriter(novoFicheiro);

        // Escrever conteudo no novo ficheiro
        while (scannerFicheiro.hasNext()) {
            mensagem = scannerFicheiro.nextLine();
            printWriter.println(mensagem);
        }

        // Fechar ficheiro
        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        // Chamar a funcao
        lerFicheiro("Exemplo02.txt", "Exemplo03.txt");
    }
}
