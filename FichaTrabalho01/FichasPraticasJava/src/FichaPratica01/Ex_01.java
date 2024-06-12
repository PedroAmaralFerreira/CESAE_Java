package FichaPratica01;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Importar Dados
        Scanner input = new Scanner(System.in);

        // Adicionar o primeiro número
        System.out.print("Introduza um numero: ");
        int num1 = input.nextInt();

        // Adicionar o segundo número
        System.out.print("Introduza um numero: ");
        int num2 = input.nextInt();

        // Soma dos números
        int soma = num1 + num2;

        // Apresentar o resultado da soma
        System.out.println("Soma: " + soma);
    }
}