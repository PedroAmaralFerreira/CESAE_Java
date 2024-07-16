package User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import static Utilidades.EncontrarEstacionamento.encontrarEstacionamento;
import static Utilidades.ImprimirCatalogo.imprimirCatalogo;
import static Utilidades.ImprimirCatalogoCategoria.imprimirCatalogoCategoria;
import static Utilidades.ImprimirEditora.imprimirEditora;
import static Utilidades.ImprimirJogoMaisRecente.imprimirJogoMaisRecente;
import static Utilidades.ImprimirJogos.imprimirJogos;
import static Utilidades.PressEnterToContinue.pressEnterToContinue;

public class ClienteMenu {
    public static void clienteMenu() throws FileNotFoundException {

        // Introduzir scanner
        Scanner scanner = new Scanner(System.in);
        
        // Declarar variaveis
        int opcao;
        String editoraNome, categoriaNome;

        // Login
        System.out.print("Insira Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Insira Contacto: ");
        int contacto = scanner.nextInt();
        System.out.print("Insira Email: ");
        String email = scanner.next();

        System.out.println("Cliente Inserido com Sucesso: "+nome+" | "+contacto+" | "+email+"\n");

        System.out.println("Olá, "+nome+"\n");
        do {
            System.out.println("Que pretende fazer?\n1. Procura Estacionamento\n2. Imprimir Catálogo\n3. Imprimir Catálogos Gráficos\n4. Imprimir Catálogo Editora\n5. Imprimir Catálogo Categoria\n6. Imprimir Jogo Mais Recente\n7. Log Out:");
            opcao = scanner.nextInt();
            System.out.println();
            switch (opcao) {
                case 1:
                    encontrarEstacionamento(); // Encontrar estacionamento no parque
                    pressEnterToContinue();
                    break;
                case 2:
                    imprimirJogos("GameStart/GameStart_Vendas.csv"); // Apresentar catalogo de jogos
                    pressEnterToContinue();
                    break;
                case 3:
                    imprimirCatalogo(); // Apresentar catalogo grafico
                    pressEnterToContinue();
                    break;
                case 4:
                    System.out.print("Editora a Pesquisar: ");
                    editoraNome = scanner.next();
                    imprimirEditora("GameStart/GameStart_Vendas.csv", editoraNome); // Apresentar jogos da editora
                    pressEnterToContinue();
                    break;
                case 5:
                    System.out.print("Categoria a Pesquisar: ");
                    categoriaNome = scanner.next();
                    imprimirCatalogoCategoria("GameStart/GameStart_Vendas.csv", categoriaNome); // Apresentar jogos e as suas categorias da editora
                    pressEnterToContinue();
                    break;
                case 6:
                    imprimirJogoMaisRecente("GameStart/GameStart_Vendas.csv"); // Apresentar jogo mais recente com uma venda
                    pressEnterToContinue();
                    break;
                case 7:
                    System.out.println("A sair da conta...\n"); // Log out
                    return;
                default:
                    System.out.println("ERRO!");
                    break;
            }
        } while (true); // Apresentar o menu ate fazer log out
    }
}
