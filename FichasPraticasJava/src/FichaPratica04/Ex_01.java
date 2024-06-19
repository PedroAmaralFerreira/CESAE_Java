package FichaPratica04;
import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, resultado;
        String operador, cont;
        boolean continuar = true;

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

            if (cont == "s")
                continuar = true;
            if (cont == "n")
                continuar = false;

        } while ();

    }
}
