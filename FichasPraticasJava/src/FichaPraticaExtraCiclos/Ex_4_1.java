package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_4_1 {
    public static void main(String[] args) {

        // Ler variável
        int num = 1;

        // Print do "*" 10 vezes em 4 colunas
        for (int i=1; i <= 10; i++){
            System.out.print("*");
            if (i == 10 && num < 4){
                System.out.print("\n");
                i = 0;
                num++;
            }
        }
    }
}
