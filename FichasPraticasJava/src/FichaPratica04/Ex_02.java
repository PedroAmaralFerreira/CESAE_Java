package FichaPratica04;
import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        // Condicao que criará um loop enquanto o utilizar escolher a opcao 1, 2 ou 3
        // e que termina o programa caso escolha a opcap 4
        do {
            System.out.print("1. Criar\n2. Atualizar\n3. Eliminar\n4. Sair\nEscolha uma opção:");
            opcao = input.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Escolheu: " + opcao +". Criar\n");
                        break;
                    case 2:
                        System.out.println("Escolheu: " + opcao +". Atualizar\n");
                        break;
                    case 3:
                        System.out.println("Escolheu: " + opcao +". Eliminar\n");
                        break;
                    case 4:
                        System.out.println("Escolheu: " + opcao +". Sair\nA Sair...");
                        break;
                    default:
                        while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                            System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE!");
                            System.out.print("Escolha uma opção:\n1. Criar\n2. Atualizar\n3. Eliminar\n4. Sair");
                            opcao = input.nextInt();
                        }
                }
            } while(opcao == 1 || opcao == 2 ||opcao == 3);
        }
}
