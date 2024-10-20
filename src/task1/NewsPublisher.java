package task1;

import task1.Observer;

/**
 * task1.NewsPublisher interface declares methods to manage subscribers and publish news.
 */
public interface NewsPublisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void publishNews(String category, String news);
    void notifyObservers(String category, String news);
}
