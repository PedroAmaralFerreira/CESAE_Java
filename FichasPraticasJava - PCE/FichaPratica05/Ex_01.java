package FichaPratica05;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variavel
        int[] num = new int[10];

        // Ler numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira o número no Array["+i+"]: ");
            num[i] = input.nextInt();
        }

        // Apresentar numeros
        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }

    }
}
