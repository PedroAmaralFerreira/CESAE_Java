package Itens;

public class Pocao extends Consumivel{
    public int vidaCurar;
    public int aumentoForca;

    public Pocao(int preco, String nome, int vidaCurar, int aumentoForca) {
        super(preco, nome);
        this.vidaCurar = vidaCurar;
        this.aumentoForca = aumentoForca;
    }

    /**
     * Mostrar detalhes da pocao
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Vida Curada: " + this.vidaCurar);
        System.out.println("Força Aumentada: " + this.aumentoForca);
    }
}