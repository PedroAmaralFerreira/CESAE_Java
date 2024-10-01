package FichaPratica02.Ex_01;

public class Clothing extends Product{

    public Clothing(String name, Double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("***** " + this.name + " *****");
        System.out.println("Price: " + this.price + "€\n");
    }
}
