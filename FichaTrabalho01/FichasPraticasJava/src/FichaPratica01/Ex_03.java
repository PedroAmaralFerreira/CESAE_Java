package FichaPratica01;
import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        // Ler comprimento
        System.out.print("Insira o comprimento: ");
        double comp = input.nextDouble();

        // Ler largura
        System.out.print("Insira a largura: ");
        double larg = input.nextDouble();

        // Calcular a área e o comprimento
        double area = comp * larg;
        double perimetro = comp * 2 + larg * 2;

        // Apresentar a área e o comprimento
        System.out.println("Area: "+area);
        System.out.println("Perímetro: "+perimetro);
    }
}
