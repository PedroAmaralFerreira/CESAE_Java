package Entidades;

import Itens.ArmaPrincipal;
import Itens.Consumivel;

import java.util.ArrayList;

public abstract class Heroi extends Entidade {
    public int nivel;
    public int ouro;
    public ArmaPrincipal armaPrincipal;
    public ArrayList<Consumivel> inventario;

    public Heroi(String nome, int vidaMax, int vidaAtual, int forca, ArmaPrincipal armaPrincipal, int ouro, int nivel) {
        super(nome, vidaMax, vidaAtual, forca);
        this.armaPrincipal = armaPrincipal;
        this.ouro = ouro;
        this.nivel = nivel;
        this.inventario = new ArrayList<Consumivel>();
    }

    /**
     * Atualiza a arma Principal do Heroi
     *
     * @param novaArma A nova arma que vai substituir a arma atual
     */
    public void trocarArma(ArmaPrincipal novaArma) {
        this.armaPrincipal = novaArma;
        System.out.println("Arma principal foi atualizada para: " + novaArma.nome);
    }

    /**
     * Clonagem do heroi
     *
     * @return Ira fazer a clonagem/backup do heroi criado
     */
    public abstract Heroi clonarHeroi();

    /**
     * Atacar o NPC
     *
     * @param npc Ira receber o NPC como parametro para combate
     */
    public abstract void atacar(NPC npc);

    /**
     * Getter do Inventario
     *
     * @return Ira devolver o inventario
     */
    public ArrayList<Consumivel> getInventario() {
        return inventario;
    }

    /**
     * Mostrar Detalhes do Heroi
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Arma Principal: " + this.armaPrincipal);
        System.out.println("Ouro: " + this.ouro);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Inventário: " + this.inventario);
    }
}
