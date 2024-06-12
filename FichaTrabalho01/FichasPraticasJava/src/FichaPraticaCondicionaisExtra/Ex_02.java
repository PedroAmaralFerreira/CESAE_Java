package FichaPraticaCondicionaisExtra;
import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double peso;

        // Ler peso
        System.out.print("Introduza o peso (em Kg.): ");
        peso = input.nextDouble();

        // Calcular peso na Lua
        if(peso > 0)
            peso = peso * 0.16;
        else
            System.out.println("PESO INVÁLIDO!");

        // Apresentar peso na Lua
        System.out.println("Peso na lua: "+peso);
    }
}
