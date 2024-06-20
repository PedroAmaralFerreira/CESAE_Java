package FichaPratica04;
import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num;

        // Ler numero
        System.out.println("Introduza um número: ");
        num = input.nextInt();

        // Condicao que determinara se o numero e ou nao primo
        if (num % 2 != 0 || num == 2)
            System.out.println("O número É primo.");
        else
            System.out.println("O número NÃO É primo.");
    }
}
