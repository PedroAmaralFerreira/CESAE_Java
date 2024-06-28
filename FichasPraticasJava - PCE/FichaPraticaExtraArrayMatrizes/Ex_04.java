package FichaPraticaExtraArrayMatrizes;
import java.util.Scanner;
public class Ex_04 {
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

        // Ler numero a pesquisar
        System.out.println("Número a pesquisar: ");
        pesquisa = scanner.nextInt();

        // Verificar se existe o numero pesquisado
        for (int i = 1; i < 10; i++) {
            if(pesquisa == num[i]){
                contar++;
            }
        }

        // Apresentar se existe ou nao o numero verificado
        if(contar > 0)
            System.out.println("Existe "+pesquisa+" no array.");
        else
            System.out.println("Não existe "+pesquisa+" no array.");

        // Apresentar onde esta no array
        for (int i = 1; i < 10; i++) {
            if(pesquisa == num[i]){
                System.out.println("Array["+i+"]");
            }
        }
    }
}