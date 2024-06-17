package FichaPratica03;
import java.util.Scanner;
public class Ex_13 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numInicio, numFinal, numMultiplo;

        // Ler valor de inicio e fim de um intervalo
        System.out.println("Introduza o valor de início: ");
        numInicio = input.nextInt();
        System.out.println("Introduza o valor final: ");
        numFinal = input.nextInt();

        // Condicao que ira verificar e apresentar os numeros
        // que sao multiplos de 5
        while (numInicio <= numFinal){
            if (numInicio % 5 == 0) {
                System.out.println(numInicio);
                numInicio++;
            }
            else
                numInicio++;
        }
    }
}
