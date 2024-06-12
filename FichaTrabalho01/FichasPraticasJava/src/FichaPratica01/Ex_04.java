package FichaPratica01;
import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        double pi = 3.14;

        // Importar dados
        Scanner input = new Scanner(System.in);

        // Raio da circunferência
        System.out.print("Introduz o raio da circunferência: ");
        double raio = input.nextDouble();

        // Área da circunferência
        double area = pi * raio * raio;

        // Apresentar a área da circunferência
        System.out.println("Área: "+area);
    }
}
