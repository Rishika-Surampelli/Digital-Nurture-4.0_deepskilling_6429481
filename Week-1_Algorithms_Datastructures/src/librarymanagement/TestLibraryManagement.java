package librarymanagement;

public class TestLibraryManagement {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B001", "The Alchemist", "Paulo Coelho"),
            new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
            new Book("B003", "1984", "George Orwell"),
            new Book("B004", "Pride and Prejudice", "Jane Austen"),
            new Book("B005", "The Great Gatsby", "F. Scott Fitzgerald")
        };

        System.out.println("-- Linear Search --");
        Book found1 = BookSearch.linearSearch(books, "1984");
        System.out.println(found1 != null ? found1 : "Book not found");

        System.out.println("\n-- Binary Search --");
        BookSearch.sortBooks(books);
        Book found2 = BookSearch.binarySearch(books, "1984");
        System.out.println(found2 != null ? found2 : "Book not found");
    }
}
