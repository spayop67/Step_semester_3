package classes_objects_w3.ap1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        BookInventory[] books = new BookInventory[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter title, author, copiesAvailable (comma separated):");
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String title = parts[0].trim();
            String author = parts[1].trim();
            int copies = Integer.parseInt(parts[2].trim());
            books[i] = new BookInventory(title, author, copies);
        }
        System.out.println("\n--- Inventory ---");
        for (int i = 0; i < books.length; i++) {
            books[i].printEntry();
        }
        sc.close();
    }
}