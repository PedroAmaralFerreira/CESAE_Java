package FichaPratica06;
import java.util.Scanner;
public class Ex_04 {

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

        // Declarar variáveis
        int soma = 0;
        int cont = 1;

        // Verificar se o numero e triangular
        while (soma < num){
            soma += cont;
            cont++;
        }

        // Retorna o resultado da verificacao
        return num == soma;

    }


    public static void main(String[] args) {

        // Importar scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int num, escolha;

        // Ler numero
        System.out.print("Introduza um número: ");
        num = scanner.nextInt();

        // Verificar que e inserido um numero valido
        while (true) {
            System.out.print("1. Par ou Ímpar\n2. Positivo ou Negativo\n3. Primo ou não primo\n4. Perfeito ou Não Perfeito\n5. Triangular ou Não Triangular\n6. Trocar de Número\nEscolha a opção que quer usar: ");
            escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= 5)
                break;
            else
                System.out.println("INVÁLIDO!");
        }

        // Escolher opcao
        switch (escolha){
            case 1:
                if(par(num) == true)
                    System.out.println("O número é par!");
                else
                    System.out.println("O número é ímpar!");
                break;
            case 2:
                if(positivo(num) == true)
                    System.out.println("Número é positivo!");
                else
                    System.out.println("Número é negativo!");
                break;
            case 3:
                if(primo(num) == true)
                    System.out.println("Número é primo!");
                else
                    System.out.println("Número não é primo!");
                break;
            case 4:
                if(perfeito(num) == true)
                    System.out.println("Número é perfeito!");
                else
                    System.out.println("Número não é perfeito!");
                break;
            case 5:
                if(triangulo(num) == true)
                    System.out.println("Número é triangular!");
                else
                    System.out.println("Número não é triangular!");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                break;
        }
    }
}
