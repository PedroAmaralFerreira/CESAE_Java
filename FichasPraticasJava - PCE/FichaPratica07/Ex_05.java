package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_05 {

    public static void imprimirFicheiro(String path) throws FileNotFoundException{

        Scanner scannerFicheiro = new Scanner(new File(path));
        int somarNumero = 0, numero;

        while (scannerFicheiro.hasNextInt()){
            numero = scannerFicheiro.nextInt();
            somarNumero += numero;
        }

        System.out.println(somarNumero);
    }

    public static void main(String[] args) throws FileNotFoundException {

        // Chamar a funcao
        imprimirFicheiro("Exemplo_05.txt");
    }
}
