package Entidades;

public abstract class Entidade {
    public String nome;
    public int vidaMax;
    public int vidaAtual;
    public int forca;

    public Entidade(String nome, int vidaMax, int vidaAtual, int forca) {
        this.nome = nome;
        this.vidaMax = vidaMax;
        this.vidaAtual = vidaAtual;
        this.forca = forca;
    }

    /**
     * Mostrar Detalhes da Entidade
     */
    public void mostrarDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida Máxima: " + this.vidaMax);
        System.out.println("Vida Atual: " + this.vidaAtual);
        System.out.println("Força: " + this.forca);
    }
}
