package FichaPratica02;
import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        // Ler dois números introduzidos pelo utilizador
        System.out.print("Introduza um numero: ");
        int num1 = input.nextInt();
        System.out.print("Introduza um numero: ");
        int num2 = input.nextInt();

        // Condição para entender qual número é maior e apresentá-lo
        if(num1 > num2)
            System.out.println("Maior: "+num1);
        else if(num1 == num2)
            System.out.println("Maior: "+num2 + " (Ambos são iguais!)");
        else
            System.out.println("Maior: "+num2);
    }
}
