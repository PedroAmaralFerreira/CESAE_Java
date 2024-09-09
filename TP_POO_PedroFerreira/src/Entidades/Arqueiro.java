package Entidades;

import Itens.ArmaPrincipal;
import Itens.Consumivel;
import Itens.ConsumivelCombate;
import Itens.Pocao;

import java.util.Scanner;

import static Utilidades.MultiploQuebraLinha.multiploQuebraLinha;
import static Utilidades.PressionaEnter.pressionaEnter;

public class Arqueiro extends Heroi {
    public Arqueiro(String nome, int vidaMax, int vidaAtual, int forca, ArmaPrincipal armaPrincipal, int ouro, int nivel) {
        super(nome, vidaMax, vidaAtual, forca, armaPrincipal, ouro, nivel);
    }

    /**
     * Ataca o NPC
     * @param npc Recebe o NPC para lutar
     */
    @Override
    public void atacar(NPC npc) {
        Scanner scanner = new Scanner(System.in);
        boolean ataqueEspecialUsado = false;
        boolean atacou = false;
        boolean possuiConsumivelCombate = false;
        int escolhaAtacar = 0;
        int escolhaConsumivel = 0;
        int danoHeroi = this.forca + this.armaPrincipal.getAtaque();
        int danoHeroiEspecial = this.forca + this.armaPrincipal.getAtaqueEspecial();
        int danoNPC = npc.forca;

        while (npc.vidaAtual > 0 && this.vidaAtual > 0) {

            System.out.println(npc.nome + " desafiou-te para um combate!\n");
            System.out.println("Teu turno para atacar");
            System.out.println("1. Atacar\n2. Consumir\n3. Item Combate");
            int escolhaCombate = scanner.nextInt();
            switch (escolhaCombate){
                case 1:
                    atacou = false;
                    while (!atacou) {
                        System.out.println("1. Ataque Normal (" + danoHeroi + "HP)");
                        System.out.println("2. Ataque Especial (" + danoHeroiEspecial + "HP)");
                        System.out.println("Introduzir: ");
                        escolhaAtacar = scanner.nextInt();
                        switch (escolhaAtacar){
                            case 1:
                                npc.vidaAtual -= danoHeroi;
                                System.out.println(this.nome + " atacou o " + npc.nome + " e perdeu " + danoHeroi + " pontos de vida!");
                                atacou = true;
                                multiploQuebraLinha();
                                break;
                            case 2:
                                if (escolhaAtacar == 2 && ataqueEspecialUsado == false) {
                                    npc.vidaAtual -= danoHeroiEspecial;
                                    ataqueEspecialUsado = true;
                                    atacou = true;
                                    System.out.println(this.nome + " atacou o " + npc.nome + " e perdeu " + danoHeroiEspecial + " pontos de vida!");
                                    multiploQuebraLinha();
                                } else if (escolhaAtacar == 2 && ataqueEspecialUsado == true) {
                                    System.out.println("Só podes utilizar o ataque especial uma vez por combate!");
                                    pressionaEnter();
                                    multiploQuebraLinha();
                                }
                                break;
                            default:
                                System.out.println("Erro!");
                                break;
                        }
                    }
                    break;
                case 2:
                    multiploQuebraLinha();
                    if (this.inventario.isEmpty()){
                        System.out.println("Não tem itens no inventário!");
                        System.out.println("Como demoraste a procurar, " + npc.nome + " atacou-te!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        multiploQuebraLinha();
                        System.out.println("Escolha um item para consumir:");
                        for (int i = 0; i < this.inventario.size(); i++) {
                            Consumivel item = this.inventario.get(i);
                            int indicePocao = 1;
                            if(item instanceof Pocao) {
                                System.out.println(indicePocao + ". " + item.nome);
                                indicePocao++;
                            }
                        }
                        System.out.print("Introduza: ");
                        escolhaConsumivel = scanner.nextInt();

                        if (escolhaConsumivel > 0 && escolhaConsumivel <= this.inventario.size()){
                            Consumivel itemConsumido = this.inventario.get(escolhaConsumivel - 1);
                            if(itemConsumido instanceof Pocao){
                                int vidaAtualTemp = this.vidaAtual;
                                int forcaAtualTemp = this.forca;

                                this.vidaAtual += ((Pocao) itemConsumido).vidaCurar;
                                this.forca += ((Pocao) itemConsumido).aumentoForca;

                                if (this.vidaAtual != vidaAtualTemp) {
                                    System.out.println(this.nome + " ganhou " + (this.vidaAtual - vidaAtualTemp) + "HP");
                                    System.out.println("Vida Atual: " + this.vidaAtual);
                                    this.inventario.remove(itemConsumido);
                                }
                                if (this.forca != forcaAtualTemp) {
                                    System.out.println("Força Atual: " + this.forca);
                                    this.inventario.remove(itemConsumido);
                                }
                            }
                        }
                    }
                    multiploQuebraLinha();
                    break;
                case 3:
                    for (Consumivel item : this.inventario) {
                        if (item instanceof ConsumivelCombate) {
                            possuiConsumivelCombate = true;
                            break;
                        }
                    }
                    if (!possuiConsumivelCombate){
                        System.out.println("Não tens nenhum Consumível de Combate!");
                        System.out.println("Como demoraste a procurar, " + npc.nome + " atacou-te!");
                        pressionaEnter();
                        multiploQuebraLinha();
                    } else {
                        for (int i = 0; i < this.inventario.size(); i++) {
                            Consumivel item = this.inventario.get(i);
                            int indiceConsumivelCombate = 1;
                            if (item instanceof ConsumivelCombate) {
                                System.out.println(indiceConsumivelCombate + ". " + item.nome);
                                indiceConsumivelCombate++;
                            }
                        }

                        multiploQuebraLinha();
                        System.out.print("Introduza: ");
                        escolhaConsumivel = scanner.nextInt();

                        if (escolhaConsumivel > 0 && escolhaConsumivel <= this.inventario.size()) {
                            Consumivel itemCombate = this.inventario.get(escolhaConsumivel - 1);

                            if (itemCombate instanceof ConsumivelCombate) {
                                ConsumivelCombate consumivelCombate = (ConsumivelCombate) itemCombate;

                                npc.vidaAtual -= consumivelCombate.ataqueInstantaneo;
                                System.out.println(this.nome + " usou " + consumivelCombate.nome + " e causou " + consumivelCombate.ataqueInstantaneo + " pontos de dano ao " + npc.nome);

                                this.inventario.remove(consumivelCombate);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Erro!");
            }


            if (npc.vidaAtual > 0) {
                System.out.println(npc.nome + " - " + npc.vidaAtual + "HP");
                double novoDano = (double) npc.forca * 0.1;
                double danoAumento = npc.forca + novoDano;
                this.vidaAtual -= danoAumento;
                System.out.println(npc.nome + " atacou o " + this.nome + " e perdeu " + danoAumento + " pontos de vida!");
                System.out.println(this.nome + " - " + this.vidaAtual + "HP");

            } else {
                System.out.println(npc.nome + " foi derrotado!");
            }

            if (this.vidaAtual <= 0) {
                System.out.println(this.nome + " foi derrotado!");
            }
        }
        this.ouro += npc.ouro;
    }

    /**
     * Clonar Heroi
     * @return Ira fazer um backup do heroi, caso morra
     */
    @Override
    public Heroi clonarHeroi() {
        return new Cavaleiro(this.nome, this.vidaMax, this.vidaAtual, this.forca, this.armaPrincipal, this.ouro, this.nivel);
    }
}
