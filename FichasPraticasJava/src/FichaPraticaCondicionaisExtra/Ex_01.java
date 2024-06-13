package FichaPraticaCondicionaisExtra;
import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int idade;

        // Ler idade
        System.out.print("Introduza a idade: ");
        idade = input.nextInt();

        // Condição que verifica se é maior ou menor de idade
        if(idade >= 18)
            System.out.println("Maior de idade.");
        else
            System.out.println("Menor de idade.");
    }
}
