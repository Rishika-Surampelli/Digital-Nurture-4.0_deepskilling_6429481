package customersorting;

public class TestOrderSorting {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Aarav", 7500.00),
            new Order("O102", "Bhavya", 12000.00),
            new Order("O103", "Chirag", 5000.00),
            new Order("O104", "Divya", 9800.00),
            new Order("O105", "Esha", 3200.00)
        };

        System.out.println("-- Bubble Sort by Total Price --");
        OrderSorting.bubbleSort(orders);
        for (Order order : orders) {
            System.out.println(order);
        }

        // Resetting array for Quick Sort
        orders = new Order[] {
            new Order("O101", "Aarav", 7500.00),
            new Order("O102", "Bhavya", 12000.00),
            new Order("O103", "Chirag", 5000.00),
            new Order("O104", "Divya", 9800.00),
            new Order("O105", "Esha", 3200.00)
        };

        System.out.println("\n-- Quick Sort by Total Price --");
        OrderSorting.quickSort(orders, 0, orders.length - 1);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
