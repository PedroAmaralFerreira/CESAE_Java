package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int numBase, numElevado, resultado;

        System.out.print("Introduza o primeiro número: ");
        numBase = input.nextInt();
        System.out.print("Introduza o segundo número: ");
        numElevado = input.nextInt();
        resultado = numBase;

        for (int i = 1; i < numElevado; i++){
            resultado = resultado * numBase;
        }

        System.out.println("Resultado: "+ resultado);

    }
}
