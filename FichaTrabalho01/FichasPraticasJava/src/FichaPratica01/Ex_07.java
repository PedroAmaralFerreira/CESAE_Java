package FichaPratica01;
import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        // Ler valor de 3 produtos
        System.out.print("Preço do primeiro produto: ");
        double precoProduto1 = input.nextDouble();
        System.out.print("Preço do segundo produto: ");
        double precoProduto2 = input.nextDouble();
        System.out.print("Preço do terceiro produto: ");
        double precoProduto3 = input.nextDouble();

        // Valor a pagar com desconto aplicado
        double precoFinal = (precoProduto1 + precoProduto2 + precoProduto3) * 0.9;

        // Apresentação do valor a pagar final
        System.out.println("Valor a pagar: "+precoFinal);
    }
}
