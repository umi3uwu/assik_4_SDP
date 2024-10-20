package Task3;

/**
 * CardPaymentStrategy adds a 2% commission to the order amount.
 */
public class CardPaymentStrategy implements PaymentStrategy {

    private static final double COMMISSION_RATE = 0.02;

    @Override
    public double calculateFinalAmount(double orderAmount) {
        double finalAmount = orderAmount + (orderAmount * COMMISSION_RATE);
        System.out.println("Using Card Payment. Commission of 2% applied.");
        return finalAmount;
    }
}

