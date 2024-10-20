package Task3;

/**
 * PaymentStrategy interface defines the method to calculate the final order cost.
 */
public interface PaymentStrategy {
    double calculateFinalAmount(double orderAmount);
}

