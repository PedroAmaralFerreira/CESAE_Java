package FichaPratica01;
import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        // Importar dados
        Scanner input = new Scanner(System.in);

        // Declarar Varíaveis
        double raio, area;

        // Raio da circunferência
        System.out.print("Introduz o raio da circunferência: ");
        raio = input.nextDouble();

        // Área da circunferência
        area = 3.14 * raio * raio;

        // Apresentar a área da circunferência
        System.out.println("Área: "+area);
    }
}
