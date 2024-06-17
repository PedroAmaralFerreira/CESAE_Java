package FichaPratica03;
import java.util.Scanner;
public class Ex_11 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num=0, lim, salto;

        // Ler numeros
        System.out.print("Introduza um limite: ");
        lim = input.nextInt();
        System.out.print("Introduza um salto: ");
        salto = input.nextInt();

        // Condicao somara os numeros ate ao numero limite,
        // saltando de numero em numero dependendo o numero introduzido
        while(num <= lim){
            System.out.println(num);
            num = num + salto;
        }
    }
}
