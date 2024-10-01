package FichaPratica02.Ex_02;

public class TacoTipoFrango extends Taco{

    public TacoTipoFrango(String nomeComida, double precoComida) {
        super(nomeComida, precoComida);
    }

    @Override
    public void prepare() {
        System.out.println("A preparar " + this.nomeComida);
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar " + this.nomeComida);
    }

    @Override
    public void box() {
        System.out.println("A embalar " + this.nomeComida);
    }

    @Override
    public void display() {
        System.out.println("Pedido: " + this.nomeComida);
        System.out.println("Preço: " + this.precoComida + "€\n");
    }
}
