package FichaPratica01;
import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        // Ler código do funcionário e dias de trabalho durante o mês
        System.out.print("Introduzir código de funcionário: ");
        int codigo = input.nextInt();
        System.out.print("Introduzir dias de trabalho durante o mês: ");
        double dias = input.nextInt();

        // Calcular valores para apresentar no recibo
        double vencimento = 40 * dias;
        double alimentacao = 5 * dias;
        double irs = vencimento * 0.1;
        double social = vencimento * 0.3475;
        double liquido = vencimento - irs - social;

        // Apresentar valores pedidos
        System.out.println("Valor ilíquido: "+ vencimento + "€");
        System.out.println("Valor do subsídio de alimentação: "+ alimentacao + "€");
        System.out.println("Valor da retenção do IRS: " + irs + "€");
        System.out.println("Valor para a Segurança Social: " + social + "€");
        System.out.println("Valor líquido: " + liquido + "€");
    }
}
