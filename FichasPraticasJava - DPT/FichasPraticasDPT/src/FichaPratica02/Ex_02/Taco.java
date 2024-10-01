package FichaPratica02.Ex_02;

public abstract class Taco {

    protected String nomeComida;
    protected double precoComida;

    public Taco(String nomeComida, double precoComida) {
        this.nomeComida = nomeComida;
        this.precoComida = precoComida;
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void box();

    public abstract void display();
}
