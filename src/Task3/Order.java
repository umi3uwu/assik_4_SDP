package Task3;

/**
 * Order class accepts a payment strategy and calculates the final order cost.
 */
public class Order {
    private double orderAmount;
    private PaymentStrategy paymentStrategy;

    public Order(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder() {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy not set.");
        } else {
            double finalAmount = paymentStrategy.calculateFinalAmount(orderAmount);
            System.out.printf("Final amount to be paid: %.2f UGX%n", finalAmount);
        }
    }
}


