package FichaPratica14.Ex_01;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    public Triangulo(String cor, double base, double lado1, double lado2, double altura) {
        super(cor);
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double calcularArea(){
        return (base * altura) / 2;
    }

    public double calcularPerimetro(){
        return base + lado1 + lado2;
    }
}
