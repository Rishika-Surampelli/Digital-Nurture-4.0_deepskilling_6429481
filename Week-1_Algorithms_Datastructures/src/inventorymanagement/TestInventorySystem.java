package inventorymanagement;

public class TestInventorySystem {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P001", "Laptop", 10, 50000.0);
        Product p2 = new Product("P002", "Smartphone", 20, 20000.0);
        Product p3 = new Product("P003", "Monitor", 15, 12000.0);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("\n-- Viewing All Products --");
        manager.viewAllProducts();

        System.out.println("\n-- Updating Product P002 --");
        manager.updateProduct("P002", 25, 21000.0);

        System.out.println("\n-- Deleting Product P001 --");
        manager.deleteProduct("P001");

        System.out.println("\n-- Final Inventory --");
        manager.viewAllProducts();
    }
}
