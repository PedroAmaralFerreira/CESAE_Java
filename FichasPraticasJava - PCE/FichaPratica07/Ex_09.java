package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Ex_07.contarLinhasFicheiro;

public class Ex_09 {

    public static String[][] lerCsvParaMatriz(String path) throws FileNotFoundException{

        String[][] matrizCompleta = new String[contarLinhasFicheiro(path)-1][4];

        Scanner scannerFicheiro = new Scanner(new File(path));

        String linha = scannerFicheiro.nextLine();

        int contadorLinhaMatriz = 0;

        while (scannerFicheiro.hasNextLine()){
            linha = scannerFicheiro.nextLine();
            String[] linhaDividida = linha.split(",");

            for (int coluna = 0; coluna < matrizCompleta[0].length; coluna++) {
                matrizCompleta[contadorLinhaMatriz][coluna] = linhaDividida[coluna];
            }

            contadorLinhaMatriz++;
        }

        return matrizCompleta;
    }

    public static void imprimirMusicaGenero(String genero, String[][] matrizCompleta) throws FileNotFoundException {
    }

    public static void imprimirMusicaArtista(String artista, String[][] matrizCompleta) throws FileNotFoundException{
    }

    public static void menu() throws FileNotFoundException{

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {

            System.out.println("1. Pesquisar músicas de um determinado género: ");
            System.out.println("2. Músicas de um determinado artista: ");
            System.out.println("3. Com maior duração: ");
            System.out.println("4. Duração acima do valor: ");
            System.out.println("5. Número de músicas: ");
            System.out.println("6. Sair");
            System.out.println("\nSelecione a sua opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        }while (opcao != 6);
    }

    public static void main(String[] args) {

        lerCsvParaMatriz("exercicio_09.csv");
        String[][] matrizCompleta = lerCsvParaMatriz("exercicio_09.csv");

    }
}
