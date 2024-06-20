package FichaPraticaExtraCiclos;
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Declarar variaveis
        int num = 1;

        // Escrever multiplos de 3 entre 1 e 255
        for (int i = 1; i < 255; i++){
            if (num % 3 == 0)
                System.out.println(num);
            num++;
        }
    }
}
