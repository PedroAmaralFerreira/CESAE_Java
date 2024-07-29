package FichaPratica14.Ex_01;

public class Circulo extends FiguraGeometrica{

    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return 3.14 * (raio * raio);
    }

    @Override
    public double calcularPerimetro(){
        return 2 * raio * 3.14;
    }
}
