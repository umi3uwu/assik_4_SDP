package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * task1.NewsPublisherImpl manages subscribers and notifies them of new news articles.
 */
public class NewsPublisherImpl implements NewsPublisher {

    private List<Observer> observers;

    public NewsPublisherImpl() {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publishNews(String category, String news) {
        System.out.println("Publishing news in category: " + category);
        notifyObservers(category, news);
    }

    @Override
    public void notifyObservers(String category, String news) {
        for (Observer observer : observers) {
            observer.update(category, news);
        }
    }
}
