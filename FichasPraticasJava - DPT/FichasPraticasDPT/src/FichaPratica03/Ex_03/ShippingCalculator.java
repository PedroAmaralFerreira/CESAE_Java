package FichaPratica03.Ex_03;

public class ShippingCalculator{
    private ShippingStrategy shipping;

    public ShippingCalculator(ShippingStrategy shipping) {
        this.shipping = shipping;
    }

    public double calculateShippingCost(double weight){
        return shipping.calculateCost(weight);
    }
}