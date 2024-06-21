package FichaPraticaExtraCiclos;
import java.util.Scanner;
public class Ex_10 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num=0, numResto;

        // Ler numero
        System.out.println("Introduza um número: ");
        num = input.nextInt();

        // Trocar a ordem dos numeros
        while (num > 0){
            numResto = num % 10;
            System.out.print(numResto);
            num /= 10;
        }
    }
}
