package FichaPratica02;
import java.util.Scanner;
public class Ex_17 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variável
        double saldoMedio;

        // Ler saldo medio
        System.out.print("Introduza o saldo médio: ");
        saldoMedio = input.nextDouble();

        System.out.println("Saldo médio: " + saldoMedio + "€");

        if (saldoMedio <= 2000)
            System.out.println("Não tem valor de crédito");
        if (saldoMedio > 2000 && saldoMedio <= 4000) {
            saldoMedio = saldoMedio * 0.2;
            System.out.println("Valor de crédito: " + saldoMedio + "€");
        }
        if (saldoMedio > 4000 && saldoMedio <= 6000) {
            saldoMedio = saldoMedio * 0.3;
            System.out.println("Valor de crédito: " + saldoMedio + "€");
        }
        if (saldoMedio > 6000) {
            saldoMedio = saldoMedio * 0.4;
            System.out.println("Valor de crédito: " + saldoMedio + "€");
        }
    }
}