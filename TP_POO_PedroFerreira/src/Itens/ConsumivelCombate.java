package Itens;

public class ConsumivelCombate extends Consumivel{
    public int ataqueInstantaneo;

    public ConsumivelCombate(int preco, String nome, int ataqueInstantaneo) {
        super(preco, nome);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }
}
