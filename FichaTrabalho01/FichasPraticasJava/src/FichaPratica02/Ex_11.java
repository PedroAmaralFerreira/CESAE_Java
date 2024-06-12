package FichaPratica02;
import java.util.Scanner;
public class Ex_11 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int saldoMedio, valorMov, saldoAtual;

        // Ler saldo médio e valor a movimentar
        System.out.print("Introduza saldo médio: ");
        saldoMedio = input.nextInt();
        System.out.print("Introduza valor a movimentar: ");
        valorMov = input.nextInt();

        // Calcular o saldo atual
        if(valorMov >= 0)
            saldoAtual = saldoMedio + valorMov;
        else
            saldoAtual = saldoMedio + valorMov;

        if(saldoAtual >= 0)
            System.out.println("Saldo Atual: "+saldoAtual);
        else{
            saldoAtual = saldoMedio;
            System.out.println("Operação Inválida. Saldo Insuficiente.");
            System.out.println("Saldo Atual: "+saldoAtual);
        }
    }
}
