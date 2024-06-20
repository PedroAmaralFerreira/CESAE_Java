package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_4_3 {
    public static void main(String[] args) {

        // Ler variável
        int num = 5;

        // Print dos símbolo "*"
        for (int i=1; i <= num; i++){
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
