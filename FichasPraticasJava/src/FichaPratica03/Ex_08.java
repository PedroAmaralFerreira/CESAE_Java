package FichaPratica03;
import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numAntecessor, numOriginal, numFinal;

        // Ler número
        System.out.print("Introduzir um número: ");
        numOriginal = input.nextInt();
        numAntecessor = numOriginal - 5;
        numFinal = numOriginal + 5;

        // Condição que fará print dos 5 numeros anteriores e posteriores
        while (numAntecessor <= numFinal){
            if (numAntecessor != numOriginal)
                System.out.println(numAntecessor);
            else
                System.out.println();
            numAntecessor++;
        }
    }
}
