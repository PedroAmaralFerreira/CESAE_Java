package FichaPraticaExtraArrayMatrizes;
import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanho, contar = 0;

        System.out.print("Tamanho do Array: ");
        tamanho = scanner.nextInt();

        int[] num = new int[tamanho];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduza o número no Vetor["+i+"]: ");
            num[i] = scanner.nextInt();
        }

        System.out.print("Valor a remover: ");
        int removerArray = scanner.nextInt();

        for (int i = 0; i < num.length; i++) {
            if(num[i] == removerArray)
                contar++;
        }

        int[] newArray = new int[tamanho - contar];
        int novoTamanho = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != removerArray) {
                newArray[novoTamanho] = num[i];
                novoTamanho++;
            }
        }

        System.out.println("Vetor Original");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Array["+i+"]: "+num[i]);
        }

        System.out.println();
        System.out.println("Vetor Alterado");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Array["+i+"]: "+newArray[i]);
        }

    }
}
