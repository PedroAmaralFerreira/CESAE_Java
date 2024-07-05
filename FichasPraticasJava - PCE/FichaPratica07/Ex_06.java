package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_06 {

    public static void verificarIdade(String path) throws FileNotFoundException{

        Scanner scannerFicheiro = new Scanner(new File(path));


    }

    public static void main(String[] args) throws FileNotFoundException {

        // Chamar a funcao
        verificarIdade("Exemplo_06.txt");
    }
}
