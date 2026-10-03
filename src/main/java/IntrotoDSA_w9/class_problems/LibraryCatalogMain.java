package IntrotoDSA_w9.class_problems;

import java.util.Scanner;
public class LibraryCatalogMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of catalog entries: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        String[][] catalog = new String[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ISBN and title (comma separated): ");
            String[] parts = sc.nextLine().split(",", 2);
            catalog[i][0] = parts[0].trim();
            catalog[i][1] = parts[1].trim();
        }
        System.out.print("Enter targetIsbn: ");
        String targetIsbn = sc.nextLine().trim();
        String result = LibraryCatalog.findBook(catalog, targetIsbn);
        System.out.println(result);
        sc.close();
    }
}