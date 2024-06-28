package FichaPratica05;
import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int[] num = new int[10];
        Boolean crescente = true;

        // Introduzir numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduza o "+(i+1)+"º número: ");
            num[i] = scanner.nextInt();
        }

        // Verificar se e crescente
        for (int i = 0; i < 9; i++) {
            if (num[i] >= num[i+1]){
                crescente = false;
                break;
            }
        }

        // Apresentar resultado a informar se e ou nao crescente
        if (crescente)
            System.out.println("Crescente");
        else
            System.out.println("Não é crescente");

    }
}
