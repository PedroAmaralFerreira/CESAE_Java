package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {

    public static void pessoaMaisVelha(String path) throws FileNotFoundException {

        Scanner scannerFicheiro = new Scanner(new File(path));

        int maiorIdade = 0;
        String nomeMaiorIdade = "";

        while (scannerFicheiro.hasNextLine()){
            String linha = scannerFicheiro.nextLine();

            String[] linhaDividida = linha.split(",");
            if(Integer.parseInt(linhaDividida[1]) > maiorIdade){
                maiorIdade = Integer.parseInt(linhaDividida[1]);
                nomeMaiorIdade = linhaDividida[0];
            }
        }

        System.out.println("A pessoa mais velha é "+nomeMaiorIdade+" com "+maiorIdade+" anos!" );

    }

    public static void main(String[] args) throws FileNotFoundException {

        pessoaMaisVelha("exercicio_06.txt");

    }
}
