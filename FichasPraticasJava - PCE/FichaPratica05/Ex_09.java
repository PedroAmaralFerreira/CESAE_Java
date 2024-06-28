package FichaPratica05;
import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner scanner = new Scanner(System.in);

        int[][] num = new int[3][3];
        int soma=0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Fila: "+(i+1)+"\nPosição: "+(j+1)+"\nIntroduza um número: ");
                num[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                soma += num[i][j];
            }
        }

        System.out.println("Soma: "+soma);
    }
}
