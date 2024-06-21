package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num, numNegativo = 0, numPositivo = 0;

        // Ler numero ate ser introduzido 0
        do{
            System.out.print("Introduza um número: ");
            num = input.nextInt();
            if (num > 0)
                numPositivo++;
            else if (num < 0)
                numNegativo++;
        }while (num != 0);

        // Apresentar numeros negativos e positivos
        System.out.println("Número(s) negativo(s): "+numNegativo);
        System.out.println("Número(s) positivo(s): "+numPositivo);
    }
}
