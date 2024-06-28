package FichaPratica06;
import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        String carater;
        int linhas, colunas;

        // Introduzir dados
        System.out.print("Introduza um carater: ");
        carater = scanner.next();
        System.out.print("Introduza número de linhas: ");
        linhas = scanner.nextInt();
        System.out.print("Introduza número de colunas: ");
        colunas = scanner.nextInt();

        // Apresentar o quadrado
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if(i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1)
                    System.out.print(carater);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
