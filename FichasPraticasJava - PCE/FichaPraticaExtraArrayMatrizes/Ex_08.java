package FichaPraticaExtraArrayMatrizes;
import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanho;

        System.out.print("Tamanho do Array: ");
        tamanho = scanner.nextInt();

        int[] num = new int[tamanho];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduza o número no Vetor["+i+"]: ");
            num[i] = scanner.nextInt();
        }

        System.out.print("Novo valor: ");
        int novoValor = scanner.nextInt();

        System.out.print("Índice do Novo Valor (0-"+tamanho+"): ");
        int index = scanner.nextInt();

        num[index] = novoValor;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Vetor["+i+"]: "+num[i]);
        }
    }
}
