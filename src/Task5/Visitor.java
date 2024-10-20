package Task5;

/**
 * Visitor interface defines methods for interacting with different file types.
 */
public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}

