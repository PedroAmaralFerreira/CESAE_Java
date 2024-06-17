package FichaPratica03;
import java.util.Scanner;
public class Ex_15 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num, count, numOriginal;

        // Ler numero
        System.out.println("Fatorial de: ");
        num = input.nextInt();
        count = num;
        numOriginal = num;

        if(num < 0)
            num = -1;
        if(num == 0)
            num = 1;
        while (count > 1){
            num = num * (numOriginal - 1);
            count--;
            numOriginal--;
        }

        if (num < 0)
            System.out.println("INVÁLIDO!");
        else
            System.out.println(num);

    }
}
