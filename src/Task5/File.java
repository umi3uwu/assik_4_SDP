package Task5;

/**
 * File interface defines the accept method for visitors.
 */
public interface File {
    void accept(Visitor visitor);
}

