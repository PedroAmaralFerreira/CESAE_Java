package FichaPratica03.Ex_03;

public class StandardShippingStrategy implements ShippingStrategy{

    @Override
    public double calculateCost(double weight) {
        return weight * 5.0;
    }
}
