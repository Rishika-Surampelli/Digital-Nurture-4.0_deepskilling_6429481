package observer;

public class MobileApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Mobile App - New Stock Price: " + price);
    }
}
