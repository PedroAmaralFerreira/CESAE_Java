package Consola;

import User.AdminMenu;
import Utilidades.Top5Jogos;
import Utilidades.criarMatrizes;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static User.ClienteMenu.clienteMenu;
import static Utilidades.criarMatrizes.*;
import static User.AdminMenu.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Introduzir scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variáveis
        int opcao;
        String username, password;
        boolean confirmarLoginAdmin = false;
        boolean paginaLogin = true;

        // Logotipo da GameStarter
        String[][] logotipo = criarMatriz("GameStart/CatalogoGrafico/gameStarter.txt", false);

        for (int i = 0; i < logotipo.length; i++) {
            for (int j = 0; j < logotipo[i].length; j++) {
                System.out.println(logotipo[i][j]);
            }
        }

        System.out.println();

        // Loop para forcar escolher uma opcao
        while (paginaLogin) {
            do {
                System.out.println("TIPO DE UTILIZADOR");
                System.out.println("1. ADMIN\n2. Cliente\n3. Sair");
                System.out.print("Iniciar sessão como:");
                opcao = scanner.nextInt();
                System.out.println();
            } while (opcao < 1 || opcao > 3);

            // Base na escolha anterior, ira fazer login como Admin ou entrar como cliente
            switch (opcao) {
                case 1:
                    do {
                        System.out.println("LOGIN");
                        System.out.print("USERNAME: ");
                        username = scanner.next();
                        System.out.print("PASSWORD: ");
                        password = scanner.next();
                        confirmarLoginAdmin = Admin.adminLogin("GameStart/GameStart_Admins.csv", username, password);
                        if (!confirmarLoginAdmin)
                            System.out.println("\nUsername ou password incorretos!\n");
                    } while (!confirmarLoginAdmin);
                    System.out.println("\nLogin com sucesso!\n");
                    adminMenu();
                    break;
                case 2:
                    clienteMenu();
                    break;
                case 3:
                    String[][] copyRight = criarMatriz("GameStart/GameStart_Copyright.txt", false);
                    for (int i = 0; i < copyRight.length; i++) {
                        for (int j = 0; j < copyRight[i].length; j++) {
                            System.out.println(copyRight[i][j]);
                        }
                    }
                    paginaLogin = false;
                    break;
                default:
                    System.out.println("ERRO!");
                    break;
            }
        }
    }
}