package FichaPratica04;
import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num1, num2, resultado;
        String operador, cont;

        // Condicao que fara o utilizador a escolher dois numeros e um operador.
        // Ira tambem perguntar se quer continuar a usar o programa ou nao
        do {
            System.out.print("Introduzida um número: ");
            num1 = input.nextInt();
            System.out.print("Introduzida um número: ");
            num2 = input.nextInt();
            System.out.print("Introduzida um operador: ");
            operador = input.next();

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println(resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println(resultado);
                    break;
                case "/":
                    resultado = num1 / num2;
                    System.out.println(resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println(resultado);
                    break;
                default:
                    System.out.println("INVÁLIDO!");
            }

            System.out.println("Deseja continuar?\n(introduza s/n): ");
            cont = input.next();

            while (!cont.equals("s") && !cont.equals("n")){
                System.out.println("INPUT INVÁLIDO!");
                System.out.println("Deseja continuar?\n(introduza s/n): ");
                cont = input.next();
            }

        } while (cont.equals("s"));

    }
}
