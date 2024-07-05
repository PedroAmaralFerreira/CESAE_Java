package FichaPratica03;
import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num=1, soma=0;

        // Condição que irá fazer print de 1 a 100
        // e somar todos os números
        while (num <= 100) {
            System.out.println(num);
            soma = soma + num;
            num++;
        }

        // Apresentar soma
        System.out.println("Somatório: "+soma);

    }
}
