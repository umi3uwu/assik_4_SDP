package task1;

import task1.Observer;

/**
 * task1.NewsSubscriberTablet receives notifications for all news categories.
 */
public class NewsSubscriberTablet implements Observer {

    @Override
    public void update(String category, String news) {
        System.out.println("Tablet received news: " + news);
    }
}
