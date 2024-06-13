package FichaPratica03;
import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, count = 0;
        String frase;

        // Ler numero e frase
        System.out.print("Introduza um número: ");
        num = input.nextInt();
        System.out.print("Introduza uma mensagem: ");
        frase = input.next();

        // Condição que irá fazer print da mensagem escrita
        // durante o número de vezes introduzida
        while (count < num){
            System.out.println(frase);
            count++;
        }
    }
}
