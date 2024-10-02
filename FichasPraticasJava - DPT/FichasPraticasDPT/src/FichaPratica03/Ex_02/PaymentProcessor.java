package FichaPratica03.Ex_02;

public class PaymentProcessor {
    private DiscountStrategy discountStrategy;

    public PaymentProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(double totalPrice){
        return discountStrategy.applyDiscount(totalPrice);
    }
}
