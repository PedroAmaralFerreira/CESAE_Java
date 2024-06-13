package FichaPratica02;
import java.util.Scanner;
public class Ex_12 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        // Opções do menu
        System.out.print("Opções do menu:\n1. Criar\n2. Atualizar\n3. Eliminar\n4. Sair\nIntroduza a opção: ");
        opcao = input.nextInt();

        // Condição para escolher a opção
        switch (opcao){
            case 1:
                System.out.println("1. Criar");
                break;
            case 2:
                System.out.println("2. Atualizar");
                break;
            case 3:
                System.out.println("3. Eliminar");
                break;
            case 4:
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
        }
    }
}
