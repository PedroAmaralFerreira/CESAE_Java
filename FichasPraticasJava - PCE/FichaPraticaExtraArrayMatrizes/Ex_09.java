package FichaPraticaExtraArrayMatrizes;
import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanho, temp;
        boolean troca;

        System.out.print("Quantos elementos quer inserir no Array: ");
        tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Vetor["+i+"]: ");
            array[i] = scanner.nextInt();
        }

        do {
            troca = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    i = 0;
                    troca = true;
                }
            }
        }while (troca);

        System.out.println();
        System.out.println("Ordem Crescente");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Vetor["+i+"]: "+array[i]);
        }
    }
}
