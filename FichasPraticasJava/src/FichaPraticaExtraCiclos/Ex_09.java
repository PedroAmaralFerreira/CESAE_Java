package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num, resultado = 0;

        // Ler numero
        System.out.println("Introduza um número: ");
        num = input.nextInt();

        // Somar os numeros dentro do numero introduzido (Ex: 123, 1+2+3=5)
        while (num > 0) {
            resultado = resultado + num % 10;
            num /= 10;
        }

        // Apresentar o resultado
        System.out.println(resultado);
    }
}
