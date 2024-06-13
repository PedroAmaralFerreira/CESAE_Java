package FichaPratica03;
import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, count = 0;

        // Ler numero introduzido
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Condição que vai imprimir todos nos número inteiros
        // até o número introduzido
        while (count <= num) {
            System.out.println(count);
            count++;
        }
    }
}
