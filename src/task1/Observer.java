package task1;

/**
 * task1.Observer interface defines the method that all subscribers must implement.
 */
public interface Observer {
    void update(String category, String news);
}
