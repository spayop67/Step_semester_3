import programming_construct_oop_w4.class_problems.LibraryBook;

import java.util.Scanner;

public static class LibraryBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        LibraryBook[] books = new LibraryBook[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter title and isbn (comma separated, leave isbn blank if none): ");
            String[] parts = sc.nextLine().split(",", -1);
            String title = parts[0].trim();
            String isbn = parts.length > 1 ? parts[1].trim() : "";
            if (isbn.isEmpty()) {
                books[i] = new LibraryBook(title);
            } else {
                books[i] = new LibraryBook(title, isbn);
            }
        }
        for (int i = 0; i < n; i++) {
            books[i].printStatus();
        }
        sc.close();
    }
}
}