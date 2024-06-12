package FichaPratica02;
import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num;

        // Ler número
        System.out.print("Introduz um número: ");
        num = input.nextInt();

        // Verificar e apresentar se é par ou ímpar
        if (num % 2 == 0)
            System.out.println(num + " é um número par");
        else
            System.out.println(num + " é um número ímpar");
    }
}
