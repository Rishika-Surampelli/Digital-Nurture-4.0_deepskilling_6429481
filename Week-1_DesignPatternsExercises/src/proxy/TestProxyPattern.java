package proxy;

public class TestProxyPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("cat_photo.jpg");

        // First call — loads from disk
        image.display();

        System.out.println();

        // Second call — uses cached version
        image.display();
    }
}
