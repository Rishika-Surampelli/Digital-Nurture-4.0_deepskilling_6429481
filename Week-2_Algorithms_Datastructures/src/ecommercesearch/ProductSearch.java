package ecommercesearch;

import java.util.Arrays;

public class ProductSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search (Assumes sorted array)
    public static Product binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].getProductName().compareToIgnoreCase(name);

            if (cmp == 0) return products[mid];
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    // Sort products by name for binary search
    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));
    }
}
