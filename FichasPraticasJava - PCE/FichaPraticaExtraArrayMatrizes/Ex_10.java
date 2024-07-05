package FichaPraticaExtraArrayMatrizes;
import java.util.Scanner;
public class Ex_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[12];
        boolean[] vetorDuplicado = new boolean[12];
        int contador = 0, duplicado = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Vetor["+i+"]: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    duplicado++;
            }
            if (duplicado > 1)
                vetorDuplicado[i]= true;
        }

        for (int i = 0; i < array.length; i++) {
            if (!vetorDuplicado[i])
                contador++;
        }

        int[] novoArray = new int[contador];
        int novoVetor = 0;
        for (int i = 0; i < array.length; i++) {
                if (!vetorDuplicado[i]) {
                    novoArray[novoVetor++] = array[i];
                }
            }

        for (int i = 0; i < novoArray.length; i++) {
            System.out.println("Vetor["+i+"]: " + novoArray[i]);
        }
    }
}
