package FichaPratica03.Ex_02;

public class PercentageDiscountStrategy implements DiscountStrategy{

    private double discountPercentage;

    public PercentageDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double totalPrice) {

        double discount;

        discount = totalPrice * this.discountPercentage;

        return totalPrice - discount;
    }
}
