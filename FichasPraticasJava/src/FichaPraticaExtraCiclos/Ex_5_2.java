package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_5_2 {
    public static void main(String[] args) {

        // Ler variável
        int num = 5, numMostra = 1;

        // Print dos símbolo "*"
        for (int i=1; i <= num; i++){
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print(numMostra);
            }
            numMostra++;
            System.out.println();
        }
    }
}
