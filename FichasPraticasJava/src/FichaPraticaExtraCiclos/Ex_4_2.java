package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_4_2 {
    public static void main(String[] args) {

        // Ler variável
        int num = 5;

        // Print dos símbolo "*"
        for (int i=1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
