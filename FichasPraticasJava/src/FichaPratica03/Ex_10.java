package FichaPratica03;
import java.util.Scanner;
public class Ex_10 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, num2=2;

        // Ler número
        System.out.println("Introduzir número: ");
        num = input.nextInt();

        // Condição que vai verificar se o número é par
        // e irá fazer print, caso seja
        while (num2 <= num){
            System.out.println(num2);
            num2++;
            if (num2 % 2 != 0)
                num2++;
            else
                System.out.println(num2);
        }
    }
}
