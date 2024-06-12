package FichaPratica02;
import java.util.Scanner;
public class Ex_15 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, num3;
        String ordem;

        // Ler 3 números
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();
        System.out.print("Introduza um número: ");
        num3 = input.nextInt();

        System.out.print("Introduza \'C\' para ordem crescente ou \'D\' para ordem descrecente: ");
        ordem = input.next();

        switch (ordem){
            case "C":
                if(num2 < num1) {
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                    num1 = num1 - num2;
                }

                if(num3 < num2)
                {
                    num3 = num3 + num2;
                    num2 = num3 - num2;
                    num3 = num3 - num2;
                }

                if(num2 < num1) {
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                    num1 = num1 - num2;
                }
                System.out.println(num1 + "" + num2 + "" + num3);
                break;
            case "D":
                if(num2 > num1) {
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                    num1 = num1 - num2;
                }

                if(num3 > num2)
                {
                    num3 = num3 + num2;
                    num2 = num3 - num2;
                    num3 = num3 - num2;
                }

                if(num2 > num1) {
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                    num1 = num1 - num2;
                }
                System.out.println(num1 + "" + num2 + "" + num3);
                break;
            default:
                System.out.println("INVÁLIDO!");
        }
    }
}
