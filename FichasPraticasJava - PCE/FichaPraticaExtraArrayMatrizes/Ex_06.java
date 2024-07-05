package FichaPraticaExtraArrayMatrizes;
import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declarar variavel
        int num;

        // Introduzir numero de elementos no array
        System.out.print("Quantos elementos quer inserir no array: ");
        num = scanner.nextInt();

        // Declarar variavel
        int[] array = new int[num];

        // Introduzir numero
        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira um número no Array["+i+"]: ");
            array[i] = scanner.nextInt();
        }

        // Apresentar numero
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array["+i+"]: "+array[i]);
        }
    }
}
