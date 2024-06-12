package FichaPratica02;
import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, media;

        // Ler as notas introduzidas pelo utilizador
        System.out.println("Introduzar a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("Introduzar a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.println("Introduzar a terceira nota: ");
        nota3 = input.nextDouble();

        // Calcular a média
        nota1 = nota1 * 0.25;
        nota2 = nota2 * 0.35;
        nota3 = nota3 * 0.4;
        media = (nota1 + nota2 + nota3);

        if (media >= 9.5)
            System.out.println("Aluno está aprovado!");
        else
            System.out.println("Aluno não está aprovado.");
    }
}
