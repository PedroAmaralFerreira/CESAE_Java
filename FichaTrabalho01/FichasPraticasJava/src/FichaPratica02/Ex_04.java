package FichaPratica02;
import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int lugar;

        // Ler posição
        System.out.print("Introduza o seu lugar na corrida: ");
        lugar = input.nextInt();

        // Condição que dirá os pontos ganhos, base na posição
        switch (lugar){
            case 1: System.out.println("Ganhou 10 pontos");
                    break;
            case 2: System.out.println("Ganhou 8 pontos");
                    break;
            case 3: System.out.println("Ganhou 6 pontos");
                    break;
            case 4: System.out.println("Ganhou 5 pontos");
                    break;
            case 5: System.out.println("Ganhou 4 pontos");
                    break;
            case 6: System.out.println("Ganhou 3 pontos");
                    break;
            case 7: System.out.println("Ganhou 2 pontos");
                    break;
            case 8: System.out.println("Ganhou 1 pontos");
                    break;
            default: System.out.println("Não ganhou pontos");
        }
    }
}
