package FichaPratica05;
import java.util.Scanner;
public class Ex_12 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        int[][] matriz = new int[10][2];

        // Ler valores para o primeiro array
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um número no Array1[" + i + "]: ");
            num1[i] = scanner.nextInt();
        }

        // Ler valores para o segundo array
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um número no Array2[" + i + "]: ");
            num2[i] = scanner.nextInt();
        }

        // Gerar a matriz
        for (int i = 0; i < 10; i++) {
            matriz[i][0] = num1[i];
            matriz[i][1] = num2[i];
        }

        // Apresentar a matriz
        System.out.println("Matriz 10x2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(matriz[i][0] + " " + matriz[i][1]);
        }
    }
}
