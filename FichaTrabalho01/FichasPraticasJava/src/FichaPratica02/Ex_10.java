package FichaPratica02;
import java.util.Scanner;
public class Ex_10 {
    public static void main(String[] args) {

        //Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;
        String operacao;

        System.out.print("Introduza um número: ");
        num1 = input.nextDouble();
        System.out.print("Introduza um número: ");
        num2 = input.nextDouble();

        System.out.print("Introduza a operação aritmética: ");
        operacao = input.next();

        switch (operacao){
            case "+": resultado = num1 + num2;
                System.out.println("Resultado: "+resultado);
                break;
            case "-": resultado = num1 - num2;
                System.out.println("Resultado: "+resultado);
                break;
            case "*": resultado = num1 * num2;
                System.out.println("Resultado: "+resultado);
                break;
            case "/": resultado = num1 / num2;
                System.out.println("Resultado: "+resultado);
                break;
            default:
                System.out.println("OPERAÇÃO ARITMÉTICA INVÁLIDA!");
        }
    }
}
