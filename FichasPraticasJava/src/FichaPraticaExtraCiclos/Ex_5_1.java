package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_5_1 {
    public static void main(String[] args) {

        // Ler variável
        int num = 5, numMostra = 1;

        // Print dos símbolo "*"
        for (int i=1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(numMostra);
            }
            numMostra++;
            if(numMostra == 5)
                System.out.println("\n. . .");
            System.out.println();
        }
    }
}
