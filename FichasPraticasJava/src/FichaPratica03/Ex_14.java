package FichaPratica03;
import java.util.Scanner;
public class Ex_14 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int cont, num, numAnterior = 0, numCrescente=0;

        // Ler numero de vezes
        System.out.println("Quantos números deseja inserir: ");
        cont = input.nextInt();

        if(cont == 0 || cont < 0)
            numCrescente = 0;
        else {
            System.out.println("Introduza um número: ");
            num = input.nextInt();
            while (numAnterior < num && cont > 1) {
                numAnterior = num;
                System.out.println("Introduza um número: ");
                num = input.nextInt();
                cont--;
                numCrescente = 1;
                if (numAnterior > num)
                    numCrescente = 0;
            }

            while (cont > 1) {
                System.out.println("Introduza um número: ");
                num = input.nextInt();
                numCrescente = 0;
                cont--;
            }
        }

        if (cont == 0 || cont < 0)
            System.out.println("0 números introduzidos!");
        else {
            if (numCrescente == 1)
                System.out.println("Crescente");
            else
                System.out.println("Não crescente");
        }

    }
}
