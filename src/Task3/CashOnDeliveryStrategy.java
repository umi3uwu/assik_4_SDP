package Task3;

/**
 * CashOnDeliveryStrategy adds 300 rubles for delivery.
 */
public class CashOnDeliveryStrategy implements PaymentStrategy {

    private static final double DELIVERY_CHARGE = 300.0;

    @Override
    public double calculateFinalAmount(double orderAmount) {
        double finalAmount = orderAmount + DELIVERY_CHARGE;
        System.out.println("Using Cash on Delivery. Additional charge of 300 UGX applied.");
        return finalAmount;
    }
}

