package FichaPratica04;
import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int escolherNumero, adivinharNumero, contar=0;

        // Condicao que obrigue o utilizador a introduzir um numero entre 0 e 100
        do {
            System.out.print("Jogador 1, selecione um número entre 0 e 100.\nInsira: ");
            escolherNumero = input.nextInt();
            if (escolherNumero < 0 || escolherNumero > 10)
                System.out.println("Jogador 1, o número tem que ser ENTRE 0 E 100!");
        }while (escolherNumero < 0 || escolherNumero > 100);

        // Condicao que, enquanto o jogador 2 nao acertar no numero, ira informar se o numero introduzido
        // pelo jogador 1 e maior ou menor que o valor introduzido pelo jogador 2.
        // Tambem ira obrigar o jogador 2 a introduzir um numero entre 0 e 100.
        System.out.println("Jogador 2, tente adivinhar!");
        do {
            System.out.print("Insira: ");
            adivinharNumero = input.nextInt();
            if (adivinharNumero > escolherNumero && adivinharNumero <= 100){
                System.out.println("O número é inferior!");
                contar++;
            }
            if (adivinharNumero < escolherNumero && adivinharNumero >= 0){
                System.out.println("O número é superior!");
                contar++;
            }
            if (adivinharNumero > 100 || adivinharNumero < 0)
                System.out.println("Tem que ser entre 0 e 100!");
        }while (adivinharNumero != escolherNumero);

        System.out.println("Acertaste o número em "+contar+" tentativas!");
    }
}
