import java.util.Scanner;
public class Teste {

    /*public static double divisao(double n1, double n2){

        System.out.println(n1);
        System.out.println(n2);

    }*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Insira: ");
        num = input.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
