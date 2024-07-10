package User;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminMenu {
    public static void adminMenu() throws FileNotFoundException{

        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("BEM-VINDO À GAMESTART");

        do {
            System.out.println("ADMIN MENU");
            System.out.println("1. Consulta de Ficheiros\n2. Total de Vendas 2\n3. Total de lucro\n4. Pesquisa de Cliente\n5. Jogo mais caro\n6. Melhor(es) Cliente(s)\n\7. ");
            System.out.print("Choose an option: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Call method for Option 1
                    System.out.println("Option 1 selected");
                    break;
                case 2:
                    // Call method for Option 2
                    System.out.println("Option 2 selected");
                    break;
                case 3:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (opcao != 3);
    }
}
