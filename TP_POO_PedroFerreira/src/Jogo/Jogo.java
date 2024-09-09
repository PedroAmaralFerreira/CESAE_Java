package Jogo;

import Entidades.*;
import Itens.ArmaPrincipal;
import Itens.Consumivel;
import Itens.ConsumivelCombate;
import Itens.Pocao;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Utilidades.MultiploQuebraLinha.multiploQuebraLinha;
import static Utilidades.PressionaEnter.pressionaEnter;



public class Jogo {

    // Funcao que ira devolver um numero entre 0.0 e 1.0
    public double chance() {
        double chance = Math.random();

        return chance;
    }

    private Heroi criarPersonagem() {
        // Chamar Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar Variaveis
        int confirmarPersonagem = 0;
        int pontosCriacao = 0;
        int ouro = 0;
        int forca = 0;
        int vida = 0;
        int tipoHeroi = 0;
        int jogoDificuldade = 0;
        Heroi heroi = null;
        String nome;

        // Criacao da personagem
        System.out.print("Introduza o nome do Herói: ");
        nome = scanner.nextLine();
        multiploQuebraLinha();

        do {
            System.out.println("Escolha a personagem");
            System.out.println("1. Cavaleiro");
            System.out.println("2. Feiticeiro");
            System.out.println("3. Arqueiro");
            System.out.print("Introduza: ");
            try {
                tipoHeroi = scanner.nextInt();
                if (tipoHeroi < 1 || tipoHeroi > 3) {
                    System.out.println("\nIntroduza um número entre 1 a 3!");
                    pressionaEnter();
                }
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor, introduza um número válido!");
                pressionaEnter();
                scanner.next();
            }
        } while (tipoHeroi < 1 || tipoHeroi > 3);

        multiploQuebraLinha();

        switch (tipoHeroi) {
            case 1:
                System.out.println("Selecionaste: Cavaleiro");
                break;
            case 2:
                System.out.println("Selecionaste: Feiticeiro");
                break;
            case 3:
                System.out.println("Selecionaste: Arqueiro");
                break;
            default:
                System.out.println("Erro!");
                break;
        }

        do {
            System.out.println("\nEscolha a dificuldade do jogo");
            System.out.println("1. Fácil");
            System.out.println("2. Difícil");
            System.out.print("Introduza: ");
            try {
                jogoDificuldade = scanner.nextInt();
                if (jogoDificuldade < 1 || jogoDificuldade > 2) {
                    System.out.println("\nIntroduza um número entre 1 a 2!");
                    pressionaEnter();
                }
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor, introduza um número válido!");
                pressionaEnter();
                scanner.next();
            }
        } while (jogoDificuldade < 1 || jogoDificuldade > 2);

        if (jogoDificuldade == 1) {
            pontosCriacao = 300;
            ouro = 20;
        }
        if (jogoDificuldade == 2) {
            pontosCriacao = 220;
            ouro = 15;
        }

        switch (tipoHeroi) {
            case 1:
                do {
                    do {
                        if (confirmarPersonagem == 2) {
                            System.out.println("Voltar à criação da personagem...");
                        }
                        vida = 0;
                        forca = 0;
                        while (vida < 1 || vida > pontosCriacao) {
                            System.out.println("\nPontos de criação: " + pontosCriacao);
                            System.out.println("Força: " + forca);
                            System.out.println("Vida: " + vida + "\n");
                            System.out.println("1 ponto de vida = 1 ponto de criação");
                            System.out.println("1 ponto de força = 5 pontos de criação\n");
                            System.out.println("Mínimo Vida: 180HP");
                            System.out.println("Quantos pontos de vida quer adicionar?");
                            System.out.print("Introduza: ");
                            try {
                                vida = scanner.nextInt();
                                if (vida < 1 || vida > pontosCriacao) {
                                    System.out.println("\nIntroduza um número entre 1 a " + pontosCriacao);
                                    pressionaEnter();
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("\nPor favor, introduza um número válido!");
                                pressionaEnter();
                                scanner.next();
                            }
                        }
                        while (vida < 180) {
                            System.out.println("\nMínimo de vida é 180HP!");
                            pressionaEnter();
                            System.out.print("Introduza: ");
                            vida = scanner.nextInt();
                        }
                        multiploQuebraLinha();
                    } while (vida < 1 || vida > pontosCriacao);


                    do {
                        System.out.println(nome + " terá:");
                        forca = (pontosCriacao - vida) / 5;
                        System.out.println("Força: " + forca);
                        System.out.println("Vida: " + vida + "\n");
                        System.out.println("1. Confirmar\n2. Voltar");
                        System.out.print("Introduzir: ");
                        try {
                            confirmarPersonagem = scanner.nextInt();
                            if (confirmarPersonagem < 1 || confirmarPersonagem > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (confirmarPersonagem < 1 || confirmarPersonagem > 2);
                } while (confirmarPersonagem != 1);
                break;
            case 2:
                do {
                    do {
                        if (confirmarPersonagem == 2) {
                            System.out.println("Voltar à criação da personagem...");
                        }
                        vida = 0;
                        forca = 0;
                        while (vida < 1 || vida > pontosCriacao) {
                            System.out.println("\nPontos de criação: " + pontosCriacao);
                            System.out.println("Força: " + forca);
                            System.out.println("Vida: " + vida + "\n");
                            System.out.println("1 ponto de vida = 1 ponto de criação");
                            System.out.println("1 ponto de força = 5 pontos de criação\n");
                            System.out.println("Mínimo Vida: 140HP");
                            System.out.println("Quantos pontos de vida quer adicionar?");
                            System.out.print("Introduza: ");
                            try {
                                vida = scanner.nextInt();
                                if (vida < 1 || vida > pontosCriacao) {
                                    System.out.println("\nIntroduza um número entre 1 a " + pontosCriacao);
                                    pressionaEnter();
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("\nPor favor, introduza um número válido!");
                                pressionaEnter();
                                scanner.next();
                            }
                        }
                        while (vida < 140) {
                            System.out.println("\nMínimo de vida é 140HP!");
                            pressionaEnter();
                            System.out.print("Introduza: ");
                            vida = scanner.nextInt();
                        }
                        multiploQuebraLinha();
                    } while (vida < 1 || vida > pontosCriacao);


                    do {
                        System.out.println(nome + " terá:");
                        forca = (pontosCriacao - vida) / 5;
                        System.out.println("Força: " + forca);
                        System.out.println("Vida: " + vida + "\n");
                        System.out.println("1. Confirmar\n2. Voltar");
                        System.out.print("Introduzir: ");
                        try {
                            confirmarPersonagem = scanner.nextInt();
                            if (confirmarPersonagem < 1 || confirmarPersonagem > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (confirmarPersonagem < 1 || confirmarPersonagem > 2);
                } while (confirmarPersonagem != 1);
                break;
            case 3:
                do {
                    do {
                        if (confirmarPersonagem == 2) {
                            System.out.println("Voltar à criação da personagem...");
                        }
                        vida = 0;
                        forca = 0;
                        while (vida < 1 || vida > pontosCriacao) {
                            System.out.println("\nPontos de criação: " + pontosCriacao);
                            System.out.println("Força: " + forca);
                            System.out.println("Vida: " + vida + "\n");
                            System.out.println("1 ponto de vida = 1 ponto de criação");
                            System.out.println("1 ponto de força = 5 pontos de criação\n");
                            System.out.println("Mínimo Vida: 120HP");
                            System.out.println("Quantos pontos de vida quer adicionar?");
                            System.out.print("Introduza: ");
                            try {
                                vida = scanner.nextInt();
                                if (vida < 1 || vida > pontosCriacao) {
                                    System.out.println("\nIntroduza um número entre 1 a " + pontosCriacao);
                                    pressionaEnter();
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("\nPor favor, introduza um número válido!");
                                pressionaEnter();
                                scanner.next();
                            }
                        }
                        while (vida < 120) {
                            System.out.println("\nMínimo de vida é 120HP!");
                            pressionaEnter();
                            System.out.print("Introduza: ");
                            vida = scanner.nextInt();
                        }
                        multiploQuebraLinha();
                    } while (vida < 1 || vida > pontosCriacao);


                    do {
                        System.out.println(nome + " terá:");
                        forca = (pontosCriacao - vida) / 5;
                        System.out.println("Força: " + forca);
                        System.out.println("Vida: " + vida + "\n");
                        System.out.println("1. Confirmar\n2. Voltar");
                        System.out.print("Introduzir: ");
                        try {
                            confirmarPersonagem = scanner.nextInt();
                            if (confirmarPersonagem < 1 || confirmarPersonagem > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (confirmarPersonagem < 1 || confirmarPersonagem > 2);
                } while (confirmarPersonagem != 1);
                break;
            default:
                System.out.println("Erro!");
        }


        scanner.nextLine();
        multiploQuebraLinha();

        switch (tipoHeroi) {
            case 1:
                ArmaPrincipal espada = new ArmaPrincipal(0, "Espada", 10, 20);
                heroi = new Cavaleiro(nome, vida, vida, forca, espada, ouro, 1);
                break;
            case 2:
                ArmaPrincipal cajadoMagico = new ArmaPrincipal(0, "Cajado Mágico", 10, 20);
                heroi = new Feiticeiro(nome, vida, vida, forca, cajadoMagico, ouro, 1);
                break;
            case 3:
                ArmaPrincipal arco = new ArmaPrincipal(0, "Arco", 10, 20);
                heroi = new Arqueiro(nome, vida, vida, forca, arco, ouro, 1);
                break;
            default:
                System.out.println("Erro!");
        }
        return heroi;
    }

    public void aventuraJogo(Heroi heroi) {

        Scanner scanner = new Scanner(System.in);
        boolean menuComprar = true;
        int comprarItens = 0;
        int continuarComprar = 0;
        int escolhaCaminho = 0;
        int escolhaPocao = 0;
        int escolhaConsumivel = 0;
        double chance;


        Vendedor vendedor = new Vendedor();
        Pocao pocaoVida = new Pocao(10, "Poção de Vida", 25, 0);
        Pocao superPocaoVida = new Pocao(20, "Super Poção de Vida", 75, 0);
        Pocao pocaoVidaTotal = new Pocao(50, "Poção de Cura Total", heroi.vidaMax, 0);
        Pocao pocaoForca = new Pocao(20, "Poção de Força", 0, 10);
        Pocao superPocaoForca = new Pocao(50, "Super Poção de Força", 0, 25);
        Pocao megaPocaoForca = new Pocao(100, "Mega Poção de Força", 0, 40);
        ArmaPrincipal espadaLonga = new ArmaPrincipal(20, "Espada Longa", 20, 30);
        ArmaPrincipal espadaDiamante = new ArmaPrincipal(20, "Espada de Diamante", 50, 75);
        ArmaPrincipal cajadoCristal = new ArmaPrincipal(20, "Cajado Cristal", 20, 30);
        ArmaPrincipal cajadoNegro = new ArmaPrincipal(20, "Cajado Negro", 70, 90);
        ArmaPrincipal arcoLongo = new ArmaPrincipal(20, "Arco Longo", 20, 30);
        ArmaPrincipal arcoFlamejante = new ArmaPrincipal(20, "Arco Flamejante", 80, 120);

        ConsumivelCombate lancaMadeira = new ConsumivelCombate(15, "Lança de Madeira", 20);
        ConsumivelCombate lancaFerro = new ConsumivelCombate(25, "Lança de Ferro", 40);
        ConsumivelCombate esferaNegra = new ConsumivelCombate(25, "Esfera Negra", 30);
        ConsumivelCombate esferaExplosiva = new ConsumivelCombate(45, "Esfera Explosiva", 60);
        ConsumivelCombate dardos = new ConsumivelCombate(20, "Dardos", 25);
        ConsumivelCombate facas = new ConsumivelCombate(30, "Mini-Facas", 40);

        espadaLonga.armaPrincipalPermitida("Cavaleiro");
        espadaDiamante.armaPrincipalPermitida("Cavaleiro");
        cajadoCristal.armaPrincipalPermitida("Feiticeiro");
        cajadoNegro.armaPrincipalPermitida("Feiticeiro");
        arcoLongo.armaPrincipalPermitida("Arqueiro");
        arcoFlamejante.armaPrincipalPermitida("Arqueiro");

        lancaMadeira.heroisPermitidos.add("Cavaleiro");
        lancaFerro.heroisPermitidos.add("Cavaleiro");
        esferaNegra.heroisPermitidos.add("Feiticeiro");
        esferaExplosiva.heroisPermitidos.add("Feiticeiro");
        dardos.heroisPermitidos.add("Arqueiro");
        facas.heroisPermitidos.add("Arqueiro");
        vendedor.adicionarItem(pocaoVida);
        vendedor.adicionarItem(superPocaoVida);
        vendedor.adicionarItem(pocaoVidaTotal);
        vendedor.adicionarItem(pocaoForca);
        vendedor.adicionarItem(superPocaoForca);
        vendedor.adicionarItem(megaPocaoForca);
        vendedor.adicionarItem(espadaLonga);
        vendedor.adicionarItem(cajadoCristal);
        vendedor.adicionarItem(arcoLongo);
        vendedor.adicionarItem(lancaMadeira);
        vendedor.adicionarItem(lancaFerro);
        vendedor.adicionarItem(esferaNegra);
        vendedor.adicionarItem(esferaExplosiva);
        vendedor.adicionarItem(dardos);
        vendedor.adicionarItem(facas);


        System.out.println("Personagem:");
        heroi.mostrarDetalhes();
        pressionaEnter();
        multiploQuebraLinha();
        System.out.println(heroi.nome + " cresceu na aldeia Cesaegard onde reinava paz, amor e família.\nUm certo dia, homem chamado Vítor, que era um respeitado líder, enlouqueceu e transformou-se em um maluco.\nEle matou o líder da aldeia e agora reina no castelo House Cesaegard.\n" + heroi.nome + " conseguiu escapar a tempo, saltando para um rio que lhe levou longe!\nA missão é derrotar Vítor e libertar a vila.\n");
        pressionaEnter();

        while (heroi.vidaAtual > 0) {
            // Entidades.Vendedor
            System.out.println("\nBem-vindo, Desconhecido!");
            System.out.println("Tenho aqui produtos que te possam interessar...\n");
            while (comprarItens < 1 || comprarItens > 2) {
                try {
                    System.out.println("Deseja comprar algo?");
                    System.out.println("1. Sim\n2. Não");
                    System.out.print("Introduzir: ");
                    comprarItens = scanner.nextInt();
                    if (comprarItens < 1 || comprarItens > 2) {
                        System.out.println("\nIntroduza um número entre 1 a 2!");
                        pressionaEnter();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nPor favor, introduza um número válido!");
                    pressionaEnter();
                    scanner.next();
                }
            }
            if (comprarItens == 1) {
                while (menuComprar) {
                    boolean inventarioDisponivel = vendedor.imprimirLoja();
                    if (inventarioDisponivel) {
                        System.out.println("\nOuro Disponível: " + heroi.ouro);
                        System.out.println("Qual item quer comprar?");
                        System.out.print("Introduza: ");
                        int comprarItem = scanner.nextInt();
                        vendedor.vender(heroi, comprarItem);
                        do {
                            System.out.println("\nDeseja comprar mais algo?");
                            System.out.println("1. Sim");
                            System.out.println("2. Não");
                            System.out.print("Introduza: ");
                            continuarComprar = scanner.nextInt();
                            if (continuarComprar < 1 || continuarComprar > 2) {
                                System.out.println("Introduza um número entre 1 e 2");
                                pressionaEnter();
                                multiploQuebraLinha();
                            }
                        } while (continuarComprar < 1 || continuarComprar > 2);
                        if (continuarComprar == 2) {
                            menuComprar = false;
                            comprarItens = 0;
                        }
                    } else {
                        menuComprar = false;
                    }
                }
            }
            System.out.println("\nAté à próxima, Desconhecido!\n");
            menuComprar = true;
            System.out.println("Arma Principal: " + heroi.armaPrincipal);
            System.out.println("Inventário: " + heroi.getInventario() + "\n");
            pressionaEnter();
            multiploQuebraLinha();

            // Primeiro Cenario
            System.out.println("\nDurante o caminho, encontras uma aldeia abandonada.");
            while (escolhaCaminho < 1 || escolhaCaminho > 3) {
                System.out.println("1. Explorar a aldeia\n2. Seguir caminho\n3. Chamar");
                System.out.print("Introduza: ");
                try {
                    escolhaCaminho = scanner.nextInt();
                    if (escolhaCaminho < 1 || escolhaCaminho > 3) {
                        System.out.println("\nIntroduza um número entre 1 a 3!");
                        pressionaEnter();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nPor favor, introduza um número válido!");
                    pressionaEnter();
                    scanner.next();
                }
            }
            multiploQuebraLinha();
            switch (escolhaCaminho) {
                case 1:
                    System.out.println("Entras numa casa abandonada...");
                    chance = chance();
                    if (chance <= 0.5) {
                        System.out.println("Encontraste uma poção de vida!");
                        heroi.inventario.add(pocaoVida);
                    }
                    heroi.inventario.add(pocaoVida);
                    System.out.println("De repente, ouves um barulho e encontras um ORC!");
                    NPC orc = new NPC("Geraldo", 80, 80, 10, 25);
                    System.out.println("ORC: Uuuuuuurrrrrrrrrr");
                    System.out.println(heroi.nome + ": Eia bem... Pensava que era a minha ex-namorada!\n");
                    pressionaEnter();
                    heroi.atacar(orc);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.nivel += 1;
                    heroi.vidaMax += 10;
                    System.out.println(heroi.nome + ": Cheiras tão bem como és bonito...");
                    System.out.println("Após derrotar " + orc.nome + ", " + heroi.nome + " segue viagem.");
                    do {
                        try {
                            System.out.println("Desejas usar uma poção?");
                            System.out.println("1. Sim\n2. Não");
                            System.out.print("Introduzir: ");
                            escolhaPocao = scanner.nextInt();
                            if (escolhaPocao < 1 || escolhaPocao > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (escolhaPocao < 1 || escolhaPocao > 2);

                    if (heroi.inventario.isEmpty()) {
                        System.out.println("Não tens poções no inventário!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        switch (escolhaPocao) {
                            case 1:
                                do {
                                    System.out.println("Escolha um item para consumir.");
                                    for (int i = 0; i < heroi.inventario.size(); i++) {
                                        Consumivel item = heroi.inventario.get(i);
                                        int indicePocao = 1;
                                        if (item instanceof Pocao) {
                                            System.out.println(indicePocao + ". " + item.nome);
                                            indicePocao++;
                                        }
                                    }
                                    System.out.print("Introduza: ");
                                    try {
                                        escolhaConsumivel = scanner.nextInt();
                                        if (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size()) {
                                            System.out.println("\nIntroduza um número entre 1 a " + heroi.inventario.size() + "!");
                                            pressionaEnter();
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\nPor favor, introduza um número válido!");
                                        pressionaEnter();
                                        scanner.next();
                                    }
                                } while (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size());
                                if (escolhaConsumivel > 0 && escolhaConsumivel <= heroi.inventario.size()) {
                                    Consumivel itemConsumido = heroi.inventario.get(escolhaConsumivel - 1);
                                    if (itemConsumido instanceof Pocao) {
                                        int vidaAtualTemp = heroi.vidaAtual;
                                        int forcaAtualTemp = heroi.forca;

                                        heroi.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                        heroi.forca += ((Pocao) itemConsumido).aumentoForca;

                                        if (heroi.vidaAtual != vidaAtualTemp) {
                                            System.out.println(heroi.nome + " ganhou " + (heroi.vidaAtual - vidaAtualTemp) + "HP");
                                            System.out.println("Vida Atual: " + heroi.vidaAtual);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                        if (heroi.forca != forcaAtualTemp) {
                                            System.out.println("Força Atual: " + heroi.forca);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Escolheste não usar.");
                                break;
                        }
                    }
                    pressionaEnter();
                    break;
                case 2:
                    System.out.println("Ignoraste a aldeia e decidiste seguir caminho...");
                    chance = chance();
                    if (chance <= 0.4) {
                        System.out.println("Tropeçaste num pau e torceste o tornozelo");
                        heroi.vidaAtual -= 10;
                    }
                    break;
                case 3:
                    System.out.println(heroi.nome + " chama por alguém para verificar se é seguro");
                    System.out.println("De repente, aparece um bando de javalis que vão contra " + heroi.nome);
                    heroi.vidaAtual -= 20;
                    System.out.println(heroi.nome + " perdeu 20HP");
                    System.out.println("Vida Atual: " + heroi.vidaAtual + "HP");
                    pressionaEnter();
                    do {
                        try {
                            System.out.println("Desejas usar uma poção?");
                            System.out.println("1. Sim\n2. Não");
                            System.out.print("Introduzir: ");
                            escolhaPocao = scanner.nextInt();
                            if (escolhaPocao < 1 || escolhaPocao > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (escolhaPocao < 1 || escolhaPocao > 2);

                    if (heroi.inventario.isEmpty()) {
                        System.out.println("Não tens poções no inventário!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        switch (escolhaPocao) {
                            case 1:
                                do {
                                    System.out.println("Escolha um item para consumir.");
                                    for (int i = 0; i < heroi.inventario.size(); i++) {
                                        Consumivel item = heroi.inventario.get(i);
                                        int indicePocao = 1;
                                        if (item instanceof Pocao) {
                                            System.out.println(indicePocao + ". " + item.nome);
                                            indicePocao++;
                                        }
                                    }
                                    System.out.print("Introduza: ");
                                    try {
                                        escolhaConsumivel = scanner.nextInt();
                                        if (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size()) {
                                            System.out.println("\nIntroduza um número entre 1 a " + heroi.inventario.size() + "!");
                                            pressionaEnter();
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\nPor favor, introduza um número válido!");
                                        pressionaEnter();
                                        scanner.next();
                                    }
                                } while (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size());
                                if (escolhaConsumivel > 0 && escolhaConsumivel <= heroi.inventario.size()) {
                                    Consumivel itemConsumido = heroi.inventario.get(escolhaConsumivel - 1);
                                    if (itemConsumido instanceof Pocao) {
                                        int vidaAtualTemp = heroi.vidaAtual;
                                        int forcaAtualTemp = heroi.forca;

                                        heroi.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                        heroi.forca += ((Pocao) itemConsumido).aumentoForca;

                                        if (heroi.vidaAtual != vidaAtualTemp) {
                                            System.out.println(heroi.nome + " ganhou " + (heroi.vidaAtual - vidaAtualTemp) + "HP");
                                            System.out.println("Vida Atual: " + heroi.vidaAtual);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                        if (heroi.forca != forcaAtualTemp) {
                                            System.out.println("Força Atual: " + heroi.forca);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Escolheste não usar.");
                                break;
                        }
                    }
                    multiploQuebraLinha();
                    break;
                default:
                    System.out.println("Erro!");
            }

            // Entidades.Vendedor
            System.out.println("\nBem-vindo, Desconhecido!");
            System.out.println("Tenho aqui produtos que te possam interessar...\n");
            while (comprarItens < 1 || comprarItens > 2) {
                try {
                    System.out.println("Deseja comprar algo?");
                    System.out.println("1. Sim\n2. Não");
                    System.out.println("Introduzir: ");
                    comprarItens = scanner.nextInt();
                    if (comprarItens < 1 || comprarItens > 2) {
                        System.out.println("\nIntroduza um número entre 1 a 2!");
                        pressionaEnter();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nPor favor, introduza um número válido!");
                    pressionaEnter();
                    scanner.next();
                }
            }
            if (comprarItens == 1) {
                while (menuComprar) {
                    boolean inventarioDisponivel = vendedor.imprimirLoja();
                    if (inventarioDisponivel) {
                        System.out.println("\nOuro Disponível: " + heroi.ouro);
                        System.out.println("Qual item quer comprar?");
                        System.out.print("Introduza: ");
                        int comprarItem = scanner.nextInt();
                        vendedor.vender(heroi, comprarItem);
                        do {
                            System.out.println("\nDeseja comprar mais algo?");
                            System.out.println("1. Sim");
                            System.out.println("2. Não");
                            System.out.print("Introduza: ");
                            continuarComprar = scanner.nextInt();
                            if (continuarComprar < 1 || continuarComprar > 2) {
                                System.out.println("Introduza um número entre 1 e 2");
                                pressionaEnter();
                                multiploQuebraLinha();
                            }
                        } while (continuarComprar < 1 || continuarComprar > 2);
                        if (continuarComprar == 2) {
                            menuComprar = false;
                            comprarItens = 0;
                        }
                    } else {
                        menuComprar = false;
                    }
                }
            }
            System.out.println("\nAté à próxima, Desconhecido!\n");
            menuComprar = true;
            System.out.println("Arma Principal: " + heroi.armaPrincipal);
            System.out.println("Inventário: " + heroi.getInventario() + "\n");
            pressionaEnter();
            multiploQuebraLinha();

            // Segundo Cenario
            escolhaCaminho = 0;
            System.out.println("Durante o caminho, encontras uma bifurcação. Decidiste escolher o caminho da...");
            while (escolhaCaminho < 1 || escolhaCaminho > 3) {
                System.out.println("1. Esquerda\n2. Direita\n3. Centro");
                System.out.print("Introduza: ");
                try {
                    escolhaCaminho = scanner.nextInt();
                    if (escolhaCaminho < 1 || escolhaCaminho > 3) {
                        System.out.println("\nIntroduza um número entre 1 a 3!");
                        pressionaEnter();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nPor favor, introduza um número válido!");
                    pressionaEnter();
                    scanner.next();
                }
            }
            switch (escolhaCaminho) {
                case 1:
                    System.out.println("Encontraste um guarda no qual és amigo.");
                    System.out.println(heroi.nome + ": Hey, Bruno! Ainda bem que estás vivo!");
                    System.out.println("Bruno olha para ti e pega na sua espada para te desafiar");
                    System.out.println(heroi.nome + ": O que estás a fazer?!");
                    System.out.println("Bruno: Quando precisávamos de ti, tu abandonaste! Quem é que tu pensas que és?");
                    System.out.println(heroi.nome + ": Lavaram-te a cabeça, Bruno! Isso não é verdade! Eu vim ajudar-vos!");
                    System.out.println("Bruno: Mentiroso! Tu vais pagar!");
                    NPC bruno = new NPC("Bruno", 120, 120, 20, 40);
                    heroi.atacar(bruno);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.nivel += 1;
                    heroi.vidaMax += 10;
                    System.out.println(heroi.nome + ": Porque, Bruno?! Não havia necessidade!");
                    System.out.println("Bruno: Amigo, perdoa-me... Pensava que estava a ajudar a aldeia mas acabei prejudicando-a...\nSalva a aldeia... Salva a minha família... Por favor");
                    System.out.println(heroi.nome + ": Fica comigo! Não te vou deixar aqui assim! ... Bruno? ... BRUNO?!");
                    System.out.println("Bruno deu o seu último suspiro nos teus braços");
                    System.out.println("Ele te deixou uma Super Poção de Vida e uma Poção de Força");
                    heroi.inventario.add(superPocaoVida);
                    heroi.inventario.add(pocaoForca);
                    do {
                        try {
                            System.out.println("Desejas usar uma poção?");
                            System.out.println("1. Sim\n2. Não");
                            System.out.print("Introduzir: ");
                            escolhaPocao = scanner.nextInt();
                            if (escolhaPocao < 1 || escolhaPocao > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (escolhaPocao < 1 || escolhaPocao > 2);

                    if (heroi.inventario.isEmpty()) {
                        System.out.println("Não tens poções no inventário!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        switch (escolhaPocao) {
                            case 1:
                                do {
                                    System.out.println("Escolha um item para consumir.");
                                    for (int i = 0; i < heroi.inventario.size(); i++) {
                                        Consumivel item = heroi.inventario.get(i);
                                        int indicePocao = 1;
                                        if (item instanceof Pocao) {
                                            System.out.println(indicePocao + ". " + item.nome);
                                            indicePocao++;
                                        }
                                    }
                                    System.out.print("Introduza: ");
                                    try {
                                        escolhaConsumivel = scanner.nextInt();
                                        if (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size()) {
                                            System.out.println("\nIntroduza um número entre 1 a " + heroi.inventario.size() + "!");
                                            pressionaEnter();
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\nPor favor, introduza um número válido!");
                                        pressionaEnter();
                                        scanner.next();
                                    }
                                } while (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size());
                                if (escolhaConsumivel > 0 && escolhaConsumivel <= heroi.inventario.size()) {
                                    Consumivel itemConsumido = heroi.inventario.get(escolhaConsumivel - 1);
                                    if (itemConsumido instanceof Pocao) {
                                        int vidaAtualTemp = heroi.vidaAtual;
                                        int forcaAtualTemp = heroi.forca;

                                        heroi.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                        heroi.forca += ((Pocao) itemConsumido).aumentoForca;

                                        if (heroi.vidaAtual != vidaAtualTemp) {
                                            System.out.println(heroi.nome + " ganhou " + (heroi.vidaAtual - vidaAtualTemp) + "HP");
                                            System.out.println("Vida Atual: " + heroi.vidaAtual);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                        if (heroi.forca != forcaAtualTemp) {
                                            System.out.println("Força Atual: " + heroi.forca);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Escolheste não usar.");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ouves passos mas não consegues entender o que e de onde são");
                    System.out.println("Olhas de um lado para o outro e o som se torna mais alto");
                    System.out.println("De repente, uma flecha passa a milimetro de ti e aparece uma pessoa misteriosa");
                    System.out.println(heroi.nome + ": Quem és tu?");
                    System.out.println("Homem Misterioso: ...");
                    System.out.println(heroi.nome + ": Não sabes falar? Responde-me!");
                    System.out.println("Homem Misterioso: ... Luta contra mim ...");
                    NPC misterio = new NPC("Homem Misterioso", 120, 120, 20, 40);
                    heroi.atacar(misterio);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.nivel += 1;
                    heroi.vidaMax += 10;
                    System.out.println("Estás para dar o golpe final mas o Homem Misterioso se revela!\n");
                    System.out.println(heroi.nome + ": Va...Varus?");
                    System.out.println("Varus: Sim, " + heroi.nome + "... Sou eu.");
                    System.out.println(heroi.nome + ": O que vem a ser isto tudo?");
                    System.out.println("Varus: Eu também escapei da aldeia, tal como tu.");
                    System.out.println("Vítor é um homem extremamente perigoso e eu... eu não sou capaz de o conseguir derrotar");
                    System.out.println(heroi.nome + ": Como é que Varus não consegue? O melhor arqueiro que conheço!");
                    System.out.println("Varus: Eu não sou mas... Tu és... E agora que lutámos, consigo ver isso. Eu tinha que testar e ver pelos meus próprios olhos.");
                    System.out.println(heroi.nome + ": Varus...");
                    System.out.println("Varus: Não há tempo, " + heroi.nome + "! A aldeia precisa de ti!");
                    System.out.println("Varus te ofereceu uma Super Poção de Vida");
                    heroi.inventario.add(superPocaoVida);
                    System.out.println("Varus: O futuro dela está nas tuas mãos.");
                    System.out.println("Varus vai embora na esperança que vais conseguir derrotar Vítor");
                    System.out.println("Olhas para a frente e segues caminho...");
                    do {
                        try {
                            System.out.println("Desejas usar uma poção?");
                            System.out.println("1. Sim\n2. Não");
                            System.out.print("Introduzir: ");
                            escolhaPocao = scanner.nextInt();
                            if (escolhaPocao < 1 || escolhaPocao > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (escolhaPocao < 1 || escolhaPocao > 2);

                    if (heroi.inventario.isEmpty()) {
                        System.out.println("Não tens poções no inventário!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        switch (escolhaPocao) {
                            case 1:
                                do {
                                    System.out.println("Escolha um item para consumir.");
                                    for (int i = 0; i < heroi.inventario.size(); i++) {
                                        Consumivel item = heroi.inventario.get(i);
                                        int indicePocao = 1;
                                        if (item instanceof Pocao) {
                                            System.out.println(indicePocao + ". " + item.nome);
                                            indicePocao++;
                                        }
                                    }
                                    System.out.print("Introduza: ");
                                    try {
                                        escolhaConsumivel = scanner.nextInt();
                                        if (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size()) {
                                            System.out.println("\nIntroduza um número entre 1 a " + heroi.inventario.size() + "!");
                                            pressionaEnter();
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\nPor favor, introduza um número válido!");
                                        pressionaEnter();
                                        scanner.next();
                                    }
                                } while (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size());
                                if (escolhaConsumivel > 0 && escolhaConsumivel <= heroi.inventario.size()) {
                                    Consumivel itemConsumido = heroi.inventario.get(escolhaConsumivel - 1);
                                    if (itemConsumido instanceof Pocao) {
                                        int vidaAtualTemp = heroi.vidaAtual;
                                        int forcaAtualTemp = heroi.forca;

                                        heroi.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                        heroi.forca += ((Pocao) itemConsumido).aumentoForca;

                                        if (heroi.vidaAtual != vidaAtualTemp) {
                                            System.out.println(heroi.nome + " ganhou " + (heroi.vidaAtual - vidaAtualTemp) + "HP");
                                            System.out.println("Vida Atual: " + heroi.vidaAtual);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                        if (heroi.forca != forcaAtualTemp) {
                                            System.out.println("Força Atual: " + heroi.forca);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Escolheste não usar.");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println(heroi.nome + " reparou que a floresta estava bastante escura.");
                    chance = chance();
                    if (chance <= 0.6) {
                        System.out.println("Encontraste 50 ouro!");
                        heroi.ouro += 50;
                    }
                    System.out.println("Vozes começam a vir de todos os lados");
                    System.out.println("Bruxa: Que bons olhos te vêm, " + heroi.nome);
                    System.out.println(heroi.nome + ": Quem és tu?");
                    System.out.println("Bruxa: Sou quem te vai dar riqueza e poder para o resto da tua vida.");
                    System.out.println(heroi.nome + ": Eu não nasci ontem, Bruxa. Sai da frente!");
                    System.out.println("Bruxa: Como te atreves a falar assim comigo?!\n");
                    pressionaEnter();
                    NPC bruxa = new NPC("Bruxa", 120, 120, 20, 40);
                    heroi.atacar(bruxa);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    System.out.println("Bruxa: Não... NÃO... NÃO!!!");
                    System.out.println(heroi.nome + ": Vou embora deste lugar!");
                    pressionaEnter();
                    do {
                        try {
                            System.out.println("Desejas usar uma poção?");
                            System.out.println("1. Sim\n2. Não");
                            System.out.print("Introduzir: ");
                            escolhaPocao = scanner.nextInt();
                            if (escolhaPocao < 1 || escolhaPocao > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (escolhaPocao < 1 || escolhaPocao > 2);

                    if (heroi.inventario.isEmpty()) {
                        System.out.println("Não tens poções no inventário!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        switch (escolhaPocao) {
                            case 1:
                                do {
                                    System.out.println("Escolha um item para consumir.");
                                    for (int i = 0; i < heroi.inventario.size(); i++) {
                                        Consumivel item = heroi.inventario.get(i);
                                        int indicePocao = 1;
                                        if (item instanceof Pocao) {
                                            System.out.println(indicePocao + ". " + item.nome);
                                            indicePocao++;
                                        }
                                    }
                                    System.out.print("Introduza: ");
                                    try {
                                        escolhaConsumivel = scanner.nextInt();
                                        if (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size()) {
                                            System.out.println("\nIntroduza um número entre 1 a " + heroi.inventario.size() + "!");
                                            pressionaEnter();
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\nPor favor, introduza um número válido!");
                                        pressionaEnter();
                                        scanner.next();
                                    }
                                } while (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size());
                                if (escolhaConsumivel > 0 && escolhaConsumivel <= heroi.inventario.size()) {
                                    Consumivel itemConsumido = heroi.inventario.get(escolhaConsumivel - 1);
                                    if (itemConsumido instanceof Pocao) {
                                        int vidaAtualTemp = heroi.vidaAtual;
                                        int forcaAtualTemp = heroi.forca;

                                        heroi.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                        heroi.forca += ((Pocao) itemConsumido).aumentoForca;

                                        if (heroi.vidaAtual != vidaAtualTemp) {
                                            System.out.println(heroi.nome + " ganhou " + (heroi.vidaAtual - vidaAtualTemp) + "HP");
                                            System.out.println("Vida Atual: " + heroi.vidaAtual);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                        if (heroi.forca != forcaAtualTemp) {
                                            System.out.println("Força Atual: " + heroi.forca);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Escolheste não usar.");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }

            // Entidades.Vendedor
            System.out.println("\nBem-vindo, Desconhecido!");
            System.out.println("Tenho aqui produtos que te possam interessar...\n");
            while (comprarItens < 1 || comprarItens > 2) {
                try {
                    System.out.println("Deseja comprar algo?");
                    System.out.println("1. Sim\n2. Não");
                    System.out.println("Introduzir: ");
                    comprarItens = scanner.nextInt();
                    if (comprarItens < 1 || comprarItens > 2) {
                        System.out.println("\nIntroduza um número entre 1 a 2!");
                        pressionaEnter();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nPor favor, introduza um número válido!");
                    pressionaEnter();
                    scanner.next();
                }
            }
            if (comprarItens == 1) {
                while (menuComprar) {
                    boolean inventarioDisponivel = vendedor.imprimirLoja();
                    if (inventarioDisponivel) {
                        System.out.println("\nOuro Disponível: " + heroi.ouro);
                        System.out.println("Qual item quer comprar?");
                        System.out.print("Introduza: ");
                        int comprarItem = scanner.nextInt();
                        vendedor.vender(heroi, comprarItem);
                        do {
                            System.out.println("\nDeseja comprar mais algo?");
                            System.out.println("1. Sim");
                            System.out.println("2. Não");
                            System.out.print("Introduza: ");
                            continuarComprar = scanner.nextInt();
                            if (continuarComprar < 1 || continuarComprar > 2) {
                                System.out.println("Introduza um número entre 1 e 2");
                                pressionaEnter();
                                multiploQuebraLinha();
                            }
                        } while (continuarComprar < 1 || continuarComprar > 2);
                        if (continuarComprar == 2) {
                            menuComprar = false;
                            comprarItens = 0;
                        }
                    } else {
                        menuComprar = false;
                    }
                }
            }
            System.out.println("\nAté à próxima, Desconhecido!\n");
            menuComprar = true;
            System.out.println("Arma Principal: " + heroi.armaPrincipal);
            System.out.println("Inventário: " + heroi.getInventario() + "\n");
            pressionaEnter();
            multiploQuebraLinha();

            // Terceiro Cenario
            System.out.println("Encontras uma casa abandonada e aparenta haver alguém dentro. Decides...");
            System.out.println("1. Explorar a casa\n2. Descansar na barraca ao lado da casa\n3. Ignorar e seguir caminho");
            System.out.println("Introduza: ");
            escolhaCaminho = scanner.nextInt();
            switch (escolhaCaminho) {
                case 1:
                    chance = chance();
                    if (chance < 0.8) {
                        System.out.println("Encontraste 30 ouro e uma poção de vida!");
                        heroi.inventario.add(pocaoVida);
                        heroi.ouro += 30;
                    }
                    System.out.println(heroi.nome + ": Olá? Está aqui alguém?");
                    System.out.println(heroi.nome + " encontra alguém ferido");
                    System.out.println("Homem Ferido: Cuidado, atrás de ti!");
                    System.out.println(heroi.nome + " olha para trás e aparece um Lobo Assassino");
                    System.out.println("Lobo Assassino: Olá, " + heroi.nome + ". Quero dizer... O salvador da pátria! *Ri-se*");
                    System.out.println(heroi.nome + ": Quem és tu?");
                    System.out.println("Lobo Assassino: Talvez seja algué amigo... Talvez seja o teu pior pesadelo...");
                    System.out.println("Vais querer mesmo salvar essa pessoa insignificante? Acaba com ele e vamos juntos à busca de poder");
                    System.out.println(heroi.nome + ": Pouco me importa o que queres. Não vais lidar mais com ele mas sim comigo!");
                    System.out.println("Lobo Assassino: Bem, o funeral é teu!");
                    NPC lobo = new NPC("Lobo Assassino", 160, 160, 35, 65);
                    heroi.atacar(lobo);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.nivel += 1;
                    heroi.vidaMax += 10;
                    System.out.println("Lobo Assassino: Maldito... Sejas...");
                    System.out.println("Homem Ferido: Salvaste-me! Muito obrigado!");
                    System.out.println(heroi.nome + ": Não tens que me agradecer. Fico feliz por agora estás a salvo!");
                    System.out.println("David: Chamo-me David e consegui escapar da aldeia após aquele maldito Vítor ficar maluco!");
                    System.out.println(heroi.nome + ": És Cesaegardense?");
                    System.out.println("David: Nascido e criado, " + heroi.nome);
                    System.out.println(heroi.nome + ": Como sabes o meu nome?");
                    System.out.println("David: Todos sabem o nome do homem que se irá tornar no maior guerreiro de Cesaegard!");
                    System.out.println("Eu acredito que tu vais salvar a aldeia e que vamos poder viver em paz novamente.");
                    System.out.println("Toma! Eu sei que não é muito mas poderá ajudar!");
                    System.out.println("Recebeste Poção de Força");
                    System.out.println("David: Agora, vai... Vai e salva Cesaegard.\nEu fico bem.");
                    do {
                        try {
                            System.out.println("Desejas usar uma poção?");
                            System.out.println("1. Sim\n2. Não");
                            System.out.print("Introduzir: ");
                            escolhaPocao = scanner.nextInt();
                            if (escolhaPocao < 1 || escolhaPocao > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (escolhaPocao < 1 || escolhaPocao > 2);

                    if (heroi.inventario.isEmpty()) {
                        System.out.println("Não tens poções no inventário!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        switch (escolhaPocao) {
                            case 1:
                                do {
                                    System.out.println("Escolha um item para consumir.");
                                    for (int i = 0; i < heroi.inventario.size(); i++) {
                                        Consumivel item = heroi.inventario.get(i);
                                        int indicePocao = 1;
                                        if (item instanceof Pocao) {
                                            System.out.println(indicePocao + ". " + item.nome);
                                            indicePocao++;
                                        }
                                    }
                                    System.out.print("Introduza: ");
                                    try {
                                        escolhaConsumivel = scanner.nextInt();
                                        if (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size()) {
                                            System.out.println("\nIntroduza um número entre 1 a " + heroi.inventario.size() + "!");
                                            pressionaEnter();
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\nPor favor, introduza um número válido!");
                                        pressionaEnter();
                                        scanner.next();
                                    }
                                } while (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size());
                                if (escolhaConsumivel > 0 && escolhaConsumivel <= heroi.inventario.size()) {
                                    Consumivel itemConsumido = heroi.inventario.get(escolhaConsumivel - 1);
                                    if (itemConsumido instanceof Pocao) {
                                        int vidaAtualTemp = heroi.vidaAtual;
                                        int forcaAtualTemp = heroi.forca;

                                        heroi.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                        heroi.forca += ((Pocao) itemConsumido).aumentoForca;

                                        if (heroi.vidaAtual != vidaAtualTemp) {
                                            System.out.println(heroi.nome + " ganhou " + (heroi.vidaAtual - vidaAtualTemp) + "HP");
                                            System.out.println("Vida Atual: " + heroi.vidaAtual);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                        if (heroi.forca != forcaAtualTemp) {
                                            System.out.println("Força Atual: " + heroi.forca);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Escolheste não usar.");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Entraste na barraca e descansaste");
                    System.out.println("Felizmente, correu tudo bem e recuperaste toda a tua vida");
                    heroi.vidaAtual = heroi.vidaMax;
                case 3:
                    System.out.println("Ignoraste a casa e seguiste caminho.");
                    System.out.println("Contudo, encontraste no chão, perto da casa, 80 ouro.");
                    heroi.ouro += 80;
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }

            // Entidades.Vendedor
            System.out.println("\nBem-vindo, Desconhecido!");
            System.out.println("Tenho aqui produtos que te possam interessar...\n");
            while (comprarItens < 1 || comprarItens > 2) {
                try {
                    System.out.println("Deseja comprar algo?");
                    System.out.println("1. Sim\n2. Não");
                    System.out.println("Introduzir: ");
                    comprarItens = scanner.nextInt();
                    if (comprarItens < 1 || comprarItens > 2) {
                        System.out.println("\nIntroduza um número entre 1 a 2!");
                        pressionaEnter();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nPor favor, introduza um número válido!");
                    pressionaEnter();
                    scanner.next();
                }
            }
            if (comprarItens == 1) {
                while (menuComprar) {
                    boolean inventarioDisponivel = vendedor.imprimirLoja();
                    if (inventarioDisponivel) {
                        System.out.println("\nOuro Disponível: " + heroi.ouro);
                        System.out.println("Qual item quer comprar?");
                        System.out.print("Introduza: ");
                        int comprarItem = scanner.nextInt();
                        vendedor.vender(heroi, comprarItem);
                        do {
                            System.out.println("\nDeseja comprar mais algo?");
                            System.out.println("1. Sim");
                            System.out.println("2. Não");
                            System.out.print("Introduza: ");
                            continuarComprar = scanner.nextInt();
                            if (continuarComprar < 1 || continuarComprar > 2) {
                                System.out.println("Introduza um número entre 1 e 2");
                                pressionaEnter();
                                multiploQuebraLinha();
                            }
                        } while (continuarComprar < 1 || continuarComprar > 2);
                        if (continuarComprar == 2) {
                            menuComprar = false;
                            comprarItens = 0;
                        }
                    } else {
                        menuComprar = false;
                    }
                }
            }
            System.out.println("\nAté à próxima, Desconhecido!\n");
            menuComprar = true;
            System.out.println("Arma Principal: " + heroi.armaPrincipal);
            System.out.println("Inventário: " + heroi.getInventario() + "\n");
            pressionaEnter();
            multiploQuebraLinha();

            // Quarto Cenario
            System.out.println("Estás perto de chegar à aldeia mas deparas-te num desfiladeiro.\nVês que existe uma ponte velha e instável.\nContudo também existe um caminho alternativo mais longo mas seguro. Decides...");
            System.out.println("1. Ir pela ponte velha\n2. Contornar o desfiladeiro\n3. Voltar para trás");
            System.out.println("Introduza: ");
            escolhaCaminho = scanner.nextInt();
            switch (escolhaCaminho) {
                case 1:
                    System.out.println("Começas a passar a ponte com muito cuidado...");
                    System.out.println(heroi.nome + ": Tu consegues... Com muita, muita calma...");
                    System.out.println("Ao pousares o pé, a placa quebra, cais mas agarras a tempo!");
                    System.out.println("Puxas-te e consegues voltar à ponte.");
                    System.out.println(heroi.nome + ": Detesto pontes! Nunca mais!");
                    System.out.println("Com muito cuidado, consegues passar a ponte no qual cai no exato momento onde chegas ao outro lado do desfiladeiro.");
                    System.out.println("Olhas para baixo e nem consegues perceber o fundo do desfiladeiro");
                    System.out.println("No nomento onde olhas para trás, aparece um Golem.");
                    System.out.println("Golem: ...");
                    System.out.println(heroi.nome + ": Não tenho tempo para ti. Afasta-te!");
                    System.out.println("O Golem agarra em ti e atira-te contra o chão e de seguida longe.");
                    System.out.println("Golem: ...");
                    System.out.println(heroi.nome + ": Bem, pediste-as...");
                    NPC golem = new NPC("Golem", 300, 300, 40, 85);
                    System.out.println("Golem cai, causando um estrondo.");
                    System.out.println("De repente, ele se desfaz e começa a brilhar.");
                    System.out.println("Aproximas-te e encontraste...");
                    if (heroi.armaPrincipal.nome.equals("Espada") || heroi.armaPrincipal.nome.equals("Espada Longa")) {
                        System.out.println("Encontraste uma Espada de Diamante!");
                        heroi.trocarArma(espadaDiamante);
                    }
                    if (heroi.armaPrincipal.nome.equals("Cajado Mágico") || heroi.armaPrincipal.nome.equals("Cajado Cristal")) {
                        System.out.println("Encontraste um Cajado Negro!");
                        heroi.trocarArma(cajadoNegro);
                    }
                    if (heroi.armaPrincipal.nome.equals("Arco") || heroi.armaPrincipal.nome.equals("Arco Longo")) {
                        System.out.println("Encontraste um Arco Flamejante!");
                        heroi.trocarArma(arcoFlamejante);
                    }
                    do {
                        try {
                            System.out.println("Desejas usar uma poção?");
                            System.out.println("1. Sim\n2. Não");
                            System.out.print("Introduzir: ");
                            escolhaPocao = scanner.nextInt();
                            if (escolhaPocao < 1 || escolhaPocao > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (escolhaPocao < 1 || escolhaPocao > 2);

                    if (heroi.inventario.isEmpty()) {
                        System.out.println("Não tens poções no inventário!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        switch (escolhaPocao) {
                            case 1:
                                do {
                                    System.out.println("Escolha um item para consumir.");
                                    for (int i = 0; i < heroi.inventario.size(); i++) {
                                        Consumivel item = heroi.inventario.get(i);
                                        int indicePocao = 1;
                                        if (item instanceof Pocao) {
                                            System.out.println(indicePocao + ". " + item.nome);
                                            indicePocao++;
                                        }
                                    }
                                    System.out.print("Introduza: ");
                                    try {
                                        escolhaConsumivel = scanner.nextInt();
                                        if (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size()) {
                                            System.out.println("\nIntroduza um número entre 1 a " + heroi.inventario.size() + "!");
                                            pressionaEnter();
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\nPor favor, introduza um número válido!");
                                        pressionaEnter();
                                        scanner.next();
                                    }
                                } while (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size());
                                if (escolhaConsumivel > 0 && escolhaConsumivel <= heroi.inventario.size()) {
                                    Consumivel itemConsumido = heroi.inventario.get(escolhaConsumivel - 1);
                                    if (itemConsumido instanceof Pocao) {
                                        int vidaAtualTemp = heroi.vidaAtual;
                                        int forcaAtualTemp = heroi.forca;

                                        heroi.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                        heroi.forca += ((Pocao) itemConsumido).aumentoForca;

                                        if (heroi.vidaAtual != vidaAtualTemp) {
                                            System.out.println(heroi.nome + " ganhou " + (heroi.vidaAtual - vidaAtualTemp) + "HP");
                                            System.out.println("Vida Atual: " + heroi.vidaAtual);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                        if (heroi.forca != forcaAtualTemp) {
                                            System.out.println("Força Atual: " + heroi.forca);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Escolheste não usar.");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ao dar a volta ao desfiladeiro, deparas-te com três soldados.");
                    System.out.println("Soldado: " + heroi.nome + ", a tua jornada acaba aqui! Rende-te ou morres!");
                    System.out.println(heroi.nome + ": Não acho que entendem a minha disposição, neste momento");
                    System.out.println("Saiam da minha frente ou vão parar no fundo do desfiladeiro");
                    System.out.println("Soldado: Não temos medo de ti, " + heroi.nome + "! ATAQUEM!");
                    NPC soldado1 = new NPC("Soldado", 100, 100, 15, 20);
                    heroi.atacar(soldado1);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.nivel += 1;
                    heroi.vidaMax += 10;
                    NPC soldado2 = new NPC("Soldado", 100, 100, 15, 20);
                    heroi.atacar(soldado2);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.nivel += 1;
                    heroi.vidaMax += 10;
                    NPC soldado3 = new NPC("Soldado", 100, 100, 15, 20);
                    heroi.atacar(soldado3);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.nivel += 1;
                    heroi.vidaMax += 10;
                    System.out.println(heroi.nome + ": Eu avisei-vos...");
                    System.out.println(heroi.nome + " estava bastante perto da aldeia. O que será que vai acontecer?");
                    System.out.println();
                    do {
                        try {
                            System.out.println("Desejas usar uma poção?");
                            System.out.println("1. Sim\n2. Não");
                            System.out.print("Introduzir: ");
                            escolhaPocao = scanner.nextInt();
                            if (escolhaPocao < 1 || escolhaPocao > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (escolhaPocao < 1 || escolhaPocao > 2);

                    if (heroi.inventario.isEmpty()) {
                        System.out.println("Não tens poções no inventário!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        switch (escolhaPocao) {
                            case 1:
                                do {
                                    System.out.println("Escolha um item para consumir.");
                                    for (int i = 0; i < heroi.inventario.size(); i++) {
                                        Consumivel item = heroi.inventario.get(i);
                                        int indicePocao = 1;
                                        if (item instanceof Pocao) {
                                            System.out.println(indicePocao + ". " + item.nome);
                                            indicePocao++;
                                        }
                                    }
                                    System.out.print("Introduza: ");
                                    try {
                                        escolhaConsumivel = scanner.nextInt();
                                        if (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size()) {
                                            System.out.println("\nIntroduza um número entre 1 a " + heroi.inventario.size() + "!");
                                            pressionaEnter();
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\nPor favor, introduza um número válido!");
                                        pressionaEnter();
                                        scanner.next();
                                    }
                                } while (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size());
                                if (escolhaConsumivel > 0 && escolhaConsumivel <= heroi.inventario.size()) {
                                    Consumivel itemConsumido = heroi.inventario.get(escolhaConsumivel - 1);
                                    if (itemConsumido instanceof Pocao) {
                                        int vidaAtualTemp = heroi.vidaAtual;
                                        int forcaAtualTemp = heroi.forca;

                                        heroi.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                        heroi.forca += ((Pocao) itemConsumido).aumentoForca;

                                        if (heroi.vidaAtual != vidaAtualTemp) {
                                            System.out.println(heroi.nome + " ganhou " + (heroi.vidaAtual - vidaAtualTemp) + "HP");
                                            System.out.println("Vida Atual: " + heroi.vidaAtual);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                        if (heroi.forca != forcaAtualTemp) {
                                            System.out.println("Força Atual: " + heroi.forca);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Escolheste não usar.");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ao voltares para trás à procura de outro caminho");
                    System.out.println("Não reparaste num buraco, escorregaste e caíste.");
                    System.out.println("Morreste...");
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.vidaAtual = 0;
                    break;
                default:
                    System.out.println("Erro!");
            }

            // Entidades.Vendedor
            System.out.println("\nBem-vindo, Desconhecido!");
            System.out.println("Tenho aqui produtos que te possam interessar...\n");
            while (comprarItens < 1 || comprarItens > 2) {
                try {
                    System.out.println("Deseja comprar algo?");
                    System.out.println("1. Sim\n2. Não");
                    System.out.println("Introduzir: ");
                    comprarItens = scanner.nextInt();
                    if (comprarItens < 1 || comprarItens > 2) {
                        System.out.println("\nIntroduza um número entre 1 a 2!");
                        pressionaEnter();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nPor favor, introduza um número válido!");
                    pressionaEnter();
                    scanner.next();
                }
            }
            if (comprarItens == 1) {
                while (menuComprar) {
                    boolean inventarioDisponivel = vendedor.imprimirLoja();
                    if (inventarioDisponivel) {
                        System.out.println("\nOuro Disponível: " + heroi.ouro);
                        System.out.println("Qual item quer comprar?");
                        System.out.print("Introduza: ");
                        int comprarItem = scanner.nextInt();
                        vendedor.vender(heroi, comprarItem);
                        do {
                            System.out.println("\nDeseja comprar mais algo?");
                            System.out.println("1. Sim");
                            System.out.println("2. Não");
                            System.out.print("Introduza: ");
                            continuarComprar = scanner.nextInt();
                            if (continuarComprar < 1 || continuarComprar > 2) {
                                System.out.println("Introduza um número entre 1 e 2");
                                pressionaEnter();
                                multiploQuebraLinha();
                            }
                        } while (continuarComprar < 1 || continuarComprar > 2);
                        if (continuarComprar == 2) {
                            menuComprar = false;
                            comprarItens = 0;
                        }
                    } else {
                        menuComprar = false;
                    }
                }
            }
            System.out.println("\nÉ a nossa última vez. Boa sorte, Desconhecido!\n");
            menuComprar = true;
            System.out.println("Arma Principal: " + heroi.armaPrincipal);
            System.out.println("Inventário: " + heroi.getInventario() + "\n");
            pressionaEnter();
            multiploQuebraLinha();

            // Quinto Cenario
            System.out.println(heroi.nome + " finalmente chegou à aldeia.");
            System.out.println("Reparas que na portão do castelo estão dois guardas.");
            System.out.println("Reparas também que existe uma berma que poderá levar a uma entrada secreta. Decides...");
            System.out.println("1. Ir pelo portão da frente\n2. Ir pela berma\n3. Esperar até os guardas saírem");
            System.out.println("Introduza: ");
            escolhaCaminho = scanner.nextInt();
            switch (escolhaCaminho) {
                case 1:
                    System.out.println(heroi.nome + ": Saiam da frente enquanto puderem...");
                    System.out.println("Guarda: Rende-te, " + heroi.nome + "!");
                    System.out.println(heroi.nome + ": Não irei descansar até a paz voltar a reinar em Cesaegard!");
                    NPC soldado4 = new NPC("Guarda 1", 100, 100, 15, 20);
                    heroi.atacar(soldado4);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.nivel += 1;
                    heroi.vidaMax += 10;
                    NPC soldado5 = new NPC("Guarda 2", 100, 100, 15, 20);
                    heroi.atacar(soldado5);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.nivel += 1;
                    heroi.vidaMax += 10;
                    NPC soldado6 = new NPC("Guarda 3", 100, 100, 15, 20);
                    heroi.atacar(soldado6);
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.nivel += 1;
                    heroi.vidaMax += 10;
                    System.out.println(heroi.nome + ": Estou perto, Vítor...");
                    do {
                        try {
                            System.out.println("Desejas usar uma poção?");
                            System.out.println("1. Sim\n2. Não");
                            System.out.print("Introduzir: ");
                            escolhaPocao = scanner.nextInt();
                            if (escolhaPocao < 1 || escolhaPocao > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (escolhaPocao < 1 || escolhaPocao > 2);

                    if (heroi.inventario.isEmpty()) {
                        System.out.println("Não tens poções no inventário!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        switch (escolhaPocao) {
                            case 1:
                                do {
                                    System.out.println("Escolha um item para consumir.");
                                    for (int i = 0; i < heroi.inventario.size(); i++) {
                                        Consumivel item = heroi.inventario.get(i);
                                        int indicePocao = 1;
                                        if (item instanceof Pocao) {
                                            System.out.println(indicePocao + ". " + item.nome);
                                            indicePocao++;
                                        }
                                    }
                                    System.out.print("Introduza: ");
                                    try {
                                        escolhaConsumivel = scanner.nextInt();
                                        if (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size()) {
                                            System.out.println("\nIntroduza um número entre 1 a " + heroi.inventario.size() + "!");
                                            pressionaEnter();
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\nPor favor, introduza um número válido!");
                                        pressionaEnter();
                                        scanner.next();
                                    }
                                } while (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size());
                                if (escolhaConsumivel > 0 && escolhaConsumivel <= heroi.inventario.size()) {
                                    Consumivel itemConsumido = heroi.inventario.get(escolhaConsumivel - 1);
                                    if (itemConsumido instanceof Pocao) {
                                        int vidaAtualTemp = heroi.vidaAtual;
                                        int forcaAtualTemp = heroi.forca;

                                        heroi.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                        heroi.forca += ((Pocao) itemConsumido).aumentoForca;

                                        if (heroi.vidaAtual != vidaAtualTemp) {
                                            System.out.println(heroi.nome + " ganhou " + (heroi.vidaAtual - vidaAtualTemp) + "HP");
                                            System.out.println("Vida Atual: " + heroi.vidaAtual);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                        if (heroi.forca != forcaAtualTemp) {
                                            System.out.println("Força Atual: " + heroi.forca);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Escolheste não usar.");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Conseguiste encontrar uma brecha que te fez entrar no castelo.");
                    System.out.println("Estás diante de Vítor...");
                    do {
                        try {
                            System.out.println("Desejas usar uma poção?");
                            System.out.println("1. Sim\n2. Não");
                            System.out.print("Introduzir: ");
                            escolhaPocao = scanner.nextInt();
                            if (escolhaPocao < 1 || escolhaPocao > 2) {
                                System.out.println("\nIntroduza um número entre 1 a 2!");
                                pressionaEnter();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nPor favor, introduza um número válido!");
                            pressionaEnter();
                            scanner.next();
                        }
                    } while (escolhaPocao < 1 || escolhaPocao > 2);

                    if (heroi.inventario.isEmpty()) {
                        System.out.println("Não tens poções no inventário!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        switch (escolhaPocao) {
                            case 1:
                                do {
                                    System.out.println("Escolha um item para consumir.");
                                    for (int i = 0; i < heroi.inventario.size(); i++) {
                                        Consumivel item = heroi.inventario.get(i);
                                        int indicePocao = 1;
                                        if (item instanceof Pocao) {
                                            System.out.println(indicePocao + ". " + item.nome);
                                            indicePocao++;
                                        }
                                    }
                                    System.out.print("Introduza: ");
                                    try {
                                        escolhaConsumivel = scanner.nextInt();
                                        if (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size()) {
                                            System.out.println("\nIntroduza um número entre 1 a " + heroi.inventario.size() + "!");
                                            pressionaEnter();
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("\nPor favor, introduza um número válido!");
                                        pressionaEnter();
                                        scanner.next();
                                    }
                                } while (escolhaConsumivel < 1 || escolhaConsumivel > heroi.inventario.size());
                                if (escolhaConsumivel > 0 && escolhaConsumivel <= heroi.inventario.size()) {
                                    Consumivel itemConsumido = heroi.inventario.get(escolhaConsumivel - 1);
                                    if (itemConsumido instanceof Pocao) {
                                        int vidaAtualTemp = heroi.vidaAtual;
                                        int forcaAtualTemp = heroi.forca;

                                        heroi.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                        heroi.forca += ((Pocao) itemConsumido).aumentoForca;

                                        if (heroi.vidaAtual != vidaAtualTemp) {
                                            System.out.println(heroi.nome + " ganhou " + (heroi.vidaAtual - vidaAtualTemp) + "HP");
                                            System.out.println("Vida Atual: " + heroi.vidaAtual);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                        if (heroi.forca != forcaAtualTemp) {
                                            System.out.println("Força Atual: " + heroi.forca);
                                            heroi.inventario.remove(itemConsumido);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Escolheste não usar.");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enquanto esperavas, ficaste com sono devido ao cansaço de todas as lutas.");
                    System.out.println("Adormeceste...");
                    System.out.println("Quando abres os olhos, estão 5 guardas ao teu redor!");
                    System.out.println("Antes de conseguires fazer algo, uma espada te é espada no peito.");
                    System.out.println("Morreste...");
                    if (heroi.vidaAtual <= 0) {
                        System.out.println(heroi.nome + " morreu!");
                        return;
                    }
                    heroi.vidaAtual = 0;
                    break;
                default:
                    System.out.println("Erro!");
            }

            // Sexto Cenário

            System.out.println("Após derrotares os guardas, entras no Castelo.");
            System.out.println("Em frente, está Vítor sentado no trono do Rei.");
            System.out.println(heroi.nome + ": VÍTOR!");
            System.out.println("Vítor: Olá, " + heroi.nome + ". Tudo bem contigo?");
            System.out.println(heroi.nome + ": Tudo bem?!");
            System.out.println("Vítor: Espero que sim. Hoje vamos ter uma noite muito produtiva.");
            System.out.println(heroi.nome + ": Não gozes comigo, Vítor! Eu irei derrotar e restaurar a paz em Cesaegard!");
            System.out.println("Vítor: Tudo bem. Bora lá?");
            System.out.println("Vítor invoca 3 minions para te atacar");
            System.out.println("Vítor: Vamos lá, maltinha?");
            NPC minion = new NPC("Minion 1", 100, 100, 15, 20);
            heroi.atacar(minion);
            if (heroi.vidaAtual <= 0) {
                System.out.println(heroi.nome + " morreu!");
                return;
            }
            heroi.nivel += 1;
            heroi.vidaMax += 10;
            NPC minion2 = new NPC("Minion 2", 100, 100, 15, 20);
            heroi.atacar(minion2);
            if (heroi.vidaAtual <= 0) {
                System.out.println(heroi.nome + " morreu!");
                return;
            }
            heroi.nivel += 1;
            heroi.vidaMax += 10;
            NPC minion3 = new NPC("Minion 3", 100, 100, 15, 20);
            heroi.atacar(minion3);
            if (heroi.vidaAtual <= 0) {
                System.out.println(heroi.nome + " morreu!");
                return;
            }
            heroi.nivel += 1;
            heroi.vidaMax += 10;
            System.out.println(heroi.nome + ": Chega, seu cobarde! Faz-te homem e luta!");
            System.out.println("Vítor: Vamos lá, então?");
            NPC vitor = new NPC(" Vítor", 1000, 1000, 40, 1000);
            pressionaEnter();
            System.out.println("Vítor: *sigh*");
            System.out.println(heroi.nome + ": O teu reino acaba aqui, Vítor...");
            System.out.println("Vítor: Antes de acabares comigo... Tenho que te perguntar algo?");
            System.out.println(heroi.nome + ": Fala!");
            System.out.println("Vítor: Porque é que estás a dormir?");
            System.out.println(heroi.nome + ": Dor...Dormir?");
            System.out.println("Vítor: Malta, bora bater palmas para o acordar.");
            System.out.println(heroi.nome + ": Estás a gozar com a minha cara?");
            System.out.println("Vítor: Em 3...");
            System.out.println(heroi.nome + ": Pára de gozar comigo!");
            System.out.println("Vítor: 2...");
            System.out.println(heroi.nome + ": Já chega disto!");
            System.out.println("Vítor: 1...");
            System.out.println(heroi.nome + ": MORRE!!!");
            System.out.println("Pedro: Hey! Huh... O quê? Mãe?");
            System.out.println("Vítor: Então, Pedro? Estavas a dormir?");
            System.out.println("Pedro: Eish, desculpa, Vítor! Não foi por mal...");
            System.out.println("Vítor: Não faz mal. Precisas de ir lá fora um bocado?");
            System.out.println("Pedro: Sim, se não te importares...");
            System.out.println("Vítor: Malta, fazemos agora um intervalinho de 30 minutos. Até já.");
            System.out.println("Pedro: *Eia bem... Eu estou todo comido da cabeça...*");
            System.out.println("*Espero que o facto de ele me ter apanhado a dormir não prejudique no 20 que ele me vai dar no projeto de POO...*");
            System.out.println("Seria complicado, não seria, Vítor?");
            System.out.println("1. Muito complicado... E ainda tenho mais 19 projetos para ver!\n2. Imagina... Não é preciso exagerar");
            int escolhaVitor = scanner.nextInt();

            switch (escolhaVitor) {
                case 1:
                    System.out.println("Pedro: Fico feliz por compreenderes, Vítor.");
                    System.out.println("Independentemente da nota, não me reproves. *Riso nervoso*");
                    System.out.println("Força nisso. Grande abraço!");
                    break;
                case 2:
                    System.out.println("Pedro: Desculpa, foi um mês complicado para mim.");
                    System.out.println("Mas, apesar de tudo, consegui descansar e estou pronto para dar tudo!");
                    System.out.println("Bem, vou-te deixar pois sei que deves ter uns não sei quantos mais trabalhos para avaliar");
                    System.out.println("Força nisso, Vítor. Grande abraço!");
                    break;
                default:
                    System.out.println("Erro");
            }
        }
    }

    public static void main(String[] args) {

        int recomecar = 0;
        boolean continuarJogo = true;

        Scanner scanner = new Scanner(System.in);
        Jogo jogo = new Jogo();

        while (continuarJogo) {
            Heroi heroi = jogo.criarPersonagem();
            Heroi heroiBackup = heroi.clonarHeroi();
            jogo.aventuraJogo(heroi);

            while (heroi.vidaAtual <= 0) {
                do {
                    System.out.println("Perdeste o jogo!");
                    System.out.println("O que desejas fazer?");
                    System.out.println("1. Recomeçar com a mesma personagem\n2. Recomeçar com uma personagem nova\n3. Sair");
                    try {
                        recomecar = scanner.nextInt();
                        if (recomecar < 1 || recomecar > 3) {
                            System.out.println("\nIntroduza um número entre 1 a 3!");
                            pressionaEnter();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("\nPor favor, introduza um número válido!");
                        pressionaEnter();
                        scanner.next();
                    }
                } while (recomecar < 1 || recomecar > 3);

                switch (recomecar) {
                    case 1:
                        heroi = heroiBackup.clonarHeroi();
                        jogo.aventuraJogo(heroi);
                        break;
                    case 2:
                        heroi = jogo.criarPersonagem();
                        heroiBackup = heroi.clonarHeroi();
                        jogo.aventuraJogo(heroi);
                        break;
                    case 3:
                        System.out.println("A sair...");
                        continuarJogo = false;
                        break;
                    default:
                        System.out.println("Erro!");
                }
            }
        }
    }
}