package Task4;

/**
 * Abstract class QualityCheck defines the template method for product quality checking.
 */
public abstract class QualityCheck {

    /**
     * Template method that defines the steps of the quality check process.
     * This method is declared as final to prevent subclasses from altering the sequence.
     */
    public final void performQualityCheck() {
        checkAppearance();
        checkCharacteristics();
        finalReport();
    }

    /**
     * Step 1: Check Appearance (common for all products).
     */
    protected void checkAppearance() {
        System.out.println("Checking product appearance...");
    }

    /**
     * Step 2: Check Characteristics (specific to each product type).
     * Subclasses must implement this method.
     */
    protected abstract void checkCharacteristics();

    /**
     * Step 3: Final Report (common for all products).
     */
    protected void finalReport() {
        System.out.println("Generating final quality report.");
    }
}

