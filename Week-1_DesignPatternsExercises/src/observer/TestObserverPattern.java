package observer;

public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        System.out.println("Setting price to 120.50");
        market.setPrice(120.50);

        System.out.println("\nSetting price to 135.75");
        market.setPrice(135.75);
    }
}
