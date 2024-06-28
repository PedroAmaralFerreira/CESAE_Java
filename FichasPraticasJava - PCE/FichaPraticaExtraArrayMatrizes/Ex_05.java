package FichaPraticaExtraArrayMatrizes;
import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int[] num = new int[12];
        boolean[] duplicado = new boolean[12];
        boolean[] guardar = new boolean[12];

        // Introduzir numeros
        for (int i = 0; i < 12; i++) {
            System.out.println("Insira um número no Array["+(i)+"]: ");
            num[i] = scanner.nextInt();;
        }

        // Apresentar verificar numeros duplicados
        for (int i = 0; i < 12; i++) {
            for (int j = i + 1; j < 12; j++) {
                if(num[i] == num[j]){
                    duplicado[i] = true;
                    duplicado[j] = true;
                }
            }
        }

        // Apresentar numero(s) duplicado(s)
        for (int i = 0; i < 12; i++) {
            if (duplicado[i] && !guardar[i]) {
                System.out.println(num[i] + " está duplicado!");
                for (int j = 0; j < 12; j++) {
                    if (num[i] == num[j])
                        guardar[j] = true;
                }
            }
        }
    }
}