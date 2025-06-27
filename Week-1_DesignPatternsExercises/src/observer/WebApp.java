package observer;

public class WebApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Web App - New Stock Price: " + price);
    }
}
