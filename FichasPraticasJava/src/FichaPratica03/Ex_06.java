package FichaPratica03;
import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, num2, count=0;

        // Ler os 2 números
        System.out.print("Introduza um número de início: ");
        num = input.nextInt();
        System.out.print("Introduza um número final: ");
        num2 = input.nextInt();

        if(num < num2){
            count = num;
            while (count <= num2){
                System.out.println(count);
                count++;
            }
        }
        else{
            count = num2;
            num2 = num;
            num = count;
            while (count <= num2){
                System.out.println(count);
                count++;
            }
        }
    }
}
