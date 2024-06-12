package FichaPratica01;
import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {

        int perm;

        // Importar dados
        Scanner input = new Scanner(System.in);

        // Ler valor 1 e valor 2
        System.out.print("Introduza o primeiro valor: ");
        int valor1 = input.nextInt();
        System.out.print("Introduza o segundo valor: ");
        int valor2 = input.nextInt();

        // Permutar os dois valores
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        // Apresentação dos dois valores após permutação
        System.out.println("Valor 1: "+valor1+"\nValor 2: "+valor2);
    }
}
