package ecommercesearch;

public class TestSearchFunction {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P101", "Laptop", "Electronics"),
            new Product("P102", "Mouse", "Accessories"),
            new Product("P103", "Keyboard", "Accessories"),
            new Product("P104", "Smartphone", "Electronics"),
            new Product("P105", "Charger", "Accessories")
        };

        System.out.println("-- Linear Search --");
        Product found1 = ProductSearch.linearSearch(products, "Smartphone");
        System.out.println(found1 != null ? found1 : "Product not found");

        System.out.println("\n-- Binary Search --");
        ProductSearch.sortProductsByName(products);
        Product found2 = ProductSearch.binarySearch(products, "Smartphone");
        System.out.println(found2 != null ? found2 : "Product not found");
    }
}
