package FichaPraticaExtraArrayMatrizes;
import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int[] num = new int[10];

        // Introduzir numeros
        for (int i = 1; i < 10; i++) {
            System.out.println("Insira um número no Array["+(i)+"]: ");
            num[i] = scanner.nextInt();;
        }

        // Apresentar numero por ordem contraria de insercao
        for (int i = 9; i > 0; i--) {
            System.out.println(num[i]);
        }
    }
}
