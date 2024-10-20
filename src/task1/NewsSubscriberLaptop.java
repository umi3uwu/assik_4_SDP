package task1;

import task1.Observer;

/**
 * task1.NewsSubscriberLaptop receives notifications for "Science" news.
 */
public class NewsSubscriberLaptop implements Observer {

    @Override
    public void update(String category, String news) {
        if ("Science".equalsIgnoreCase(category)) {
            System.out.println("Laptop received news: " + news);
        }
    }
}
