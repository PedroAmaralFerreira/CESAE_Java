package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int resultado;

        // Introduzir o primeiro número
        System.out.print("Introduza um número: ");
        int num1 = input.nextInt();

        // Introduzir o segundo número
        System.out.print("Introduza um número: ");
        int num2 = input.nextInt();

        // Calcular a soma
        resultado = num1 + num2;
        System.out.println("Soma: "+resultado);

        // Calcular a subtração
        resultado = num1 - num2;
        System.out.println("Subtração: "+resultado);

        // Calcular a multiplicação
        resultado = num1 * num2;
        System.out.println("Multiplicação: "+resultado);

        // Calcular a divisão
        resultado = num1 / num2;
        System.out.println("Divisão: "+resultado);
    }
}
