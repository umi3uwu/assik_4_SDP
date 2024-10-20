package Task5;

/**
 * ReportVisitor generates a scan report.
 */
public class ReportVisitor implements Visitor {

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Generating report for text file: " + textFile.getName());
        // For simplicity, just indicate that the file was scanned
        System.out.println("Text file " + textFile.getName() + " scanned successfully.");
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Generating report for executable file: " + executableFile.getName());
        // For simplicity, just indicate that the file was scanned
        System.out.println("Executable file " + executableFile.getName() + " scanned successfully.");
    }
}

