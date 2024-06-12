package FichaPratica01;
import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        // Ler os 3 números
        System.out.print("Introduza o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.print("Introduza o segundo número: ");
        double num2 = input.nextDouble();
        System.out.print("Introduza o terceiro número: ");
        double num3 = input.nextDouble();

        // Calcular a média aritmética (20%, 30% e 50%)
        num1 = num1 * 0.2;
        num2 = num2 * 0.3;
        num3 = num3 * 0.5;
        double media = (num1 + num2 + num3) / 3;

        // Apresentar o resultado da média
        System.out.println("A média aritmética é "+media);
    }
}
