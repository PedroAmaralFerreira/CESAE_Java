package FichaPratica03.Ex_03;

public class Main {
    public static void main(String[] args) {

        ShippingCalculator calculator = new ShippingCalculator(new StandardShippingStrategy());
        double cost = calculator.calculateShippingCost(10.0);
        System.out.println("Custo de portes padrão: €" + cost);

        calculator = new ShippingCalculator(new ExpressShippingStrategy());
        cost = calculator.calculateShippingCost(10.0);
        System.out.println("Custo de portes expresso: €" + cost);

        calculator = new ShippingCalculator(new OvernightShippingStrategy());
        cost = calculator.calculateShippingCost(10.0);
        System.out.println("Custo de portes noturno: €" + cost);
    }
}
