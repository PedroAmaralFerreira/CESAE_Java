package FichaPratica02;
import java.util.Scanner;
public class Ex_16 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor, div;

        // Ler
        System.out.print("Introduza o valor: ");
        valor = input.nextInt();

        System.out.println("O valor é de "+valor+"€.");

        if (valor >= 200){
            div = valor / 200;
            valor = valor - 200 * div;
            System.out.println(div+" notas de 200€");
        }
        if (valor >= 100){
            div = valor / 100;
            valor = valor - 100 * div;
            System.out.println(div+" notas de 100€");
        }
        if (valor >= 50){
            div = valor / 50;
            valor = valor - 50 * div;
            System.out.println(div+" notas de 50€");
        }
        if (valor >= 20){
            div = valor / 20;
            valor = valor - 20 * div;
            System.out.println(div+" notas de 20€");
        }
        if (valor >= 10){
            div = valor / 10;
            valor = valor - 10 * div;
            System.out.println(div+" notas de 10€");
        }
        if (valor >= 5){
            div = valor / 5;
            valor = valor - 5 * div;
            System.out.println(div+" notas de 5€");
        }
        if (valor % 5 != 0)
            System.out.println("Ainda faltam "+ valor + "€.");
    }
}
