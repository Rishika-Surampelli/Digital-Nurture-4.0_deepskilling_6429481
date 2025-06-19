package strategy;

public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.payAmount(2500.00);

        context.setStrategy(new PayPalPayment());
        context.payAmount(1500.00);
    }
}
