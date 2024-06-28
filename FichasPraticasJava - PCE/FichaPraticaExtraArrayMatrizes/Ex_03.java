package FichaPraticaExtraArrayMatrizes;
import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int[] num = new int[10];
        int pesquisa, contar = 0;

        // Introduzir numeros
        for (int i = 1; i < 10; i++) {
            System.out.println("Insira um número no Array["+(i)+"]: ");
            num[i] = scanner.nextInt();;
        }

        System.out.println("Número a pesquisar: ");
        pesquisa = scanner.nextInt();

        // Apresentar numero por ordem de insercao
        for (int i = 1; i < 10; i++) {
            if(pesquisa == num[i]){
                contar++;
            }
        }

        if(contar > 0)
            System.out.println("Existe "+pesquisa+" no array.");
        else
            System.out.println("Não existe "+pesquisa+" no array.");

    }
}
