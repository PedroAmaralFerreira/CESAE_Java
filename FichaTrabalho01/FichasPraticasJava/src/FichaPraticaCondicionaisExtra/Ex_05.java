package FichaPraticaCondicionaisExtra;
import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num = 31, numTentativa;

        // Ler o número de tentativa
        System.out.print("Adivinhe o número (1 a 100): ");
        numTentativa = input.nextInt();

        // Condição que confirma se o número introduzido está entre 1 e 100
        // e que cita se o número introduzido está certo, acima ou abaixo do valor.
        if (numTentativa >= 1 && numTentativa <= 100) {
            if (numTentativa > num) {
                System.out.println("Muito alto");
                System.out.println("Adivinhe o número (1 a 100): ");
                numTentativa = input.nextInt();
                if (numTentativa > num) {
                    System.out.println("Muito alto");
                    System.out.println("Ficaste sem tentativas...");
                }
                if (numTentativa < num) {
                    System.out.println("Muito baixo");
                    System.out.println("Ficaste sem tentativas...");
                }
            }

            if (numTentativa < num) {
                System.out.println("Muito baixo");
                System.out.println("Adivinhe o número (1 a 100): ");
                numTentativa = input.nextInt();
                if (numTentativa > num) {
                    System.out.println("Muito alto");
                    System.out.println("Ficaste sem tentativas...");
                }
                if (numTentativa < num) {
                    System.out.println("Muito baixo");
                    System.out.println("Ficaste sem tentativas...");
                }
            }

            if (numTentativa == num)
                System.out.println("Boa! Ganhaste o jogo!");
        }
        else
            System.out.println("INVÁLIDO! NÚMERO TEM QUE SER ENTRE 1 E 100!");
    }
}
