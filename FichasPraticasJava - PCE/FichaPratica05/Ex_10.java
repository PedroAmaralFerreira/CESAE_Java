package FichaPratica05;
import java.util.Scanner;
public class Ex_10 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner scanner = new Scanner(System.in);

        int[][] num = new int[3][5];
        int pesquisa, contar=0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("Fila: "+(i+1)+"\nPosição: "+(j+1)+"\nIntroduza um número: ");
                num[i][j] = scanner.nextInt();
                System.out.println();
            }
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nInsira um número para pesquisar: ");
        pesquisa = scanner.nextInt();

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                if(pesquisa == num[i][j])
                    contar++;
            }
        }

        if (contar == 1)
            System.out.println("Há 1 posição na matriz com o número "+pesquisa);
        else if (contar > 0)
            System.out.println("Há "+contar+" posições com o número "+pesquisa);
        else
            System.out.println("Não existe nenhuma posição com o número "+pesquisa);

    }
}
