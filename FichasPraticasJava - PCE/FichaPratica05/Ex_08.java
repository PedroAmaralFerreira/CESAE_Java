package FichaPratica05;
import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner scanner = new Scanner(System.in);

        int[][] num = new int[3][3];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Vetor[" + i + "]["+j+"]: ");
                num[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(num[2][1]);
    }
}
