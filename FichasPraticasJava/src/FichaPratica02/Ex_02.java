package FichaPratica02;
import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {

        // Import de Scanner.
        Scanner input = new Scanner(System.in);

        // Declarar varíaveis.
        double salarioAnual, taxa;

        // Ler o valor do salário anual introduzido pelo utilizador.
        System.out.print("Introduzir salário anual: ");
        salarioAnual = input.nextDouble();

        // Condição que determinará o valor da taxa que terá que pagar, base no valor do salário.
        if(salarioAnual <= 15000){
            taxa = salarioAnual * 0.2;
            System.out.print("Paga taxa de 20%: "+taxa+"€");
        }
        else{
            taxa = salarioAnual * 0.3;
            System.out.print("Paga taxa de 30%: "+taxa+"€");
        }
    }
}
