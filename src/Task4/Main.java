package Task4;

/**
 * Main class to test the Template Method pattern implementation.
 */
public class Main {
    public static void main(String[] args) {
        // Create a quality check instance for food products
        QualityCheck foodCheck = new FoodQualityCheck();
        System.out.println("Starting quality check for food product:");
        foodCheck.performQualityCheck();

        System.out.println();

        // Create a quality check instance for electronic products
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        System.out.println("Starting quality check for electronic product:");
        electronicsCheck.performQualityCheck();
    }
}

