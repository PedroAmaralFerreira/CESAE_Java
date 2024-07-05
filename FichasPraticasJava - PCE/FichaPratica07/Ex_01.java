package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_01 {

    public static void lerFicheiro(String path) throws FileNotFoundException{

        Scanner scannerFicheiro = new Scanner(new File(path));

        while (scannerFicheiro.hasNextLine()) {
            System.out.println(scannerFicheiro.nextLine());
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        lerFicheiro("exercicio_01_Alternativa02.txt");
    }
}
