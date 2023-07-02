class NewsChannel implements Observer {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }
}
