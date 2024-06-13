package FichaPratica03;
import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, conta=0, soma=0, media;

        // Ler número
        System.out.println("Introduza um número: ");
        num = input.nextInt();

        // Condição que, enquanto o número não for "-1",
        // continuará a somar os números introduzidos
        while (num != -1) {
            soma = soma + num;
            conta++;
            System.out.println("Introduza um número: ");
            num = input.nextInt();
        }

        // Condição que dirá qual a média dos números
        if (conta==0)
            media = 0;
        else
            media = soma / conta;

        // Apresentar a média
        System.out.println("Média: "+media);
    }
}
