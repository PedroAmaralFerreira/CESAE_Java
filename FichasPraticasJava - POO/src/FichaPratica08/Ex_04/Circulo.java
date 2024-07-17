package FichaPratica08.Ex_04;

public class Circulo {

    private double raio;

    public Circulo(double raioTemp, double diametroTemp){
        this.raio = raioTemp;
    }

    public double calcularArea(){
        return 3.14 * (this.raio * this.raio);
    }

    public double calcularCircunferencia(){
        return 2 * 3.14 * this.raio;
    }

}
