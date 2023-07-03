
public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel observer1 = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();

        newsAgency.registerObserver(observer1);
        newsAgency.registerObserver(observer2);

        newsAgency.setNews("Breaking news!");

        System.out.println(observer1.getNews());
        newsAgency.setNews("Breaking news!2");
        System.out.println(observer2.getNews()); // Output: Breaking news!2
    }
}