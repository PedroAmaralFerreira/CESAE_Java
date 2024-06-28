package FichaPratica06;
import java.util.Scanner;
public class Ex_07 {

    static void somarMatrizes(int[][] matriz1, int[][] matriz2){

        int somaMatriz1 = 0, somaMatriz2 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaMatriz1 += matriz1[i][j];
                somaMatriz2 += matriz2[i][j];
            }
        }

        System.out.println("Soma da Matriz 1: "+somaMatriz1);
        System.out.println("Soma da Matriz 2: "+somaMatriz2);
    }

    static int somatorioMatrizes(int[][] matriz1, int[][] matriz2){

        int soma=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz1[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz2[i][j];
            }
        }

        return soma;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int somatorio;

        System.out.println("\nPrimeira Matriz\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila: "+(i+1)+"\nPosição: "+(j+1)+"\nIntroduza um número: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSegunda Matriz\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila: "+(i+1)+"\nPosição: "+(j+1)+"\nIntroduza um número: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        somarMatrizes(matriz1, matriz2);
        somatorio = somatorioMatrizes(matriz1, matriz2);
        System.out.println("O somatório é: "+somatorio);
    }
}
