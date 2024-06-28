package FichaPratica06;
import java.util.Scanner;
public class Ex_02 {

    public static void asterisco(int num){

        // Imprimir asteriscos
        while (num > 0){
            System.out.print("*");
            num--;
        }

    }

    public static void main(String[] args) {

        // Importar Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int num;

        // Introduzir numero
        System.out.print("Introduza um número: ");
        num = scanner.nextInt();

        // Chamar a funcao
        asterisco(num);

    }
}
