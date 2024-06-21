package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num, numMenor = 0, numMaior = 0;

        // Introduzir numeros ate introduzir o numero 0
        do{
            System.out.print("Introduza um número: ");
            num = input.nextInt();
            if (num == 0)
                break;
            if (num < numMenor)
                numMenor = num;
            if (num > numMaior)
                numMaior = num;
        }while (num != 0);

        // Apresentar o menor e maior numero introduzido
        System.out.println("Número maior: " + numMaior);
        System.out.println("Número menor: " + numMenor);

    }
}
