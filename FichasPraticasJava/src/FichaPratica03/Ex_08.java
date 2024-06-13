package FichaPratica03;
import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, numOriginal, numFinal;

        // Ler número
        System.out.print("Introduzir um número: ");
        num = input.nextInt();
        numOriginal = num;
        numFinal = num + 5;
        num = num - 5;

        // Condição que fará print dos 5 numeros anteriores e posteriores
        while (num <= numFinal){
            System.out.println(num);
            num++;
            // Condição que passará à frente o número introduzido
            if (num == numOriginal)
                num++;
        }
    }
}
