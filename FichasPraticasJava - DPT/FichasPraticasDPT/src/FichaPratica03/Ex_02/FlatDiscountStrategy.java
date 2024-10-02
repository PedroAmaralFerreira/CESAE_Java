package FichaPratica03.Ex_02;

public class FlatDiscountStrategy implements DiscountStrategy{

    private double discountFlat;

    public FlatDiscountStrategy(double discountFlat) {
        this.discountFlat = discountFlat;
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice - this.discountFlat;
    }
}
