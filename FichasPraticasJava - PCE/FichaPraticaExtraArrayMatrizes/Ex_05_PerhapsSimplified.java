package FichaPraticaExtraArrayMatrizes;
import java.util.Scanner;
public class Ex_05_PerhapsSimplified {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[12];
        boolean[] duplicado = new boolean[12];
        boolean[] confirmarDuplicado = new boolean[12];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Insira o número do vetor["+i+"]:");
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    duplicado[i] = true;
                    duplicado[j] = true;
                }
            }
        }

        for (int i = 0; i < duplicado.length; i++) {
            if (duplicado[i] && !confirmarDuplicado[i]) {
                System.out.println("O número " + num[i] + " está duplicado!");
                for (int j = 0; j < duplicado.length; j++) {
                    if (num[i] == num[j])
                        confirmarDuplicado[j] = true;
                }
            }
        }
    }
}
