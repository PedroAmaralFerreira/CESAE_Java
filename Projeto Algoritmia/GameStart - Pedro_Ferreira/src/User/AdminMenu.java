package User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static User.Categoria.categoriaProdutos;
import static User.Cliente.consultaDeFicheiros;
import static User.Venda.vendaProdutos;
import static Utilidades.Bottom5Jogos.bottom5Jogos;
import static Utilidades.JogoMaisCaro.jogoMaisCaro;
import static Utilidades.MargemCategoria.margemCategoria;
import static Utilidades.MelhorCategoria.melhorCategoria;
import static Utilidades.MelhorCliente.melhorCliente;
import static Utilidades.PesquisarCliente.pesquisarCliente;
import static Utilidades.PesquisarVenda.pesquisarVenda;
import static Utilidades.PressEnterToContinue.pressEnterToContinue;
import static Utilidades.Top5Jogos.top5Jogos;
import static Utilidades.criarMatrizes.criarMatriz;
import static User.Cliente.*;

public class AdminMenu {
    public static void adminMenu() throws FileNotFoundException{

        // Importar scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int opcao, opcaoFicheiro=0, numeroDeVendas=0, idCliente;
        double soma=0;
        String[][] matrizVendas = criarMatriz("GameStart/GameStart_Vendas.csv", true);
        String nomeJogo;

        System.out.println("BEM-VINDO À GAMESTART\n");

        // Mostrar menu do admin
        // Condicao while criara um loop infinito para escolher opcoes ate fazer log out
        while (true) {
            System.out.println("ADMIN MENU");
            System.out.println("1. Consulta de Ficheiros\n2. Total de Vendas\n3. Total de lucro\n4. Pesquisa de Cliente\n5. Jogo mais caro\n6. Melhor(es) Cliente(s)\n7. Melhor Categoria\n8. Pesquisa Vendas\n9. TOP 5 Jogos\n10. BOTTOM 5 Jogos\n11. Log Out ");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    do {
                        System.out.println("CONSULTA DE FICHEIROS\n");
                        System.out.print("1. Vendas\n2. Clientes\n3. Categorias\n4. Sair\nEscolha o ficheiro que pretende consultar: ");
                        opcaoFicheiro = scanner.nextInt();
                        switch (opcaoFicheiro) {
                            case 1:
                                vendaProdutos(); // Apresentar informacao do jogo vendido e que cliente comprou
                                pressEnterToContinue(); // funcao que fara avancar o programa se o usuario clicar no Enter ou introduzir algo
                                break;
                            case 2:
                                consultaDeFicheiros(); // Apresenta todos os clientes
                                pressEnterToContinue();
                                System.out.println();
                                break;
                            case 3:
                                categoriaProdutos(); // Apresentar margem de lucro de cada categoria de jogo
                                pressEnterToContinue();
                                break;
                            case 4:
                                System.out.println("\n*A voltar para menu anterior*\n");
                                break;
                            default:
                                System.out.println("OPÇÃO INVÁLIDA!");
                                break;
                        }
                    } while (opcaoFicheiro != 4);
                    break;
                case 2:
                    // Somar todos os jogos vendidos
                    for (int i = 0; i < matrizVendas.length; i++) {
                        numeroDeVendas++;
                        soma += Double.parseDouble(matrizVendas[i][5]);
                    }

                    System.out.println("Número de Vendas: " + numeroDeVendas); // Apresentar o numero de vendas e o total delas
                    System.out.print("Total de Vendas: ");
                    System.out.printf("%.2f", soma);
                    System.out.print("€\n");
                    pressEnterToContinue(); // Pressionar Enter ou introduzir algo para continuar
                    break;
                case 3:
                    System.out.print("Total de Lucro: "); // Apresentar o total de lucro, base nas margems de cada categoria
                    System.out.printf("%.2f", margemCategoria(matrizVendas));
                    System.out.print("€\n");
                    pressEnterToContinue(); // Pressionar Enter ou introduzir algo para continuar
                    break;
                case 4:
                    System.out.print("\nInsira IdCliente: "); // Pesquisar informacao sobre o id cliente inserido
                    idCliente = scanner.nextInt();
                    System.out.println();
                    pesquisarCliente("GameStart/GameStart_Clientes.csv", idCliente);
                    pressEnterToContinue(); // Pressionar Enter ou introduzir algo para continuar
                    break;
                case 5:
                    jogoMaisCaro(); // Apresentar jogo mais caro e os clientes que o compraram
                    pressEnterToContinue(); // Pressionar Enter ou introduzir algo para continuar
                    break;
                case 6:
                    melhorCliente("GameStart/GameStart_Vendas.csv", "GameStart/GameStart_Clientes.csv"); // Apresentar o(s) melhor(es) cliente(s) base no valor total gasto
                    pressEnterToContinue(); // Pressionar Enter ou introduzir algo para continuar
                    break;
                case 7:
                    melhorCategoria("GameStart/GameStart_Vendas.csv"); // Apresentar categoria mais vendida
                    pressEnterToContinue(); // Pressionar Enter ou introduzir algo para continuar
                    break;
                case 8:
                    System.out.print("Pesquisar jogo: ");
                    nomeJogo = scanner.next();
                    System.out.println();
                    pesquisarVenda("GameStart/GameStart_Vendas.csv", nomeJogo); // Apresentar jogo(s) pesquisado(s)
                    pressEnterToContinue(); // Pressionar Enter ou introduzir algo para continuar
                    break;
                case 9:
                    top5Jogos("GameStart/GameStart_Vendas.csv"); // Apresentar os TOP 5 jogos com mais lucro
                    pressEnterToContinue(); // Pressionar Enter ou introduzir algo para continuar
                    break;
                case 10:
                    bottom5Jogos("GameStart/GameStart_Vendas.csv"); // Apresentar os TOP 5 jogos com menos lucro
                    pressEnterToContinue(); // Pressionar Enter ou introduzir algo para continuar
                    break;
                case 11:
                    System.out.println("\nA sair da conta...\n"); // Log out
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
