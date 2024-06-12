package FichaPraticaCondicionaisExtra;
import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int ano;

        // Ler ano
        System.out.println("Insira o ano: ");
        ano = input.nextInt();

        // Condição que dita se o ano é ou não bissexto
        if(ano % 4 == 0)
            System.out.println(ano + "-> É bissexto");
        else
            System.out.println(ano + "-> Não é bissexto");
    }
}
