package Task3;

import java.util.Random;

/**
 * WalletPaymentStrategy processes payment without any commission.
 * Displays a random transaction time between 1 and 24 hours.
 */
public class WalletPaymentStrategy implements PaymentStrategy {

    @Override
    public double calculateFinalAmount(double orderAmount) {
        System.out.println("Using Wallet Payment. No commission applied.");

        // Generate a random transaction time between 1 and 24 hours
        Random random = new Random();
        int transactionTime = random.nextInt(24) + 1; // +1 to make it 1 to 24

        System.out.println("Estimated transaction time: " + transactionTime + " hour(s).");

        return orderAmount;
    }
}


