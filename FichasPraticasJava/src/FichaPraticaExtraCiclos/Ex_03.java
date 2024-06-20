package FichaPraticaExtraCiclos;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        int mult = 1, num = 1, resultado;

        for (int i = 1; i <= 10; i++){
            while (num <= 10) {
                System.out.println("Tabuada do "+num+":");
                while (mult <= 10) {
                    resultado = num * mult;
                    System.out.println(num + " x " + mult + " = " + resultado);
                    mult++;
                }
                mult = 1;
                i = 1;
                num++;
                System.out.println("\n");
            }
        }
    }
}
