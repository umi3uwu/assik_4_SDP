package task1;

import java.util.Scanner;

/**
 * task1.Main class to test the task1.Observer pattern implementation with user input and selective news publishing.
 */
public class Main {

    public static void main(String[] args) {
        // Create a news publisher
        NewsPublisherImpl publisher = new NewsPublisherImpl();

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their device
        System.out.print("Enter your device (Smartphone, Laptop, Tablet): ");
        String deviceType = scanner.nextLine().trim();

        // Subscribe the user based on their device
        switch (deviceType.toLowerCase()) {
            case "smartphone":
                Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
                publisher.subscribe(smartphoneSubscriber);

                // Publish news only in the "Sports" category
                publisher.publishNews("Sports", "Team Spirit won the TI for the fifth time!");
                break;

            case "laptop":
                Observer laptopSubscriber = new NewsSubscriberLaptop();
                publisher.subscribe(laptopSubscriber);

                // Publish news only in the "Science" category
                publisher.publishNews("Science", "New species of capybara was found in Kazakhstan!");
                break;

            case "tablet":
                Observer tabletSubscriber = new NewsSubscriberTablet();
                publisher.subscribe(tabletSubscriber);

                // Publish news in all categories
                publisher.publishNews("Sports", "Team Spirit won the TI for the fifth time!");
                publisher.publishNews("Science", "New species of capybara was found in Kazakhstan!");
                publisher.publishNews("Politics", "AES was finally build!");
                break;

            default:
                System.out.println("Unknown device. No subscriptions added.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
