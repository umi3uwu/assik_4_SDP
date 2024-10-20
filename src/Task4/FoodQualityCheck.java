package Task4;

/**
 * FoodQualityCheck performs specific checks for food products.
 */
public class FoodQualityCheck extends QualityCheck {

    @Override
    protected void checkCharacteristics() {
        System.out.println("Checking expiration date...");
        System.out.println("Checking ingredients for compliance...");
    }
}

