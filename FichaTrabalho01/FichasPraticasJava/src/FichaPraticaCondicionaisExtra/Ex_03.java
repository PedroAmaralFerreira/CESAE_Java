package FichaPraticaCondicionaisExtra;
import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double preco;

        // Ler preco
        System.out.print("Introduza o preço: ");
        preco = input.nextDouble();

        // Calcular preco e aplicar, se for o caso, 10% de desconto
        if(preco > 100){
            preco = preco * 0.9;
            System.out.println("Preço Final: "+preco+"€ (10% de desconto)");
        }
        else
            System.out.println("Preço Final: "+preco+"€ Sem desconto");
    }
}
