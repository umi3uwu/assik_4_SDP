package Task4;

/**
 * ElectronicsQualityCheck performs specific checks for electronic products.
 */
public class ElectronicsQualityCheck extends QualityCheck {

    @Override
    protected void checkCharacteristics() {
        System.out.println("Checking functionality of the electronic product...");
        System.out.println("Verifying warranty documentation...");
    }
}

