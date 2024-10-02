package FichaPratica03.Ex_03;

public class ExpressShippingStrategy implements ShippingStrategy {

    @Override
    public double calculateCost(double weight) {
        return weight * 10.0;
    }
}
