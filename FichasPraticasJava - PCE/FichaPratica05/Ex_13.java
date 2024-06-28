package FichaPratica05;
import java.util.Scanner;
public class Ex_13 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int[][] num = new int[4][4];
        int soma=0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Fila: "+(i+1)+"\nPosição: "+(j+1)+"\nIntroduza um número: ");
                num[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i == j)
                    soma += num[i][j];
            }
        }

        System.out.println("Soma: "+soma);

    }
}
