package FichaPratica05;
import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int[] num = new int[10];

        // Introduzir numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduza o "+(i+1)+"º número: ");
            num[i] = scanner.nextInt();
        }

        // Verificar numero maior
        for (int i = 1; i < 10; i++) {
            if (num[i] < num[0])
                num[0] = num[i];
        }

        // Apresentar numero maior
        System.out.println("Menor número: "+ num[0]);

    }
}
