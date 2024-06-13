package FichaPratica02;
import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, num3, menor;

        // Ler 3 números
        System.out.print("Introduz um número: ");
        num1 = input.nextInt();
        menor = num1;

        // Aplicar troca, se for o caso
        System.out.print("Introduz um número: ");
        num2 = input.nextInt();
        if(num2 < menor)
            menor = num2;
        System.out.print("Introduz um número: ");
        num3 = input.nextInt();
        if(num3 < menor)
            menor = num3;

        // Apresentar número menor
        System.out.println("Menor: "+menor);
    }
}
