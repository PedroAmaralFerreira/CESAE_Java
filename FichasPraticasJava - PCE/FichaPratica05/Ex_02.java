package FichaPratica05;
import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int[] comissao = new int[12];
        int comissaoTotal = 0;

        // Calcular as comissoes de cada mes
        for (int i = 0; i < 12; i++) {
            System.out.print("Insira a comissão do mês "+(i+1)+": ");
            comissao[i] = scanner.nextInt();
            comissaoTotal = comissaoTotal + comissao[i];
        }

        // Apresentar resultado
        System.out.println("Total anual: "+comissaoTotal);

    }
}
