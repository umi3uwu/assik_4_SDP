package task1;

import task1.Observer;

/**
 * task1.NewsSubscriberSmartphone receives notifications for "Sports" news.
 */
public class NewsSubscriberSmartphone implements Observer {

    @Override
    public void update(String category, String news) {
        if ("Sports".equalsIgnoreCase(category)) {
            System.out.println("Smartphone received news: " + news);
        }
    }
}
