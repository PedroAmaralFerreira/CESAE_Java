package FichaPratica05;
import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int[] num = new int[10];
        int media = 0, calcMedia = 0;

        // Introduzir numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduza o "+(i+1)+"º número: ");
            num[i] = scanner.nextInt();
        }

        // Somar numeros e quantidade
        for (int i = 0; i < 10; i++) {
            media += num[i];
            calcMedia++;
        }

        // Calcular a media
        media /= calcMedia;

        // Apresentar a media
        System.out.println("Média: "+ media);

    }
}
