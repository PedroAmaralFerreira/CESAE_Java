package FichaPratica03;
import java.util.Scanner;
public class Ex_12 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar varáveis
        int num = 0, numInt1, numInt2, numInt3, numInt4;
        numInt1 = numInt2 = numInt3 = numInt4 = num;

        // Ler numero
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Condicao que criara um loop onde se o numero for
        // maior que 100, ira avisar e pedir para re-introduzir
        while (num > 100){
            System.out.println("Tem que ser entre 0 e 100!");
            System.out.print("Introduza um número: ");
            num = input.nextInt();
        }

        // Condicoes que irao continuamente pedir para introduzir
        // um numero ate ser negativo. Ira tambem avisar, caso
        // seja introduzido um numero superior a 100, que os tera
        // que ser entre 0 e 100
        if (num < 0)
            num = 0;
        else {
            while (num >= 0) {
                System.out.print("Introduza um número: ");
                num = input.nextInt();
                if (num <= 25)
                    numInt1++;
                if (num > 25 && num <= 50)
                    numInt2++;
                if (num > 50 && num <= 75)
                    numInt3++;
                if (num > 75 && num <= 100)
                    numInt4++;
                if (num > 100)
                    System.out.println("Tem que ser entre 0 e 100!");
            }
        }
        System.out.println("[00,25]: "+numInt1);
        System.out.println("[26,50]: "+numInt2);
        System.out.println("[51,75]: "+numInt3);
        System.out.println("[76,100]: "+numInt4);
    }
}
