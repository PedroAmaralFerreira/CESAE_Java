package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        // Introduzir o primeiro número
        System.out.print("Introduza um número: ");
        int num1 = input.nextInt();

        // Introduzir o segundo número
        System.out.print("Introduza um número: ");
        int num2 = input.nextInt();

        // Operações
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        // Resultados das diferentes operações
        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+sub);
        System.out.println("Multiplicação: "+mult);
        System.out.println("Divisão: "+div);
    }
}
