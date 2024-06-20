package FichaPratica04;
import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num;

        // Condicao que determinara se o numero e ou nao primo
        do {

            // Ler numero
            System.out.print("Introduza um número: ");
            num = input.nextInt();

            if (num % 2 != 0 || num == 2)
                System.out.println("O número É primo.");
            else
                System.out.println("O número NÃO É primo.");
        } while (true);
    }
}
