package Itens;

public class ArmaPrincipal extends ItemHeroi{
    private int ataque;
    private int ataqueEspecial;

    public ArmaPrincipal(int preco, String nome, int ataque, int ataqueEspecial) {
        super(preco, nome);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    /**
     * Nome da arma Principal
     *
     * @return Ira retornar o nome da Arma Principal
     */
    @Override
    public String toString() {
        return this.nome;
    }

    /**
     * Mostrar detalhes da Arma Principal
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Ataque Especial: " + this.ataqueEspecial);
    }
}
