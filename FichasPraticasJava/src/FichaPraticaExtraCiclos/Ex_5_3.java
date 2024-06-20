package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_5_3 {
    public static void main(String[] args) {

        // Ler variável
        int num = 5;

        // Print dos símbolo "*"
        for (int i=1; i <= num; i++){
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
