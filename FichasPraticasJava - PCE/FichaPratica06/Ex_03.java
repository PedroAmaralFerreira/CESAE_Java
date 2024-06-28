package FichaPratica06;
import java.util.Scanner;
public class Ex_03 {

    static boolean par(int num){

        // Verifica se o numero e par e devolve a confirmacao
        return num % 2 == 0;
    }

    static boolean positivo(int num){

        // Verifica se o numero e positivo e devolver a confirmacao
        return num >= 0 ;
    }

    static boolean primo(int num){

        // Verifica se o numero e primo e devolve a confirmacao
        if (num <= 1)
            return false;
        if (num == 2 || num % 2 != 0)
            return true;
        else
            return false;
    }

    static boolean perfeito(int num){

        // Declarar variaveis
        int perfeito = 0;

        // Verifica se o numero e perfeito
        if(num < 1)
            return false;
        for (int i = 1; i < num ; i++) {
            if ( num % i == 0)
                perfeito += i;
        }

        // Devolve a confirmacao
        return perfeito == num;
    }

    static boolean triangulo(int num){

        int soma = 0;
        int cont = 1;

        while (soma < num){
            soma += cont;
            cont++;
        }

        return num == soma;

    }


    public static void main(String[] args) {

        // Importar scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int num;

        // Ler numero
        System.out.print("Introduza um número: ");
        num = scanner.nextInt();

        // Apresentar resultados
        if(par(num) == true)
            System.out.println("O número é par!");
        else
            System.out.println("O número é ímpar!");

        if(positivo(num) == true)
            System.out.println("Número é positivo!");
        else
            System.out.println("Número é negativo!");

        if(primo(num) == true)
            System.out.println("Número é primo!");
        else
            System.out.println("Número não é primo!");

        if(perfeito(num) == true)
            System.out.println("Número é perfeito!");
        else
            System.out.println("Número não é perfeito!");

        if(triangulo(num) == true)
            System.out.println("Número é triangular!");
        else
            System.out.println("Número não é triangular!");
    }
}
