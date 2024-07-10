package Consola;

import User.AdminMenu;
import Utilidades.criarMatrizes;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Utilidades.criarMatrizes.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        /*Scanner scanner = new Scanner(System.in);
        int opcao;
        String username, password;
        boolean confirmarLoginAdmin = false;

        do {
            System.out.println("LOGIN");
            System.out.println("1. ADMIN\n2. Cliente\n3. Sair");
            System.out.print("Iniciar sessão como:");
            opcao = scanner.nextInt();
        }while (opcao < 1 || opcao > 3);

        switch (opcao){
            case 1:
                do{
                    System.out.print("Username: ");
                    username = scanner.next();
                    System.out.print("Password: ");
                    password = scanner.next();
                    confirmarLoginAdmin = Admin.adminLogin("GameStart/GameStart_Admins.csv", username, password);
                    if (!confirmarLoginAdmin)
                        System.out.println("\nUsername ou password incorretos!\n");
                }while (!confirmarLoginAdmin);
                System.out.println("\nLogin com sucesso!");
                AdminMenu.adminMenu();
                break;
            case 2:
                System.out.println("\nLogin com Sucesso!");
                break;
            case 3:
                System.out.println("Até breve!");
                break;
            default:
                System.out.println("ERRO!");
                break;
        }*/


        System.out.println(criarMatriz("src/Consola/Cliente.java", true));
        //Venda.idVenda("GameStart/GameStart_Vendas.csv");
        //Comissao.comissaoCategoria("GameStart/GameStart_Categorias.csv");

    }
}