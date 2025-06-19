package librarymanagement;

import java.util.Arrays;

public class BookSearch {

    // Linear Search
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search (assumes sorted by title)
    public static Book binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);

            if (cmp == 0) return books[mid];
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    // Sorts books alphabetically by title
    public static void sortBooks(Book[] books) {
        Arrays.sort(books, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));
    }
}
