package FichaPratica03.Ex_02;

public class NoDiscountStrategy implements DiscountStrategy{

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice;
    }
}
