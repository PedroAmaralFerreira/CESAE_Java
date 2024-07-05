package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {

    public static void quantidadePalavras(String path) throws FileNotFoundException{

        int numeroDePalavras = 0;
        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNextLine()){
            String palavras = scannerFicheiro.next();
            numeroDePalavras++;
        }

        System.out.println("Palavras: "+ numeroDePalavras);
    }

    public static void main(String[] args) throws FileNotFoundException {

        quantidadePalavras("Exemplo_07.txt");

    }
}
