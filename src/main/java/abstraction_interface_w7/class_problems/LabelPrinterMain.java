package abstraction_interface_w7.class_problems;

import java.util.Scanner;
public class LabelPrinterMain {
    static void printAll(Printable[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].printLabel());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        Printable[] items = new Printable[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (package/invoice) and id (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            String id = parts[1].trim();
            if (type.equalsIgnoreCase("package")) {
                items[i] = new PackageBox(id);
            } else {
                items[i] = new Invoice(id);
            }
        }
        printAll(items);
        sc.close();
    }
}