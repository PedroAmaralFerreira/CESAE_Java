package FichaPratica08.Ex_03;

public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo(double Largura, double Altura){
        this.largura = Largura;
        this.altura = Altura;
    }

    public double calcularArea(){
        return this.largura * this.altura;
    }

    public double calcularPerimetro(){
        return this.largura * 2 + this.altura * 2;
    }
}