package Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class to demonstrate different payment strategies with user input.
 */
public class Main {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        double orderAmount = 0.0;

        // Prompt the user to enter the order amount
        while (true) {
            try {
                System.out.print("Enter the order amount in UGX: ");
                orderAmount = scanner.nextDouble();

                if (orderAmount <= 0) {
                    System.out.println("Order amount must be a positive number.");
                    continue;
                }
                break; // Valid input received
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Create an Order instance
        Order order = new Order(orderAmount);

        // Create instances of payment strategies
        PaymentStrategy cardPayment = new CardPaymentStrategy();
        PaymentStrategy walletPayment = new WalletPaymentStrategy();
        PaymentStrategy cashOnDelivery = new CashOnDeliveryStrategy();

        System.out.println("\nSelect payment method:");
        System.out.println("1. Card Payment (2% commission)");
        System.out.println("2. Wallet Payment (No commission, 1-24 hours transaction time)");
        System.out.println("3. Cash on Delivery (Additional 300 UGX for delivery)");
        System.out.print("Enter the number corresponding to your choice: ");

        int choice = 0;

        while (true) {
            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        order.setPaymentStrategy(cardPayment);
                        break;
                    case 2:
                        order.setPaymentStrategy(walletPayment);
                        break;
                    case 3:
                        order.setPaymentStrategy(cashOnDelivery);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        continue;
                }
                break; // Valid choice received
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value (1, 2, or 3).");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println();

        // Process the order with the selected payment strategy
        order.processOrder();

        // Close the scanner
        scanner.close();
    }
}



